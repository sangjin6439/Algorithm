    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Scanner;
    import java.util.StringTokenizer;

     class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[] a= new int[9];
            int max = a[0];
            int count = 0;
            for(int j =0; j<a.length; j++){
                a[j]=Integer.parseInt(br.readLine());
                if (max<a[j]) {
                    max=a[j];
                    count=j+1;
                }
            }

            System.out.println(max);
            System.out.println(count);
        }

    }