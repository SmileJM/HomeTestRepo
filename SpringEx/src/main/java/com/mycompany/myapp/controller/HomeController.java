package com.mycompany.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {		
		return "home";
	}
	
	@RequestMapping("/web/withoutMeta")
	public String withoutMeta() {		
		return "web/withoutMeta";
	}
	@RequestMapping("/web/withMeta")
	public String withMeta() {		
		return "web/withMeta";
	}
	@RequestMapping("/web/atMediaRule")
	public String atMediaRule() {		
		return "web/atMediaRule";
	}
	@RequestMapping("/web/mediaAttribute")
	public String mediaAttribute() {		
		return "web/mediaAttribute";
	}
	@RequestMapping("/web/mediaFeature")
	public String mediaFeature() {		
		return "web/mediaFeature";
	}
	@RequestMapping("/web/orientation")
	public String orientation() {		
		return "web/orientation";
	}
	@RequestMapping("/web/pattern1")
	public String pattern1() {		
		return "web/pattern1";
	}
	@RequestMapping("/web/pattern2")
	public String pattern2() {		
		return "web/pattern2";
	}
	@RequestMapping("/web/pattern3")
	public String pattern3() {		
		return "web/pattern3";
	}
	@RequestMapping("/web/pattern4")
	public String pattern4() {		
		return "web/pattern4";
	}
}
