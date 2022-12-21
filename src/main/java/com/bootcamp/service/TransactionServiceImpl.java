package com.bootcamp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootcamp.document.Transaction;
import com.bootcamp.repository.TransactionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl implements TransactionService {

	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public Flux<Transaction> getAllTransactionsByClient(String codCliente,String cardNumber) {
		
		return transactionRepository.findAll().filter(x->x.getCodClient().equals(codCliente)&&x.getCardNumber().equals(cardNumber));
	}

	@Override
	public Mono<Transaction> saveTransaction(Transaction transaction) {
		
		return transactionRepository.save(transaction);
	}

	@Override
	public Flux<Transaction> getAllLastTenTransaction(String cardNumber) {
		return transactionRepository.findAllByCardNumberOrderByDateCreatedDesc(cardNumber)
				.take(10);
	}

}
