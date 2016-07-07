package com.niit.comparator;

import java.util.Collections;
import java.util.LinkedList;

public class TestEmpl {
	
	public static void main(String[] args) {
		
	LinkedList<Empl> list=new LinkedList<Empl>();
	list.add(new Empl("tim",3000));
	list.add(new Empl("rim",5000));
	list.add(new Empl("kim",7000));
	list.add(new Empl("jim",9000));
	Collections.sort(list,new MySalaryComp());
	for(Empl e : list)
		System.out.println(e.getName()+' '+e.getSalary());
	
	}
	

}
