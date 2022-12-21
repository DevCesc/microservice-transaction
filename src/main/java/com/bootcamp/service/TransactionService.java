package com.bootcamp.service;

import com.bootcamp.document.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {
	
	public Flux<Transaction> getAllTransactionsByClient(String codCliente,String cardNumber);
	public Mono<Transaction> saveTransaction(Transaction transaction);
	Flux<Transaction> getAllLastTenTransaction(String cardNumber);
}
