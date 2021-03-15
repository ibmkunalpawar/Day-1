
public class Order {
	private int itemID;
	private String itemName;
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Order(int itemID, String itemName) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
	}
}