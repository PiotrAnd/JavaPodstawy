package training.oop.manufacter;

abstract class Engine {
    public double capacity;
    public int power_HP;
    public String gasType;
    public int rpm;

    abstract void increaseRpm();
    abstract void decreaseRpm();
    abstract String engineInfo();

    @Override // włączenie tej funkcji ----  ctrl + o
    public String toString() {
        return engineInfo();
    }
}
