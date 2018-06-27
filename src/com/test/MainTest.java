package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.Student;
import com.main.StudentSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class MainTest {

	@Test
	void test() {
		
		Student obj1 = new Student(1,"Rajat",22);
		Student obj2 = new Student(2,"Vikram",22);
		Student obj3 = new Student(3,"Aakash",22);
		Student obj4 = new Student(4,"Sharoon",23);
		Student obj5 = new Student(5,"Joe",23);
		List<Student> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		Collections.sort(list, new StudentSorter());
		assertEquals("[Student [id=4, name=Sharoon, age=23], Student [id=5, name=Joe, age=23], Student [id=2, name=Vikram, age=22], "
				+ "Student [id=1, name=Rajat, age=22], Student [id=3, name=Aakash, age=22]]",list.toString());
}
}
