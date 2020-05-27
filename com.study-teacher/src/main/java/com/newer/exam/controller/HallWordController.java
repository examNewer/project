package com.newer.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HallWordController {

		@ResponseBody
		@RequestMapping("/hello")
		public String hello() {
			return "hello,word";
		}
}
