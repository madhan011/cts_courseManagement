package com.learning.management.courseManagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.management.courseManagement.Service.CourseService;
import com.learning.management.courseManagement.model.Course;
import com.learning.management.courseManagement.model.QAResponse;
import com.learning.management.courseManagement.model.RestResponse;


@RestController
@RequestMapping("/course")
public class CourseMasterController {
	
	
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/courseList")
	public ResponseEntity<RestResponse> getAllCouses() throws Exception{
		try {
			return ResponseEntity.ok().body(new RestResponse("200",courseService.getAllCourses(),"Success"));
						
		}catch(Exception e) {
			return ResponseEntity.ok().body(new RestResponse("500",null,"Internal Server Error"));
		}
	}
	
	@PostMapping("/get")
	public ResponseEntity<RestResponse> getAllCoursesById(@RequestParam String Id) throws Exception{
		try {
			return ResponseEntity.ok().body(new RestResponse("200",courseService.getAllCoureById(Id),"Success"));
						
		}catch(Exception e) {
			return ResponseEntity.ok().body(new RestResponse("500",null,"Internal Server Error"));
		}
	}

	@PostMapping("/update")
	public ResponseEntity<RestResponse> updateCount(@RequestParam String Id) throws Exception{
		try {
			Course course	=	 courseService.updateCount(Id);
			if(course!=null)
				return ResponseEntity.ok().body(new RestResponse("200",course,"Success"));
			else
				return ResponseEntity.ok().body(new RestResponse("202",null,"Maxmimun Count Reached"));
		}catch(NoSuchElementException nse) {
			return ResponseEntity.ok().body(new RestResponse("404",null,"Course Not Available. Please Contact Administrator"));
		}
		catch(Exception e) {
			return ResponseEntity.ok().body(new RestResponse("500",null,"Internal Server Error"));
		}
	}
	
	@PostMapping("/validate")
	public ResponseEntity<RestResponse> validateQA(@RequestBody List<QAResponse> qa) throws Exception{
		try {
			return ResponseEntity.ok().body(new RestResponse("200",courseService.validateAnswers(qa),"Success"));
						
		}catch(Exception e) {
			return ResponseEntity.ok().body(new RestResponse("500",null,"Internal Server Error"));
		}
	}
	
	@PostMapping("/getMock")
	public ResponseEntity<RestResponse> getMockQA(@RequestParam String id) throws Exception{
		try {
			return ResponseEntity.ok().body(new RestResponse("200",courseService.getMockTestByCourseId(id),"Success"));
						
		}catch(Exception e) {
			return ResponseEntity.ok().body(new RestResponse("500",null,"Internal Server Error"));
		}
	}
	
}
