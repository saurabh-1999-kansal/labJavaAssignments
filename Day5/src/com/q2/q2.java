package com.q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		try {

			File file = new File("demo.txt");
			BufferedReader text = new BufferedReader(new FileReader(file));

			String temp = text.readLine();

			while (temp != null) {

				String wordsArray[] = temp.split(" ");

				for (int counter = 0; counter < wordsArray.length; counter++) {

					if (h1.containsKey(wordsArray[counter])) {
						h1.put(wordsArray[counter], h1.get(wordsArray[counter]) + 1);
					}

					else {
						h1.put(wordsArray[counter], 1);
					}

				}

				temp = text.readLine();
			}

			text.close();

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String temp : h1.keySet()) {
			System.out.println(temp + " appears " + h1.get(temp));
		}

	}

}
