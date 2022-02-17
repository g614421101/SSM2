package ssm.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ssm.mybatis.Employee;

import java.util.List;

/**
 * 你大爷写的代码
 */
public interface EmployeeMapper {
    Employee getEmpById(Integer id);
    List<Employee> getEmps();
}
