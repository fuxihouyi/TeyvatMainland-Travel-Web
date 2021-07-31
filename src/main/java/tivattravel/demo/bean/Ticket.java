package tivattravel.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    //主属性-用于接收Ticket表传过来的属性
    private int tid;
    private String tname;
    private String routeIntroduction;
    private Integer price;
    private String ssid;

    //附加属性-用于接收图片集合
    @TableField(exist = false)
    private String imgsPath;

    @TableField(exist = false)
    private String ticketPath;

}
