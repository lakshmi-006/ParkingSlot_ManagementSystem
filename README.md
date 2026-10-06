# Parking Slot Management System

# Introduction

The "Parking Slot Management System" is a console-based Java application developed to manage vehicle parking efficiently. It allows users to park cars and bikes, search for parked vehicles, exit vehicles, manage parking slots, and maintain parking history with ticket and fee details.

# Features

- Park Cars and Bikes in available parking slots.
- Automatically allocate the next available parking slot.
- Search for a currently parked vehicle using its vehicle number.
- Exit a vehicle and calculate the parking fee based on parking duration.
- Display the status of all parking slots.
- Maintain parking tickets and **parking history** with entry and exit details.

# Project Structure

Parking-Slot-Management-System/
│
├── Main.java
├── Vehicle.java
├── Car.java
├── Bike.java
├── ParkingSlot.java
├── ParkingSystem.java
├── ParkingTicket.java
├── README.md
└── .gitignore


# Class Description

Main.java - Provides the console-based menu and handles user input for all parking operations.
Vehicle.java - Base class that stores common vehicle details such as vehicle number and owner name.
Car.java -  Extends Vehicle and stores car-specific information such as fuel type. 
Bike.java - Extends Vehicle and stores bike-specific information such as engine capacity. 
ParkingSlot.java - Represents a parking slot and manages its availability, occupied status, and parked vehicle. 
ParkingSystem.java - Manages the main parking operations such as parking, searching, vehicle exit, slot display, and parking history.
ParkingTicket.java - Stores ticket details including ticket ID, vehicle, slot number, entry time, exit time, and parking fee. 
