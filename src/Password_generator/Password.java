package Password_generator;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		//Ask the user for how many passwords they want and length of the password
		System.out.println("How Many Random Password do you want Generated?");
		int total = in.nextInt();
		System.out.println("How Many Character long do you want your Random passwords to be?");
		int length = in.nextInt();
		
		
		//create array to store random password
		String[] randomPasswords = new String[total];
		
	    //'0'-'9' = 48-57 in ASCII
		//'A'-'Z' = 65-90 in ASCII
		//'a'-'z' = 97-122 in ASCII
		
		//loop through total number of password
		
		for(int i=0;i<total;i++) {
			//generate one random Passsword
			
			String randamPassword = "";
			for(int j=0;j<length;j++) {
				//generate one random character
				randamPassword += randomCharacter();
				
			}
			//add our random password to the array
			randomPasswords[i] = randamPassword;
		}
		//print our array of password
		printPasswords(randomPasswords);
		
		//print password Strength
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
			
			
			//Generator  a random number that represents all possible character in our password
			//10 digits + 26 uppercase letters + 26 lowercase letters  = 62 possible characters
			
			
			int rand = (int) (Math.random()*62);
			
			
			
			
			//break up round into intervals to represents numbers, uppercase letters, and lowercase letters
			//rand is between 0-61 inclusive
			//if rand is between 0-9 =>  number
			//if rand is between 10-35 => uppercase
			//if rand is between 36-61 => lowercase
			
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


