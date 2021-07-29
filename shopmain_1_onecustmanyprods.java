package Shop2pack;
import java.util.*;

public class shopmain_1_onecustmanyprods
{

		public static void main(String[] args) 
		{
			System.out.println("-------Welcome to Our Shop----------");
			Customer c=accept();
			display(c);
			billd(c);
			disbill(c);
	          System.out.println("--------Thank You--------");
	          System.out.println("--------Visit again---------");
		}
		public static Customer accept()
		{
			Scanner sc=new Scanner(System.in);
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
			int n=sc.nextInt();
			Product parr[]=new Product[n];
			for(int i=0;i<parr.length;i++)
			{
			
				Product pobj1=new Product();
				System.out.println("=======================================");
	      	  System.out.println("Enter product id:");
	      	  pobj1.setProdId(sc.nextInt());
	      	  System.out.println("Enter product name:");
	      	  pobj1.setProdName(sc.next());
	      	  System.out.println("Enter product price:");
	      	  pobj1.setProdPrice(sc.nextDouble());
	      	  System.out.println("Enter product quantity");
	      	  pobj1.setProdQty(sc.nextInt());
	      	  parr[i]=pobj1;
			}
			
			Customer c=new Customer(cid,cname,mno,parr,a);
			return c;
		}
		public static void display(Customer c)
		{
			
		System.out.println("-------Customer details------------------");
		System.out.println("Customer id:"+c.getCustId());
		System.out.println("Customer name:"+c.getCustName());
		System.out.println("Mobile no:"+c.getMobNo());
		Address a=c.getA();
		System.out.println("---------Address details---------");
		System.out.println("City:"+a.getCt());
		System.out.println("State:"+a.getSt());
		System.out.println("Pincode"+a.getPincode());
		System.out.println("---------Product details----------");
		Product p[]=c.getProd();
		for(int i=0;i<p.length;i++)
		     {
			        System.out.println("==========================================");
			        System.out.println("Product id:"+p[i].getProdId());
			        System.out.println("Product name:"+p[i].getProdName());
			        System.out.println("Product price:"+p[i].getProdPrice());
			        System.out.println("Product quantity:"+p[i].getProdQty());
		     }
		}
		public static void billd(Customer c)
		{
			double cgst,sgst;
			double tot=0,fb;
		//	int tot,fb;
			Product parr[]=c.getProd();
			for(int i=0;i<parr.length;i++)
			{
				tot=tot+parr[i].getProdPrice()*parr[i].getProdQty();
			}
			cgst=tot*0.06;
			sgst=tot*0.06;
			fb=tot+cgst+sgst;
			Bill b=new Bill(101,cgst,sgst,tot,fb);
			c.setB(b);
		}
		public static void disbill(Customer c)
		{
			System.out.println("---------Bill details--------");
			System.out.println("Bill no:"+c.getB().getBillno());
			System.out.println("Cgst:"+c.getB().getCgst());
			System.out.println("Sgst:"+c.getB().getSgst());
			System.out.println("Total:"+c.getB().getTot());
			System.out.println("Final Total:"+c.getB().getFinaltot());
		}
		
	}


