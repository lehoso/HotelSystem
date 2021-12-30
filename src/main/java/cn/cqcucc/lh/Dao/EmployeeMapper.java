package cn.cqcucc.lh.Dao;

import cn.cqcucc.lh.Model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author LIHAO
 * @date 2021/12/30
 * @apinote
 */
@Mapper
@Service
public interface EmployeeMapper {

    //增
    int insert(Employee record);

    int insertSelective(Employee record);


    //删
    int deleteEmployeeeById(int id);

    //改

    int updateEmployee(Employee employee);

    //查

    Employee employeeconfirm(Employee employee);

    ArrayList<String> getallemployeeid();

    Employee selectById(int i);


    Employee getEmployeeByUsername(String username);

    ArrayList<Employee> getAllEmployee();
}