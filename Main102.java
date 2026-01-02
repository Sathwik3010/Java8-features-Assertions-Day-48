package com.codegnan.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class Main102 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            int price = sc.nextInt();
            list.add(new Product(id, name, price));
        }
		
		Collections.sort(list, new Comparator<Product>() {

			@Override
			public int compare(Product p1, Product p2) {	
				return p2.price- p1.price;
			}
			
		});
		
		for(Product p : list) {
			System.out.print(p.name+" ");
		}
		sc.close();
	}

}
