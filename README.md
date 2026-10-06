## Parking Slot Management System

## Introduction

The "Parking Slot Management System" is a console-based Java application developed to manage vehicle parking efficiently. It allows users to park cars and bikes, search for parked vehicles, exit vehicles, manage parking slots, and maintain parking history with ticket and fee details.

## Features

- Park Cars and Bikes in available parking slots.
- Automatically allocate the next available parking slot.
- Search for a currently parked vehicle using its vehicle number.
- Exit a vehicle and calculate the parking fee based on parking duration.
- Display the status of all parking slots.
- Maintain parking tickets and **parking history** with entry and exit details.

## Project Structure

```text
Parking_Slot_System/
│
├── Main.java
├── Vehicle.java
├── Car.java
├── Bike.java
├── ParkingSlot.java
├── ParkingTicket.java
├── ParkingSystem.java
│
├── .gitignore
└── README.md
```

## Class Description

| Class/File | Description |
|---|---|
| `Main.java` | Entry point of the application. Displays the menu and handles user input. |
| `Vehicle.java` | Base class that stores common vehicle details such as vehicle number and owner name. |
| `Car.java` | Child class of `Vehicle` that represents a car and contains car-specific details. |
| `Bike.java` | Child class of `Vehicle` that represents a bike and contains bike-specific details. |
| `ParkingSlot.java` | Represents a parking slot and manages its occupancy and parked vehicle. |
| `ParkingTicket.java` | Stores parking ticket details and calculates parking duration and parking fee. |
| `ParkingSystem.java` | Main management class that handles parking, vehicle removal, slot management, and ticket operations. |
