
public class InnerClassesDemo {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
	}
}
class Account{
//	private Address adddress;
	private Address[] addresses;	//multiple addresses
	private int number;
	public Account() {
		this.addresses = new Address[3];
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] addresses) {
		this.addresses = addresses;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	class Address{
		private String streetName;
	}
}