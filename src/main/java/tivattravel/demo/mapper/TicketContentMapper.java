package tivattravel.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tivattravel.demo.bean.Scenery;
import tivattravel.demo.bean.TicketContent;

@Mapper
@Repository
public interface TicketContentMapper {
    //通过tid查询business表和ticket表的基本信息
    public TicketContent getTicketContentMapperByTid(@Param("tid")int tid);

    //通过sid查询scenery表的图片路径和名称
    public Scenery getNameAndImageBySId(@Param("sid")int id);

    //通过tid查询collection表的收藏数
    public int getCollectionNumByTid(@Param("tid") int tid);

}
