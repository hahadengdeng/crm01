import crm.dao.PermissionMapper;
import crm.entity.Customer;
import crm.entity.CustomerShare;
import crm.entity.CustomerVisit;
import crm.entity.Permission;
import crm.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {

    @Autowired
    private PermissionServiceImp serviceImp;

    @Test
    public void aaa() {
        List<Permission> list = serviceImp.selectAllPerByMenu();
        for (Permission c : list) {
            System.err.println(list);
        }
    }
}
