package cn.com.generator.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.ShellCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * ����ִ����
 * @author Kai
 *
 */
public class GeneratorSqlMap {
    public void generator() throws Exception{
    	//warningsΪ���ڷ�����ɹ���еľ�����Ϣ�ļ��϶���
    	List<String> warnings=new ArrayList<String>();
    	//ָ���Ƿ񸲸������ļ�
    	boolean overwrite=true;
    	//���������ļ�
    	File configFile=new File("config/generatorConfig.xml");
    	//���ý�����
    	ConfigurationParser cp=new ConfigurationParser(warnings);
    	//���ý�������������ļ������Configuration���ö���
          Configuration config=cp.parseConfiguration(configFile);
    	//ShellCallback�������ظ����ļ�
          ShellCallback callback=new DefaultShellCallback(overwrite);
          //���򹤳̶���
          MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warnings);
          //ִ�������ļ���ɲ���
          myBatisGenerator.generate(null);
          
    }
    public static void main(String[] args) throws Exception {
		GeneratorSqlMap generatorSqlMap=new GeneratorSqlMap();
		generatorSqlMap.generator();
	}
}
