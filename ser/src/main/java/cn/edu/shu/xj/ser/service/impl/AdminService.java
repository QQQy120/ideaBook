package cn.edu.shu.xj.ser.service.impl;

import cn.edu.shu.xj.ser.entity.Admin;
import cn.edu.shu.xj.ser.mapper.AdminMapper;
import cn.edu.shu.xj.ser.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService extends ServiceImpl<AdminMapper, Admin> implements IAdminService {
    @Autowired
    AdminMapper adminMapper;

    public Admin findOneAdmin(Integer adminId){
        return  adminMapper.findOneAdmin(adminId);
    }

    public String findAdminPwd(String adminName){
        return  adminMapper.findAdminPwd(adminName);
    }

    public Boolean adminRegister(String adminName,String adminPwd){
        return adminMapper.adminRegister(adminName,adminPwd);
    }


}
