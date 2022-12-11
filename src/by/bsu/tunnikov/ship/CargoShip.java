package by.bsu.tunnikov.ship;

public abstract class CargoShip implements ShipImpl {
    int idNumberShiup;
    int maximumWeightOfTheTransportedCargo;
    double width;
    double length;

    public CargoShip() {
        Engine engine = new Engine();
    }

    public CargoShip(int idNumberShiup,
                     int maximumWeightOfTheTransportedCargo,
                     double width,
                     double length) {
        this.idNumberShiup = idNumberShiup;
        this.maximumWeightOfTheTransportedCargo = maximumWeightOfTheTransportedCargo;
        this.width = width;
        this.length = length;
    }

    public class Engine {
        boolean toggleSwitch = false;

        public Engine() {

        }

        void switchOnToggleSwitch() {
            toggleSwitch = (toggleSwitch) ? false : true;
        }
    }

    @Override
    public int getIdNumberShip() {
        return idNumberShiup;
    }

    @Override
    public void setIdNumberShip(int idNumberShip) {
        this.idNumberShiup = idNumberShiup;
    }

    public int getMaximumWeightOfTheTransportedCargo() {
        return maximumWeightOfTheTransportedCargo;
    }

    public void setMaximumWeightOfTheTransportedCargo(int maximumWeightOfTheTransportedCargo) {
        this.maximumWeightOfTheTransportedCargo = maximumWeightOfTheTransportedCargo;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void start() {
        System.out.println("Начало работы");
    }

    @Override
    public void end() {
        System.out.println("Конец работы");
    }

}
