package com.bootcamp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bootcamp.document.Transaction;
import reactor.core.publisher.Flux;


public interface TransactionRepository extends ReactiveCrudRepository<Transaction, Integer>{
        Flux<Transaction> findAllByCardNumberOrderByDateCreatedDesc(String cardNumber);
}
