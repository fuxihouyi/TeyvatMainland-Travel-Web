package tivattravel.demo.service;

public interface CollectionService {
    //添加收藏
    public void addCollection(int tid, int id);

    //删除收藏
    public void removeCollection(int tid, int id);
}
