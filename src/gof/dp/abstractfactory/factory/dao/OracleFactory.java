package gof.dp.abstractfactory.factory.dao;

import gof.dp.abstractfactory.product.ado.ProductDao;
import gof.dp.abstractfactory.product.ado.ProductOracleDao;
import gof.dp.abstractfactory.userinfo.ado.UserInfoDao;
import gof.dp.abstractfactory.userinfo.ado.UserInfoOracleDao;

public class OracleFactory implements DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
