package test20180111;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Testmain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedOutputStream outp = null;
		BufferedInputStream in = null;
		String filenamedownload = "/help/bimportUserInstruction.xls";
		try {
			outp = new BufferedOutputStream(null);
			in = new BufferedInputStream( new FileInputStream(filenamedownload));
			byte[] b = new byte[1024];
			int i = 0;
			while ((i = in.read(b)) > 0) {
				outp.write(b, 0, i);
			}
			
			//if(outp != null){
				outp.flush();
				outp.close();
			//}
			//if(in != null){
				in.close();
			//}			
		} catch (IOException e) {
 
		} 
 
	}

}
