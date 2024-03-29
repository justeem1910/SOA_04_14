package Entity.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Repository.OxyRepository;
import Entity.model.BenhVien;
import Entity.model.Oxy;

@Service
@Transactional
public class OxyService {

	@Autowired
	private OxyRepository oxyRepository;
	
	public List<Oxy> findAll(){
		return oxyRepository.findAll();
	}
	
	public Oxy getOxy(Integer id) {
		return oxyRepository.findById(id).get();
		
	}

	public void saveOxy(Oxy oxy) {
		oxyRepository.save(oxy);
	}
	
}
