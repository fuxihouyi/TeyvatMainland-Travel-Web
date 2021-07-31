package tivattravel.demo.service;

import tivattravel.demo.bean.Scenery;
import tivattravel.demo.bean.TicketContent;

public interface TicketContentService {

    public TicketContent getTicketContentByTid(int tid);

    public Scenery getNameAndImageBySId(int sid);

    public int getCollectionNumByTid(int tid);

}
