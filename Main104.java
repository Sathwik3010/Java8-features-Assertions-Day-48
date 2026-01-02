package com.codegnan.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Employeee {
    int id;
    String name;
    int salary;

    Employeee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Main104 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Employeee> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			list.add(new Employeee(id, name, salary));
		}
		
		Collections.sort(list, (e1, e2)->e2.salary-e1.salary);
		
		for(Employeee e : list) {
			System.out.print(e.name+" ");
		}
		sc.close();
	}

}
