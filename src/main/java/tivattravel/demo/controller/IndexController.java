package tivattravel.demo.controller;



import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tivattravel.demo.bean.User;
import tivattravel.demo.mapper.UserMapper;
import tivattravel.demo.service.UserService;
import tivattravel.demo.service.impl.UserServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 负责页面跳转
 */
@Controller
@Slf4j
public class IndexController {


    @Autowired
    JdbcTemplate jdbcTemplate;
    @Resource
    UserMapper usersMapper;
    @Autowired
    UserService userService;
    @Autowired
    UserServiceImpl userServiceImpl;
    //来登录页
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    //登录请求表单提交，所以是post请求
    @PostMapping("/login")
    public String main(User user, HttpSession session , Model model, RedirectAttributes redirectAttributes) {
        LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
        query.eq(User::getNumber, user.getUserName());
        List<User> list = usersMapper.selectAll(query);

        LambdaQueryWrapper<User> query1 = new LambdaQueryWrapper<>();
        query.eq(User::getOpwd, user.getPassword());
        List<User> list1 = usersMapper.selectAll(query);

        if (list.isEmpty()) {
            model.addAttribute("msg", "账号错误");
           return "login";
        } else if (list1.isEmpty()) {
            model.addAttribute("msg", "密码错误");
            //回到登录页
            return "login";
        } else {
            //把登录成功的用户保存起来

            for (User user1 : list1){
                if (user1.getNumber().equals(user.getUserName())){
                    user.setId(user1.getId());
                    user.setName(user1.getName());
                    redirectAttributes.addAttribute("userName", user1.getName());
                }
            }
            session.setAttribute("loginUser", user);

            //登录成功重定向到main.html页面；重定向防止表单重复提交
            return "redirect:/main.html";
        }

}


    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model, RedirectAttributes redirectAttributes){

//        //是否登录  拦截器  ， 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if( loginUser != null ){
//            return "main";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
        model.addAttribute("uName", redirectAttributes.getAttribute("userName"));
        return "main";
    }

    //跳转个人信息页面
    @RequestMapping("/userInfo1")
    public String userInfo(@RequestParam(value =  "name")String name, Model model){
        LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
        query.eq(User::getNumber, name);
        List<User> list = usersMapper.selectAll(query);
        log.info("输出：{}",list);
        model.addAttribute("info",list);
        return "userInfo";
    }












//    @GetMapping("/spot-show.html")
//    public String spotShow(HttpSession session, Model model){
//        //是否登录  拦截器  ， 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if( loginUser != null ){
//            return "spot-show";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
//
//    }
//
//    @GetMapping("/ticket.html")
//    public String ticket(HttpSession session, Model model){
//
//        //是否登录  拦截器  ， 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if( loginUser != null ){
//            return "ticket";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
//
//    }
//
//    @GetMapping("/rank.html")
//    public String rank(HttpSession session, Model model){
//
//        //是否登录  拦截器  ， 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if( loginUser != null ){
//            return "rank";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
//
//    }
//
//    @GetMapping("/login.html")
//    public String loginout(HttpSession session, Model model){
//
//        //是否登录  拦截器  ， 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if( loginUser != null ){
//            session.removeAttribute("loginUser");
//            return "login";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
//
//    }
//
//    @GetMapping("/regist.html")
//    public String regist(){
//        return "regist";
//    }

}
