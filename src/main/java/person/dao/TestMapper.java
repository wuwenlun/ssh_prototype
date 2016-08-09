package person.dao;

import java.util.List;

import person.model.TestModel;

public interface TestMapper {

	List<TestModel> selectAll() throws Exception;
}
