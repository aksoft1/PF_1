package sh1;

public class PrimeNum
{
	public static void main(String[] args)
	{
		int val = 8;
		int div = 2;
		boolean PrimeNum = true;
		
		for(int i = 0; i < val-2; i++)
		{
			if(val % div ==0);
			PrimeNum = false;
			
			break;
		}

		if(PrimeNum == true)
		{
			
			System.out.println("�Է��� ���� " + val + "�Դϴ�");
			System.out.println("�ش� ���� �Ҽ��Դϴ�" );
		}
		else
			System.out.println("�Է��� ���� " + val + "�Դϴ�");
			System.out.println("�ش� ���� �ռ����Դϴ�");
	}
}
