package com.bean;

import java.util.List;

public class Classes {
	
	private int id;
	private String name;
	private Teacher teacher;
	
	private List<Student> stu;

	@Override
	public String toString() {
		return "Classes [id=" + id + ", name=" + name + ", teacher=" + teacher
				+ ", stu=" + stu + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	public Classes(int id, String name, Teacher teacher, List<Student> stu) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.stu = stu;
	}

	public Classes() {
		super();
	}
    
	
	
	
}