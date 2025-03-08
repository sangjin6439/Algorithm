import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i=0;

        for(int T=Integer.parseInt(br.readLine()); i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a= Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            bw.write(a+b+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
