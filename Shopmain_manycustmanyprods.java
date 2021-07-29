package Shop2pack;
import java.util.*;

public class Shopmain_manycustmanyprods {

	public static void main(String[] args) 
	{
		System.out.println("-------Welcome to Our Shop----------");
		Customer c[]=accept();
		calculateBill(c);
		//billd(c);
		display(c);
		//disbill(c);
          System.out.println("--------Thank You--------");
          System.out.println("--------Visit again---------");
	}
	public static Customer[] accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many customers do u want?");
		int n=sc.nextInt();
		Customer c[]=new Customer[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter customer id:");
		int cid=sc.nextInt();
		System.out.println("Enter customer name:");
		String cname=sc.next();
		System.out.println("Enter Customer mobile no:");
		String mno=sc.next();
		System.out.println("Enter city:");
		String ct=sc.next();
		System.out.println("Enter state");
		String st=sc.next();
		System.out.println("Enter pincode");
		int pin=sc.nextInt();
		Address a=new Address(pin,ct,st);

		System.out.println("Enter how many products do u want to buy");
		int pno=sc.nextInt();
		Product parr[]=new Product[pno];
		for(int j=0;j<pno;j++)
		{
		
	   System.out.println("=======================================");
      	  System.out.println("Enter product id:");
      	int pid=sc.nextInt();
      	  System.out.println("Enter product name:");
      	String Name=sc.next();
      	  System.out.println("Enter product price:");
      	double Price=sc.nextDouble();
      	  System.out.println("Enter product quantity");
      	int Qty=sc.nextInt();
  
      	Product p=new Product(pid,Qty,Price,Name);
      	  parr[j]=p;
		}
		Customer c1=new Customer(cid,cname,mno,parr,a);
		c[i]=c1;
    	  c[i].setProd(parr);

		}
		return c;
		}
	
	public static void display(Customer c[])
	{
		for(int i=0;i<c.length;i++)
		{
	        System.out.println("-------Customer details------------------");
         	System.out.println("Customer id:"+c[i].getCustId());
 	        System.out.println("Customer name:"+c[i].getCustName());
	     System.out.println("Mobile no:"+c[i].getMobNo());
	     Address a=c[i].getA();
	     System.out.println("---------Address details---------");
	     System.out.println("City:"+a.getCt());
	    System.out.println("State:"+a.getSt());
	    System.out.println("Pincode"+a.getPincode());
	     System.out.println("---------Product details----------");
	   Product p[]=c[i].getProd();
	for(int j=0;j<p.length;j++)
	     {
		        System.out.println("==========================================");
		        System.out.println("Product id:"+p[j].getProdId());
		        System.out.println("Product name:"+p[j].getProdName());
		        System.out.println("Product price:"+p[j].getProdPrice());
		        System.out.println("Product quantity:"+p[j].getProdQty());
	     }
     // Bill b[]=c[i].getB();
	/*for( i=0;i<c.length;i++)
	{
		Bill b=c[i].getB();

	System.out.println("---------Bill details--------");
	System.out.println("Bill no:"+b.getBillno());
	System.out.println("Cgst:"+b.getCgst());
	System.out.println("Sgst:"+b.getSgst());
	System.out.println("Total:"+b.getTot());
	System.out.println("Final Total:"+b.getFinaltot());

	
	    }*/
	   System.out.println("\n----------------- BILL -----------------");
		System.out.println("Bill No\t\t: "+c[i].getB().getBillno());
		System.out.println("Total\t\t: "+c[i].getB().getTot());
		System.out.println("CGST\t\t: "+c[i].getB().getCgst());
		System.out.println("SGST\t\t: "+c[i].getB().getSgst());
		System.out.println("Final Total\t: "+c[i].getB().getFinaltot());
	}
	}
	/*public static void billd(Customer c[])
	{
		double cgst,sgst;
		double tot=0,fb;
	//	int tot,fb;
		
		for(int i=0;i<c.length;i++)
		{
		      Product parr[]=c[i].getProd();
		      for(i=0;i<parr.length;i++)
	    	{
			    tot=tot+parr[i].getProdPrice()*parr[i].getProdQty();
			   
	      	}
		    cgst=tot*0.06;
		    sgst=tot*0.06;
		    fb=tot+cgst+sgst;
			Bill b=new Bill(i, cgst, sgst, tot, fb);
		   c[i].setB(b);
		   
		}
	}*/
	public static void calculateBill(Customer custarr[])
	{
		int i=0;
		double total=0,cgst,sgst,finaltotal;
		for(i=0;i<custarr.length;i++)
		{
			Product prodarr[]=custarr[i].getProd();
			for(int j=0;j<prodarr.length;j++)
			{
				total=total+(prodarr[j].getProdPrice()*prodarr[j].getProdQty());
			}
			cgst=total*0.06;
			sgst=total*0.06;
			finaltotal=total+cgst+sgst;
			
			Bill obj=new Bill(101, cgst, sgst, total, finaltotal);
			custarr[i].setB(obj);
		}
	}

	/*public static void disbill(Customer c[])
	{
		for(int i=0;i<c.length;i++)
		{
			Bill[] b=c[i].getB();

		System.out.println("---------Bill details--------");
		System.out.println("Bill no:"+b[i].getBillno());
		System.out.println("Cgst:"+b[i].getCgst());
		System.out.println("Sgst:"+b[i].getSgst());
		System.out.println("Total:"+b[i].getTot());
		System.out.println("Final Total:"+b[i].getFinaltot());
	}
	}*/
}

