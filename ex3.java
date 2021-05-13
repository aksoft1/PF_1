
public class ex3 {


	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int res = add1(a, b);		
		System.out.println("result = " + res);
				
		add2(a, b);
		add3(a, b);
	
	}

	public static int add1(int a, int b) {
		int result;
		result = a + b;
		return result;
		
	}
	
	public static void add2 (int a, int b) {
		int result;
		result = a + b;
		System.out.println("result = " + result);
	}
	
	public static int add3 (int a, int b) {
		int result;
		result = a + b;
		System.out.println("result = " + result);
		return result;
	}
	
	
}
