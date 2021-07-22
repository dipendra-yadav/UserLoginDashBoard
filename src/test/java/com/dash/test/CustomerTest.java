package com.dash.test;
/*
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dash.config.SpringDataJpaConfig;
import com.dash.dao.ICustomerDao;
import com.dash.entities.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { SpringDataJpaConfig.class })
public class CustomerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	ICustomerDao custDao;

	@Test
	public void testInsertJpa() {

		Customer c = new Customer();
		c.setCname("Jitesh");
		c.setAddress("Bangalore");
		c.setPhone(9742758996L);
		custDao.save(c);
	}

	

	@Test
	public void testFindByNameJpa() {
		List<Customer> custs = custDao.findByCname("Deependra");
		System.out.println("***FindByCname***:" + custs.size());
	}

}
*/