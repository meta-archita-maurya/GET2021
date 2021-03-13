package shoppingCart;

public class Item {
	
	private int itemId;
	private String itemName;
	private String itemDesc;
	private int itemQuantity;
	private double itemPrice;

	//-----------setters----------------------
	void setItemId(int id){
		itemId = id;
	}

	public void setItemName(String name){
		itemName = name;
	}
	public void setItemPrice(double price){
		itemPrice = price;
	}
	public void setItemDesc(String desc){
		itemDesc = desc;
	}
	public void setItemQuantity(int quantity){
		itemQuantity = quantity;
	}
	//-----------getters----------------------
	String getItemName(){
		return itemName;
	}
	double getItemPrice(){
		return itemPrice;
	}
	int getItemQuantity(){
		return itemQuantity;
	}

	String getItemDesc(){
		return itemDesc;
	}
	int getItemId(){
		return itemId;
	}

}
