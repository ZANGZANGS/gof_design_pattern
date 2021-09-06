package gof.dp.abstractfactory.factory.dao;

import gof.dp.abstractfactory.product.ado.ProductDao;
import gof.dp.abstractfactory.userinfo.ado.UserInfoDao;

public interface DaoFactory {
    public UserInfoDao createUserInfoDao();
    public ProductDao createProductDao();
}
