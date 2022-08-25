package ua.lviv.lgs.service;

import java.util.List;
import java.util.stream.Stream;


import ua.lviv.lgs.domain.Univercity;

public interface UnivercityService {

	
	Univercity save(Univercity custom); 
		
	
	Univercity findById(Long id);
	
	
	Univercity update(Univercity custom);
	
	
	void deleteById(Long id);
	
	List<Univercity> findAll();
	
	
	List<Univercity> findByName(String email);
	
	
	List<Univercity> findByCountPupils(Integer count);
	
	
	Stream<Univercity> findByNameReturnsStream( String email);
}
