import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        if (b-45<0){
            if(a-1<0) {
                System.out.printf("%d %d", a + 23, b + 15);
            }else {
                System.out.printf("%d %d", a - 1, b + 15);
            }
        }else{
            System.out.printf("%d %d",a,b-45);

        }


    }
}
