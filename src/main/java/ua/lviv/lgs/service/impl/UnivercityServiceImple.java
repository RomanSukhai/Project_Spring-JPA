package ua.lviv.lgs.service.impl;


import java.util.List;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.dao.UnivercityRepository;
import ua.lviv.lgs.domain.Univercity;
import ua.lviv.lgs.service.UnivercityService;

@Service
public class UnivercityServiceImple implements UnivercityService{

	@Autowired
	private UnivercityRepository customRepository;
	
	@Override
	public Univercity save(Univercity custom) {
		return customRepository.saveAndFlush(custom) ;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Univercity findById(Long id) {
		
		return customRepository.getOne(id);
	}

	@Override
	public Univercity update(Univercity custom) {
		return customRepository.save(custom);
	}

	@Override
	public void deleteById(Long id) {
		customRepository.deleteById(id);
	}

	@Override
	public List<Univercity> findAll() {
		return customRepository.findAll();
	}


	@Override
	public List<Univercity> findByName(String name) {
		
		return customRepository.findByName(name);
		
	}
	
	public List<Univercity> findByCountPupilsList(Integer count) {
		// TODO Auto-generated method stub
		return customRepository.findByCountPupilsList(count);
	}

	@Override
	public Stream<Univercity> findByNameReturnsStream(String name) {
		return customRepository.findByEmailReturnsStream(name);
	}

	
	
}
