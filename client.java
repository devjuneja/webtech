

import java.net.*;
import java.io.*;
public class client
{
  public static void main(String[] args) {

        try {
              Socket s=new Socket("localhost",8081);
              DataOutputStream o=new DataOutputStream(s.getOutputStream());
              BufferedReader in=new BufferedReader(new FileReader("copy.txt"));
              String str=in.readLine();
              o.writeUTF(str);

        }catch(Exception e){}
    }
    }
