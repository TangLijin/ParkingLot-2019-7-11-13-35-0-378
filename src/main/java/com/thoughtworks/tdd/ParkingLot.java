package com.thoughtworks.tdd;

import java.util.HashMap;

public class ParkingLot {
//    private Car car;
//    private Car carTwo;
//    private List<Car> cars = new ArrayList<>();
    private HashMap<Ticket,Car> cars = new HashMap<>();

    public void park(Ticket ticket, Car car){
//        if(this.car == null) {
////            this.car = car;
////        }else{
////            this.carTwo = car;
////        }
        cars.put(ticket,car);
    }

    public Car getCar(Ticket ticket) {
//        return cars.get(ticket);
//        return car;
        if(ticket == null || !(cars.keySet().contains(ticket))){
            return null;
        }else {
            return cars.get(ticket);
        }
    }



}
