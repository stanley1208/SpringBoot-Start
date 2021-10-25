package com.example.demo.test.oneway_mto1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.oneway_mto1.Customer;
import com.example.demo.entity.oneway_mto1.Order;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.OrderRepository;

@SpringBootTest
public class Query {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Test
	public void start() {
		//@ManyToOne預設是fetch=FetchType.EAGER
		//所以SQL會進行left outer join 來聯集其他資料
		//@ManyToOne手動改成fetch=FetchType.LAZY
		//就不會進行聯查詢
		//後來的程式有調用到一的一方的資料會自動生成SQL指令查詢
		Order order=orderRepository.findById(1L).get();
		System.out.println(order.getName());
		System.out.println(order.getCustomer().getName());
	}
}
