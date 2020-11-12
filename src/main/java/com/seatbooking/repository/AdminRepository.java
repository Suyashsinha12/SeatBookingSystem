package com.seatbooking.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.seatbooking.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer > {
	@Query("SELECT u FROM Admin u WHERE u.username=:username")
    Iterable<Admin> findAdminByUsername(@Param("username") String u);

    @Query("SELECT u FROM Admin u WHERE u.username=:username AND u.password=:password")
    Iterable<Admin> findAdminByCredentials(@Param("username") String username, @Param("password") String password);
}
