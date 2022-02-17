package ssm.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.EmployeeMapper;
import ssm.mybatis.Employee;

import java.util.List;

/**
 * 你大爷写的代码
 */
@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmps(){
        return employeeMapper.getEmps();
    }
}
