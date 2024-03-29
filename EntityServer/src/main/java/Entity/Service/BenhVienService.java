package Entity.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Repository.BenhVienRepository;
import Entity.model.Oxy;
import Entity.model.BenhVien;
import lombok.extern.java.Log;


@Service
public class BenhVienService {
	
	@Autowired
	private BenhVienRepository benhVienRepository;

	public List<BenhVien> listAll(){
		return benhVienRepository.findAll();
	}
	
	public void saveBenhVien(BenhVien benhVien) {
		benhVienRepository.save(benhVien);
	}
	
	public BenhVien getBenhVien(Integer id) {
		return benhVienRepository.findById(id).get();
		
	}
	
	public void deleteBenhVien(Integer id) {
		benhVienRepository.deleteById(id);
	}
}
