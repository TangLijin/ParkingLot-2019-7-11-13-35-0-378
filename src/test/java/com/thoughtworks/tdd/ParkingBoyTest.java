package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ParkingBoyTest {
    @Test
    void should_return_car_when_fetch_car_given_have_ticket_by_parking_the_car() {
        //Given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
        Ticket ticket = parkingBoy.park(car);

        //When

        Car fetchCar = parkingBoy.fetch(ticket);

        //Then
        Assertions.assertSame(car,fetchCar);
    }
}
