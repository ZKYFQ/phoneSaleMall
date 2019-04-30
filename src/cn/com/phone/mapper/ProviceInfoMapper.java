package cn.com.phone.mapper;

import cn.com.phone.pojo.ProviceInfo;
import cn.com.phone.pojo.ProviceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviceInfoMapper {
    int countByExample(ProviceInfoExample example);

    int deleteByExample(ProviceInfoExample example);

    int insert(ProviceInfo record);

    int insertSelective(ProviceInfo record);

    List<ProviceInfo> selectByExample(ProviceInfoExample example);

    int updateByExampleSelective(@Param("record") ProviceInfo record, @Param("example") ProviceInfoExample example);

    int updateByExample(@Param("record") ProviceInfo record, @Param("example") ProviceInfoExample example);
}