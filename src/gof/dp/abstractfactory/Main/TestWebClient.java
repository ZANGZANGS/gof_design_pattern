package gof.dp.abstractfactory.Main;

import gof.dp.abstractfactory.factory.dao.DaoFactory;
import gof.dp.abstractfactory.factory.dao.MysqlFactory;
import gof.dp.abstractfactory.factory.dao.OracleFactory;
import gof.dp.abstractfactory.product.ado.ProductDao;
import gof.dp.abstractfactory.product.ato.Product;
import gof.dp.abstractfactory.userinfo.ado.UserInfoDao;
import gof.dp.abstractfactory.userinfo.ato.UserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestWebClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("db.properties");

        Properties properties = new Properties();
        properties.load(fis);

        String dbType = properties.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("userId123");
        userInfo.setPassword("1234");
        userInfo.setUserName("장장스");

        Product product = new Product();
        product.setProductId("pID574923");
        product.setProductName("뜨근한 국밥");

        DaoFactory daoFactory = null;

        if("MYSQL".equals(dbType)){
            daoFactory = new MysqlFactory();
        }else if("ORACLE".equals(dbType)){
            daoFactory = new OracleFactory();
        }else{
            System.out.println("Error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("===== UserInfo Transaction =====");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        System.out.println("===== Product Transaction =====");
        ProductDao productDao = daoFactory.createProductDao();
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);

    }
}

