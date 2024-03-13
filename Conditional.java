import java.util.Scanner;

public class Conditional {
    public static void main(String args[])
    {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//
//        if(x % 2 == 0) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1:
                System.out.println("Krishna");
                break;
            case 2:
                System.out.println("Laksmana");
                break;
            case 3:
                System.out.println("Balaram");
                break;
            default :
                System.out.println("Gauranga");

           }

    }









}
