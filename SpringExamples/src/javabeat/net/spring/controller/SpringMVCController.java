package javabeat.net.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringMVCController {

	@RequestMapping(value = "/springmvctest", method = RequestMethod.GET)
	public String redirectTest(Model model) {
		model.addAttribute("msg", "Test Message");
		return "hello";
	}
}