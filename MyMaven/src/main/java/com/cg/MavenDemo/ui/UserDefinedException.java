package com.cg.MavenDemo.ui;

import java.util.Scanner;

import com.cg.MavenDemo.dto.CustomClass;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomClass emp=new CustomClass();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the EMployee name in caps");
		
		try {
			emp.setName(sc.next());
			System.out.println("Name is set successfully");
		}
		catch(CustomClass c) {
			System.out.println(c.getMessage());
		}

	}

}
