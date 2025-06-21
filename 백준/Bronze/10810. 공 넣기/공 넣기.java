import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int x,y,z;

        int array[] = new int[num1];

        for (int i = 0; i < num2; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            for (int j = x; j <= y; j++) {
                    array[j-1] = z;
                }
            }

        for (int i = 0; i < num1; i++) {
            System.out.print(array[i] + " ");

        }
        }
    }
