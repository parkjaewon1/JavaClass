package ch08;

public class VolumeEx {
	public static void main(String[] args) {
		//�������̽��� ����ص� ���ó�� �迭�� ���� �ѹ��� ó���� �����ϴ�.
		Volume[] vols = new Volume[3];
		vols[0] = new Radio();
		vols[1] = new TV();
		vols[2] = new Speaker();

		for (Volume vol : vols) {
			vol.volumeUp();
			vol.volumeDown();
		}

	}

}
