package Implementation;

// 26.03.11
// 백준 2557번
//  "Hello World!" 출력하는 프로그램

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class _2557_HelloWorld {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World!");
        bw.flush();
        bw.close();
        //System.out.println("Hello World!");
    }
}
