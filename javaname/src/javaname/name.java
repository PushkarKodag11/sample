package javaname;

public class name {

	public static void main(String[] args) {
		System.out.println("Hello World");
		show();

	}
	
	public static void show() {
		int[] arr = {1,2,3,4,4};
		int sum=0;
		
		for(int n:arr)
		{
			sum+=n;
			sum+=n;
			sum+=n;
			System.out.println(n);
		}
		System.out.println("Show method here !");
		
	}

}
