package com.seatbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.seatbooking.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query("SELECT l FROM Location l WHERE l.location=:location")
	Iterable<Location> findSeatByLocation(@Param("location") String location);
	
	@Query("SELECT l FROM Location l WHERE l.floor=:floor")
	Iterable<Location> findSeatByFloor(@Param("floor") String floor);
	
	@Query("SELECT l FROM Location l WHERE l.office=:office")
	Iterable<Location> findSeatByOffice(@Param("office") String office);
	
}
