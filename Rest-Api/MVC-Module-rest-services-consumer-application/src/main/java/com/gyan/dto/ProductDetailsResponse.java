package com.gyan.dto;

public class ProductDetailsResponse {
	
	private int id;
	private String title;
	private double price;
	private String description;
	private String image;
	private Rating rating;
	
	public ProductDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDetailsResponse(int id, String title, double price, String description, String image, Rating rating) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.description = description;
		this.image = image;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "ProductDetailsResponse [id=" + id + ", title=" + title + ", price=" + price + ", description="
				+ description + ", image=" + image + ", rating=" + rating + "]";
	}

}
