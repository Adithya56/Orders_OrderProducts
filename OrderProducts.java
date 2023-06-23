package eStoreProduct.model.customer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import eStoreProduct.model.admin.entities.Product;
import eStoreProduct.model.admin.entities.orderModel;

@Entity
@Table(name = "slam_OrderProducts")
public class OrderProducts {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ordr_id")
	private Long order_id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prod_id")
	private Product product;

	@Column(name = "orpr_batchno")
	private String batchNumber;

	@Column(name = "orpr_qty")
	private Integer quantity;

	@Column(name = "orpr_gst")
	private double gst;

	@Column(name = "orpr_price")
	private double price;

	@ManyToOne
	@JoinColumn(name = "ordr_id", referencedColumnName = "Ordr_id", insertable = false, updatable = false)
	orderModel ordprd;

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long long1) {
		this.order_id = long1;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Getters and setters
	// ...
}