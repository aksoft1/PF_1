
public class ex1 {

	public static void main(String[] args) {
							
		//22번 수행하는 for문을 작성하시오 , 초기값0
		//100번 수행하는 for문을 작성하시오, 초기값 3
		
		/*
		for(int i=0; i<22; i++)
		{
			System.out.println(i);
		}
		
		
		for(int i=3; i<103; i++)
		{
			System.out.println(i);
		
		}
		*/
		
		/*

		//1-100 사이 자연수의 합을 구하시오
		int total=0;
		int sum=0;
		
		for(int i=0; i<=100; i++)
		{
			total = total + sum;
			sum = sum + 1;
			
		}
		System.out.println(total);
		
		*/
		
		/*
		
		//1-100사이 홀수의 합을 구하시오
		int total = 0;
		int odd = 0;
		
		for(int i=0; i<=100; i++)
		{
			if(i % 2 == 1)
				total = total + odd;
				odd = odd + 1;
		}
		System.out.println(total);
			
		*/		
		/*
		//13-2만큼 루프를 돌린다(소수는 1과 자기자신을 제외한 나머지 수로 나누어 떨어지는지 확인)
		//소수인지 확인 (%연산자를 써서 나머지가 0이면 합성수[나누어 떨어짐],
		//나누어 떨어지지 않으면 소수
				
		int val = 15;
		int div = 2;
		boolean isPrimeNum = true;
		
		for(int i = 0; i < val-2; i++)
		{
			//나누어 떨어졌다!==>합성수
			if(0 == val % div)
			{
				System.out.println(div);
				isPrimeNum = false;
				break;
			}
			
			div++;
			
		} // for 문의 끝
		
		if(isPrimeNum == true) // 루프를 다 돌았냐
		{
			System.out.println("소수"); //소수
		}
		else
		{
			System.out.println("합성수");
		}
		
		*/
		/*
		//2-9단까지 출력하시오
		
		//최소 8번 실행 for문
		//각 단별로 9번 실행 for문
		
				
		for(int i=2; i<10; i++)
		{
			System.out.println(i + " 단");
			System.out.println("----------");
		
			for(int j=1; j<10; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j);
				
			}
			System.out.println();
		}
		*/
		
		
		
		int dan = 2;
		int mul = 1;
		
		for(int i = 0; i < 8; i++)
		{
			for(int k = 0; k < 9; k++)
			{
				System.out.println(dan + " * " + mul + " = " + dan * mul);
				mul = mul + 1;
			}
		mul = 1;
		dan = dan + 1;
		}
		
	}
}
	
		

