package cn.edu.shu.xj.ser.mapper;

import cn.edu.shu.xj.ser.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface AdminMapper extends BaseMapper<Admin> {
    @Select("select * from admin_info where admin_id =#{id}")
    Admin findOneAdmin(@Param("id") Integer id);

    @Select("select admin_pwd from admin_info where admin_name =#{adminName}")
    String findAdminPwd(@Param("adminName") String adminName);

    @Insert("INSERT INTO admin_info(admin_name,admin_pwd) VALUES (#{adminName},#{adminPwd})")
    Boolean adminRegister(@Param("adminName") String adminName,@Param("adminPwd") String adminPwd);


}
