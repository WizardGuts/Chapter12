import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Exercise12_15 {
	public static void main(String[] args) throws Exception {
		
		java.io.File file = new java.io.File("Exercise12_15.txt");
		
		if (file.exists()) {
			System.out.println("File already exists.");
			System.exit(0);
		}
		
		try (
			java.io.PrintWriter output = new java.io.PrintWriter(file);
		) {
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 100) + 1));
				output.print(" ");
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		try (
			Scanner input = new Scanner(file);
		) {
			while(input.hasNext()) {
				list.add(input.nextInt());
			}
		}
		
		Collections.sort(list);
		
		System.out.print(list.toString());
		System.out.println(" ");
	}
}