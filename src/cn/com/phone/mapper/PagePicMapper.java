package cn.com.phone.mapper;

import cn.com.phone.pojo.PagePic;
import cn.com.phone.pojo.PagePicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PagePicMapper {
    int countByExample(PagePicExample example);

    int deleteByExample(PagePicExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(PagePic record);

    int insertSelective(PagePic record);

    List<PagePic> selectByExample(PagePicExample example);

    PagePic selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") PagePic record, @Param("example") PagePicExample example);

    int updateByExample(@Param("record") PagePic record, @Param("example") PagePicExample example);

    int updateByPrimaryKeySelective(PagePic record);

    int updateByPrimaryKey(PagePic record);
    
    List<PagePic> selectPagePicByPageName(@Param("pageName") String pageName);
}