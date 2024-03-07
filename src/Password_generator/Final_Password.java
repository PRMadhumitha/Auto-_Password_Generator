package Password_generator;

import java.util.Scanner;

public class Final_Password {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How Many Random Password do you want Generated?");
		int total = input.nextInt();
		System.out.println("How Many Character long do you want your Random passwords to be?");
		int length = input.nextInt();
		
		String[] random_Pass = new String[total];
		for(int i=0;i<total;i++) {
			String randamPassword = "";
			for(int j=0;j<length;j++) {
				randamPassword += randomCharacter();   //+= addition assignment operators
			}
			 random_Pass[i] = randamPassword;
		}
		printPasswords( random_Pass);
		System.out.println(getPasswordStrength(length));
	}
	public static String getPasswordStrength(int length) {
		if(length<5) {
			return "weak";
		}
		else if(length<10) {
			return "medium";
		}
		else {
			return "Strong";
		}
	}
	public static void printPasswords(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static char randomCharacter() {
		int rand = (int) (Math.random()*62);
		if(rand<=9) {
			//number: rand is between 0-9 => 48-57 in ASCII
			int ascii = rand + 48; //48-0 = 48
			return (char)(ascii);
		} 
		else if(rand<=35) {
			int ascii = rand + 55; //65-10 = 55
			return (char)(ascii);
		}
		else {
			int ascii = rand + 61; //65-10 = 55
			return (char)(ascii);
		}
}
}
