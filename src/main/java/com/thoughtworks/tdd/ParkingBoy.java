package com.thoughtworks.tdd;

public class ParkingBoy {
    private ParkingLot parkingLot;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Car fetch(Ticket ticket) {
        return parkingLot.getCar(ticket);
    }

    public Ticket park(Car car){
        if(parkingLot.getCars().size() < parkingLot.getCapacity()) {
            Ticket ticket = new Ticket(car);
            parkingLot.park(ticket, car);
            return ticket;
        }else {
            return null;
        }
    }
}
