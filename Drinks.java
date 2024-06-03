public class Drinks extends Product {
    private double volume;

    public Drinks(int cost, String name, double volume) {
        super(cost, name);
        this.volume = volume;
    }

  
    public double getVolume() {
        return volume;
    }

    /**
     * Переопределенный метод
     *
     * @return наименование продукта, его стоимость и объем;
     */
    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }

    /**
     * Задание объема напитка с проверкой на некорректное значение
     *
     * @param volume объем напитка
     */
    public void setVolume(double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Объем напитка должен быть больше нуля!");
    }
}

