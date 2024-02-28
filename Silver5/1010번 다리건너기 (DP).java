import java.util.*;

class Main {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // C순열로 풀었는데 재귀함수에서 메모리 초과가 나서 다른 방식으로 접근을 했다.
        // 성질 1 mCn = m-1Cn-1 + m-1Cn, 성질 2 mC0=mCm=1
        StringBuilder sb = new StringBuilder();

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(CC(b,a)).append('\n');

        }
        System.out.println(sb);
    }

    public static int CC(int fir, int sec) {

        if(dp[fir][sec]>0){
            return dp[fir][sec];
        }

        //2번 성질
        if (sec == 0 || fir == sec) {
            return dp[fir][sec]=1;

        }
        //1번 성질
        return dp[fir][sec]=CC(fir - 1, sec - 1) + CC(fir - 1, sec);


    }
}
