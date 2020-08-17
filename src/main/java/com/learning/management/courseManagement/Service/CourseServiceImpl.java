package com.learning.management.courseManagement.Service;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learning.management.courseManagement.Repository.CourseMockQARepo;
import com.learning.management.courseManagement.Repository.CourseRepo;
import com.learning.management.courseManagement.model.Course;
import com.learning.management.courseManagement.model.CourseMockQA;
import com.learning.management.courseManagement.model.QAResponse;

@Component
public class CourseServiceImpl implements CourseService{

	
	@Autowired
	CourseRepo courseRepo;
	
	@Autowired
	CourseMockQARepo courseMockQARepo;
	
	@Autowired
	ObjectMapper mapper;
	
	@Override
	public List<Course> getAllCourses() {

		return courseRepo.findByIsActive(true);
	}

	@Override
	public Optional<Course> getAllCoureById(String id) {
		
		return courseRepo.findById(Long.valueOf(id));
	}

	@Override
	public Course updateCount(String id)  throws Exception{
		Optional<Course> course	=	getAllCoureById(id);
		try {
			if(course.isPresent() && course.get()!=null) {
				if(course.get().getMaxCount()>course.get().getSubscriptionCount()) {
					course.get().setSubscriptionCount(course.get().getSubscriptionCount()+1);
					course	= Optional.ofNullable(courseRepo.save(course.get()));
				}else {
					course	=	null;
				}
			}
			else {
				throw new NoSuchElementException();
			}
		}catch(Exception e) {
			throw e;
		}
		return course.orElse(null);
	}

	@Override
	public Integer validateAnswers(List<QAResponse> qaResponselist) throws Exception {
		Integer markResult	=	0;
		try {
			System.out.print("Test"+qaResponselist);
			
			if(qaResponselist!=null) {
				
				for(QAResponse qaResponse: qaResponselist) {
					
					Optional<CourseMockQA> courseMockQa	=	courseMockQARepo.findById(qaResponse.getId());
					if(courseMockQa.isPresent() && courseMockQa.get().getCrtAnswer().equalsIgnoreCase(qaResponse.getAnswer()) ) {
						markResult	= markResult+1;
					}
				}
			}
			
		}catch(Exception e) {
			throw e;
		}
		return markResult;
	}
	
	@Override
	public List<CourseMockQA> getMockTestByCourseId(String courseId)throws Exception{
		
		return courseMockQARepo.findByCourseIdAndIsValid(Long.parseLong(courseId), true);
		
	}
	

}
