import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
//      Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine() ;
        StringTokenizer st= new StringTokenizer(str," ");
        int A =Integer.parseInt(st.nextToken());
        int B =Integer.parseInt(st.nextToken());
        int C =Integer.parseInt(st.nextToken());


        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}