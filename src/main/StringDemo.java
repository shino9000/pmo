package main;

/**
 * Created by xxx on 2018/5/8.
 */
public class StringDemo {

    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        String str1 = new String("abcd");
        String str2 = str1 + "dd";
        System.out.println(p==p2);


        StringBuffer sb = new StringBuffer("aaa");
        System.out.println(sb.toString());
    }
}
