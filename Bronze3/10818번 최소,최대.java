import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[a];



        for(int i=0; i<b.length; i++){
            b[i]=sc.nextInt();
        }

        Arrays.sort(b);
        System.out.println(b[0]+" "+b[a-1]);


    }
}
