package gof.dp.abstractfactory.factory.dao;

import gof.dp.abstractfactory.product.ado.ProductDao;
import gof.dp.abstractfactory.product.ado.ProductMysqlDao;
import gof.dp.abstractfactory.product.ado.ProductOracleDao;
import gof.dp.abstractfactory.userinfo.ado.UserInfoDao;
import gof.dp.abstractfactory.userinfo.ado.UserInfoMysqlDao;
import gof.dp.abstractfactory.userinfo.ado.UserInfoOracleDao;

public class MysqlFactory implements DaoFactory{
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMysqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMysqlDao();
    }
}
