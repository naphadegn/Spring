package in.snit.config;

import org.springframework.batch.item.ItemProcessor;

import in.snit.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {

		// my own login if required... 
		// ex. drop one column in excel. or any column related logic.
		System.out.println("Customer process executed.....");	
		return item;
	}

}
