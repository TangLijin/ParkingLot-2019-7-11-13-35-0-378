package com.thoughtworks.tdd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ParkingLot {
//    private Car car;
//    private Car carTwo;
//    private List<Car> cars = new ArrayList<>();
    private HashMap<Ticket,Car> cars = new HashMap<>();
    private int capacity = 10;

    public void park(Ticket ticket, Car car){
//        if(this.car == null) {
////            this.car = car;
////        }else{
////            this.carTwo = car;
////        }
        if(cars.size() <= capacity)
            cars.put(ticket,car);
    }

    public HashMap<Ticket, Car> getCars() {
        return cars;
    }

    public int getCapacity() {
        return capacity;
    }

    public Car getCar(Ticket ticket) {
//        return cars.get(ticket);
//        return car;
        if(ticket == null || !(cars.keySet().contains(ticket))){
            return null;
        }else {
            Iterator<Map.Entry<Ticket,Car>> it = cars.entrySet().iterator();
            Car result = cars.get(ticket);
            while (it.hasNext()){
                Map.Entry<Ticket,Car> c = it.next();
                if(c.getKey() == ticket)
                    it.remove();
            }
            return result;
        }
    }



}
