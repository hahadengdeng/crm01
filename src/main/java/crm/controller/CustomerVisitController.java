package crm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import crm.entity.Customer;
import crm.entity.CustomerVisit;
import crm.entity.Employees;
import crm.entity.bootstrapPage;
import crm.service.CustomerVisitService;
import crm.service.EmployeesService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerVisitController {

    @Autowired
    private CustomerVisitService service;

    @Autowired
    private EmployeesService employeesService;

    //表单验证
    @RequestMapping("/checkDeleteEmpCV")
    public @ResponseBody
    List<CustomerVisit> checkDeleteEmp(Integer empid) {
        List<CustomerVisit> list = service.checkDeleteEmp(empid);
        return list;
    }

    @RequiresPermissions("customervisit:selectbymanager")
    @RequestMapping("/findAllCusVisit")
    public String findAllCusVisit(Model model) {
        List<CustomerVisit> list = service.findAllCV();
        model.addAttribute("list", list);
        return "customerVisit/showAllCusVisit.jsp";
    }


    @RequiresPermissions("customervisit:update")
    @RequestMapping("/findCvById")
    public @ResponseBody
    CustomerVisit findCvById(int id) {
        CustomerVisit customerVisit = service.findCvById(id);
        return customerVisit;
    }

    @RequiresPermissions("customervisit:update")
    @RequestMapping("/modifyCsById")
    public @ResponseBody
    int modifyCsById(CustomerVisit customerVisit) {
        service.modifyCsById(customerVisit);
   /*     Integer empid = customerVisit.getEmployees().getEmpid();
        Employees emp = employeesService.findEmpById(empid);
        if (emp.getDept().getDeptid() == 1) {
            return 1;
        } else {
            return 2;
        }*/
        return 1;
    }

    @RequiresPermissions("customervisit:managerinsert")
    @RequestMapping("/addCustomerVisit")
    public @ResponseBody
    int addCustomerVisit(CustomerVisit customerVisit) {
        service.addCustomerVisit(customerVisit);
   /*     Integer empid = customerVisit.getEmployees().getEmpid();
        Employees emp = employeesService.findEmpById(empid);
        if (emp.getDept().getDeptid() == 1) {
            return 1;
        } else {
            return 2;
        }*/
        return 1;
    }

    @RequiresPermissions("customervisit:delete")
    @RequestMapping("/deleteCusVisit")
    public @ResponseBody
    int deleteCusVisit(CustomerVisit customerVisit) {
        service.deleteCusVisit(customerVisit);
        /*Integer empid = customerVisit.getEmployees().getEmpid();
        Employees emp = employeesService.findEmpById(empid);
        if (emp.getDept().getDeptid() == 1) {
            return 1;
        } else {
            return 2;
        }*/
        return 1;
    }

    @RequiresPermissions("customervisit:selectbycom")
    @RequestMapping("findAllByCom")
    public String findAllByCom(String username,Model model){
        List<CustomerVisit> list=service.findAllByCom(username);
        model.addAttribute("list",list);
        return "customerVisit/showAllCvByCom.jsp";
    }


    @RequiresPermissions("customervisit:cominsert")
    @RequestMapping("/addCvByCom")
    public @ResponseBody
    int addCvByCom(CustomerVisit customerVisit,String username) {

        Employees employees=employeesService.selectByUsername(new Employees(username));
        customerVisit.setEmployees(employees);
        System.err.println(customerVisit);
        service.addCustomerVisit(customerVisit);
        return 1;
    }

    @RequiresPermissions("customervisit:pagebymanager")
    @RequestMapping("/managerShowCvPage")
    public @ResponseBody bootstrapPage<CustomerVisit> managerShowCvPage(int offset, int limit){

        PageHelper.offsetPage(offset, limit);
        List<CustomerVisit> list=service.findAllCV();

        PageInfo<CustomerVisit> page=new PageInfo<CustomerVisit>(list);

        bootstrapPage<CustomerVisit> bootstrapPage=new bootstrapPage<CustomerVisit>();
        bootstrapPage.setRows(page.getList());
        bootstrapPage.setTotal((int) page.getTotal());
        return bootstrapPage;
    }

    @RequiresPermissions("customervisit:pagebycom")
    @RequestMapping("/comShowCvPage")
    public @ResponseBody bootstrapPage<CustomerVisit> comShowCvPage(int offset, int limit,String username){
        PageHelper.offsetPage(offset, limit);
        List<CustomerVisit> list=service.findAllByCom(username);
        PageInfo<CustomerVisit> page=new PageInfo<CustomerVisit>(list);
        bootstrapPage<CustomerVisit> bootstrapPage=new bootstrapPage<CustomerVisit>();
        bootstrapPage.setRows(page.getList());
        bootstrapPage.setTotal((int) page.getTotal());
        return bootstrapPage;
    }

    /*纯页面跳转*/
    @RequiresPermissions("customervisit:managerinsert")
    @RequestMapping("/gotoAddCustomerVisit")
    public String gotoAddCustomerVisit() {
        return "customerVisit/addCustomerVisit.jsp";
    }

    @RequiresPermissions("customervisit:cominsert")
    @RequestMapping("/gotoComAddCv")
    public String gotoComAddCustomerVisit() {
        return "customerVisit/comAddCv.jsp";
    }

    @RequiresPermissions("customervisit:pagebymanager")
    @RequestMapping("/gotoManagerShowCvPage")
    public String gotoManagerShowCvPage(){
        return "customerVisit/managerShowCvByPage.jsp";
    }

    @RequiresPermissions("customervisit:pagebycom")
    @RequestMapping("/gotoComShowCvPage")
    public String gotoComShowCvPage(){
        return "customerVisit/comShowCvByPage.jsp";
    }
}
