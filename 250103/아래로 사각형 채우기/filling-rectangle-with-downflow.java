import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = i + j * n + 1;
            }
        }

        /*
        int num = 1;
        
        // 배열의 숫자를 채웁니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[j][i] = num++;

        */

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}