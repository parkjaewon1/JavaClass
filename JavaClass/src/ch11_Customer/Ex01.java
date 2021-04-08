package ch11_Customer;
import java.util.*;
// �ܼ�â(��)���� ���� ��ɾ ���޹ް� ����� �ܼ�â���� �˷� �ش�
public class Ex01 {
	private static CustomerServiceImpl cs = new CustomerServiceImpl();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("��ɾ �Է��ϼ���");
			String command = sc.nextLine();
			if (command.equals("exit")) break;
			// insert�� �����ϴ� ��ɾ �Է��ϸ�
			else if (command.startsWith("insert"))
			// �ĸ�(,)�� �������� �����͸� ����� �迭�� ����� �װ��� �Ű������� ���
			// insert,id,��ȣ,��ȣȮ��,�̸���,�̸� : ���� 6�� �迭
			// insert,k1,1,1,k1@k.com,�浿
				insert(command.split(","));
			else if (command.startsWith("update"))
				update(command.split(","));
			// delete,id ���� ������ �о ������ ����, ������ "���µ� ���� ������" remove
			else if (command.startsWith("delete"))
				delete(command.split(","));
			else if (command.startsWith("select")) 
				select(command.split(","));
			else if (command.equals("list"))
				list();
			else help();
		}
		sc.close();
		System.out.println("���α׷� ����");
	}
	private static void delete(String[] str) {
		int k = lengthChk(str.length, 2);
		if (k==0) return;
//		if (str.length != 2) {// select,id
//			help();
//			return; // �޼��� ����
//		}
		int result = cs.delete(str[1]);
		if (result > 0) System.out.println("���� ���� ����");
	}
	private static void update(String[] str) {
		int k = lengthChk(str.length, 6);
		if (k==0) return;
//		if (str.length != 6) {
//			help();
//			return; // �޼��� ����
//		}
		Customer customer=new Customer(str[1],str[2], str[4],str[5],new Date());
		if (!str[2].equals(str[3])) {
			System.out.println("��ȣ�� ��ȣȮ���� �ٸ��ϴ�");
			return;
		}
		int result = cs.update(customer); // result�� ���� ���� üũ(1�� ����, 0�� ����)
		if (result > 0) System.out.println("���� ���� !! ���");
	}
	private static void list() {
		Collection<Customer> list = cs.list();
		if (list == null || list.size() == 0) 
			System.out.println("�����Ͱ� �����ϴ�");
		else 
			for (Customer customer : list) {
				System.out.println(customer);
			}
	}
	static int lengthChk(int length, int num) {
		int result = 1;
		if (length != num) {// select,id
			help();
			result = 0;
		}
		return result;
	}
	private static void select(String[] str) {
		int k = lengthChk(str.length, 2);
		if (k==0) return;
//		if (str.length != 2) {// select,id
//			help();
//			return; // �޼��� ����
//		}
		// id�� ��ġ�ϴ� �� �����͸� �о �� ��ü�� �����ϰ� ����
		Customer customer = cs.select(str[1]);
		if (customer == null) System.out.println("���� ���Դϴ�");
		else System.out.println(customer);
	}
	private static void insert(String[] str) {
		int k = lengthChk(str.length, 6);
		if (k==0) return;
//		if (str.length != 6) {
//			help();
//			return; // �޼��� ����
//		}
		Customer customer=new Customer(str[1],str[2], str[4],str[5],new Date());
		if (!str[2].equals(str[3])) {
			System.out.println("��ȣ�� ��ȣȮ���� �ٸ��ϴ�");
			return;
		}
		// CustomerServiceImpl ��ü�� insert()�� �����ϰ� �� ����� result�� ����
		int result = cs.insert(customer);
		if (result > 0) System.out.println("�� ��� ���� ����");
	}
	private static void help() {
		System.out.println("�߸��� ��ɾ� �Դϴ�");
		System.out.println("���� ��ɾ�� ���� �ϼ���");
		System.out.println("insert,id,��ȣ,��ȣȮ��,�̸���,�̸�");
		System.out.println("update,id,��ȣ,��ȣȮ��,�̸���,�̸�");
		System.out.println("delete,id");
		System.out.println("select,id");
		System.out.println("list");
		System.out.println("exit");
	}
}