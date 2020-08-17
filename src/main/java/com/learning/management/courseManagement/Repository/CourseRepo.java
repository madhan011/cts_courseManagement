package com.learning.management.courseManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.management.courseManagement.model.Course;


@Repository
public interface CourseRepo extends JpaRepository<Course, Long>{

	List<Course> findByIsActive(boolean b);

}
