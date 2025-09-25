package com.andrei.websecurity.dish;


import org.springframework.data.mongodb.repository.MongoRepository;

/*
@author   AndreiP
@project   websecurity
@class  DishRepository
@version  1.0.0
*/

public interface DishRepository extends MongoRepository<Dish, String> {
}
