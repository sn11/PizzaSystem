package pizzalabtest;

public class pizza {
	int quantity;
	int price;
	String name;

	public  pizza(String name, int quantity, int price) {
		super();
		this.name=name;
		this.quantity = quantity;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printDetails()
	{
			
		
		System.out.println("     "+getName()+"                 "+getQuantity()+"             "	+getPrice()+"         "	+netPrice());
		
	}
	public int netPrice()
	{
		int total;
		total=(int) (getQuantity()*getPrice());
		return total;
		
	}
	
	
	
	
	
	}




