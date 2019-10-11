package crm.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import crm.entity.Employees;
import crm.entity.bootstrapPage;
import crm.service.EmployeesService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
public class EmployeeController {

   @Autowired
   private EmployeesService service;

    //表单验证
    @RequestMapping("/checkLoginName")
    public void selectByUsername(Employees employees, HttpServletResponse resp)  {
        Employees e=service.selectByUsername(employees);
        try {
            if (e == null) {
                resp.getWriter().print("true");
            } else {
                resp.getWriter().print("false");
            }
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }

    @RequestMapping("/findModify")
    public void findModify(Employees employees,HttpServletResponse resp){
        Employees e=service.findModify(employees);
        try {
            if (e == null) {
                resp.getWriter().print("true");
            } else {
                resp.getWriter().print("false");
            }
        }catch (IOException e1){
            e1.printStackTrace();
        }
    }

    @RequestMapping("/register")
    public String register(Employees employees) throws IOException {

        Md5Hash md5Hash = new Md5Hash(employees.getPassword());
        String newpassword= md5Hash.toString();
        employees.setPassword(newpassword);
        int a=service.register(employees);
        return "login.jsp";
    }

    @RequestMapping("/modifyPassword")
    public String modifyPassword(Employees employees){
        Md5Hash md5Hash = new Md5Hash(employees.getPassword());
        String newpassword= md5Hash.toString();
        employees.setPassword(newpassword);
        int a=service.modifyPassword(employees);
        if (a==1){
            Subject subject= SecurityUtils.getSubject();
            subject.logout();
            return "login.jsp";
        }else {
            return "main.jsp";
        }
    }

    @RequiresPermissions("com:select")
    @RequestMapping("/findAllCommissioner")
    public String findAllCommissioner(Model model){
        List<Employees> employeesList=service.findAllCommissioner();
        model.addAttribute("list",employeesList);
        return "employee/showAllCom.jsp";
    }

    @RequiresPermissions("com:update")
    @RequestMapping("/findEmpById")
    public @ResponseBody Employees findEmpById(Integer empid){
        return service.findEmpById(empid);
    }


    @RequiresPermissions("com:update")
    @RequestMapping("/modifyCom")
    public @ResponseBody int modifyCom(Employees employees){
        int i = service.modifyCom(employees);
        return i;
    }

    @RequiresPermissions("com:insert")
    @RequestMapping("/addCommissioner")
    public String addCommissioner(Employees employees,Model model){
        String password=employees.getPassword();
        Md5Hash md5Hash=new Md5Hash(password);
        String newpassword= md5Hash.toString();
        employees.setPassword(newpassword);
        int a=service.addCommissioner(employees);
        return "redirect:/findAllCommissioner.action";
    }

    @RequiresPermissions("com:delete")
    @RequestMapping("/deleteCom")
    public @ResponseBody int deleteCom(Integer empid){
        int a=service.deleteCom(empid);
        return a;
    }

    @RequiresPermissions("com:selectpage")
    @RequestMapping("/findAllCommissionerByPage")
    public @ResponseBody bootstrapPage<Employees> findAllCommissionerByPage(int offset, int limit){

        /*PageHelper.startPage((offset+limit)/limit,limit);*/
        PageHelper.offsetPage(offset,limit);
        List<Employees> list=service.findAllCommissioner();

        PageInfo<Employees> page=new PageInfo<Employees>(list);


        bootstrapPage<Employees> bootPage= new bootstrapPage<Employees>();
        bootPage.setTotal((int) page.getTotal());
        bootPage.setRows(page.getList());

        return bootPage;
    }

    @RequestMapping("/findAllEmp")
    public @ResponseBody List<Employees> findAllEmp(){
        List<Employees> list=service.findAllEmp();
        return list;
    }
/*-----------以下为纯页面跳转------------*/


    @RequiresPermissions("com:insert")
    @RequestMapping("readyInsert")
    public String readyInsert(){
        return "employee/addCommissioner.jsp";
    }


    @RequiresPermissions("com:selectpage")
    @RequestMapping("doPage")
    public String doPage(){ return "employee/showComByPage.jsp";}

    @RequestMapping("gotoShowCom")
    public String gotoShowCom(){
        return "redirect:findAllCommissioner.action";
    }

}
