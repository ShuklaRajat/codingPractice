import java.util.Scanner;

public class FiboRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=1;

        while (x <= n ) {
            System.out.println(fibo(x));
            x=x+1;
        }
    }

    static int fibo(int x){
        if(x==1){               //Base Case 1
            return 0;
        } else if (x==2){       //Base Case 2
            return 1;
        } else {                //Recursive call
            return fibo(x-1)+fibo(x-2);
        }
    }
}

//public class FiboRecursion {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        while (n > 0) {
//            System.out.println(fibo(n));
//            n=n-1;
//        }
//    }
//
//    static int fibo(int n){
//        if(n==1){               //Base Case 1
//            return 0;
//        } else if (n==2){       //Base Case 2
//            return 1;
//        } else {                //Recursive call
//            return fibo(n-1)+fibo(n-2);
//        }
//    }
//}
