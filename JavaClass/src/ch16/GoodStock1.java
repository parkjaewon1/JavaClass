package ch16;
import java.io.Serializable;
// Serializable�� �������� ���� ����ȭ ���� �� ����
public class GoodStock1 implements Serializable {
	String code;
//	int num;
//	transient�� ���ڴ� 0, ���ڴ� null ���� �ȴ�
	transient int num;
	public GoodStock1(String code, 	int num) {
		this.code = code;  this.num = num;
	} 
	@Override
	public String toString() {
		return "�ֽ�[�ڵ�:"+code+", ����:"+num+"]";
	}
}