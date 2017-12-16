package edu.mum.farmer.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.farmer.entity.LineItem;
import edu.mum.farmer.repository.LineItemRepository;

public class LineItemService implements ILineItemService {

	@Autowired
	LineItemRepository lir;

	@Override
	public void addLineItem(LineItem lineItem) {
		lir.save(lineItem);
	}

	@Override
	public void updateLineItem(LineItem lineItem) {
		lir.save(lineItem);
	}

	@Override
	public void deleteLineItem(long id) {
		lir.delete(id);
	}

	@Override
	public LineItem getLineItem(long id) {
		return lir.findOne(id);
	}
	

}
