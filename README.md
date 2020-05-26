# Leap Years TDD

This is a TDD implementation of Leap Years Calculator kata provided at http://codingdojo.org/kata/LeapYears/.

## Requirement
This short and simple Kata should be performed in pairs using Test Driven Development (TDD).

Prior to 1582, the Julian Calendar was in wide use and defined leap years as every year divisible by 4. However, it was found in the late 16th century that the calendar year had drifted from the solar year by approximately 10 days. The Gregorian Calendar was defined in order to thin out the number of leap years and to more closely align the calendar year with the solar year. It was adopted in Papal countries on October 15, 1582, skipping 10 days from the Julian Calendar date. Protestant countries adopted the Gregorian Calendar after some time.

The Gregorian Calendar is quite accurate, but could be made more accurate by adding an additional rule that eliminates years divisible by 4000 as leap years. But I guess we’ll cross that bridge when we come to it. Consider adding this rule as a second story as an extension to the exercise.

### User Story:

As a user, I want to know if a year is a leap year, So that I can plan for an extra day on February 29th during those years.

### Acceptance Criteria:

1. All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
2. All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
3. All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
4. All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).

## Project structure

1. Java 11
2. Gradle (6.4.1 - wrapper included)
3. Lombok 
4. JUnit Jupiter

## Run
`./gradlew clean check build`

Or 

In your favourite IDE

## TDD steps
Check all the commits for each step

1. Start by reading req, and start with first.
2. Create test case for that. 
3. Since there is no class to execute the logic, create class and empty method for execution. Make the project compile even if the test case fails as there is no logic written.
4. Write logic for divisible by 400 and pass the test case.
5. Write the test case for 2nd step. Even if it fails. Interestingly it passes without any change in logic.  
6. There is scope for optimisation as leapYearCalculator object initialisation is at multiple places. Also since we want to test with multiple arguments, change to parameterised test.
7. Add the proper logic even if test case is passed, as it may help later and help us properly understand code. 
8. Write failing test case for "All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016)" - step 3
9. For step 3, write the logic and write few other parameters for testing. 
10. Write test case for step 4. Same as step 2 this passes without any logic addition. 
11. Still Write the logic and add more parameter to test.
12. Optimise it
    - Since we are checking the thing multiple times, instead of multiple `if` we can have `if` and `else if`
    - There are redundant checks like `year % 400 == 0` and `year % 100 == 0 && year % 400 != 0`, as we already checked `% 400` then there is no need to check in `else`
12. Optimisation 2
    - Still, there are multiple `if` and `else` conditions
    - We can combine the branches returning `true` and don't calculate if it returns `false` because by default it anyways returns false

13. Since, all the tests are for Gregorian Calendar, just renamed the variable.
14. As second phase, we need to improve Gregorian Calendar. So write second test case file as we don't want to mess up existing one.
15. The test case does not compile because we didn't implement class. So implement class, but since it is just improvment of Gregorian calendar, extend the class. The test case fails as we didn't write the logic yet.
16. Add logic to pass test case for improved Gregorian Calendar.
17. Add a test in Gregorian Calendar to check that the default Gregorian Calendar is not improved one.
18. We don't want to test everything what Gregorian supports in improved so just check that the improved class is subclass of Gregorian
    - if for any reason this cannot be checked then we may need to check every test case from Gregorian Calendar to improved one



