package com.spring.test;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContextConfig.xml"})
public class springTest {
	@Autowired
	Performer performer;
	@Autowired
	ConnectionBean bean;
	@Test
	public void test() throws Exception{
		performer.perform();
		Contestant c = (Contestant) performer;
		c.receiveAward();
		System.out.println(bean.getDriverClassName());
		System.out.println(Arrays.toString(bean.getServers().toArray(new String[0])));
	}
}
