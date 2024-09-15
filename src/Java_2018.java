import java.io.*;

public class Java_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        //나누기로 하면 될듯
        //나머지 0 이면 참으로 반환
        //1은 어처피 무조건 들어가니깐 포함 안시켜도 될듯
        int number = 1;
        int flag = 2;
        do{
            if(N ==1){
                break;
            }
        } while(true){
            if(N/flag < 1){
                break;
            }
            


        }
        bw.write(String.valueOf(number));
//그런 경우 flush 사용 안해도 될듯

        bw.close();

    }
}
