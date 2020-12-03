package com.scifdemo.demo;

import com.scifdemo.demo.domain.EmploymentType;

public class EnumTest
{
	public static void main(String[] args)
	{
		System.out.println(EmploymentType.CONTRACTOR.toString().equals("CONTRACTOR"));
	}
}