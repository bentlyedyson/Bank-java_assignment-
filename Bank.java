import java.util.ArrayList;
public class Bank {
	private ArrayList<Customer> customer;
	private int numberOfCustomers;
	private String bankName;
	
	public Bank(String bName) {
		this.bankName = bName;
	}
	
	public Customer getCustomer(ArrayList<Customer> customer, int index) {
		return customer.get(index);
	}
	
	public void setCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}
	
	public int getNumOfCustomers(ArrayList<Customer> customer) {
		return customer.size();
	}
	
	public void addCustomer(ArrayList<Customer> customer, String f, String l) {
		customer.add(new Customer(f,l));
	}
}