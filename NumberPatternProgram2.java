 class NumberPatternProgram2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        int n = 5;
 
                for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(i == j)
                {
                    System.out.print(i);
                }
                else
                {
                    System.out.print(0);
                }
            }
 
            System.out.println();
        }
    }
}