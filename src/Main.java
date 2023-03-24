import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int[] array = new int[]{44,67,54,23,56,43,66,90};
        // System.out.println(san(array, 66));
        //System.out.println(rew("top"));
        //‹System.out.println(dana("ghj"));
        System.out.println(tr(7));


//
////        Scanner scanner = new Scanner(System.in);
////        int a = scanner.nextInt();
////        if(a == 1 ) {
////            hello();
////        }else if( a == 2){
////            bye();
////    }
////    }
////    static void hello(){
////        System.out.println("hello");
////    }
////    static void bye(){
////        System.out.println("Bye");
////
////        method();}
////    static void method(){
////  Scanner scanner = new Scanner(System.in);
////    int metod = scanner.nextInt();
////        for (int i = 1; i <= 10 ; i++) {
////            for (int j = 1; j <= 10; j++) {
////
////                System.out.println(i + " * "  + j +" = "  + (i*j) );
////            }
////
//    }meder
//        static void meder (int[] b){
//            for (int i = 0; i <= meder.leanth(); i++) {
//                System.out.println();
//            }

//       int[] ran = new int[] {1,2,3,4,-5,6,7,8,9};
//        int d = 0;
//        for (int i = 0; i > ran.length; i--) {
//        }
//        System.out.println(ran);


//           метод практика 2
        Scanner sacnner = new Scanner(System.in);
        //summa();
        //san(new int[] {12,34,56,66,22}, 5);
        // mass(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        //System.out.println(mas(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        int[] in = {3,5,7,9};
        int a = 0;
        

    }

    static void name() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int result = 2023 - age;
        System.out.println(result);

    }

    static void san(int a, int b) {
        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    static void wer(int d, int g) {
        Random rm = new Random();
        int[] s = new int[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = rm.nextInt(d, g);
            System.out.println(s[i]);
        }
    }

    static void summa() {
        int sm = 0;
        for (int i = 0; i <= 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0) {
                sm += i;
            }
        }
        System.out.println(sm);


    }

  /*  static int san1(int[] a, int j) {
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == j) {
                d = i;
            }
        }
        System.out.println(" индекс этого числа " + d);


    }*/

    static void mass(int[] m) {
        int r = 0;
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        for (int i = m.length / 2; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        // System.out.println();
        for (int i = 0; i < m.length / 2; i++) {
            System.out.print(m[i] + " ");
        }
    }

    static int mas(int[] f) {
        int min = f[0];
        for (int i = 0; i < f.length; i++) {
            if (f[i] < min) {
                min = f[i];
            }
        }
        return min;

    }

    static int san(int[] a, int j) {
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == j) {
                d = i;
            }
        }
        return d;
    }

    static int rew(String a) {
        String[] s = new String[]{"top", "top", "katya"};
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (s[i] == a) {
                count++;
            }
        }
        return count;

    }

    static String dana(String f) {
        String[] al = new String[]{"ал", ",бул  "};
        String t = "";
        for (int i = 0; i < al.length; i++) {
            if (al[i] == f) {
                return "bar";
            }
        }
        return "jok";
    }

    static boolean tr(int s) {
        if (s % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

}























