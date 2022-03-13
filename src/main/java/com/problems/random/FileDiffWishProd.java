package com.problems.random;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class FileDiffWishProd {

	private Set<String> sapInvoices = new HashSet<>();
	
	private Set<String> ngraInvoices = new HashSet<>();

	public static void main(String[] args) {
		FileDiffWishProd obj = new FileDiffWishProd();
		obj.work();
	}
	
	private void work() {
		readSAPFile();
		readNGRAFile();
		
		System.out.println("SAP invoice = " + sapInvoices.size());
		System.out.println("NGRA invoice = " + ngraInvoices.size());
		
		for(String sapInvoice : sapInvoices) {
			if(!ngraInvoices.contains(sapInvoice)) {
				System.out.println(sapInvoice);
			}
		}
	}

	private void readSAPFile() {
		try {
			BufferedReader fis = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File("C:\\to_delete\\wish_data_issue\\compare\\sap.txt"))));
			String line = "";

			line = fis.readLine();
			line = fis.readLine();
			while (line != null) {
				sapInvoices.add(line);
				line = fis.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void readNGRAFile() {
		try {
			BufferedReader fis = new BufferedReader(new InputStreamReader(
					new FileInputStream(new File("C:\\to_delete\\wish_data_issue\\compare\\ngra.txt"))));
			String line = "";

			line = fis.readLine();
			line = fis.readLine();
			while (line != null) {
				ngraInvoices.add(line);
				line = fis.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
