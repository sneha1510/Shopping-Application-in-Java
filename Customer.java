package Shop2pack;


public class Customer {
	private int custId;
	private String custName;
	private String mobNo;
	Product prod[];
	Bill b;
	Address a;
	public Customer(int custId, String custName, String mobNo, Product[] prod, Address a) {
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.prod = prod;
		this.a = a;
	}
	/*public Customer(int custId, String custName, String mobNo, Product[] prod, Bill[] b, Address a) {
		this.custId = custId;
		this.custName = custName;
		this.mobNo = mobNo;
		this.prod = prod;
		this.b = b;
		this.a = a;
	}*/
	
	/*public Bill[] getB() {
		return b;
	}
	public void setB(Bill obj) {
		this.b = obj;
	}*/
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Product[] getProd() {
		return prod;
	}
	public void setProd(Product[] prod) {
		this.prod = prod;
	}
	public Bill getB() {
		return b;
	}
	public void setB(Bill b) {
		this.b = b;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	
	
	

}

