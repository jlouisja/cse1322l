# Lab 6

### This lab and assignment 5 cover Module 5:Exceptions and File IO

---

In this lab, we write a program which determines the difference, in seconds, between pairs of timestamps. The timestamps must be read from a file, and their difference must be written to a different file. As some of the timestamps will not be in the correct format, your program must be able to report why a timestamp is incorrect.

## Requirements

### Class: InvalidTimeException

which is a subclass of Exception
has InvalidTimeException(String): This constructor passes its argument to the super class constructor

### Class: Driver (Lab6)

o	static int timeDelta(String, String): Returns the difference, in seconds, between the two arguments (which are assumed to be timestamps in military time). This method must be able to throw InvalidTimeExceptions. Use the table in the Introduction section to determine if an exception needs to be thrown, as well as the message that the exception must contain. Please note the following:
	timeDelta() must not have any TRY-CATCH blocks
	The conditions on the table must be checked in the order they appear in the table. A timestamp of “27:59:200” would throw an exception with the message “Hours must be less than 24”, even though the number of seconds is also incorrect.
	There is no need to verify which timestamp is the smallest. timedelta() must assume that the first timestamp is the smallest
o	static void main(String[]):
	Prompt the user for a file name from which to read the timestamps. 
	If the file doesn't exist, print an error message then terminate the program
	If the file exist, prompt the user for another file name. Your program must write its results to this second file
	Read every line in the first file. For every line read, extract the two time stamps and pass them as arguments to timeDelta() in the order that they appear in the file
	If timeDelta() throws an exception, write the exception message to the output file
	If timeDelta() does not throw an exception, write its returned value to the output file
	Once the input file has been fully read, terminate the program


### UML Diagram

provide a diagram including all classes and the interface

### Task List

- [ ] set up loop for FibIteration
- [ ] set up Binet's formula in FibFormula
- [ ] generate UML diagram
