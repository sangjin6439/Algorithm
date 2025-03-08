import java.util.*;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // a= 테스트 케이스 수
        int a = sc.nextInt();
        //배열이 10을 넘지는 않음
        int[] arr = new int[11];
        arr[0]=1;
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;

        for(int i = 0; i<a; i++){
            int b = sc.nextInt();
            for(int j =4; j<arr.length; j++){
                arr[j]= arr[j-1]+arr[j-2]+arr[j-3];
            }
            System.out.println(arr[b]);
        }


        /*
        * dp[5]까지 개수를 구해보고 그 전까지 개수를 비교해보면
        * dp[i-1]+dp[i-2]+dp[i-3]이라는 점화식이 나옴
        *
        * */

    }
}