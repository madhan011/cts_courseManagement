package com.learning.management.courseManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.learning.management.courseManagement.model.Course;
import com.learning.management.courseManagement.model.CourseMockQA;
import com.learning.management.courseManagement.model.QAResponse;

@Service
public interface CourseService {

	List<Course> getAllCourses();

	Optional<Course> getAllCoureById(String id);

	Course updateCount(String id) throws Exception;
	
	Integer validateAnswers(List<QAResponse> qa) throws Exception;

	List<CourseMockQA> getMockTestByCourseId(String courseId) throws Exception;
	

}
