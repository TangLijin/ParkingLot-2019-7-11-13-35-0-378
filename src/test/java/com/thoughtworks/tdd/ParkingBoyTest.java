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

    @Test
    void should_return_cars_when_fetch_cars_given_have_tickets_by_parking_the_cars(){
        //Given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
        Car carTwo = new Car();

        Ticket ticket = parkingBoy.park(car);
        Ticket ticketTwo = parkingBoy.park(carTwo);

        //When
        Car fetchCar = parkingBoy.fetch(ticket);
        Car fetchCarTwo = parkingBoy.fetch(ticketTwo);

        //Then
        Assertions.assertSame(car,fetchCar);
        Assertions.assertSame(carTwo,fetchCarTwo);
    }

    @Test
    void should_not_return_car_when_fetch_cars_given_have_null_ticket(){
        //Given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
        Ticket ticket = parkingBoy.park(car);
        //When
        Car fetchCar = parkingBoy.fetch(null);
        //Then

        Assertions.assertNull(fetchCar);
    }

    @Test
    void should_not_return_car_when_fetch_cars_given__ticket_already_used(){
        //Given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
        Ticket ticket = parkingBoy.park(car);


        //When
        Car fetchCar = parkingBoy.fetch(ticket);
        Car fetchCarAgain = parkingBoy.fetch(ticket);

        //Then
        Assertions.assertNull(fetchCarAgain);

    }


}
