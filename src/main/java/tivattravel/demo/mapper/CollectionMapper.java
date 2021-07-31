package tivattravel.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CollectionMapper {

    //添加收藏
    public void addCollection(@Param("tid") int tid, @Param("id") int id);

    //删除收藏
    public void removeCollection(@Param("tid") int tid, @Param("id") int id);

}
