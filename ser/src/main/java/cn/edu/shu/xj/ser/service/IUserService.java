package cn.edu.shu.xj.ser.service;

import cn.edu.shu.xj.ser.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IUserService extends IService<User> {

    Boolean register(String user_name,String user_pwd);

}
