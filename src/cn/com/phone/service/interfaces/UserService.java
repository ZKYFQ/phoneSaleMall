package cn.com.phone.service.interfaces;

import java.util.List;

import cn.com.phone.pojo.UserInfo;


public interface UserService {
	/**
	 * 判断用户是否存在
	 * @return
	 * @throws Exception
	 */
     public boolean isAccountExcit(String accountNumber,String password) throws Exception;
     /**
      * 保存账号和用户信息
      * @param billId
      * @return
      * @throws Exception
      */
     public boolean saveUserInfoAndAccount(UserInfo userInfo,String accountNumber,String password) throws Exception;

     public UserInfo getUserInfoByAccountNumber(String accountNumber) throws Exception;
     /**
      * 判断该用户信息是否存在
      * @param username
      * @param certCode
      * @param billId
      * @param accountNumber
      * @return
      * @throws Exception
      */
     public boolean IsUserInfo(String username,String certCode,String billId) throws Exception;
     /**
      * 修改密码
      * @param accountNumber
      * @param password
      * @return
      * @throws Exception
      */
     public boolean changePassword(String accountNumber,String password) throws Exception;
}
