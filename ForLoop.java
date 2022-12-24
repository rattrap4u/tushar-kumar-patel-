
// Java code to demonstrate for loop.
public class ForLoop {
    public static void main(String[] args) {
        // code for printing number from 1 to 5
        System.out.println("For loop\n");
        for ( int i = 1; i <= 5; i++)
        {
            System.out.println(i);
            
        }
        System.out.println("\nnow while loop\n");
        WhileLoop();
        System.out.println("\nContinue statement\n");
        Continue();
        System.out.println("\n If - else\n");
        Ifelse();
        System.out.println("\n Switch \n");
        Switch();
        System.out.println("\n Factorial using recursion \n");
        System.out.println("\n Factorial of 5 is : "+Recursion(5));
    }
    public static void WhileLoop() {
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }

    public static void Continue() {

        for (int i = 1; i <= 5; i++)
        {
            if(i==3)
            {
                // continue statement will skip the value / loop will continue when it reaches to 3
                continue;
            }
            System.out.println(i);
        }
    }
    public static void Ifelse() {
        int a = -5;
        if(a > 0)
        {
            System.out.println("The value is positive number. ");
        }
        else
        System.out.println("The value is negative number.");
    }
    public static void Switch() {
        int a = 5;
        switch(a) 
        {
            case 1: System.out.println(" The value is 1.");
            break;
            case 2: System.out.println(" The value is 2.");
            break;
            case 3: System.out.println(" The value is 3.");
            break;
            case 4: System.out.println(" The value is 4.");
            break;
            case 5: System.out.println(" The value is 5.");
            break;
            
        }
    }
    public static int  Recursion(int n) {
        if (n==1)
            return 1;
        else
            return(n * Recursion(n-1));       
    }
}


