package tivattravel.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tivattravel.demo.bean.Scenery;
import tivattravel.demo.bean.Ticket;
import tivattravel.demo.bean.TicketContent;
import tivattravel.demo.bean.User;
import tivattravel.demo.service.CollectionService;
import tivattravel.demo.service.TicketContentService;
import tivattravel.demo.service.TicketService;
import tivattravel.demo.service.UserService;

import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import javax.websocket.Session;
import java.util.List;

@Slf4j
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    UserService userService;
    @Autowired
    TicketService ticketService;
    @Autowired
    TicketContentService ticketContentService;
    @Autowired
    CollectionService collectionService;
    @Test
    void contextLoads() {
    }
    @Test
    void testUserMapper(){
          List<User> list = userService.list();
        //User user = userMapper.selectById(1L);

        for(User user:list){
            System.out.println("用户信息:{}"+user);
        }
    }

    @Test
    void testListTicket(){
        List<Ticket> listTicket = ticketService.listTicket(1, 4);
        for (Ticket ticket : listTicket){
            String [] sids = ticket.getSsid().split(",");
            for (String sid : sids){
                ticket.setImgsPath(ticketService.getImageNamePath((int) (Math.random() * 16 + 1)));
            }
        }
        for (Ticket ticket : listTicket){
            log.info("获取门票信息：{}", ticket);
        }
    }

//    @Test
//    void testListTicket(){
//        IPage<Ticket> listTicket = ticketService.listTicket(new Page<>(1, 2));
//        log.info("测试");
//    }



    @Test
    void testGetImageNamePath(){
        log.info("获取景点图片：{}", ticketService.getImageNamePath(1));
    }

    @Test
    void testGetImagePahtAndSceneryName(){
        log.info("获取景点的名称和图片：{}", ticketContentService.getNameAndImageBySId(1));
    }

    @Test
    void testGetTicketContextByTid(){
        TicketContent ticketContent = ticketContentService.getTicketContentByTid(1);
        ticketContent.setCollectionNum(ticketContentService.getCollectionNumByTid(1));
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
        log.info("得到的门票数据：{}", ticketContent);

    }


    @Test
    void testaddCollection(){
        collectionService.addCollection(7, 2);
    }

    @Test
    void testremoveCollection(){
        collectionService.removeCollection(7, 2);
    }




}
