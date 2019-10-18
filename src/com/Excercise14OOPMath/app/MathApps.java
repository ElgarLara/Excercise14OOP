package com.Excercise14OOPMath.app;

import java.util.Scanner;

import com.Excercise14OOPMath.model.MathOperations;

public class MathApps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable
		double base=0;
		double height=0;
		double radio=0;
		double side=0;
		double result=0;
		
		//objects
		Scanner input =new Scanner(System.in);
		MathOperations myOperations=new MathOperations();
		System.out.println("Input Base");
		base=input.nextDouble();
		System.out.println("Input Height");
		height=input.nextDouble();
		result=MathOperations.areaTriangle(base, height);
		System.out.println("Triangle area:"+result);
		MathOperations.PI;

	}

}
