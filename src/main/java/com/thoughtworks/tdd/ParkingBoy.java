package com.thoughtworks.tdd;

public class ParkingBoy {
    private ParkingLot parkingLot;
//    private String response  = null;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Car fetch(Ticket ticket) {
//        if(ticket == null){
//            response = "Please provide your parking ticket.";
//        }
        return parkingLot.getCar(ticket);
    }

//    public void setResponse(String response) {
//        this.response = response;
//    }
//
//    public String getResponse() {
//        return response;
//    }

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
