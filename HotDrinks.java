public class HotDrinks extends Drinks {
    private int temp;
    

    //Перегруженный конструктор класса горячих напитков

    public HotDrinks(int cost, String name, double volume, int temp) {
        super(cost, name, volume);
        this.temp = temp;
    }

    // Получение температуры напитка
    
    public int getTemp() {
        return temp;
    }

     @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }

   
}

