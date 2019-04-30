package cn.com.phone.mapper;

import cn.com.phone.pojo.UserInfo;
import cn.com.phone.pojo.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    UserInfo selectUserInfoByPhone(@Param("billId") String billId);
    
    UserInfo selectUserInfoByaccountName(@Param("accountNumber") String accountNumber);
    
    UserInfo selectUserInfoByusername(@Param("username") String username,@Param("certCode") String certCode,@Param("billId") String billId);
}