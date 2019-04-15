package training.oop.manufacter;

class DieselEngine extends Engine implements Catalyst {

    public DieselEngine(int power, double capacity){
        this.capacity = capacity;
        this.power_HP = power;
        this.rpm = 0;
    }

    @Override
    void increaseRpm() {
        rpm+=200;

    }

    @Override
    void decreaseRpm() {
        rpm-=200;

    }

    @Override
    String engineInfo() {
        StringBuilder sb = new StringBuilder("Diesel engine");
        sb.append("\n\tPower: ").append(power_HP);
        sb.append("\n\tCapacity: ").append(capacity).append(" L");
        return sb.toString();
    }

    @Override
    public void cleanExhaust() {
        System.out.println("In process ...");
    }
}
