package basic;

import java.util.Date;

public class ForEachDemo {

    public void forEach() {
        int[] x = {3, 5, 2, 6, 7};
        for (int i:x){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ForEachDemo forEach=new ForEachDemo();
        forEach.forEach();
        Date date = new Date();
        System.out.println(date.toString());

    }

}
