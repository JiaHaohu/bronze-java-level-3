package com.tw;

public class ParkingBoy {
    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Implement the method according to test
        // <-start-
        ParkingResult parkResult = parkingLot.park(car);
        lastErrorMessage = parkResult.getMessage();
        return parkResult.getTicket();
        // ---end->
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Implement the method according to test
        // <-start-
        FetchingResult fetchingResult = parkingLot.fetch(ticket);
        lastErrorMessage = fetchingResult.getMessage();
        return fetchingResult.getCar();
        // ---end->
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}

