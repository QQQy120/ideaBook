package cn.edu.shu.xj.ser.service;

import cn.edu.shu.xj.ser.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IAdminService extends IService<Admin> {
    Admin findOneAdmin(Integer adminId);
    String findAdminPwd(String adminName);
    Boolean adminRegister(String adminName,String adminPwd);
}
