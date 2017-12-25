package ua.saniok.web.shop.model.entity;

import java.math.BigDecimal;
import java.util.List;

public class Order {
	private int id;
	private int userId;
	private BigDecimal sumPrice;
	private int postId;
	private String moveToAdress;
	private int phone;
	private String note;
	private Date dateOrder;
	private List<Product> products;
	private Carrier carrier;
	public int getId() {
		return id;
	}
	public int getUserId() {
		return userId;
	}
	public BigDecimal getCost() {
		return sumPrice;
	}
	public int getPostId() {
		return postId;
	}
	public String getMoveToAdress() {
		return moveToAdress;
	}
	public int getPhone() {
		return phone;
	}
	
	public String getNote() {
		return note;
	}
	public Date getDateOrder() {
		return dateOrder;
	}
	public List<Product> getProducts() {
		return products;
	}
	public Carrier getCarriers() {
		return carrier;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setCost(BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public void setMoveToAdress(String moveToAdress) {
		this.moveToAdress = moveToAdress;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void setCarriers(Carrier carrier) {
		this.carrier = carrier;
	}

}
