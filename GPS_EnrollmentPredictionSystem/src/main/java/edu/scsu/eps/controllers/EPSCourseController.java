/**
 * 
 */
package edu.scsu.eps.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.scsu.eps.entities.EPSCourse;
import edu.scsu.eps.services.EPSCourseService;

/**
 * @author znabd
 *
 */
@Controller
public class EPSCourseController {

	/*
	 *  Check if the cours alreayd in the system
	 */
	@Autowired
	private EPSCourseService epsCourseService;
	@GetMapping("/course")
	public String courseForm(Model model) {
	
		model.addAttribute("course", new EPSCourse());
		return "views/courseForm";
	}
	
	@PostMapping("/course")
	public String addCourse(@Valid EPSCourse epsCourse,BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return "views/courseForm";
		}
		if(epsCourseService.isCourseExist(epsCourse.getCourse_id())) {
			model.addAttribute("exist", true);
			return "views/courseForm";
		}
		epsCourseService.createCourse(epsCourse);
		return "views/added_course";
		
	}
}
