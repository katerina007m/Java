public class Main {
    public static void main(String[] args) {
    

        VendingMachine vendingMachineWater = new VendingMachineBottleOfWater();
        VendingMachineHotDrinks vendingMachineHotDrinks = new VendingMachineHotDrinks();

        Product pro1 = new BottleOfWater(123, "mineral water", 1);//экземпляры для напитков в бутылках
        Product pro2 = new BottleOfWater(13, "sweet water", 2);
        Product pro3 = new BottleOfWater(17, "lemon water", 1);
     
        Product pro4 = new HotDrinks(200, "coffee", 1, 90);//экземпляры для горячих напитков
        Product pro5 = new HotDrinks(200, "tea", 2, 90);
        Product pro6 = new HotDrinks(200, "latte", 1, 80);

        vendingMachineWater.addProduct((pro1));
        vendingMachineWater.addProduct((pro2));
        vendingMachineWater.addProduct((pro3));

        vendingMachineHotDrinks.addProduct((pro4));
        vendingMachineHotDrinks.addProduct((pro5));
        vendingMachineHotDrinks.addProduct((pro6));
        
        

        //System.out.println(vendingMachine.getProduct("asd").getName());
        
        System.out.println(vendingMachineWater.getProduct("lemon water").getName());
        System.out.println(vendingMachineHotDrinks.getProduct("coffee", 90).getName());
    }
}
