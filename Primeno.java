public class Primeno {

	public static void main(String[] args) 
	{
		int i=0;
		int num=0;
		
		String prime = " ";
		
		for(i = 1;i<=100;i++)
		{
			int counter = 0;
			for(num =i;num>=1;num--)
			{
				if(i%num == 0)
				{
					counter = counter +1;
				}
			}
			if(counter == 2)
			{
				prime = prime + i + " ";
			}
		}
		System.out.println("prime Numbers between 1 to 100 are :");
		System.out.println(prime);
		

	}

}
