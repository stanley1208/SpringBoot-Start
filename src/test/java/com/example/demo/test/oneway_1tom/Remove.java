package com.example.demo.test.oneway_1tom;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.oneway_1tom.Infect;
import com.example.demo.oneway_1tom.Vaccine;
import com.example.demo.repository.InfectRepository;
import com.example.demo.repository.VaccineRepository;

@SpringBootTest
public class Remove {
	
	@Autowired
	InfectRepository infectRepository;
	
	@Autowired
	VaccineRepository vaccineRepository;
	
	@Test
	public void begin() {
		System.out.println("Remove");
		
		//單向一對多移除(一)方的時候
		//假設要移除infects id=1資料
		//預設會先將(多)的一方的關聯欄位為NULL，再刪除(一)的一方
		//infectRepository.deleteById(1L);
		
		//聯集刪除@OneToMany(cascade = CascadeType.REMOVE)
		infectRepository.deleteById(2L);
	}
}
