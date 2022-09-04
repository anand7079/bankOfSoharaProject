package com.project.bankOfSohara;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BankOfSoharaRepository extends JpaRepository<Customers,BigInteger> {
   //Customers findByCustomer_id(BigInteger id);
	Customers findByName(String name);
	@Transactional
	@Modifying
	@Query("UPDATE Customers SET balance=balance + :amount WHERE customer_id= :cust_id")
	//@Query("SELECT balance FROM Customers WHERE customer_id=1000001")
	int updateBalance(@Param("cust_id") BigInteger cust_id,@Param("amount") double amount);
}
