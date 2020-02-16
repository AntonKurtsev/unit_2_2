package ru.battlefield.units;

abstract class AbstractMachine extends AbstractArmyUnit {

    private short fuel;

    public AbstractMachine(short fuel) {
        this.fuel = fuel;
    }

    public short getFuel() {
        return fuel;
    }

    public void setFuel(short fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "AbstractMachine{" +
                "fuel=" + fuel +
                '}';
    }
}




