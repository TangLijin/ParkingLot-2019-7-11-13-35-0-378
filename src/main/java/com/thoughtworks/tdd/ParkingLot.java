package com.thoughtworks.tdd;

public class ParkingLot {
    private Car car;
   // private Map<Ticket,Car> cars = new HashMap<>();

    public void park(Car car){
        this.car = car;
    }

    public Car getCar(Ticket ticket) {
//        return cars.get(ticket);
        return car;
    }
}
