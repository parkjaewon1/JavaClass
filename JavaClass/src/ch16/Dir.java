package ch16;
import java.io.File;
public class Dir {
//	. : ���� ��Ű��(����), .. : ���� ��Ű��(���丮)
	public static void main(String[] args) {
	//	File dir = new File(".");
	//	File dir = new File("./src/ch16");
		File dir = new File("../ch15/src/ch15");
		String[] strs = dir.list();
		for (String str : strs) {
			System.out.println(str);
		}
	}
}