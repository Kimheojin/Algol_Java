import java.io.*;

import java.nio.Buffer;
import java.util.StringTokenizer;

public class Java_10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        //br.readLine 하면 한줄씩 읽어온다

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();

            //빈칸으로 구분함
            while(st.hasMoreTokens()) {
                String Token = st.nextToken();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Token).reverse();
                sb.append(sb2.toString()).append(" ");
            }
            System.out.println(sb);

        }

    }
}