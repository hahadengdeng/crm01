package crm.service;

import crm.entity.Employees;

import java.util.List;

public interface EmployeesService {
    void addEmployee();

    void updateEmployee();
    void removeEmployee();
    public Employees selectByUsername(Employees employees);
    public int register(Employees employees);
    public int modifyPassword(Employees employees);
    public List<Employees> findAllCommissioner();
    public Employees findEmpById(Integer empid);
    public Employees findModify(Employees employees);
    public int modifyCom(Employees employees);
    public int addCommissioner(Employees employees);
    public int deleteCom(Integer empid);
    public List<Employees> findAllEmp();
}
