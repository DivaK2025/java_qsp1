class Main 
{
	public static void main(String[] args) 
	{
		int dif1 = 7; //odd
		int dif2 = -2; // odd

		for(int i =1;i<=i;i++){
			int n =i;
		for(int j=1;j<=i;j++){
			System.out.print(n+ " ");

			if(j%2!=0){
				n +=dif1;
			}else{
				n+=dif2;
			}
			dif1 -= 2;
            dif2 += 2;
			System.out.println();
		}
				
	}
}
}