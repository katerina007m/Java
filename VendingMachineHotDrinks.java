import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {

    private List<Product> productList; // Список продуктов в автомате

    public VendingMachineHotDrinks() {
        productList = new ArrayList<>(); // Инициализация списка продуктов
    }

    @Override
    public void initProducts(List<Product> productList){ // Метод инициализации продуктов в автомате
        this.productList = productList; // Сохранение списка продуктов
    }

    @Override
    public void addProduct(Product product){ // Метод добавления продукта в автомат
        productList.add(product); // Добавление продукта в список
    }

    @Override
    public Product getProduct(String name){ // Метод получения продукта по имени
        for (Product product : productList) {
            if(product.getName().equals((name))){
                return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, int temp){// Перегруженный метод для получения продукта по имени и значению
        for (Product product : productList) {
            if(product.getName().equals(name) && ((HotDrinks)product).getTemp() == temp){
                return product;
            }
        }
        return null;
    }
}