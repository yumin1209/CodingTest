import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
           st = new StringTokenizer(br.readLine()," ");
           bw.write("Case #" + i + ": ");
           bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n"); ;
        }

        br.close();
        bw.flush();
        bw.close();
    }
}