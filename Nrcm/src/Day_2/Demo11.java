package Day_2;

public class Demo11 { 
	private String firstName;
	private String lastName;
	private String emailid;
	private long phoneno;
	
	public void setFirstName(String fn) { 
		firstName=fn;
	}
	public void setLastName(String ln) {
		lastName=ln;
	}
	public void setEmailId(String ei) {
		emailid=ei;
	}
	public void setPhoneNo(long pn) {
		phoneno=pn;
	}
    public String getFirstName() {
    	return firstName;
    }
    public String getLastName() {
    	return lastName;
    }
    public String getEmailId() {
    	return emailid;
    }
    public long getPhoneNo() {
    	return phoneno;
    }
public static void main(String[] args) {
		Demo11 d1=new Demo11();
		d1.setFirstName("sujana");
		d1.setLastName("laura");
		d1.setEmailId("sujanatakkellapati@gmail.com");
		d1.setPhoneNo(9876546321l);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmailId());
		System.out.println(d1.getPhoneNo());
	}

}
