package cn.com.phone.service.interfaces;

import java.util.List;

import cn.com.phone.pojo.PagePic;


public interface pagePicService {
   public List<PagePic> selectPicByPageName(String pageName) throws Exception;
}
