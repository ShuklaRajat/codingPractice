import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        if(n==0){
            System.out.println("Done");
        }
        else if(n==1){
            System.out.println(0);
        } else {
            System.out.print(a+" "+b);
            n = n-2;
            int c;
            while(n>-1) {
                c = a+b;
                System.out.print(" "+c);
                n=n-1;
                a=b;
                b=c;
            }
        }

    }
}
