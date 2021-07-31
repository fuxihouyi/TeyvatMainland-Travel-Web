package tivattravel.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tivattravel.demo.bean.Scenery;
import tivattravel.demo.bean.Ticket;
import tivattravel.demo.service.SceneryService;
import tivattravel.demo.service.TicketContentService;
import tivattravel.demo.service.TicketService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@Slf4j
public class mainController {

    @Autowired
    SceneryService sceneryService;

    @Autowired
    TicketService ticketService;

    @Autowired
    TicketContentService ticketContentService;

    @GetMapping("/spot-show")
    public String spotShow(@RequestParam(value="PageNum", defaultValue = "1") Integer PageNum, Model model){
        //1.查询数据
        List<Scenery> list = sceneryService.list();

        //2.分页数据查询
        Page<Scenery> sceneryPage = new Page<>(PageNum, 4);
        Page<Scenery> pageData = sceneryService.page(sceneryPage, null);

        //3.传递参数
        model.addAttribute("pageData", pageData);

        //4.页面跳转
        return "spot-show";
    }

    /**
     * 门票
     */
    @GetMapping("/ticket")
    public String ticket(@RequestParam(value="PageNum", defaultValue = "1") int PageNum, Model model){
        int start = (PageNum-1)*4;
        int end = 4;
        int len = 0;
        log.info("PageNum={}, start={}, end={}",PageNum, start, end);
        List<Ticket> listTicket = ticketService.listTicket(start, end);
        log.info("展图后输出长度：{}", listTicket.size());

        for (Ticket ticket : listTicket){

            String[] ssid = ticket.getSsid().split(",");
            if (ssid.length>1){
                int Tage=0;
                int Length=ssid.length;
                log.info("需要遍历次数：{}",Length);
                for (String sid:ssid){
                    Scenery scenery = ticketContentService.getNameAndImageBySId(Integer.parseInt(sid));
                    if (Tage==0){
                        ticket.setTicketPath(scenery.getSname());
                        ticket.setImgsPath(scenery.getPath());
                    }else if (Tage<Length){
                        ticket.setTicketPath(ticket.getTicketPath()+"->"+scenery.getSname());
                        ticket.setImgsPath(ticket.getImgsPath()+"--"+scenery.getPath());
                    }else{
                        ticket.setTicketPath(ticket.getTicketPath()+""+scenery.getSname());
                        ticket.setImgsPath(ticket.getImgsPath()+""+scenery.getPath());
                    }
                    log.info("第{}次遍历，获得门票数据：{}", Tage, ticket);
                    Tage++;
                }
            }else{
                Scenery scenery = ticketContentService.getNameAndImageBySId(Integer.parseInt(ssid[0]));
                ticket.setImgsPath(scenery.getPath());
                ticket.setTicketPath(scenery.getSname());
            }
            //ticket.setImgsPath(ticketService.getImageNamePath((int) (Math.random() * 16 + 1)));
            len++;
        }
        log.info("展图后输出长度：{}", len);
        model.addAttribute("PageData", listTicket);
        model.addAttribute("indexNum", PageNum);
        log.info("测试{}", listTicket);
        return "ticket";

    }


}
