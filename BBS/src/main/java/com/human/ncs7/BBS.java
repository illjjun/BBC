package com.human.ncs7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BBS {
	@RequestMapping("/list")
	public String list() {
		return "list";
	}
}