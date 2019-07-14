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
    @Test
    void should_not_return_ticket_when_park_given_bigger_than_capacity(){
        //Given
        ParkingLot parkingLot = new ParkingLot();
        ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car();
        Car car10 = new Car();
        Car car11 = new Car();

        //When
        Ticket ticket1 = parkingBoy.park(car1);
        Ticket ticket2 = parkingBoy.park(car2);
        Ticket ticket3 = parkingBoy.park(car3);
        Ticket ticket4 = parkingBoy.park(car4);
        Ticket ticket5 = parkingBoy.park(car5);
        Ticket ticket6 = parkingBoy.park(car6);
        Ticket ticket7 = parkingBoy.park(car7);
        Ticket ticket8 = parkingBoy.park(car8);
        Ticket ticket9 = parkingBoy.park(car9);
        Ticket ticket10 = parkingBoy.park(car10);
        Ticket ticket11 = parkingBoy.park(car10);
//        Car fetchCar = parkingBoy.fetch(ticket);
//        Car fetchCarAgain = parkingBoy.fetch(ticket);

        //Then
        Assertions.assertNull(ticket11);

    }

}
