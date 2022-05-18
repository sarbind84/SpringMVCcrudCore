package com.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@RequestMapping("/frm")
	public String formpage() {

		return "form";
	}
	

	//@RequestMapping("/hellonew")
	
//	
//public String display(HttpServletRequest req,Model m) {
//		//read the provided form data 
//		String name=req.getParameter("name");
//		String pass=req.getParameter("pass");
//		
//		if(pass.equals("admin")) { 
//			String msg="Hello "+ name;
//		//add a message to the model
//			m.addAttribute("name", msg);
//		return "successpage"; 
//		
//		}
//		else 
//		{ 
//		String msg="Sorry "+ name+". You entered an incorrect password";
//		m.addAttribute("name", msg);
//		return "errorpage"; 
//		} 
//		} 
	
	//@RequestParam annotation is used to read the form data and bind it automatically to 
	//the parameter present in the provided method.
	//So, it ignores the requirement of HttpServletRequest object to read the provided data.
	
	
	@RequestMapping("/hellonew") 
	public String display(@RequestParam("names") String name,@RequestParam("pass") String pass,Model m) 
	{ 
		if(pass.equals("admin")) 
		{
			String msg="Hello "+ name; 
	//add a message to the model
		
		m.addAttribute("name", msg); 
		
		return "successpage";
		} 
		else 
		{ 
		String msg="Sorry "+ name+". You entered an incorrect password";
		m.addAttribute("name", msg); 
		return "errorpage"; 
		
		} 
		} 
	
	
 
	

}
