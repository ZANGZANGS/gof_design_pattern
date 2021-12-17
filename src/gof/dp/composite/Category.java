package gof.dp.composite;

import java.util.ArrayList;

public class Category extends ProductCategory{

    ArrayList<ProductCategory> list;

    public Category(int id, String name, int price){
        super(id, name, price);
        list = new ArrayList<ProductCategory>();
    }

    @Override
    public void addProduct(ProductCategory product) {
        list.add(product);
    }

    @Override
    public void removeProduct(ProductCategory product) {
        list.remove(product);
    }

    @Override
    public int getCount() {
        return list.stream().mapToInt(ProductCategory::getCount).sum();
    }

    @Override
    public String getName() {
        return list.toString();
    }

    @Override
    public int getPrice() {
        return list.stream().mapToInt(ProductCategory::getPrice).sum();
    }

    @Override
    public int getId() {
        return 0;
    }
}
