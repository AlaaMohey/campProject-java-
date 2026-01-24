package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long>{
   
    List<Booking> findByCampId(Long campId);
}
