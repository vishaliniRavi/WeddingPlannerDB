package com.weddingplanner;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Wedding Planner");
		System.out.println("\n1.Register\n2.Login\n3.Admin login\nEnter your choice");
		int choice=Integer.parseInt(sc.nextLine());
		UserDao userDao=null;
		switch(choice) {
		case 1:
			userDao=new UserDao();
			System.out.println("Enter user name");
			String User_name=sc.nextLine();
			System.out.println("Enter email id");
			String email_id=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			User user=new User(User_name,email_id,password);
			userDao.insertUser(user);
		case 2:
			userDao=new UserDao();
			System.out.println("User Login");
			System.out.println("Enter the registered email id");
			String email=sc.nextLine();
			
		}

	}

}
