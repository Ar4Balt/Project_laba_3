package by.bsu.tunnikov.ship;

public interface ShipImpl {

    void down();

    default void sailingBoats() {
        System.out.println("отплытие шлюпки");
    }

    int getIdNumberShip();

    void setIdNumberShip(int idNumberShip);

    void start();

    void end();


}
