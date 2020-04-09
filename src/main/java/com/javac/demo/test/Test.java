package com.javac.demo.test;

import javax.websocket.Session;
import java.io.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * i/o流
 */
public class Test {

    public static void  main(String []args) throws Exception{

        char c = 65;
        System.out.println("c = "+c);

        int a1 = 5;
        double a2 =(float)a1;
        System.out.println(a2);










        //Session.get

            /*CheckAccount checkAccount=new CheckAccount(100);
            checkAccount.saveMoney(100000);
        System.out.println(checkAccount.getPrice());
            checkAccount.outMoney(50);
        System.out.println(checkAccount.getPrice());
        checkAccount.outMoney(500);
        System.out.println(checkAccount.getPrice());
        System.out.println(checkAccount.getCode());*/

       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /*File file=new File("d:aa.txt");
        OutputStream outputStream=new FileOutputStream(file);
        String s="Hello";
        byte[] bytes = s.getBytes();
        outputStream.write(bytes);
*/
        /*File  file1=new File("d:c.txt");
        Writer writer=new FileWriter(file1);
        String aa="祖国欢迎你111!";
        char[] chars = aa.toCharArray();
        writer.write(chars,0,chars.length);
        writer.flush();*/

        //字节流 复制图片
        /*InputStream inputStream=new FileInputStream("D:\\学生.png");
        OutputStream outputStream=new FileOutputStream("D:\\学生1.png");

        int len;
        byte[] buff=new byte[1024];
        while ((len=inputStream.read(buff))!=-1){
            outputStream.write(buff,0,len);
        }*/

        String a="a";
        String b="a";
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
