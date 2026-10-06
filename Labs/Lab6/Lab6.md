# Lab 6

### This lab and assignment 4 cover Module 3: Inheritance, Abstract Classes and Interfaces

---

In this lab we write and interface that requires implemting classes to calculate the Fibonacci sequence up to some number that the user inputs.
We write two classes that implement the interface in different ways. The first class calculates the sequence using Binet's formaula while the second class uses iteration.

## Requirements

### Interface: FindFib

method: int calulateFib(int)

### Class: FibFormula

implements FindFib and the calculateFib() using Binet's formula:

GoldenRatio^n^-GoldenRatioConjugate^n^ $/$ $\sqrt{5}$

n
: nth element in the sequence

GoldenRatio
: 1 + $\sqrt{5}$ $/$ 2

GoldenRatioConjugate
: 1 - $\sqrt{5}$ $/$ 2

### Class: FibIteration

implements FindFib and the calculate method by by loops

### Class: Driver (Lab6)

1. creates objects of both classes
2. prompts user to enter a number (assuming number will be positive and below 40)
3. passes the input into the calculateFib() of both class and prints the results

### UML Diagram

provide a diagram including all classes and the interface

### Task List

- [ ] set up loop for FibIteration
- [ ] set up Binet's formula in FibFormula
- [ ] generate UML diagram
