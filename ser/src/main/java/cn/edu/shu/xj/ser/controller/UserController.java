package cn.edu.shu.xj.ser.controller;


import cn.edu.shu.xj.ser.entity.User;
import cn.edu.shu.xj.ser.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "测试接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @ApiOperation(value = "11")
    @PostMapping("/register")
    public Boolean register(@RequestParam String user_name,String user_pwd){
        return userService.register(user_name,user_pwd);
    }

    @ApiOperation(value = "用户注册")
    @PostMapping("/registerB")
    public Boolean registerB(@RequestBody User user){
        return userService.register(user.getUserName(),user.getUserPhone(),user.getUserPwd());
    }

    @ApiOperation(value = "用户登录")
    @PostMapping("/loginB")
    public Boolean loginB(@RequestBody User user){
        User oneUser = userService.findOneUserByPhone(user.getUserPhone());
        if(oneUser == null){
            return false;
            //return null;
        }
        String pwd =  userService.findUserPwd(user.getUserPhone());
        if(pwd.equals(user.getUserPwd())){
            return true;
            //return oneUser;
        }else {
            return false;
            //return null;
            //return oneUser;
        }
    }

}
