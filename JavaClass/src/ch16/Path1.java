package ch16;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path1 {

	public static void main(String[] args) {
		Path path = Paths.get("src/ch16/Path1.java");
		System.out.println("���ϸ� : "+path.getFileName());
		System.out.println("�θ� ���丮 : "+path.getParent().getFileName());
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}

	}

}
