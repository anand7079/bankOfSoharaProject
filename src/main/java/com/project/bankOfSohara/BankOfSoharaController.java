package com.project.bankOfSohara;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankOfSoharaController {
	@Autowired
	private BankOfSoharaRepository repository;

	@PutMapping(path="/customers/{customerId}/credit/{amount}")
	public int depositMoney(@PathVariable BigInteger customerId,@PathVariable int amount)
	{
		return repository.updateBalance(customerId, amount);
	}
	@PutMapping(path="/customers/{customerId}/debit/{amount}")
	public int withdrawMoney(@PathVariable BigInteger customerId,@PathVariable int amount)
	{
		amount=-1*amount;
		return repository.updateBalance(customerId, amount);
	}
	@GetMapping(path="/customers/{customerId}")
	public Optional<Customers> getCustomerDetail(@PathVariable BigInteger customerId)
	{
		return repository.findById(customerId);
	}@GetMapping(path="/gitStatus")
	public String getGitStatus()
	{
		return "first commit after intitalizing git";
	}
	
}
