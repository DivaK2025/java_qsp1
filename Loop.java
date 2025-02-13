
class Loop
{
	public static void main(String[] args) 
	{
		//print no 1 to 10
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(i+ " ");
		}
		 
		 //print A to Z
		 for( char ch ='A';ch <='Z';ch++)
		{
			System.out.println(ch+ " ");
		}
		
		// print a toz
		for(char ch = 'a'; ch<='z'; ch++)
		{
			System.out.println(ch+ " ");
		}

		//print digit 0 to 9
		for(char ch ='0';ch<='9';ch++)
		{
			System.out.println(ch+ " ");
		}

		//print ACSII valuses 
		for(int  ch = 0;ch<=127; ch++)
		{
			System.out.println(ch+ " :" +((char) ch)+ " ");
		}

		// print z to a
		for(char ch='z';ch>='a';ch--)
		{
			System.out.println(ch+ " ");
		}

	}
}
