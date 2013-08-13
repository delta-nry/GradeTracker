GradeTracker
============

Grade Tracker

This application is designed to track your progress in a course or collection of courses during a semester of school. It accomplishes this by monitoring your grades. A grade is comprised of:

a String representing its description
a non-integer value (double/float/big decimal) that represents the percentage you acquired on the item in question
a non-integer value (double/float/big decimal) that represents the worth of this item to the course
an integer representing the score you got on the item
an integer representing the total score possible on the item

Not all of these are necessary to provide the resulting data derived from the collection of marks.

A grouping of grades is called a Course. A course is comprised of:

a set of Grades (stack/tree/array form)
a String representing the course name
an integer representing the course's credit value
a non-integer value (double/float/big decimal) that represents the overall course mark
a non-integer value (double/float/big decimal) that represents the current course mark
a non-integer value (double/float/big decimal) that represents the projected course mark (needs at least two marks with different weights to make this work)

In order to initialize a Course, we need to know these things from the user:

the name of the course
the number of items that they think will be marked
the credit contribution towards their GPA
