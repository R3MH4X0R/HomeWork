package com.gmail.ditritusa;

public class Human {
	private String firstName;
	private int age;
	private boolean sex;

	public Human(String firstName, int age, boolean sex) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		String tempSex;
		if (this.sex == true) {
			tempSex = "Male";
		} else {
			tempSex = "Female";
		}
		return "Human [Name:" + firstName + ", age: " + age + ", sex: " + tempSex + "]";
	}

}
