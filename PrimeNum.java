package sh1;

public class PrimeNum
{
	public static void main(String[] args)
	{
		int val = 6;
		int div = 2;
		boolean PrimeNum = true;
		
		for(int i = 0; i < val-2; i++)
		{
			if(val % div == 0)
			{
				PrimeNum = false;
				break;
			}
			div++;
		}
		if(PrimeNum == true)
		{
			System.out.println("입력한 수는 " + val + "입니다");
			System.out.println("해당 수는 소수입니다");
		}
		else
		{
			System.out.println("입력한 수는 " + val + "입니다");
			System.out.println("해당 수는 합성수입니다");
		}
	}
}
	
