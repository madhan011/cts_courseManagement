package com.learning.management.courseManagement.model;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String category;
	
	private String courseName;
	
	private String courseTitle;
	
	private File image;
	
	private String description;
	
	private boolean isActive;
	
	private Long subscriptionCount;
	
	private Long maxCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Long getSubscriptionCount() {
		return subscriptionCount;
	}

	public void setSubscriptionCount(Long subscriptionCount) {
		this.subscriptionCount = subscriptionCount;
	}

	public Long getMaxCount() {
		return maxCount;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", category=" + category + ", courseName=" + courseName + ", courseTitle="
				+ courseTitle + ", image=" + image + ", description=" + description + ", isActive=" + isActive
				+ ", subscriptionCount=" + subscriptionCount + ", maxCount=" + maxCount + "]";
	}

	public void setMaxCount(Long maxCount) {
		this.maxCount = maxCount;
	}
	
	
	
	

}
