package com.gmail.ditritusa;

public class Student extends Human {

	private String secondName;
	private String group;
	private double perfomance;

	public Student(String firstName, String secondName, String group, int age, boolean sex, double perfomance) {
		super(firstName, age, sex);
		this.secondName = secondName;
		this.group = group;
		this.perfomance = perfomance;
	}

	public Student() {
		super();
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public double getPerfomance() {
		return perfomance;
	}

	public void setPerfomance(double perfomance) {
		this.perfomance = perfomance;
	}

	@Override
	public String toString() {
		return "Student [Second name: " + secondName + ", Group: " + group + ", Average score: " + perfomance + "]";
	}

}
