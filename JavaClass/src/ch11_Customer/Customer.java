package ch11_Customer;
import java.util.Date;
public class Customer {
	private String id;      private String pass; private String email;
	private String name;    private Date reg_date; // �����
	public Customer() {	}
	public Customer(String id, String pass, String email,String name, Date reg_date) {
		this.id=id; this.pass=pass; this.email=email; this.name=name; this.reg_date=reg_date;
	}
	public String toString() {
		return "���̵�:"+id+", ��ȣ:"+pass+", �̸���:"+email+", �̸�:"+name+", ������:"+reg_date;
	}
	public String getId() {		return id;	}
	public void setId(String id) {	this.id = id;	}
	public String getPass() {		return pass;	}
	public void setPass(String pass) {		this.pass = pass;	}
	public String getEmail() {		return email;	}
	public void setEmail(String email) {	this.email = email;	}
	public String getName() {		return name;	}
	public void setName(String name) {		this.name = name;	}
	public Date getReg_date() {		return reg_date;	}
	public void setReg_date(Date reg_date) {	this.reg_date = reg_date;	}
}