package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main (String[] args) {
		hello("world");

		double len = 5;

		System.out.println("Площад квадрата со стороной " + len + " = " + area(len));

		double a = 4;
		double b = 6;
		System.out.println("Площад прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
	}


	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area (double l) {
		return l * l;
	}

	public static double area (double a, double b) {
		return a * b;
	}

}