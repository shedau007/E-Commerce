package com.shopping.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	
	
	private long cartId;
	private long productId;
    private String title;
    private String category;
    private double price;
    private String description;
    private String imageUrl;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
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
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productId=" + productId + ", title=" + title + ", category=" + category
				+ ", price=" + price + ", description=" + description + ", imageUrl=" + imageUrl + "]";
	}
    
    
    
}
