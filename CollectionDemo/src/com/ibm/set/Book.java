package com.ibm.set;
class Book {
	private String title;
	private float price;
	private int publishYear;
	public int getPublisherYear() {
		return publishYear;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublisher(int publishYear) {
		this.publishYear = publishYear;
	}
	
	@Override
	public String toString() {
		return "{price"+this.price+",title="+this.title+",publishYear="+this.publishYear+"}";
	}


	
}
