import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 String numStr = Integer.toString(num);
		 
		 if(numStr.charAt(0)=='0')
		{
			 return false;

		}
		for(int i =1; i < numStr.length(); i++){
			 if(numStr.charAt(i)=='0'){
		
			return true;

		}
		}

		    return false;
		}
		if (isDuckNumber(num)) {
            System.out.println(num + " is a Duck number.");
        } else {
            System.out.println(num + " is not a Duck number.");
        }


	}

