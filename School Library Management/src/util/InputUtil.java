package util;

import java.util.Scanner;


import main.Student;
import main.*;

public interface InputUtil {

	public static int enterInteger(String title) {
		System.out.println(title);
		Scanner scanner = new Scanner(System.in);
		int operation = scanner.nextInt();
		return operation;
	}
	
	public static String enterString(String title) {
		System.out.println(title);
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		return answer;
	}
	
	
	
	public static Student fill() {
		String name = InputUtil.enterString("Unesite ime: ");
		String surname = InputUtil.enterString("Unesite prezime: ");
		int age = InputUtil.enterInteger("Starosna dob: ");
		String className = InputUtil.enterString("Smjer: ");
		int balanceBook = InputUtil.enterInteger("Broj knjiga koji student duži: ");
		Student student = new Student(name,surname,age,className,balanceBook);
		return new Student(name,surname,age,className,balanceBook);
	
	}
	
	
	
	
}
