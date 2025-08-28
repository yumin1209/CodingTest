import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        String temp[] = new String[input];
        for(int i=0; i<input; i++){
            String S = br.readLine();
            temp[i] = S.charAt(0) + "" + S.charAt(S.length() - 1);
        }
        for(int i=0; i<input; i++){
            System.out.println(temp[i]);
        }
    }
}