package cn.com.phone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.phone.mapper.PagePicMapper;
import cn.com.phone.pojo.PagePic;
import cn.com.phone.service.interfaces.pagePicService;


public class pagePicServiceImp implements pagePicService{
		@Autowired
	   private PagePicMapper pagePicMapper;

	@Override
	public List<PagePic> selectPicByPageName(String pageName) throws Exception {
		return pagePicMapper.selectPagePicByPageName(pageName);
	}
  
}
