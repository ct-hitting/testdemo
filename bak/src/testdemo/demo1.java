package testdemo;

public class demo1 {
	public int age;
	public String name;
	public String sex;
	public int height;
	public int weight;

	public demo1(int age, String name, String sex, int height, int weight) {
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
	}

	demo1(){
		System.out.println("test the log show");
		System.out.println("test a rebase - master");
	}

	static{
		System.out.println("static");
	}


	public static void main(String[] args){
		demo1 d1 = new demo1(18,"MKJ","男",180,60);
		System.out.println("new a demo1");
		d1.age = 18;
		demo2 d2 = new demo2();
	}
}
