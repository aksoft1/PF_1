
public class ex1 {

	public static void main(String[] args) {
							
		//22�� �����ϴ� for���� �ۼ��Ͻÿ� , �ʱⰪ0
		//100�� �����ϴ� for���� �ۼ��Ͻÿ�, �ʱⰪ 3
		
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

		//1-100 ���� �ڿ����� ���� ���Ͻÿ�
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
		
		//1-100���� Ȧ���� ���� ���Ͻÿ�
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
		//13-2��ŭ ������ ������(�Ҽ��� 1�� �ڱ��ڽ��� ������ ������ ���� ������ ���������� Ȯ��)
		//�Ҽ����� Ȯ�� (%�����ڸ� �Ἥ �������� 0�̸� �ռ���[������ ������],
		//������ �������� ������ �Ҽ�
				
		int val = 15;
		int div = 2;
		boolean isPrimeNum = true;
		
		for(int i = 0; i < val-2; i++)
		{
			//������ ��������!==>�ռ���
			if(0 == val % div)
			{
				System.out.println(div);
				isPrimeNum = false;
				break;
			}
			
			div++;
			
		} // for ���� ��
		
		if(isPrimeNum == true) // ������ �� ���ҳ�
		{
			System.out.println("�Ҽ�"); //�Ҽ�
		}
		else
		{
			System.out.println("�ռ���");
		}
		
		*/
		/*
		//2-9�ܱ��� ����Ͻÿ�
		
		//�ּ� 8�� ���� for��
		//�� �ܺ��� 9�� ���� for��
		
				
		for(int i=2; i<10; i++)
		{
			System.out.println(i + " ��");
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
	
		

