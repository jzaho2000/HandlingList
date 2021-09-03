package com.aho.handlingList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aho.handlingList.model.Student;
import org.springframework.ui.Model;

/**
 * 
 * 
 * @author jzaho
 *
 */


@Controller
public class StudentController {

	
private ArrayList<Student> studentList=new ArrayList<Student>();
	


	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
	//public String returnHello(@RequestParam(name="name", defaultValue="")String name) 
	public String handleHello(@RequestParam(name="name", defaultValue="")String name) {
		
		if (name == null || name.compareTo("")==0) {
			
			String returnStr = "Welcome to Haaga-Helia!";
			for (int i=0; i<this.studentList.size(); i++)
				returnStr += "\n" + this.studentList.get(i).getName();
			
			return returnStr;
		}
		
		this.studentList.add(new Student(name));
		
		
		return "Added to list";
	}
	
	@RequestMapping("/studentlist")
	public void studentlist(Model model) {
		model.addAttribute("students",studentList);
	}
	
}
