package com.petriuk.websecurity.dish;


import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DishRepository extends MongoRepository<Dish, String> {
    List<Dish> findByCategory(String category);
}
