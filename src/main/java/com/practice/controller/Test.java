package com.practice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.*;

@Controller
public class Test {
	String msg = "Hello Nigga";

	/*
	 * @RequestMapping("/test") public ModelAndView testController(
	 * 
	 * @RequestParam(value="name", required=false, defaultValue="Yooo") String
	 * name){ System.out.println("Test Controller");
	 * 
	 * ModelAndView mv = new ModelAndView("testView"); mv.addObject("msg",msg);
	 * mv.addObject("name", name); return mv; }
	 */


	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String viewLogin(Map<String, Object> model) {
		Person person = new Person();
		model.put("personForm", person);
		return "testView";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = {"Accept=text/xml, application/json"})
	@ResponseBody
	public Person doLogin(@Valid Person person, @ModelAttribute("personForm") Person personForm, BindingResult result,
			Map<String, Object> model) throws Exception {
		System.out.println(person.getLastName());
		if (result.hasErrors()) { 
			return personForm;
		}
		return personForm;
		
	}

	@RequestMapping(value = "/login1", headers="Accept:text/html,application/xhtml+xml,application/xml;q=0.9,/;q=0.8")
	public Person Login(@RequestBody Person person1 ) {
 
		Person person = new Person();
		person.setEmail("asdas");
		person  = person1;
		return person;
	}
}
