package gof.dp.abstractfactory.userinfo.ado;

import gof.dp.abstractfactory.userinfo.ato.UserInfo;

public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}

