package com.firstwebservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

//@RestController  //it return body data like Rest APi
@Controller
public class appController {
	
	@RequestMapping("/testapi")
	//@ResponseBody //it return body data
	public String testapi(HttpServletRequest req) {
		
		HttpSession session= req.getSession();
		
		String cname = req.getParameter("cname");
		
		session.setAttribute("cname", cname);
		
		System.out.println("testapi Am "+cname);
		// if return any file it will download not show for view
		// use a library convert jsp file to servlet so check apache tomcat version on maven repo 
		// go maven repositry site search jasper version and copy xml code and paste it xml file and restart
		
		// <!-- https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jasper -->
		return "course";
	}

}
