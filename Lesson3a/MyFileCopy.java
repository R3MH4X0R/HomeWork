package com.gmail.ditritusa;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MyFileCopy {

	private static void myCopy(File in, File out) throws IOException {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(in);
			os = new FileOutputStream(out); 
			byte[] buf = new byte[1024];
			int bytesRead;
			while ((bytesRead = is.read(buf)) > 0) {
				os.write(buf, 0, bytesRead);
			}
		} finally {
			is.close();
			os.close();
		}
	}
	public static void copyMyFiles(String pathIn, String pathOut, FileFilter filter) {
		File folderIn = new File(pathIn);
		File folderOut = new File(pathOut);
		
		File[] files = folderIn.listFiles(filter);
		for (File file : files) {
			try {
				myCopy(file, new File(folderOut, file.getName()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
