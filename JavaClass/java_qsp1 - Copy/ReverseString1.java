import java.util.Scanner;
class ReverseString1
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);

        String  str = sc.nextLine();  
        String rev1 = "";
        for(int i = str.length() - 1; i >= 0; i--)
            rev1 = rev1 + str.charAt(i);  
        System.out.println(rev1);  
    }
}