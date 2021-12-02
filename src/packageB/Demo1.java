package packageB;

import packageA.Demo;

public class Demo1 extends Demo {
	public static void main(String[] args) {
		System.out.println("This is main method:");
		Demo1 d=new Demo1();
		add();
		d.name();
		
	}

	static {
		System.out.println("this is static block");
	}

	public Demo1() {
		System.out.println("This is demo1 constructor");
	}

	public void name() {
		System.out.println("this is a method");

	}
	public static void add() {
		System.out.println("Im static method");
	}

}
