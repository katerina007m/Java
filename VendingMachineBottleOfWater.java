import java.util.ArrayList;
import java.util.List;

public class VendingMachineBottleOfWater implements VendingMachine {

    private List<Product> productList;

    public VendingMachineBottleOfWater() {
        productList = new ArrayList<>();
    }

    @Override
    public void initProducts(List<Product> productList){ //(принимает список продуктов
        this.productList = productList; //и его сохраняет
    }

    @Override
    public void addProduct(Product product){ //принимает продукт и хранит его в этом классе
        productList.add(product);
    }

    @Override
    public Product getProduct(String name){
        for (Product product : productList) {
            if(product.getName().equals((name))){
            return product;
            }
        }
        return null;
    }

    public Product getProduct(String name, double value){//перегрузили метод (доп. метод нашего класса)
        for (Product product : productList) {
            if(product.getName().equals(name) && ((BottleOfWater)product).getVolume() == value){
            return product;
            }
        }
        return null;
    }


}
