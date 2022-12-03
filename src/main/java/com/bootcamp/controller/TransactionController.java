package com.bootcamp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.document.Transaction;
import com.bootcamp.service.TransactionService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/transactions")
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@PostMapping(value = "/saveTransaction")
	public Mono<Transaction> save(@RequestBody Transaction transaction){
		return transactionService.saveTransaction(transaction);
	}
	
	@GetMapping(value = "/transaction/{codCliente}/{carNumber}")
	public Flux<Transaction> getTransactions(@PathVariable String codCliente,@PathVariable String carNumber){
		return transactionService.getAllTransactionsByClient(codCliente,carNumber);
	}
}
