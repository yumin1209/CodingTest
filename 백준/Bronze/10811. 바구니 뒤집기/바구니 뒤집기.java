import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int a = 0; a < m; a++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;

            while(i <j){
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

