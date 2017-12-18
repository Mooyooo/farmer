package edu.mum.farmer.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ShoppingCart {

	@Id
	@GeneratedValue
	private long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date addedDate;

	@OneToOne(mappedBy = "shoppingCart")
	private Client client;

	@OneToMany(cascade = {CascadeType.MERGE,CascadeType.REMOVE})
	@JoinColumn(name = "shoppingCartId")
	private List<LineItem> lineItems = new ArrayList<>();

	protected ShoppingCart() {

	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public List<LineItem> getLineItems() {
		return Collections.unmodifiableList(lineItems);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void removeLineItem(LineItem item) {
		lineItems.remove(item);
	}

	public void addLineItem(LineItem lineItem) {
		LineItem li=null;
		if (lineItems!=null) {
			for (LineItem item : lineItems) {
				if (lineItem.getProduct().getId() == item.getProduct().getId()) {
					li = item;
					lineItem.setQuantity(lineItem.getQuantity() + item.getQuantity());
				}
			}
		}
		lineItems.remove(li);
		lineItems.add(lineItem);
	}
}
