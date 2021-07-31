package tivattravel.demo.service.impl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tivattravel.demo.mapper.CollectionMapper;
import tivattravel.demo.service.CollectionService;

@Service
public class CollectionServiceImpl implements CollectionService {
    @Autowired
    CollectionMapper collectionMapper;

    @Override
    public void addCollection(int tid, int id) {
        collectionMapper.addCollection(tid, id);
    }

    @Override
    public void removeCollection(int tid, int id) {
        collectionMapper.removeCollection(tid, id);
    }

}
