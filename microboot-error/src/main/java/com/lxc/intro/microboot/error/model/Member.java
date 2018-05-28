package com.lxc.intro.microboot.error.model;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Member {
	@NotBlank(message="{member.emali.notnull.error}")
	@Email(message="{member.emali.format.error}")
	private String email;
	@NotNull(message="{member.age.notnull.error}")
	@Digits(message="{member.age.number.error}", integer=3,fraction=0)//检查是否是一种数字的整数、分数,小数位数的数字。  
	private Integer age;
	@NotNull(message="{member.salary.notnull.error}")
	@Digits(message="{member.salary.number.error}", integer=10,fraction=2)//检查是否是一种数字的整数、分数,小数位数的数字。  
	private Double salary;
	@NotNull(message="{member.birthday.notnull.error}")
	private Date birthday;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Member [email=" + email + ", age=" + age + ", salary=" + salary + ", birthday=" + birthday + "]";
	}
	
}
