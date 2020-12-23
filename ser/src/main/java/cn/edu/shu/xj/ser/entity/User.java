package cn.edu.shu.xj.ser.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("user_info")
public class User {
    @TableId
    private long user_id;

    private String user_phone;
    private String user_name;
    private String user_pwd;
    private Date user_signTime;
}
