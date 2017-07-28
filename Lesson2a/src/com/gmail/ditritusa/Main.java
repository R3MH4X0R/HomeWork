package com.gmail.ditritusa;

public class Main {

	public static void main(String[] args) {

		Student st0 = new Student("Ahsoka", "Tano", "15-j", 18, false, 78);
		Student st1 = new Student("Anakin", "Skywalker", "15-j", 22, true, 85);
		Student st2 = new Student("Obi-Wan", "Kenobi", "15-j", 28, true, 90);
		Student st3 = new Student("Mace", "Windu", "66-o", 32, true, 89);
		Student st4 = new Student("Kit", "Fisto", "66-o", 23, true, 70);
		Student st5 = new Student("Plo", "Koon", "66-o", 30, true, 88);
		Student st6 = new Student("Saesee", "Tiin", "66-o", 17, true, 67);
		Student st7 = new Student("Addi", "Gallia", "20-g", 19, false, 68);
		Student st8 = new Student("Even", "Piell", "20-g", 40, true, 61);
		Student st9 = new Student("Caleb", "Dume", "20-g", 20, true, 72);
		Student st10 = new Student("Ezra", "Bridger", "20-g", 18, true, 50);

		Group gr = new Group();

		try {
			gr.addStudent(st0);
			gr.addStudent(st1);
			gr.addStudent(st2);
			gr.addStudent(st3);
			gr.addStudent(st4);
			gr.addStudent(st5);
			gr.addStudent(st6);
			gr.addStudent(st7);
			gr.addStudent(st8);
			gr.addStudent(st9);
			gr.addStudent(st10);
		} catch (StudentIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(gr.toString());
	}

}
