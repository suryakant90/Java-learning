import java.time.Year;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        System.out.println("Enter number for Fib series");
         int Fib = scanner.nextInt();

        int a=0 , b=1;

       System.out.println(a+" "+b+" "+ "initial start");



       for( int i=1; i<=Fib; i++ )
       {
       int c = a+b;
           System.out.println(int c,"*");
           a=b;
           b=c;
       }

//        System.out.println("If you need ratio Press 1 else 2");
//        int 1=1;
//        int x;
//        //char y;
//
//       if(){
//           int x= 1
//
//                for( int i=3; i<=Fib; i++ )
//                    {
//                        int c = (a+b);
//
//                        a=b;
//                        b=c;
//                        c=a%b;
//                        System.out.println(c);
//
//                    }
//            }
//       else {
//            System.out.println("Thank You");
//            }



//        for (int i=0; i>=100; i++  );
//       if(i());

    }







}
