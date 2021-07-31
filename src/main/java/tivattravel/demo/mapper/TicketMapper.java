package tivattravel.demo.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tivattravel.demo.bean.Ticket;

import java.util.List;

@Mapper
@Repository
public interface TicketMapper {

    //查询门票信息
    public List<Ticket> listTicker(@Param("start")int start, @Param("end")int end);

    //根据门票得到的imgsPath查找图片所在的路径
    public String getImageNamePath(int sid);


}
