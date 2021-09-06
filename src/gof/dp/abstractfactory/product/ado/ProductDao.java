package gof.dp.abstractfactory.product.ado;

import gof.dp.abstractfactory.product.ato.Product;

public interface ProductDao {
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Product product);
}
