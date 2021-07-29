package Shop2pack;

public class Address 
{
	int pincode;
	  String ct,st;
	public Address(int pincode, String ct, String st) {
		this.pincode = pincode;
		this.ct = ct;
		this.st = st;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCt() {
		return ct;
	}
	public void setCt(String ct) {
		this.ct = ct;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	  
}
