package cn.edu.shu.xj.ser.service.impl;


import cn.edu.shu.xj.ser.entity.User;
import cn.edu.shu.xj.ser.mapper.UserMapper;
import cn.edu.shu.xj.ser.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service

public class UserService extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean register(String user_name,String user_pwd){
        return userMapper.register(user_name,user_pwd);
    }

}
