package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
	}

	// bulk insert
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
	/*
	 * Polymorphism indivudualCustomer ve corporateCustomer sınıflarından
	 * ürettiğimiz nesneler ile add metodu sorunsuz çalıştı. Fakat add metodu
	 * parametre olarak Customer tipinde bir parametre alıyor. Bireysel ve şirket
	 * müşterilerini Customer sınıfından extends ettğimiz için bu sınıflar dolaylı
	 * olarak customer nesnelerdir
	 */

}
