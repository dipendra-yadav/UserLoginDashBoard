package com.dash.user.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dash.config.SpringDataJpaConfig;

import com.dash.dao.IUserDao;

import com.dash.entities.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = { SpringDataJpaConfig.class })
public class UserTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	IUserDao userDao;

	@Test
	public void testInsertUserLogin() {

		User user = new User();

		user.setUserPrincipalName("deependra.yadav@guidewire.ias");
		user.setDisplayName("deependra yadav");
		user.setEmployeeID("100993760");
		user.setEmployeeType("FTE");
		user.setSourceSystem("PolicyCenter");
		user.setUserLoginDate("2021-04-29");
		user.setUserLoginTime("07:35:37.4400000");
		user.setMobile("9742758996");
		user.setDepartment("model system");
		user.setMail("deependra.yadav@pwc.com");
		user.setManager("Jithesh Mavila");

		userDao.save(user);

	}

	@Test
	public void testFindByName() {
		User user = (User) userDao.findByUserPrincipalName("deependra.yadav@guidewire.ias");
		System.out.println("***FindByUserPrincipalName***:" + user);
	}

}