package com.gmail.ditritusa;

import java.util.ArrayList;
import java.util.Collections;

public class Group {

	private Student arrayOfStudents[] = new Student[10];

	public Group(Student[] arrayOfStudents) {
		super();
		this.arrayOfStudents = arrayOfStudents;
	}

	public Group() {
		super();
	}

	public Student[] getArrayOfStudents() {
		return arrayOfStudents;
	}

	public void addStudent(Object o) throws StudentIndexOutOfBoundsException {
		Student temp = (Student) o;
		int isFull = 0;
		for (int i = 0; i < arrayOfStudents.length; i++) {
			if (arrayOfStudents[i] != null) {
				isFull++;
			}

		}
		if (isFull >= arrayOfStudents.length) {
			throw new StudentIndexOutOfBoundsException();
		}

		for (int i = 0; i < arrayOfStudents.length; i++) {
			if (arrayOfStudents[i] == null & temp != null) {
				arrayOfStudents[i] = temp;
				break;
			}
		}

	}

	public void deleteStudent(Object o) {
		Student temp = (Student) o;
		int counter = 0;
		for (Student student : arrayOfStudents) {
			if (this.arrayOfStudents[counter] == temp & this.arrayOfStudents[counter] == student & temp != null) {
				this.arrayOfStudents[counter] = null;
				System.out.println("Deleted " + temp + "from index: " + counter);
			} else if (counter == 9) {
				break;
			}
			counter++;
		}

	}

	public void findStudent(String a) {
		String temp = a;
		for (int i = 0; i < arrayOfStudents.length; i++) {
			if (arrayOfStudents[i].getSecondName().equals(temp) & arrayOfStudents[i] != null & temp != null) {
				System.out.println("Find at index: " + i);
			}

		}

	}

	@Override
	public String toString() {
		String temp = "";
		ArrayList<String> arrayN = new ArrayList<String>();

		for (int i = 0; i < arrayOfStudents.length; i++) {
			if (arrayOfStudents[i] != null) {
				arrayN.add(arrayOfStudents[i].getSecondName());
			}

		}
		Collections.sort(arrayN);
		for (int i = 0; i < arrayN.size(); i++) {
			temp += i + " " + arrayN.get(i) + "\n";

		}

		return temp;
	}
}
