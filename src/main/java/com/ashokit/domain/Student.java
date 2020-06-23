package com.ashokit.domain;

import lombok.Data;

@Data
public class Student {

	private String name;
	private String pwd;
	private String email;
	private String gender;
	private Long phno;
	private String course;
	private String[] preferrableTimings;

}
