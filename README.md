# Knapsack Project

## Project Requirements
Write implementation of brute-force solution for knapsack problem. Your program should generate all possible characteristic vectors representing potential solutions but print only the final one.
You have to implement the method for generating characteristic vectors from scratch. You cannot use predefined methods for that like Set,
characteristicVector, toBinaryString or other.
As a result print characteristic vector, total weight and total value of the best solution. Your program should find the solution in a few minutes. Implementations that execution time exceed 20 minutes won't be accepted.
Format of each file provided in attachment:
first line: total capacity
each next line: weight, value of item

## Project Overview
The Knapsack Project is an implementation of Knapsack Problem, which is a combinatorial optimization problem. Given a set of items, each with a weight and a value, the goal is to determine the most valuable combination of items to include in a knapsack of fixed capacity.
This project demonstrates how to solve the Knapsack problem using brute-force, allowing users to find the optimal solution for given inputs.

## Installation
To run the project locally, follow these steps:

1. Clone the repository:
```
git clone git@github.com:martynagotfryd/Knapsack.git
cd Knapsack
```
2. Open the project: Open the project in your preferred Java IDE (IntelliJ IDEA, Eclipse, etc.).
3. Build the project: If you're using a build tool like Maven or Gradle, ensure the dependencies are installed. Otherwise, set up the project in your IDE.

## Usage
1. Input the list of items with their respective weights and values.
2. Define the knapsack's capacity (maximum weight).
3. Run the Main class from your IDE or terminal.
4. The program will output the optimal set of items to include in the knapsack and the maximum value achievable within the given constraints.
