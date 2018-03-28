package pizzalabtest;

public class bill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total=0;
		int i;
		
		
		pizza[] i1=new pizza[10];
		i1[0]=new pizza("magreta",2,450);
		i1[1]=new  pizza("mamamia",3,300);
		i1[2]=new  pizza("indiana",5,250);
		
		

		System.out.println("***********************************DOMINOS********************************************");
		System.out.println("***********************************BILL********************************************");
		System.out.println(" Name of pizza            "  + "Quantity         "+"Price        " + "Total Price:-");

		for(i=0;i<=2;i++)
		{
			total=total+i1[i].netPrice();
			i1[i].printDetails();
			
			
		}

		System.out.println("******************************************************************************");
		System.out.println("               Total Amount                             "+total);
		System.out.println("******************************************************************************");
			float amount=total;
			float GST;
			float finalamt;
			GST=(amount*8)/100;
	
			System.out.println("               GST AMOUNT                              "+GST);
			
			finalamt=amount+GST;
			System.out.println("             Grand Total amount                        " +finalamt);
			
			System.out.println("******************************VISIT AGAIN******************************************");
		
		
		
	}
}
