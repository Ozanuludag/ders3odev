package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer ozan = new IndividualCustomer();
		ozan.customerNumber = "12345";
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(hepsiBurada);
		//customerManager.add(ozan);
		UnionCustomer abcsendikası = new UnionCustomer();
		abcsendikası.customerNumber = "99999";
		//customerManager.add(abcsendikası);
		
		Customer[] customers = {ozan, abcsendikası, hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
