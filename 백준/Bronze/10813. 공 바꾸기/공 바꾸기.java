import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int array[] = new int[N];
        for (int index = 1; index <= N; index++) {
            array[index - 1] = index;
        }

        for (int num = 0; num < M; num++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
