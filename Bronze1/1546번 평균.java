import java.util.Scanner;

public class Main1546 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt(); // 입력 받을 개수
        int[] a=new int[N];
        int max=0; //최대값
        int sum=0; //합
        for(int b=0; b<a.length;b++){
            int G= sc.nextInt();
            sum+=G; // 합 구하기
            a[b]=G;
            if(G>=max) max=G; //최댓값 구하는 식
        }
        float f= (float)sum/max*100/N; //형변환
        System.out.println(f);
    }
}