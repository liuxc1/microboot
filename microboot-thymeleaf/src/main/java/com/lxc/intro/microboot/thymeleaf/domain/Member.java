package com.lxc.intro.microboot.thymeleaf.domain;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Integer age;
	private Double salary;
	private Date dirthday;

	public Member() {
	}

	public Member(Long id, String name, Integer age, Double salary, Date dirthday) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dirthday = dirthday;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getDirthday() {
		return dirthday;
	}

	public void setDirthday(Date dirthday) {
		this.dirthday = dirthday;
	}

}
