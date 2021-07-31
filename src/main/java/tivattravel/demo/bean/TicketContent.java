package tivattravel.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketContent {
    private int tid;
    private String tname;
    private String bname;
    private String telephone;
    private String address;
    private String price;
    private String ssid;

    @TableField(exist = false)
    private int collectionNum;

    @TableField(exist = false)
    private String ticketPath;

    @TableField(exist = false)
    private String imagePath;

}
