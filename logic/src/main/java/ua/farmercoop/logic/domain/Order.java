package ua.farmercoop.logic.domain;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
	private long id;
	private long userId;
	private BigDecimal sumPrice;
	private int postId;
	private String moveToAdress;
	private String phone;
	private String note;
	private Date dateOrder;
	private List<Product> products;
	private Carrier carrier;
	
	@Override
	public String toString() {
		final int maxLen = 3;
		return "Order [id=" + id + ", userId=" + userId + ", sumPrice=" + sumPrice + ", postId=" + postId
				+ ", moveToAdress=" + moveToAdress + ", phone=" + phone + ", note=" + note + ", dateOrder=" + dateOrder
				+ ", products=" + (products != null ? products.subList(0, Math.min(products.size(), maxLen)) : null)
				+ ", carrier=" + carrier + "]";
	}
	
	public long getId() {
		return id;
	}
	public long getUserId() {
		return userId;
	}
	public BigDecimal getSumPrice() {
		return sumPrice;
	}
	public int getPostId() {
		return postId;
	}
	public String getMoveToAdress() {
		return moveToAdress;
	}
	public String getPhone() {
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
	
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public void setSumPrice(BigDecimal sumPrice) {
		this.sumPrice = sumPrice;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public void setMoveToAdress(String moveToAdress) {
		this.moveToAdress = moveToAdress;
	}
	public void setPhone(String phone) {
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
