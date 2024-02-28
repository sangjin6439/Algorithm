import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] ap = new int[26];
        String a = sc.next().toUpperCase();

        for(int i =0;i <a.length();i++){
            int num= a.charAt(i)-'A'; //배열을 문자로 하나씩 보는데 이값이 아스키코드로 정해진다.int로 반환
            ap[num]++;// 반환된 부분의 배열 인덱스로하고 그 요소를 1씩 더 한다.
        }

        int max=0;
        char same='?';
        for (int i=0;i<ap.length;i++){

            if(ap[i]>max){
                max = ap[i];
                same = (char)(i+'A');
            }else if(ap[i]==max){
                same ='?';
            }
        }
        System.out.print(same);
    }
}
