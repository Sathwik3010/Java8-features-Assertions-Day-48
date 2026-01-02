package com.codegnan.collections;

import java.util.Comparator;

public class GradeComparator implements Comparator<Studentsss>{

	@Override
	public int compare(Studentsss s1, Studentsss s2) {
		return s2.grade - s1.grade;
	}

}
