package org.example.repositories;

import org.example.model.Item;
import org.example.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer>{

    List<Item> findByItemName(String itemName);

    List<Person> findByOwner(Person owner);

}
