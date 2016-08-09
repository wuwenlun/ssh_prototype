package wuwenlun;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import person.dao.TestMapper;
import person.model.TestModel;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestSSH {

	@Autowired
	private TestMapper testMapper;
	
	@Test
	public void testFindData() throws Exception{
		List<TestModel> models = testMapper.selectAll();
		System.out.println(models);
	}
}
