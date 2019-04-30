package cn.com.phone.mapper;

import cn.com.phone.pojo.CityInfo;
import cn.com.phone.pojo.CityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityInfoMapper {
    int countByExample(CityInfoExample example);

    int deleteByExample(CityInfoExample example);

    int deleteByPrimaryKey(Integer cityId);

    int insert(CityInfo record);

    int insertSelective(CityInfo record);

    List<CityInfo> selectByExample(CityInfoExample example);

    CityInfo selectByPrimaryKey(Integer cityId);

    int updateByExampleSelective(@Param("record") CityInfo record, @Param("example") CityInfoExample example);

    int updateByExample(@Param("record") CityInfo record, @Param("example") CityInfoExample example);

    int updateByPrimaryKeySelective(CityInfo record);

    int updateByPrimaryKey(CityInfo record);
}