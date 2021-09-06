package gof.dp.abstractfactory.product.ado;

import gof.dp.abstractfactory.product.ato.Product;

public class ProductOracleDao implements ProductDao{
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into ORACLE DB ProductID =" + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into ORACLE DB ProductID =" + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into ORACLE DB ProductID =" + product.getProductId());

    }
}
