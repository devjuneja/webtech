import java.net.*;
import java.io.*;
public class server
{
   public static void main(String args[]){
   try{
            ServerSocket ss=new ServerSocket(8081);
            Socket s=ss.accept();
            File file=new File("paste.txt");
            DataInputStream in=new DataInputStream(s.getInputStream());
            String str=in.readUTF();
            System.out.println(str);
            FileWriter na=new FileWriter(file);
            na.write(str);
            na.close();
         }
   catch(Exception e){}
   }
 }
