package com.seatbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.seatbooking.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.username=:username")
	Iterable<User> findUserByUsername(@Param("username") String u);

	@Query("SELECT u FROM User u WHERE u.username=:username AND u.password=:password")
	Iterable<User> findUserByCredentials(@Param("username") String username, @Param("password") String password);

}
