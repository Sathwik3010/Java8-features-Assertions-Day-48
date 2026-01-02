package com.codegnan.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Studentsss{
	int id;
	String name;
	int grade;
	
	public Studentsss(int id, String name, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
}
public class Main94 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Studentsss> list = new ArrayList<>();
		
		for(int i=0; i<n ; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int grade = sc.nextInt();
			list.add(new Studentsss(id, name, grade));
		}
		
		Collections.sort(list, new GradeComparator());
		
		for(Studentsss s: list) {
			System.out.print(s.name+" ");
		}
		sc.close();
	}

}
