import java.util.Scanner;
class PrintAlphabets 
	{
    public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
		    for (char c = 'a'; c <= 'z'; c++)
			{
            switch (c) 
			   {
                case 'a':
                    System.out.println('a');
                    break;
                case 'b':
                    System.out.println('b');
                    break;
                case 'c':
                    System.out.println('c');
                    break;
                case 'd':
                    System.out.println('d');
                    break;
                case 'e':
                    System.out.println('e');
                    break;
                case 'f':
                    System.out.println('f');
                    break;
                case 'g':
                    System.out.println('g');
                    break;
                case 'h':
                    System.out.println('h');
                    break;
                case 'i':
                    System.out.println('i');
                    break;
					case 'j':
                    System.out.println('j');
                    break;
                case 'k':
                    System.out.println('k');
                    break;
                case 'l':
                    System.out.println('l');
                    break;
                case 'm':
                    System.out.println('m');
                    break;
                case 'n':
                    System.out.println('n');
                    break;
                case 'o':
                    System.out.println('o');
                    break;
                case 'p':
                    System.out.println('p');
                    break;
                case 'q':
                    System.out.println('q');
                    break;
                case 'r':
                    System.out.println('r');
                    break;
                case 's':
                    System.out.println('s');
                    break;
                case 't':
                    System.out.println('t');
                    break;
                case 'u':
                    System.out.println('u');
                    break;
                case 'v':
                    System.out.println('v');
                    break;
                case 'w':
                    System.out.println('w');
                    break;
                case 'x':
                    System.out.println('x');
                    break;
                case 'y':
                    System.out.println('y');
                    break;
                case 'z':
                    System.out.println('z');
                    break;
    

                default:
                    // In case the input is not between 'a' and 'z'.
                    System.out.println("Invalid character");
            }
        }
    }
}
