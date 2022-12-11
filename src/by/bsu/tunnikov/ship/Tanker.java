package by.bsu.tunnikov.ship;

public class Tanker extends CargoShip {
    Engine engine = new Engine();

    public Tanker() {
    }

    public Tanker(int idNumberShiup, int maximumWeightOfTheTransportedCargo, double width, double length) {
        super(idNumberShiup, maximumWeightOfTheTransportedCargo, width, length);
    }

    @Override
    public void down() {

    }

    @Override
    public void sailingBoats() {
        super.sailingBoats();
    }

    @Override
    public void start() {
        engine.switchOnToggleSwitch();
    }

    @Override
    public void end() {
        engine.switchOnToggleSwitch();
    }

    public void launchingBoats() {
        System.err.println("шлюпки на воду!");
    }
}
