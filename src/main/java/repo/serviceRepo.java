package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Service;

public interface serviceRepo extends JpaRepository<Service, Long> {

}
