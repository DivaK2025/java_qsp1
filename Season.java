import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
	 System.out.println("Enter a month:"); 

	 Scanner sc = new Scanner(System.in);

	 String month = sc.next().toUpperCase();// uppercase used for the bcz of here is the we use small letter it cant gives CTE



     // here we use month.equals("FEB") || instead of that

	 String op = (month.equals("OCT")|| month.equals ("NOV")||month.equals("DEC")||month.equals("JAN"))?("Winter"):
		         (month.equals("FEB")|| month.equals("MAR")||month.equals("APR")||month.equals("MAY"))?("Summer"):
		         (month.equals("JUN")||month.equals("JUL")||month.equals("AUG")||month.equals("SEP"))?("Mansoon"):
		         "Invalid";

	 System.out.println(op);

	}
}
