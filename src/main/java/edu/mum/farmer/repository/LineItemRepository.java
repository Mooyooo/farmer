package edu.mum.farmer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.LineItem;

public interface LineItemRepository extends CrudRepository<LineItem, Long>{
}
