package tivattravel.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import tivattravel.demo.bean.Ticket;

import java.util.List;

public interface TicketService {
    //构建接口，根据定义好的listTicket方法的SQL查询Ticket表
    public List<Ticket> listTicket(int start, int end);

    //构建结构，根据定义好的getImageNamePath方法的SQL，获取传过来的sid查找Scenery景点表的图片路径
    public String getImageNamePath(int sid);
}
