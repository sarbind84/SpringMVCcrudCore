package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
 
	public class HomeController {
		@RequestMapping("/hi")
		public String redirect() {
			return "viewpage";
		}

		@RequestMapping("/hiagain")
		public String display() {
			return "final";
		}

}
