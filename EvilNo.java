import java.util.*;
class EvilNo
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		String binary = Integer.toBinaryString(num);

		for(int i =0; i< binary.length(); i++){
			if(binary.charAt(i) == '1'){
				cnt++;
			}
		}

			if(num %2 == 0){
				System.out.println(num+ " is a evil number");
			}
			else{
				System.out.println(num+ " is not a evil number");

			}

	}
}
