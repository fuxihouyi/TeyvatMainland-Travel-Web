package tivattravel.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import tivattravel.demo.bean.User;
import tivattravel.demo.service.CollectionService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Slf4j
public class CollectionController {
    @Autowired
    CollectionService collectionService;

    @GetMapping("/addCollection")
    public String addCollectionController(HttpSession session, @RequestParam(value="TicketID") int tid, Model model, RedirectAttributes redirectAttributes){
//        LambdaQueryWrapper<User> query = new LambdaQueryWrapper<>();
//        query.eq(User::getNumber,user.getUserName() );
//        List<User> list = usersMapper.selectAll(query);
        User user = (User)session.getAttribute("loginUser");

        log.info("tid={}, id={}", tid, user.getId());
        collectionService.addCollection(tid, user.getId());
        redirectAttributes.addAttribute("TicketID", tid);
        return "redirect:/detail";
    }

    @GetMapping("/removeCollection")
    public String removeCollectionController(HttpSession session, @RequestParam(value="TicketID")int tid, Model model, RedirectAttributes redirectAttributes){
        User user = (User)session.getAttribute("loginUser");
        log.info("tid={}, id={}", tid, user.getId());
        collectionService.removeCollection(tid, user.getId());
        redirectAttributes.addAttribute("TicketID", tid);
        return "redirect:/detail";
    }



}
