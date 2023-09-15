package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CRUDagent<Customer> extends JpaRepository<Customer, Long> {

}
