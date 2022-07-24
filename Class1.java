package oop;
public class Class1 {
	public static void add(int a, int b) {
	int sum=a+b;
	System.out.println(sum);
	}
	public static void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println(sum);
	}
public static void add(int a,int b,int c,int d) {
	int sum=a+b+c+d;
	System.out.println(sum);
}
public static void add(double a,double b) {
	double sum=a+b;
	System.out.println(sum);
}
public static void add(int a,double b) {
	double sum=a+b;
	System.out.println(sum);
}
public static void add(double a,int b) {
	double sum=a+b;
	System.out.println(sum);
}
public static void main(String[]args) {
	add(1,2);
	add(2,3,4);
	add(2,3,4,5);
	add(10.2,1.2);
	add(5,9.2);
	add(2.5,3);
}
}
