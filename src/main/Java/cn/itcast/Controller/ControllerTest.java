package cn.itcast.Controller;

import cn.itcast.Service.AccountService;
import cn.itcast.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ControllerTest {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/aa")
    public String find(Model model){

        List<Account> all = accountService.findAll();
        model.addAttribute("list",all);

        System.out.println("SpringMVC测试");

        return "success";
    }
}
