public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = 5;
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                arr[i][j] = arr[i - 1][j] + arr[i][j -1];
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}