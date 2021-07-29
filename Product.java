package Shop2pack;

public class Product
{
	private int prodId;
	private int prodQty;
	private double prodPrice;
	private String prodName;
	
	//public Product() {
	//}
	public Product(int prodId, int prodQty, double prodPrice, String prodName) {
		this.prodId = prodId;
		this.prodQty = prodQty;
		this.prodPrice = prodPrice;
		this.prodName = prodName;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
}
