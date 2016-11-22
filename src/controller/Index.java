package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ratierchar on 22/11/16.
 */

@Controller
public class Index {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String printIndex(Model model){
		System.out.println("YOOOO");
		model.addAttribute("message", "Kim Kardashian");
		return "home";
	}
}