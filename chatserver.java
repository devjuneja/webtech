import java.io.*;
import java.net.*;

public class chatserver{
	public static void main(String[] args) throws Exception{
		ServerSocket ob = new ServerSocket(9000);
		Socket s = ob.accept();

		DataOutputStream out = new DataOutputStream(s.getOutputStream());
		DataInputStream in = new DataInputStream(s.getInputStream());
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			System.out.println(""+in.readUTF());
			out.writeUTF(bf.readLine());
		}
	}
}
