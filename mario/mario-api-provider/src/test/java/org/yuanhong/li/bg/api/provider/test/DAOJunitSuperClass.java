package org.yuanhong.li.bg.api.provider.test;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

/**
 * DAO层单元测试基类
 * @author yuanhong.li
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
@ContextConfiguration(classes = { DAOJunitSuperClass.class})
@ImportResource({"classpath:mario-dao-test-config.xml"})
public class DAOJunitSuperClass extends AbstractTestNGSpringContextTests{

	static {
		System.setProperty("spring.profiles.active", "local");
		System.setProperty("configlocation", "D:\\sourcecodes\\build\\MyWork\\1.nz");
	}

}
