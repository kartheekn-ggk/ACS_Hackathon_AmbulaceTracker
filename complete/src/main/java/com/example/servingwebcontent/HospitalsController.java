package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HospitalsController {

    @GetMapping("/hospitals")
	public String hospitals(@RequestParam(name="name", required=false, defaultValue="Ben Taub") String name, Model model) {
		model.addAttribute("name", name);
		return "hospitals";
	}

}
