package tivattravel.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class TableController {



    /**
     * 去main页面
     * @return
     */
    @GetMapping("/main")
    public String mainPage(HttpSession session, Model model){

        //是否登录  拦截器  ， 过滤器
        Object loginUser = session.getAttribute("loginUser");
        if( loginUser != null ){
            return "main";
        }else {
            model.addAttribute("msg","请重新登录");
            return "login";
        }
    }



    /**
     * 排行
     */
    @GetMapping("/rank")
    public String rank(HttpSession session, Model model){

//        //是否登录  拦截器  ， 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if( loginUser != null ){
//            List<User> users = Arrays.asList(new User("张三", "123456"),
//                    new User("李四", "123444"),
//                    new User("哈哈", "aaaaaa"),
//                    new User("hehe", "bbbbbb")
//            );
//            model.addAttribute("users",users);
//            return "rank";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
//        List<User> users = Arrays.asList(new User("张三", "123456"),
//                new User("李四", "123444"),
//                new User("哈哈", "aaaaaa"),
//                new User("hehe", "bbbbbb")
//        );
//        model.addAttribute("users",users);
        log.info("进入了：{}", "rank");
        return "rank";

    }

    @GetMapping("/loginout")
    public String loginout(HttpSession session, Model model){

//        //是否登录  拦截器  ， 过滤器
//        Object loginUser = session.getAttribute("loginUser");
//        if( loginUser != null ){
//            session.removeAttribute("loginUser");
//            return "login";
//        }else {
//            model.addAttribute("msg","请重新登录");
//            return "login";
//        }
        session.removeAttribute("loginUser");
        return "login";

    }


    @GetMapping("/regist")
    public String regist(){
        return "regist";
    }


    //我的收藏
    @GetMapping("/myCollect")
    public String myCollect(){
        return "myCollect";
    }

    //用户信息
    @GetMapping("userInfo")
    public String userInfo(){
        return "userInfo";
    }

}
