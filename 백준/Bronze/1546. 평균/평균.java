import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        double [] arr = new double[n];

        StringTokenizer str = new StringTokenizer(bf.readLine()," ");

        double m = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(str.nextToken());
            if(arr[i] > m){
                m = arr[i];
            }
        }

       double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (arr[i] / m ) * 100 ;
            sum += arr[i];
        }

        System.out.println(sum / n);
    }
}
