import java.io.*;
import java.net.*;

class echoclient{
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("localhost",8080);
		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			out.writeUTF(bf.readLine());
		}
	}
}
