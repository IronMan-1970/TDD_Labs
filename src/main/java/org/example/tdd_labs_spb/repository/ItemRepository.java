package org.example.tdd_labs_spb.repository;/*
  @author   antihetman
  @project   TDD_Labs_Spb
  @class  ItemRepository
  @version  1.0.0 
  @since 4/11/24 - 16.05
*/

import org.example.tdd_labs_spb.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
