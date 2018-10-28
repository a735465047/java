package basic;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fs=new FileInputStream("/tmp/test");
        for (int i=0;i<100;i++){
            System.out.println((char)fs.read());
        }

    }
}
