package tivattravel.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tivattravel.demo.bean.Scenery;
import tivattravel.demo.bean.TicketContent;
import tivattravel.demo.mapper.TicketContentMapper;
import tivattravel.demo.service.TicketContentService;

@Service
public class TicketContentServiceImpl implements TicketContentService {

    @Autowired
    TicketContentMapper ticketContentMapper;

    @Override
    public TicketContent getTicketContentByTid(int tid) {
        return ticketContentMapper.getTicketContentMapperByTid(tid);
    }

    @Override
    public Scenery getNameAndImageBySId(int sid) {
        return ticketContentMapper.getNameAndImageBySId(sid);
    }

    @Override
    public int getCollectionNumByTid(int tid) {
        return ticketContentMapper.getCollectionNumByTid(tid);
    }
}
