package com.gmail.ditritusa;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		/*
		 * �������� ��������� ������� ��������� ����� (� ������� ������������
		 * ����������� � �������� ������ doc) �� �������� ��������� � ������� ��������.
		 */

		MyFileFilter mff = new MyFileFilter("txt");

			MyFileCopy.copyMyFiles(null, "C:\\Users\\Remax\\eclipse-workspace\\Lesson4a", mff);
	}

}
