# HCL Training

This repository will host all training exercises handed out through the training perdiod. Each exercise will be individually contianed in their own package for rapid and quick review.

## Exercise 1 - Show How To Use GIT

The objective of this exercise is to show how to use GIT and its features.

1. Create Git acocunt (if you don't have one)
2. Create a git project in your local machine
3. Push git project from local machine to git repository
4. Share git repository with lead for review

## Exercise 2 - Implement A Program with Exception Handling

Implement a java program that creates a student class with the following attributes:

    studentID
    studentName
    StudentMark

When initializing the class, make sure the data is recieved by scanner.

Note: You have to check the condition that if somebody input student mark as less than 0 or greater than 100 then your program throws an exeption. The excption should be a a user made custom exception.

## Exercise 3 - Implement A Program with Exception Handling

Write a java program to handle exception handling mechanism through user-oriented exception handling.

Lets say you deposit $600 in a saving account. You then withdraw $100. Now you have $500 remaining. If you attempt to widthdraw $600, your program should throw an InSufficientBalance Exception.

## Exercise 3.1 - Implement A Program with String Manipulation & Exception Handling

Write a java program that accepts a user's full name. If the user's full name has more than 10-15 characters, throw a string length too long exception. Otherwise, separate the name into first middle and last names.

## Exercise 4 - String Manipulation

Write a java program showing the following String manipulation strategies:
**_ note: Use StringTokenizer and StringBuilder class for some of the examples _**

1. 'first_middle_last' to 'first:middle:last'
2. 'first_middle_last' to 'first middle last'
3. 'first middle last' to 'first middle last trevialdata'
4. 'dd/mm/yyyy' to day: dd month: mm year: yyyy

## Exercise 5 - LinkList Manipulation

Write a java program showing how to use the methods in a the LinkedList class.

## Exercise 5 - Sorting List

Write a java program showing how to sort using comparable and comporator.

Create the following classes with the specified attributes:

    Patient - PatientID, PatientName, PatientAge
    Doctor - DoctorID, DoctorName, Specialty

Populate an ArrayList and sort the list based on each class attribute.

## Exercise 6 -

Rewiew, throughself-study, the given concepts below and implement at least 1 program for each concept.
Lambda expressions,
Method references,
Functional interfaces,
Stream API,Parallel Stream,
Default methods,
Static methods in interface,
Optional class,
Collectors class,
ForEach() method,
Predicate
BiFunction examples

## Exercise 6.1 -

2.Implement a Java program with Stream API and without the Stream API, consider filter condition as for example you had employee list filter the employee records whose salary >1000 $ ,Name Startes with B & D and age > 30 .

## Exercise 6.2 -

Write a Employee Management application to do the given below operations. Assume Employee has attributes as EmpID,EmpName,DOB,Salary,Age

1.To Insert the record in Employee DB input through command line arguments.
2.To retrieve all the Employee information.
3.To retrieve any employee record input given through command line arguments.
4.To update any particular employee record input given through command line arguments.
5.To delete any particular employee record input given through command line arguments.
6.Lets say you retrieve all the employee information then you need to filter the records by the condition sal>5000 and employee name starts with B and age >21

after implementation of these menus driven program, you can further improve the program with the help of stream ,lambda expression and functional interface.

Use maven project, proper java coding convention ,exception handling wherever you feel you can use Java 8 also.

## Exercise 7 -

Create a Student table having column id, first_name, last_name, email in MYSQL or you can use in Memory H2 Database.

With the help of JPA, Hibernate implement the given below use cases with table data.

A. Insert a record into table
B. Find a particular row data specific to a id from student table
C. Find all the students data.
D. Update a particular row with the given id.
E. Delete a row with the given id.
