package tivattravel.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tivattravel.demo.bean.Scenery;
import tivattravel.demo.bean.TicketContent;
import tivattravel.demo.service.TicketContentService;

@Controller
@Slf4j
public class TicketContentAndConllectController {

    @Autowired
    TicketContentService ticketContentService;

    //门票详细信息检索逻辑实现
    @GetMapping("/detail")
    public String getTicketContent(@RequestParam(value="TicketID", defaultValue = "0") int tid, Model model ){
        if (tid==0){
            tid=(int)model.getAttribute("CollectionTid");
        }
        TicketContent ticketContent = ticketContentService.getTicketContentByTid(tid);
        ticketContent.setCollectionNum(ticketContentService.getCollectionNumByTid(tid));
        String[] ssid = ticketContent.getSsid().split(",");
        if (ssid.length>1){
            int Tage=0;
            int Length=ssid.length;
            log.info("需要遍历次数：{}",Length);
            for (String sid:ssid){
                Scenery scenery = ticketContentService.getNameAndImageBySId(Integer.parseInt(sid));
                if (Tage==0){
                    ticketContent.setImagePath(scenery.getPath());
                    ticketContent.setTicketPath(scenery.getSname());
                }else if (Tage<Length){
                    ticketContent.setImagePath(ticketContent.getImagePath()+"--"+scenery.getPath());
                    ticketContent.setTicketPath(ticketContent.getTicketPath()+"->"+scenery.getSname());
                }else{
                    ticketContent.setImagePath(ticketContent.getImagePath()+""+scenery.getPath());
                    ticketContent.setTicketPath(ticketContent.getTicketPath()+""+scenery.getSname());
                }
                log.info("第{}次遍历，获得门票数据：{}", Tage, ticketContent);
                Tage++;
            }
        }else{
            Scenery scenery = ticketContentService.getNameAndImageBySId(Integer.parseInt(ssid[0]));
            ticketContent.setImagePath(scenery.getPath());
            ticketContent.setTicketPath(scenery.getSname());
        }
        model.addAttribute("TicketContent", ticketContent);
        return "detail";
    }

}
