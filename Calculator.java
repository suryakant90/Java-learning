import java.util.Scanner;


public class Calculator
{

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Value");
        float a;
        a = scan.nextFloat();
        System.out.println("Enter Second Value");
        float b = scan.nextFloat();

        System.out.println("Choose operations(+,-,*,/,%): ");
        char operator = scan.next().charAt(0);

        float result;


        switch (operator)
        {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                if (b == 0)
                {
                    System.out.println("∞");
                } else
                {
                    result = a / b;
                    System.out.println(result);
                }
                break;
            case '%':
                result = a % b;
                System.out.println(result);
                break;

        }


    }
}



