package cn.com.phone.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.com.phone.mapper.AccountInfoMapper;
import cn.com.phone.mapper.UserInfoMapper;
import cn.com.phone.pojo.AccountInfo;
import cn.com.phone.pojo.UserInfo;
import cn.com.phone.service.interfaces.UserService;

public class UserServiceImp implements UserService{
    @Autowired 
    private AccountInfoMapper accountInfoMapper;
    @Autowired 
    private  UserInfoMapper userInfoMapper;
	@Override
	public boolean isAccountExcit(String accountNumber, String password)
			throws Exception {
		AccountInfo accountInfo=accountInfoMapper.selectAccInfoByAccountNumberAndPwd(accountNumber,password);
		if(accountInfo!=null){
			return true;
		}
		return false;
	}
	@Override
	public boolean saveUserInfoAndAccount(UserInfo userInfo,String accountNumber,String password) throws Exception {
        Date currDate=new Date();
        userInfo.setCreateDate(currDate);
        userInfo.setCreateDate(currDate);
        userInfo.setState("1");
        userInfo.setUserType(1);   //普通用户
        String billId=userInfo.getBillId();
        UserInfo userInfos=userInfoMapper.selectUserInfoByPhone(billId);
			if(userInfos==null){ //该手机号没有注册
				//向user_Info表和account_info表中插入一条数据
				int result=userInfoMapper.insert(userInfo);
				AccountInfo accountInfo=new AccountInfo();
				accountInfo.setAccountNumber(accountNumber);
				accountInfo.setPassword(password);
				accountInfo.setState(1);
				accountInfo.setCreateDate(currDate);
				accountInfo.setDoneDate(currDate);
				accountInfo.setUserId(userInfo.getUserId());
				accountInfoMapper.insert(accountInfo);
				return false;
		}
			return true;
	}
	@Override
	public UserInfo getUserInfoByAccountNumber(String accountNumber)
			throws Exception {
		return userInfoMapper.selectUserInfoByaccountName(accountNumber);
	}
	@Override
	public boolean IsUserInfo(String username, String certCode,
			String billId) throws Exception {
		UserInfo userInfo=userInfoMapper.selectUserInfoByusername(username, certCode, billId);
		if(userInfo!=null){
			return true;
		}
		return false;
	}
	@Override
	public boolean changePassword(String accountNumber, String password)
			throws Exception {
		int result=accountInfoMapper.updateByAccountNumber(accountNumber, password);
		if(result>0){
			return true;
		}
		return false;
	}
}
