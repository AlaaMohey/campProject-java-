package repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.CampImage;

public interface campImages extends JpaRepository<CampImage, Long> {

}
