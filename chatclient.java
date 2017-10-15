import java.io.*;
import java.net.*;

public class chatclient{
	public static void main(String[] args) throws Exception{
		Socket s = new Socket("127.0.0.1",9000);

		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		DataInputStream in = new DataInputStream(s.getInputStream());
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			System.out.println(""+in.readUTF());
			out.writeUTF(bf.readLine());
		}
	}
}
