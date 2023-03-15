The Question is: 
Create a student class, that will store the details of the Student
    * Reg. No.
    * Name
    * Email
    * Phone
    * Class
    * Department
The class will have a constructor to initialize the values of the Student and a method to print the Details of the Student.

In the main-method class, create an array of Student Class to hold maximum details of 100 Students.
    In the menu-driven program, the menu options will have
        * Add a student
            --> Adds the details of 1 student to the array of Student
        * Search for a student
            --> Search for the details of a student from the array of Student
            --> (Optional) Searching can be done with Name & Register Number
        * Display all students
            --> Displays the details of all students

The output for the following program is:

---------------------------------------
1. Add a student
2. Search for a student
3. Display all students
---------------------------------------
Enter your choice: 1
Enter the Registration no: 100
Enter the Name of student: Surya
Enter the Email: Surya@gmail.com
Enter the Phone: 231241231
Enter the class: A
Enter the Department: Ds

---------------------------------------
1. Add a student
2. Search for a student
3. Display all students
---------------------------------------
Enter your choice: 1
Enter the Registration no: 101
Enter the Name of student: Prakash
Enter the Email: Prakash@gmail.com
Enter the Phone: 32142131
Enter the class: B
Enter the Department: Cs

---------------------------------------
1. Add a student
2. Search for a student
3. Display all students
---------------------------------------
Enter your choice: 2
Enter the name of the student: Surya
Enter the Registraion no of the student: 100
Reg. No.: 100
Name: Surya
Email: Surya@gmail.com
Phone: 231241231
Class: A
Department: Ds

---------------------------------------
1. Add a student
2. Search for a student
3. Display all students
---------------------------------------
Enter your choice: 3
Reg. No.: 100
Name: Surya
Email: Surya@gmail.com
Phone: 231241231
Class: A
Department: Ds

Reg. No.: 101
Name: Prakash
Email: Prakash@gmail.com
Phone: 32142131
Class: B
Department: Cs


---------------------------------------
1. Add a student
2. Search for a student
3. Display all students
---------------------------------------
Enter your choice: 4
Invalid choice.

To run the program type the following commands,

javac filepath\filename
java filename

Explanation:

Here we are making class Student to store the details of the respective student.In the menu driven program we are creating a menu fo adding a student, searching a student and displaying all the student Using a do while loop.



