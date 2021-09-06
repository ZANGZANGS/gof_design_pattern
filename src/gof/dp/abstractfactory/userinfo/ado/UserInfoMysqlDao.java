package gof.dp.abstractfactory.userinfo.ado;

import gof.dp.abstractfactory.userinfo.ato.UserInfo;

public class UserInfoMysqlDao implements UserInfoDao{
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("insert into MySQL DB ProductID =" + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into MySQL DB ProductID =" + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into MySQL DB ProductID =" + userInfo.getUserId());
    }
}
