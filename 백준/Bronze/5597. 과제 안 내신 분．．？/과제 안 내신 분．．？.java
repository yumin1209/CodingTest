import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[30];
        int array2[] = new int[28];
        int array3[] = new int[2];
        int index = 0;


        for (int i = 0; i < 30; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array2.length; i++) {
            int num = sc.nextInt();
            array2[i] = num;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    array[i] = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array3[index++] = array[i];
            }
        }

        int max = array3[0];
        int min = array3[0];

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > max) {
                max = array3[i];
            }
            if (array3[i] < min) {
                min = array3[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}

