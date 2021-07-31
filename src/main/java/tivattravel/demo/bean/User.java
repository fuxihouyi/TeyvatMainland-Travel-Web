package tivattravel.demo.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("user")
public class User {

    @TableField(exist = false)
    private String userName;
    @TableField(exist = false)
    private String password;


    private int id;
    private String number;
    private String opwd;
    private String name ;
    private String gender;
    private String mailbox ;
    private String phone;
    private int state ;
}
