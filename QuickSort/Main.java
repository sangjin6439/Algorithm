import java.util.*;

class Main {
    public static void main(String[] args) {

        // 배열 원소들을 퀵 정렬 알고리즘을 이용하여 오름차순으로 정렬
        Scanner scanner = new Scanner(System.in);

        //인덱스 개수
        int n = scanner.nextInt();
        //배열 생성
        double[] array = new double[n];
        //인덱스 값 입력
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        quickSort(array, 0, n - 1);
        System.out.println("hw_1:인상진");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();

    }

    //p는 정렬할 왼쪽 인덱스, r는 정렬할 맨 오른쪽 인덱스
    //퀵 정렬
    public static void quickSort(double[] array, int p, int r) {

        // p가 r보다 같거나 크면 인덱스가 1개 이하라서 p가 r보다 작다는 조건을 검
        if (p < r) {
            // 파티션 기준으로 정렬하기
            int pivot = partition(array, p, r);
            //정렬된 피벗 기준 작은 코드를 다시 재귀호출
            quickSort(array, p, pivot - 1);
            //정렬된 피벗 기준 큰 코드를 다시 재귀호출
            quickSort(array, pivot + 1, r);
        }

    }

    //임의의 값을 기준으로 기준 값보다 크면 오른쪽 작으면 왼쪽으로 옮긴다.
    public static int partition(double[] array, int p, int r) {
        //피벗 설정
        double pivot = array[r];

        int i = p - 1; // 파티션 인덱스 설정
        //피벗보다 작으면 왼쪽으로
        for (int j = p; j < r; j++) {
            if (array[j] <= pivot) {
                i++;
                double temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //피벗보다 크면 오른쪽으로
        double temp = array[i + 1];
        array[i + 1] = array[r];
        array[r] = temp;

        return i + 1; // 파티션 위치 반환
    }
}
