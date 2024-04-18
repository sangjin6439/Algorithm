처음에 이런식으로 문제에서 원하는 식으로 적었다.
```
class Solution {
    public int solution(String[][] board, int h, int w) {
        //한칸 골랐을 때 위아래왼오른쪽칸 중 같은색깔로 칠해진 개수 h=위아래,w=양옆
        int[] dh={0, 1, -1, 0};
        int[] dw={1, 0, 0, -1};
        int n=board.length;
        int answer=0;
        for(int i = 0; i<4;i++){
            int h_check =h+dh[i];
            int w_check =w+dw[i];
            if((h_check>0&&h_check<n)&&(w_check>0&&w_check<n)){
                if(board[h][w].equals(board[h_check][w_check])){
                    answer++;
                }
            }
        }
       
        return answer;
    }
}
```
TC 65%가 나왔다.
```
class Solution {
    public int solution(String[][] board, int h, int w) {
        //한칸 골랐을 때 위아래왼오른쪽칸 중 같은색깔로 칠해진 개수 h=위아래,w=양옆
        int[] dh={0, 1, -1, 0};
        int[] dw={1, 0, 0, -1};
        int n=board.length;
        int answer=0;
        for(int i = 0; i<4;i++){
            int h_check =h+dh[i];
            int w_check =w+dw[i];
            if((h_check>=0&&h_check<n)&&(w_check>=0&&w_check<n)){
                if(board[h][w].equals(board[h_check][w_check])){
                    answer++;
                }
            }
        }
       
        return answer;
    }
}
```  
이렇게 h_check>=0&&h_check<n)&&(w_check>=0&&w_check<n)를 0이상으로 범위를 변경해줬더니 답을 맞췄다.
