# E-Commerce UI + API Test Automation Framework

This project is an end-to-end automation framework built using **Java, Selenium, TestNG, Maven, and RestAssured**.

It covers UI automation for an e-commerce demo website and API automation using a public product API.

## Project Objective

The goal of this project is to demonstrate a real-world QA/SDET automation workflow that includes:

* UI test automation
* API test automation
* Page Object Model design
* Explicit waits
* Cart flow validation
* Maven-based test execution

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* RestAssured
* GitHub

## Application Under Test

### UI Testing

Demo Web Shop:

```text
https://demowebshop.tricentis.com/
```

### API Testing

Fake Store API:

```text
https://fakestoreapi.com/
```

## Project Structure

```text
e2e-test-automation-framework
├── src
│   ├── main
│   │   └── java
│   │       └── pages
│   │           ├── HomePage.java
│   │           ├── SearchResultsPage.java
│   │           ├── ProductDetailsPage.java
│   │           └── CartPage.java
│   └── test
│       └── java
│           └── tests
│               ├── BaseTest.java
│               ├── HomePageTests.java
│               └── ProductApiTests.java
├── pom.xml
└── README.md
```

## UI Test Scenarios

The UI automation suite includes:

* Verify home page title
* Verify product search functionality
* Verify product can be added to cart
* Verify added product is displayed in shopping cart

## API Test Scenarios

The API automation suite includes:

* Verify all products API returns success
* Verify single product API returns valid product details
* Verify product categories API returns data

## Framework Highlights

* Page Object Model for clean test structure
* Reusable page classes
* Common browser setup and teardown using `BaseTest`
* Explicit waits for dynamic UI elements
* Selenium WebDriver for UI testing
* RestAssured for API testing
* TestNG assertions for validation
* Maven command-line execution

## How to Run Tests

Install dependencies and run all tests:

```bash
mvn test
```

Expected result:

```text
Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## What I Practiced

Through this project, I practiced:

* Building a Selenium TestNG framework from scratch
* Designing tests using Page Object Model
* Handling dynamic UI synchronization using explicit waits
* Automating product search and cart validation flows
* Writing API tests using RestAssured
* Running UI and API tests together using Maven
* Debugging real automation failures like stale elements and timing issues

## Future Enhancements

* Add Extent Reports
* Add screenshot capture on test failure
* Add GitHub Actions CI pipeline
* Add test data management
* Add negative UI and API test cases
* Add parallel test execution

## Author

Mahigna Reddy
