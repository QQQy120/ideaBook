package cn.edu.shu.xj.ser.controller;

import cn.edu.shu.xj.ser.entity.Admin;
import cn.edu.shu.xj.ser.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "测试接口")
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    IAdminService adminService;

    @ApiOperation(value = "查询管理员")
    @GetMapping("/query")
    public Admin queryAdmin(Integer adminId){
        Admin oneAdmin = adminService.findOneAdmin(adminId);
        return oneAdmin;
    }

    @ApiOperation(value = "查询管理员姓名")
    @GetMapping("/query/name")
    public String queryAdminName(Integer adminId){
        Admin oneAdmin = adminService.findOneAdmin(adminId);
        if(oneAdmin!=null){
            return oneAdmin.getAdminName();
        }else{
            return "未找到";
        }
    }



    @ApiOperation(value = "管理员注册")
    @PostMapping("/register")
    public Boolean register(@RequestParam String adminName,@RequestParam String adminPwd){
        return adminService.adminRegister(adminName,adminPwd);
    }

    @ApiOperation(value = "管理员注册")
    @PostMapping("/registerB")
    public Boolean registerB(@RequestBody Admin admin){
        return adminService.adminRegister(admin.getAdminName(),admin.getAdminPwd());
    }

    @ApiOperation(value = "管理员注册")
    @PostMapping("/registerT")
    public Boolean save(@RequestBody Admin admin){
        return  adminService.save(admin);
    }

    @ApiOperation(value = "管理员登陆")
    @PostMapping("/login")
    public Boolean login(@RequestBody Admin admin){
        String pwd =  adminService.findAdminPwd(admin.getAdminName());
        if(pwd.equals(admin.getAdminPwd())){
            return true;
        }else {
            return false;
        }
    }
}
