import java.util.List;

public interface VendingMachine {
 
    void initProducts(List<Product> productList);//инициализация продуктов
    void addProduct(Product product);//добавление одного продукта
    Product getProduct(String name);//возвращение продукта по имени
    
}
