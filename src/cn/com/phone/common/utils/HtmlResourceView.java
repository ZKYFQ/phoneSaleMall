package cn.com.phone.common.utils;

import java.io.File;
import java.util.Locale;

import org.springframework.web.servlet.view.InternalResourceView;
/**
 * 筛选器，跳转尾缀为.jsp,.html
 * @author Kai
 *
 */
public class HtmlResourceView extends InternalResourceView {  
    @Override    
    public boolean checkResource(Locale locale){  
        File file=new File(this.getServletContext().getRealPath("/")+getUrl());  
        return file.exists(); //判断页面是否存在  
    }  
}  
