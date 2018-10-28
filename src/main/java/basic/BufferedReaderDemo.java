package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        char c;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter your name");
        //读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//
//        } while (c != 'q');
        //读取字符串
        str = br.readLine();
        System.out.println(str);

    }

}
