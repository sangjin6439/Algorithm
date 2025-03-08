import java.util.*;

class Main_202014039 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //인덱스 개수
        int n = scanner.nextInt();
        //배열 생성
        double[] array = new double[n];
        //인덱스 값 입력
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        
        mergeSort(array, 0, n - 1);
        
        System.out.println("hw_2:인상진");
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();

    }

    //병합 정렬 메서드
    public static void mergeSort(double[] array, int left, int right) {
        //더이상 병합할 인덱스가 없으면 리턴
        if (left == right) {
            return;
        }

        //중간값 구하기
        int mid = (left + right) / 2;

        // 왼쪽부분 계속 나누기
        mergeSort(array, left, mid);
        // 오른쪽부분 계속 나누기
        mergeSort(array, mid + 1, right);

        //병합하기
        merge(array, left, mid, right);
    }

    public static void merge(double[] array, int left, int mid, int right) {

        //왼쪽 인덱스 개수
        int n1 = mid - left + 1;
        //오른쪽 인덱스 개수
        int n2 = right - mid;

        //새로운 배열 생성
        double[] leftTemp = new double[n1];
        double[] rightTemp = new double[n2];

        //왼쪽 배열
        for (int i = 0; i < n1; i++) {
            leftTemp[i] = array[left + i];
        }

        //오른쪽 배열
        for (int i = 0; i < n2; i++) {
            rightTemp[i] = array[mid + 1 + i];
        }

        int i = 0,j = 0;
        int k = left;

        //오름차순으로 정렬하기
        while (i < n1 && j < n2) {
            if (leftTemp[i] <= rightTemp[j]) {
                array[k] = leftTemp[i];
                i++;
            } else {
                array[k] = rightTemp[j];
                j++;
            }
            k++;
        }
        // n2가 없을 때 그대로 정렬
        while (i < n1) {
            array[k] = leftTemp[i];
            i++;
            k++;
        }
        // n1이 없을 때 그대로 정렬
        while (j < n2) {
            array[k] = rightTemp[j];
            j++;
            k++;
        }

    }
}
