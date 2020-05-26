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



