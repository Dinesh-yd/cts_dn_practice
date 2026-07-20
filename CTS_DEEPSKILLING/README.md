# PL/SQL Banking System Exercises

## Overview

This project contains PL/SQL programs that simulate common banking operations using control structures and stored procedures.

The exercises demonstrate:

* Loops and conditional processing
* Updating records using PL/SQL blocks
* Stored procedures
* Database transactions
* Customer and account management

---

# Exercise 1: Control Structures

## Scenario 1: Loan Interest Discount for Senior Citizens

### Objective

Apply a 1% discount to loan interest rates for customers whose age is greater than 60 years.

### Logic

* Retrieve customers above 60 years.
* Find their corresponding loans.
* Reduce the loan interest rate by 1%.
* Display a confirmation message.

### Output

Interest rates are updated for eligible customers.

---

## Scenario 2: VIP Customer Promotion

### Objective

Promote customers to VIP status if their account balance exceeds ₹10,000.

### Logic

* Iterate through all customers.
* Check whether balance is greater than ₹10,000.
* Update IsVIP flag to 'Y'.
* Display promotion message.

### Output

Eligible customers are marked as VIP.

---

## Scenario 3: Loan Due Reminder

### Objective

Generate reminders for customers whose loan due date falls within the next 30 days.

### Logic

* Retrieve loans due within 30 days.
* Fetch customer details.
* Display reminder messages using DBMS_OUTPUT.

### Output

Reminder messages for customers with upcoming loan due dates.

---

# Exercise 2: Stored Procedures

## Scenario 1: Process Monthly Interest

### Procedure Name

ProcessMonthlyInterest

### Objective

Apply 1% monthly interest to all savings account balances.

### Logic

* Update every savings account.
* Increase balance by 1%.
* Commit the transaction.

### Output

Savings account balances are updated successfully.

---

## Scenario 2: Employee Bonus Processing

### Procedure Name

UpdateEmployeeBonus

### Objective

Increase employee salaries by a specified bonus percentage for a selected department.

### Parameters

* Department Name
* Bonus Percentage

### Logic

* Identify employees in the specified department.
* Calculate bonus amount.
* Update salary values.
* Commit changes.

### Output

Employee salaries are updated successfully.

---

## Scenario 3: Fund Transfer Between Accounts

### Procedure Name

TransferFunds

### Objective

Transfer money from one account to another while ensuring sufficient balance.

### Parameters

* Source Account ID
* Destination Account ID
* Transfer Amount

### Logic

* Check source account balance.
* If balance is sufficient:

  * Debit source account.
  * Credit destination account.
  * Commit transaction.
* Otherwise display insufficient balance message.

### Output

Successful transfer confirmation or insufficient balance notification.

---

# Technologies Used

* Oracle Database
* PL/SQL
* Oracle Live SQL

---

# Concepts Demonstrated

* Anonymous PL/SQL Blocks
* FOR Loops
* Conditional Statements
* UPDATE Statements
* Stored Procedures
* Parameters
* Transactions
* DBMS_OUTPUT
* Data Validation

---

# JUnit, Mockito and SLF4J Exercises

## Overview

This project demonstrates unit testing, mocking, verification, assertions, test fixtures, and logging using Java.

Technologies Used:

* Java 21
* Maven
* JUnit 4.13.2
* Mockito 5.12.0
* SLF4J
* Logback
* IntelliJ IDEA

---

# Project Structure

```text
src
├── main
│   └── java
│       └── org.example
│           ├── Calculator.java
│           ├── ExternalApi.java
│           ├── MyService.java
│           └── LoggingExample.java
│
└── test
    └── java
        └── org.example
            ├── CalculatorTest.java
            ├── AssertionsTest.java
            ├── CalculatorAAATest.java
            ├── MyServiceTest.java
            └── MyServiceVerifyTest.java
```

---

# Exercise 1: Setting Up JUnit

## Objective

Configure JUnit in a Maven project and create a simple unit test.

## Concepts Covered

* Maven Dependency Management
* JUnit Setup
* Test Execution

## Result

Verified Calculator.add() method using assertEquals().

---

# Exercise 2: Assertions in JUnit

## Objective

Use different assertion methods provided by JUnit.

## Assertions Used

* assertEquals()
* assertTrue()
* assertFalse()
* assertNull()
* assertNotNull()

## Result

Validated expected outputs and conditions successfully.

---

# Exercise 3: Arrange-Act-Assert (AAA) Pattern

## Objective

Organize test cases using AAA pattern and implement setup and teardown methods.

## Concepts Covered

### Arrange

Prepare test data.

### Act

Execute method under test.

### Assert

Verify results.

### Setup and Teardown

* @Before
* @After

## Result

Improved test readability and maintainability.

---

# Mockito Exercise 1: Mocking and Stubbing

## Objective

Test a service that depends on an external API without calling the real API.

## Concepts Covered

* Mock Objects
* Stubbing
* Dependency Injection

## Result

Mocked ExternalApi and returned predefined values using Mockito.

---

# Mockito Exercise 2: Verifying Interactions

## Objective

Verify whether a method was called during test execution.

## Concepts Covered

* verify()
* Interaction Testing

## Result

Confirmed that getData() method was invoked successfully.

---

# SLF4J Exercise 1: Logging Error and Warning Messages

## Objective

Implement logging using SLF4J.

## Log Levels Used

### ERROR

Used for critical issues.

### WARN

Used for warning messages.

## Result

Generated application logs using Logback implementation.

---

# Maven Dependencies

```xml
<dependencies>

    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.12.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>2.0.13</version>
    </dependency>

    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.5.6</version>
    </dependency>

</dependencies>
```

---

# Learning Outcomes

After completing these exercises, the following concepts were understood:

* Unit Testing
* Assertions
* Arrange-Act-Assert Pattern
* Test Fixtures
* Setup and Teardown
* Mocking
* Stubbing
* Interaction Verification
* Logging Frameworks
* Maven Dependency Management

---

# Author

RAYALA MRUDULA SAI

Cognizant Digital Nurture 5.0 – Deep Skilling Program

