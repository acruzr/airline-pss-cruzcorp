package com.airline.pss.bookservice;

import com.airline.pss.bookservice.com.airline.pss.bookservice.configurations.DataSourceDump;
import com.airline.pss.bookservice.com.airline.pss.bookservice.configurations.DevDataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

//if enviroment was set up with export spring_profiles_active=dev you specified
//that this class will be used because of the ActiveProfiles annotation.
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DevDataSourceConfig.class})
@ActiveProfiles("dev")
public class BookServiceApplicationTests {

	@Autowired
	private DataSourceDump dataSourceDump;

	@Test
	public void contextLoads() {
	}

}
