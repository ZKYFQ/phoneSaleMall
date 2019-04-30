package cn.com.phone.mapper;

import cn.com.phone.pojo.AccountInfo;
import cn.com.phone.pojo.AccountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountInfoMapper {
    int countByExample(AccountInfoExample example);

    int deleteByExample(AccountInfoExample example);

    int insert(AccountInfo record);

    int insertSelective(AccountInfo record);

    List<AccountInfo> selectByExample(AccountInfoExample example);

    int updateByExampleSelective(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);

    int updateByExample(@Param("record") AccountInfo record, @Param("example") AccountInfoExample example);
    
    AccountInfo selectAccInfoByAccountNumberAndPwd(@Param("accountNumber") String accountNumber,@Param("password") String password);
 
    int updateByAccountNumber(@Param("accountNumber") String accountNumber,@Param("password") String password);
}