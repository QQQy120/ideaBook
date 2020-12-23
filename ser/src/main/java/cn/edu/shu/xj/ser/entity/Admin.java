package cn.edu.shu.xj.ser.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("admin_info")

public class Admin {
    //private Integer adminId;
    @TableId
    private long adminId;

    private String adminName;
    private String adminPwd;

}
