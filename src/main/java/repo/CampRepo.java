package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Camp;
import java.util.List;
public interface CampRepo  extends JpaRepository<Camp, Long> {


   List<Camp> findByIsApproved();
   List<Camp> findByStateList(String  state);

}
    