package in.snit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.snit.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}
