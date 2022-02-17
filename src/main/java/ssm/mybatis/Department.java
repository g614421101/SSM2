package ssm.mybatis;

import java.io.Serializable;
import java.util.List;

/**
 * 你大爷写的代码
 */
public class Department implements Serializable {
    private Integer id;
    private String departmentId;
    private List<Employee> emps;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentId='" + departmentId + '\'' +
                ", emps=" + emps +
                '}';
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
}
