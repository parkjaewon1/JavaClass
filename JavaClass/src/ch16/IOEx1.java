package ch16;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) throws IOException {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		ByteArrayInputStream input = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
	
		int data = 0;
		while((data = input.read())!= -1) {
			output.write(data);
		}
		outSrc = output.toByteArray();
		output.close();
		input.close();
		System.out.println("inSrc = "+Arrays.toString(inSrc));
		System.out.println("outSrc = "+Arrays.toString(outSrc));
	}

}
