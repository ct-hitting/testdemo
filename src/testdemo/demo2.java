package testdemo;

public class demo2 {
	public String name;
	public int age;
	public String sex;
	public int count;

	demo2(){
		System.out.println("first status");
		System.out.println("test a rebase - testing");
	}

	public void Calculate(int x,int y){
		count = x*y;
	}



	public static void main(String[] args){
		demo2 d2 = new demo2();
	}
}
