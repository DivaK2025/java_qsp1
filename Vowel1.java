import java.util.Scanner;
class Vowel1
{
	public static void main(String[] args) 
		throws InterruptedException	
	{   
				
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your Name:");
			
			String name = sc.next().toUpperCase();

			for(int i =0;i<= name.length()-1;i++)
		{
				if(name.charAt(i) == 'A'){
					System.out.println("a");
				}
					else if(name.charAt(i) == 'E'){
						System.out.println("e");
					}
					else if(name.charAt(i) == 'I'){
						System.out.println("i");
					}
					else if(name.charAt(i) == 'O'){
						System.out.println("o");
					}
				     else if (name.charAt(i) == 'U'){
						System.out.println("u");
					 }

				}
		}


	}
