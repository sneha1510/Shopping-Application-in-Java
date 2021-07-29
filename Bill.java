package Shop2pack;

public class Bill 
{
	private int billno;
	double cgst,sgst;
	double tot,finaltot;
	public Bill(int billno, double cgst, double sgst, double tot, double finaltot) {
		this.billno = billno;
		this.cgst = cgst;
		this.sgst = sgst;
		this.tot = tot;
		this.finaltot = finaltot;
	}
	public int getBillno() {
		return billno;
	}
	public void setBillno(int billno) {
		this.billno = billno;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}
	public double getFinaltot() {
		return finaltot;
	}
	public void setFinaltot(double finaltot) {
		this.finaltot = finaltot;
	}
	
}
