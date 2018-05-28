package com.lxc.intro.microboot.restful.vo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Member implements Serializable {
	private String id;
	private String name;
	private Integer age;
	private Double salary;
	private Date birthDay;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", birthDay=" + birthDay
				+ "]";
	}

}
