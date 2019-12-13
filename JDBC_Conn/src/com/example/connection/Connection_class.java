package com.example.connection;

public class Connection_class {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		}
	}

}
