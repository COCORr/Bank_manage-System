import sun.java2d.pipe.BufferedTextPipe;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {

        File file = new File("E:\\小学期\\userlist.txt");
        if (file.exists()) {
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);


                }
//             FileOutputStream fileOutput=new FileOutputStream(file);
//            FileInputStream fileInput = new FileInputStream(file);
                //byte []usr="abc  ".getBytes();
                //byte [] pwd="123".getBytes();
                //fileOutput.write(usr);
                //fileOutput.write(pwd);

                //读文件完成
                //
//            InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
//            BufferedReader br = new BufferedReader(reader);
//            FileReader fr = new FileReader(file);
//            String line = "";
//            line = br.readLine();
//            boolean turn=true;
//            ArrayList<String> namelist=new ArrayList<>();
//            ArrayList<String > passwordlist=new ArrayList<>();
//            while (line != null) {
//                if (turn){
//                    System.out.println("username:"+line);
//                    line=br.readLine();
//                    namelist.add(line);
//                    turn=false;
//                }
//                if (!turn){
//                    System.out.println("password:"+line);
//                    line=br.readLine();
//                    passwordlist.add(line);
//                    turn=true;
//                }
//
//            }
                //写文件
//            FileWriter fileWriter=new FileWriter(file);
//            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//            String na="大厦不必";
//            String pw="shabi";
//            bufferedWriter.write(na+"\r\n");
//            bufferedWriter.write(pw+"\r\n");
//
//            bufferedWriter.close();
//            fileWriter.close();

            }


        }
    }

