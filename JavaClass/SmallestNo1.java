 class SmallestNo1  
{  
public static void main(String args[])  
{  
int x=69;  
int y=89;  
int z=99;  

//NESTED TERNARY OPERATOR
int smallestNumber=(x < y) ? (y < z ? x : z) : (y < z ? y : z);
System.out.println("The Smallest number is: " +smallestNumber);

}
}