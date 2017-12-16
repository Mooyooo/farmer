package edu.mum.farmer.service;

import edu.mum.farmer.entity.LineItem;

public interface ILineItemService {

	public void addLineItem(LineItem lineItem);

	public void updateLineItem(LineItem lineItem);

	public void deleteLineItem(long id);

	public LineItem getLineItem(long id);

}
