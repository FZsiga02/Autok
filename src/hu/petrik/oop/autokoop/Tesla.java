package hu.petrik.oop.autokoop;


public class Tesla implements Auto{
    private double sebesseg;

    public Tesla(double sebesseg) {
        this.sebesseg = (Math.random() * 60) + 0;
    }

    @Override
    public void gyorsul() {
        this.sebesseg += (Math.random() * 15) + 5;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
