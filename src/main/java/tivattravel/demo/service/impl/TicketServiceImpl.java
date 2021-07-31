package tivattravel.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tivattravel.demo.bean.Ticket;
import tivattravel.demo.mapper.TicketMapper;
import tivattravel.demo.service.TicketService;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketMapper tickerMapper;

    @Override
    public List<Ticket> listTicket(int start, int end) {
        return tickerMapper.listTicker(start, end);
    }

    @Override
    public String getImageNamePath(int sid) {
        return tickerMapper.getImageNamePath(sid);
    }
}
