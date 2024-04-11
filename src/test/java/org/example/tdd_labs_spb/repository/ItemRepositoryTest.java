package org.example.tdd_labs_spb.repository;

import org.example.tdd_labs_spb.model.Item;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   antihetman
  @project   TDD_Labs_Spb
  @class  ItemRepositoryTest
  @version  1.0.0 
  @since 4/11/24 - 23.09

*/
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DataMongoTest
class ItemRepositoryTest {

    @Autowired
    ItemRepository underTest;

    @BeforeEach
    void setUp() {
        List<Item> items = List.of(
                (new Item("Item1", "00001","item test1")),
                (new Item("Item2", "00010","item test2")),
                (new Item("Item3", "00011","item test3"))
        );
        underTest.saveAll(items);
    }

    @AfterEach
    void tearDown() {
        List<Item> items = underTest.findAll()
                .stream().filter(item -> item.getDescription().contains("test"))
                .toList();
        underTest.deleteAll(items);
    }

    @Test
    void itShouldCheckTheCollectionIsNotEmpty() {
        assertFalse(underTest.findAll().isEmpty());
        List<Item> items = underTest.findAll()
                .stream().filter(it -> it.getDescription().contains("test"))
                .toList();
        assertEquals(items.size(), 3);
    }
    @Test
    void itShouldSaveItem(){
        //given
        Item item = new Item("Item4", "00100","item test4");
        //when
        underTest.save(item);
        //then
        Item testItem = underTest.findAll().stream()
                .filter(it -> it.getDescription().contains("test"))
                .findAny()
                .orElse(null);
        assertNotNull(testItem);
        assertNotNull(testItem.getId());
        assertFalse(testItem.getId().isEmpty());
        assertEquals(item.getCode(),"00100");

    }
    @Test
    void itShouldDeleteItem(){
        //given
        Item item = new Item("Item4", "00100","item test4");
        underTest.save(item);
        //when
        underTest.delete(item);
        //then
       Item testItem = underTest.findAll().stream()
               .filter(it -> it.getCode().contains("100"))
               .findAny().orElse(null);
       assertNull(testItem);
    }
    @Test
    void itShouldUpdateItem(){
        //given
          Item item = underTest.findAll().stream()
                  .filter(it -> it.getCode().equals("00001"))
                  .findAny().orElse(null);
          item.setDescription("changed item description");
          //when
        underTest.save(item);
        //then
        Item changedItem = underTest.findAll().stream()
                .filter(it -> it.getCode().equals("00001"))
                .findAny().orElse(null);
        assertEquals(changedItem.getDescription(),"changed item description");
    }
}