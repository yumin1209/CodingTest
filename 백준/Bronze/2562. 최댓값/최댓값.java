import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 1; i <= array.length; i++) {
            int num = sc.nextInt();

            if(num > max){
                max = num;
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
