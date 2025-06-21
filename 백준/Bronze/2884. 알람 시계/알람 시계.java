import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if ((m - 45) < 0 && h > 0) {
            System.out.println((h - 1) + " " + (60 + (m - 45)));
        }else if((m - 45) < 0 && h == 0){
            System.out.println((24 +(h - 1)) + " " + (60 + (m - 45)));
        }
        else {
            System.out.println(h + " " + (m - 45));
        }
    }
}