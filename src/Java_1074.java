


//백준 1074번 문제
//z모양으로 탐색하려고 한다
//재귀적으로 방문

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Java_1074 {
    //재귀없이 돌리면 시간초과

    static int count = 0;
    //시작이 0부터 시작하므로

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());//2승 위에
        int R = Integer.parseInt(st.nextToken());//행
        int C = Integer.parseInt(st.nextToken());//열

        //0부터 시작하는거 생각하자


        int size = (int) Math.pow(2, N); //한 변

        find(size, R, C);
        System.out.println(count);
    }

    private static void find(int size, int r, int c) {
        if(size == 1)
            return;

        if(r < size/2 && c < size/2) {
            find(size/2, r, c);
        }
        else if(r < size/2 && c >= size/2) {
            count += size * size / 4;
            find(size/2, r, c - size/2);
        }
        else if(r >= size/2 && c < size/2) {
            count += (size * size / 4) * 2;
            find(size/2, r - size/2, c);
        }
        else {
            count += (size * size / 4) * 3;
            find(size/2, r - size/2, c - size/2);
        }
    }
}
