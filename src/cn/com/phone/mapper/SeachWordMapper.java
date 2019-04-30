package cn.com.phone.mapper;

import cn.com.phone.pojo.SeachWord;
import cn.com.phone.pojo.SeachWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SeachWordMapper {
    int countByExample(SeachWordExample example);

    int deleteByExample(SeachWordExample example);

    int deleteByPrimaryKey(Integer seachId);

    int insert(SeachWord record);

    int insertSelective(SeachWord record);

    List<SeachWord> selectByExample(SeachWordExample example);

    SeachWord selectByPrimaryKey(Integer seachId);

    int updateByExampleSelective(@Param("record") SeachWord record, @Param("example") SeachWordExample example);

    int updateByExample(@Param("record") SeachWord record, @Param("example") SeachWordExample example);

    int updateByPrimaryKeySelective(SeachWord record);

    int updateByPrimaryKey(SeachWord record);
    
    List<SeachWord> selectProductType(@Param("seachWord") String productType);
}