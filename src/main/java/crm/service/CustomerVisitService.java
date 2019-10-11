package crm.service;

import crm.entity.CustomerVisit;

import java.util.List;

public interface CustomerVisitService {
    public List<CustomerVisit> checkDeleteEmp(Integer empid);

    public List<CustomerVisit> findAllCV();

    public CustomerVisit findCvById(int id);

    public int modifyCsById(CustomerVisit customerVisit);

    public int addCustomerVisit(CustomerVisit customerVisit);

    public int deleteCusVisit(CustomerVisit customerVisit);

    public List<CustomerVisit> findAllByCom(String username);

}
