import java.util.Scanner;
public class Main{
    String name;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        int b=sc.nextInt();


        for(a=1;a<=b;a++) {
            for(int i=0;i<b-a;i++) {
                System.out.print(" ");
            }

            for(int c=0;c<a;c++) {
                System.out.print('*');
            }

            System.out.println();
        }

    }
}