# Selenium Cucumber Framework
This project is a test automation framework built using Selenium and Cucumber. It is designed to test the login and order functionalities of a web application.

## Overview
This project is a test automation framework based on Selenium and Cucumber. The framework allows you to write and run automated tests using the Behavior-Driven Development (BDD) approach. The tests are written in a readable Gherkin format, making them easy to understand and maintain.


## Folder Details:
**Base:** Contains the Base.java file, which includes the setup and teardown methods for the WebDriver and other common configurations used across the framework.

**Hooks:** Includes Hooks.java to manage pre-conditions and post-conditions for the tests using Cucumber annotations.

**Locators:** Holds the page object classes (Login.java, Order.java) which define locators and actions for the respective pages.

**Runner:** The TestRunner.java class is responsible for triggering the execution of the feature files using Cucumber.

**StepDefinition:** Contains the step definition classes (LoginPage.java, OrderFunction.java) where the Gherkin steps from the feature files are implemented.

**Features:** This directory contains the feature files written in Gherkin syntax. Each feature file (e.g., Login.feature, Order.feature) corresponds to a test scenario or a group of related test scenarios.

## Prerequisites:
Before you begin, ensure you have met the following requirements:

Java JDK 1.8 or higher installed

Maven installed.

A compatible IDE like IntelliJ IDEA or Eclipse.

ChromeDriver or other WebDriver executable available in your PATH.


> Best reg,
> 
> S.Devaraj
> 
> Software Quality Analyst
> 
> devarajthemaker@gmail.com
