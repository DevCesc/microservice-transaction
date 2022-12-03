package com.bootcamp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.document.Transaction;


public interface TransactionRepository extends ReactiveCrudRepository<Transaction, Integer>{

}
