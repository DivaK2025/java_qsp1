class Census 
{
	public static void main(String[] args) 
	{
		long currpop = 312032486;
		long seconds = (365*24*60*60)*5;

		long birth = seconds/7;
		long death = seconds/13;
		long imm = seconds/45;

		long newpop = currpop+birth-death+imm;

		System.out.println("current population=" +currpop);
		System.out.println("new population=" +newpop);
	}
}


//(Write a program to display the population for each next five years .assume currpop 312032486 and one yr has 365 days).
//currpop = 312032486
//newpop = 325932970