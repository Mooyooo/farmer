package edu.mum.farmer.entity;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="t_order")
public class Order {
	@Id
	@GeneratedValue
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date orderedDate;

	private String status;

	public Order() {
		
	}
	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.REMOVE })
	@JoinColumn(name = "orderId")
	private List<LineItem> orders = new ArrayList<LineItem>();

	@ManyToOne
	@JoinColumn(name="clientId")
	Client client;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<LineItem> getOrders() {
		return orders;
	}

	public void setOrders(List<LineItem> orders) {
		this.orders = orders;
	}

}
