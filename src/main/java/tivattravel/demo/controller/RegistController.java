package tivattravel.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tivattravel.demo.bean.User;
import tivattravel.demo.mapper.UserMapper;
import tivattravel.demo.service.UserService;
import tivattravel.demo.service.impl.UserServiceImpl;

import javax.annotation.Resource;

@Slf4j
@Controller
public class RegistController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Resource
    UserMapper usersMapper;
    @Autowired
    UserService userService;
    @Autowired
    UserServiceImpl userServiceImpl;
    //添加页面跳转
    @RequestMapping("add")
    private String add(){
        return "regist";
    }
    //添加
    @RequestMapping
    private String addUsers(Model model, User user){
        int i= usersMapper.insert(user);
        model.addAttribute("u",i);
        System.out.println(i);
        System.out.println(user);
        return "redirect:/login";
    }
}
