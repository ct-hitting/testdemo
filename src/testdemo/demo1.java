package testdemo;

public class demo1 {
	public int age;
	public String name;
	public String sex;
	public int height;
	public int weight;

	demo1(int age,String name,String sex){
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	demo1(){
		System.out.println("test the log show");
		System.out.println("test a rebase - master");
	}

	static{
		System.out.println("static");
	}

	public static void main(String[] args){
		demo1 d1 = new demo1();
		System.out.println("new a demo1");
	}
}
