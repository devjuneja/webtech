import java.io.*;
import java.net.*;

class echoserver{
	public static void main(String[] args) throws Exception{
		ServerSocket ob = new ServerSocket(8080);
		Socket s = ob.accept();
		DataInputStream in = new DataInputStream(s.getInputStream());
		while(true){
			System.out.println("got:"+in.readUTF());
		}
	}
}
