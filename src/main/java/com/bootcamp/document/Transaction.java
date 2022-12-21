package com.bootcamp.document;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "transaction")
public class Transaction {

	@Id
	private ObjectId id;
//	private int codTransaction;
	private String cardNumber;
	private String codClient;
	private String dateCreated;
	private String destAccount;
	private double monto;
	private Operation operation;
	
	
}
