# Adventure Map Navigation Simulator

## Overview

This project is a simple simulator built with Java. It simulates the journey of a hero character navigating through a map based on a given sequence of moves.

## Requirements

Java version 8 or higher.

## Project Structure

Adventurer.java: This file defines the hero character and methods for moving in different cardinal directions.

Map.java: This file defines the map and provides methods for checking valid movement based on map constraints.

Simulation.java: This is the main program file. It reads the initial position and movement sequence from a file, then directs the hero to move accordingly.

The project also uses two input text files:

map.txt: This file represents the map. It should be a grid of characters, where each character is a map tile. A '#' represents a forest, which the hero cannot move through.

move.txt: This file specifies the hero's starting position and movement sequence. The first line indicates the starting position (e.g., 3,0) and the second line is a sequence of characters ('N', 'S', 'E', 'O'), each representing a direction (north, south, east, west) the hero should move.

## Usage

### Compile the Java files:

Open a terminal/command prompt and navigate to the directory where the Java files are located. Then, compile the Java files using the command:

`javac Hero.java Map.java Simulation.java`

### Run the Simulation:

To run the simulation, use the command:

`java Simulation`

The simulation will print the hero's final position after executing all the moves.

## Please ensure the map.txt and move.txt files are located in the correct directory and contain appropriate data.
