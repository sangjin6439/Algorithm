
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a==b&&b==c){
                System.out.println(10000+(a*1000));
        }else if(a==b&&b!=c||a==c&&b!=a){
            System.out.println(1000+(a*100));
        }else if(b==c&&b!=a){
            System.out.println(1000+(b*100));
        }else{
            int max=a;
            if(max<b){
                max=b;
            }
            if(max<c){
                max=c;
            }
            System.out.println(max*100);
        }
        }
    }