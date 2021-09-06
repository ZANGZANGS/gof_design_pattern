package gof.dp.abstractfactory.product.ado;

import gof.dp.abstractfactory.product.ato.Product;

public class ProductMysqlDao implements ProductDao{
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MySQL DB ProductID =" + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into MySQL DB ProductID =" + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into MySQL DB ProductID =" + product.getProductId());

    }
}
