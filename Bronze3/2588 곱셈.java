import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= b/100;
        int d= (b%100)/10;
        int f= (b%10);

        System.out.println(f*a);
        System.out.println(d*a);
        System.out.println(c*a);
        System.out.println(b*a);
    }
}
