package ua.lviv.lgs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import ua.lviv.lgs.domain.Univercity;

public interface UnivercityRepository extends JpaRepository<Univercity, Long>{

	List<Univercity> findByName(String name);
	
	
	List<Univercity> findByCountPupilsList(Integer count);
	
	@Query("select c from Custom c where c.email = :email")
	Stream<Univercity> findByEmailReturnsStream(@Param(value = "email") String email);
	
}
