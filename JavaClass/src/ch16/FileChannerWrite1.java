package ch16;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FileChannerWrite1 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("c:/java/file.txt");
		FileChannel fc = FileChannel.open(path,StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);
		String data = "�ȳ��ϼ���";
		Charset charset = Charset.defaultCharset();
		ByteBuffer bf = charset.encode(data);
		int byteCount = fc.write(bf);
		System.out.println(byteCount+"���� ����");
		fc.close();
	}
}