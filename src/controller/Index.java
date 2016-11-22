package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class Index {

	@RequestMapping(method = RequestMethod.GET)
	public String printIndex(Model model){
		model.addAttribute("message", "Salut !");
		return "home";
	}
}