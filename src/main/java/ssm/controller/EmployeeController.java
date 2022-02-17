package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.mybatis.Employee;
import ssm.service.EmployeeService;

import java.util.List;
import java.util.Map;

/**
 * 你大爷写的代码
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/emps")
    public String emps(Map<String,Object> map){
        List<Employee> emps = employeeService.getEmps();
        map.put("allEmps",emps);
        System.out.println("git2");
        System.out.println("git3");
        System.out.println("hot-fix test");
        return "list";
    }
}
