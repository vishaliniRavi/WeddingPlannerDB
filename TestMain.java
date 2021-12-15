package com.weddingplanner;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Wedding Planner");
		System.out.println("\n1.Register\n2.Login\n3.Admin login\nEnter your choice");
		int choice=Integer.parseInt(sc.nextLine());
		String email_id = null;
		String User_name = null;
		String password = null;
		UserDao userDao=null;
		switch(choice) {
		case 1:
			userDao = new UserDao();
			do {
				System.out.println("Enter user name");
				User_name = sc.nextLine();
				if (User_name.matches("[A-Z a-z]+")) {
					flag = 1;
					break;
				} else
					flag = 0;
				System.out.println("invalid name");
			} while (flag == 0);

			do {
				System.out.println("Enter email id");
				email_id = sc.nextLine();
				if (email_id.matches("[a-z]+[a-z 0-9]+[@][a-z]+[.][a-z]+")) {
					flag = 1;
					break;
				} else
					flag = 0;
				System.out.println("invalid email");
			} while (flag == 0);
			do {
				System.out.println("Enter password");
				password = sc.nextLine();
				if (password.matches("[A-Z]+[a-Z]+[0-9]+{8,10}")) {
					flag = 1;
					break;
				} else
					flag = 0;
				System.out.println("invalid email");
			} while (flag == 0);

			User user = new User(User_name, email_id, password);
			userDao.insertUser(user);

			 
		case 2:
			userDao=new UserDao();
			System.out.println("User Login");
			System.out.println("Enter the registered email id");
			String email=sc.nextLine();
			
		}

	}

}
