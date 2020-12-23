package cn.edu.shu.xj.ser.mapper;


import cn.edu.shu.xj.ser.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component

public interface UserMapper extends BaseMapper<User> {
    /**
     * @param user_id
     * @return
     */

    @Select("select * from user_info where user_id =#{user_id}")
    User findOneUser(@Param("user_id") Integer user_id);

    @Insert("insert into user_info(user_name,user_pwd,user_signTime) values(#{user_name},#{user_pwd},now())")
    Boolean register(@Param("user_name") String user_name,@Param("user_pwd") String user_pwd);

    @Select("select user_pwd from user_info where user_id =#{user_id}")
    String findUserPwd(@Param("user_id") Integer user_id);

}
