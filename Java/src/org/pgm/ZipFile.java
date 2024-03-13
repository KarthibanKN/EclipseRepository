package org.pgm;

import java.io.*;
import java.util.zip.*;

public class ZipFile {
	public static void main(String[] args) throws FileNotFoundException {
		String zipFilePath="D:\\Karthiban\\Zip.zip";
		int pdfCount=0;
		int docxCount=0;
		int txtCount=0;
		ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFilePath));
		ZipEntry entry;
		try {
			while((entry=zipInputStream.getNextEntry())!=null) {
				String fileName = entry.getName();
				if (fileName.endsWith(".pdf")) {
					pdfCount++;
				} 
				else if (fileName.endsWith(".docx")) {
					docxCount++;
				} 
				else if (fileName.endsWith(".txt")) {
					txtCount++;
				}
				zipInputStream.closeEntry();
			}
			System.out.println("Number of pdf files:"+pdfCount);
			System.out.println("Number of docx files:"+docxCount);
			System.out.println("Number of txt files:"+txtCount);
			zipInputStream.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	} 
}
