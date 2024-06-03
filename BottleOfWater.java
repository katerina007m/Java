public class BottleOfWater extends Product { //наследник класса продукт
    public double volume;
    public BottleOfWater(int cost, String name, double volume) {
        super(cost, name); //через super можем обращаться к реализации родительского класса
        this.volume = volume;//сохраняем в текущем классе
        


        
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "BottleOfWater [volume=" + super.toString() + volume + "]";
    }

    


    
}
