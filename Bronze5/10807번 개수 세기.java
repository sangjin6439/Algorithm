

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int d =0; d<a; d++){
            arr[d]=sc.nextInt();
        }

        int b = sc.nextInt();
        int c = 0;

        for(int v =0; v<a; v++){
            if(arr[v]==b){
                c++;
            }

        }
        System.out.println(c);

    }
}

