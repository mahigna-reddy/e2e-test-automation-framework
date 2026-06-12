# E-Commerce Checkout & Order Workflow Enhancement

## Project Overview
This project focuses on improving and validating the end-to-end e-commerce customer journey from login to order confirmation. The goal is to ensure that key business workflows such as product selection, cart management, checkout, pricing validation, and order completion work as expected before release.

The project is documented from a Business Analyst and UAT perspective, with supporting end-to-end automation coverage to validate critical workflows.

## Business Problem
The business needed a reliable checkout experience where users could log in, browse products, add or remove items from the cart, validate pricing, complete checkout, and receive confirmation without workflow issues. Common risks included cart count mismatches, incorrect pricing, missing validation messages, navigation issues, and incomplete checkout behavior.

## Project Objectives
- Improve checkout workflow accuracy
- Validate cart and pricing behavior
- Ensure order confirmation works as expected
- Support UAT readiness before release
- Track defects and business impact clearly
- Provide regression coverage for critical user journeys

## Role & Responsibilities
As a Business Analyst / UAT Coordinator, responsibilities included:

- Analyzed login, product catalog, cart, checkout, and order confirmation workflows
- Documented functional requirements, user stories, and acceptance criteria
- Created UAT scenarios based on business rules and expected outcomes
- Maintained requirement traceability between business needs, test scenarios, and validation results
- Supported defect triage by reviewing issue severity, business impact, and expected behavior
- Coordinated with QA and development teams to validate fixes and confirm release readiness
- Prepared status updates covering UAT progress, defects, risks, and blockers
- Supported end-to-end automation coverage for regression validation

## Stakeholders
- Product Owner
- Business Users
- Business Analyst
- QA Team
- Development Team
- Scrum Master
- Support Team

## Scope

### In Scope
- User login validation
- Product listing validation
- Add to cart and remove from cart
- Cart badge count validation
- Product price validation
- Checkout information validation
- Order confirmation validation
- Navigation and logout flow
- UAT scenario creation
- Defect tracking and reporting

### Out of Scope
- Payment gateway integration
- Real production order fulfillment
- Customer support workflows
- Inventory backend integration

## Sample User Stories

### User Story 1: Login
As a registered user, I want to log in with valid credentials so that I can access the product catalog.

**Acceptance Criteria:**
- User should be able to log in with valid credentials
- User should see an error message for invalid credentials
- User should be redirected to the product listing page after successful login

### User Story 2: Add Product to Cart
As a customer, I want to add products to my cart so that I can purchase them later.

**Acceptance Criteria:**
- User should be able to add a product to the cart
- Cart badge count should update correctly
- Added product should be visible on the cart page

### User Story 3: Checkout
As a customer, I want to complete checkout with valid information so that I can place my order successfully.

**Acceptance Criteria:**
- User should be able to enter checkout information
- System should validate required fields
- User should be able to review order summary
- Order confirmation should be displayed after successful checkout

## UAT Scenarios

| Scenario ID | UAT Scenario | Expected Result | Priority |
|---|---|---|---|
| UAT-001 | Validate successful login | User lands on product page | High |
| UAT-002 | Validate invalid login | Error message is displayed | High |
| UAT-003 | Add one product to cart | Cart count updates to 1 | High |
| UAT-004 | Add multiple products to cart | Cart count updates correctly | High |
| UAT-005 | Remove product from cart | Product is removed and count updates | Medium |
| UAT-006 | Validate product price | Product price matches expected value | Medium |
| UAT-007 | Complete checkout with valid details | Order confirmation is displayed | High |
| UAT-008 | Validate logout flow | User returns to login page | Medium |

## Requirement Traceability Matrix

| Requirement ID | Requirement | User Story | UAT Scenario | Status |
|---|---|---|---|---|
| REQ-001 | User should be able to log in | US-001 | UAT-001 | Passed |
| REQ-002 | Invalid login should show error | US-001 | UAT-002 | Passed |
| REQ-003 | User should add products to cart | US-002 | UAT-003 | Passed |
| REQ-004 | Cart count should update correctly | US-002 | UAT-004 | Passed |
| REQ-005 | User should remove products from cart | US-002 | UAT-005 | Passed |
| REQ-006 | Product price should be accurate | US-003 | UAT-006 | Passed |
| REQ-007 | User should complete checkout | US-003 | UAT-007 | Passed |
| REQ-008 | User should log out successfully | US-004 | UAT-008 | Passed |

## Defect Tracking Approach

Defects were reviewed based on:
- Business impact
- Severity and priority
- Steps to reproduce
- Expected vs actual result
- Affected workflow
- Release impact

Sample defect format:

| Defect ID | Summary | Severity | Priority | Status |
|---|---|---|---|---|
| DEF-001 | Cart badge count not updating after adding product | High | High | Closed |
| DEF-002 | Checkout allows blank first name | Medium | High | Closed |
| DEF-003 | Product price mismatch on cart page | High | High | Closed |

## Tools Used
- Jira for user stories and defect tracking
- Excel for RTM and UAT tracking
- Confluence-style documentation
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model
- GitHub

## Outcome
The project helped validate critical e-commerce workflows and improved visibility into checkout readiness. UAT scenarios, requirement traceability, and defect tracking helped confirm that login, cart, pricing, checkout, and order confirmation workflows met business expectations before release.

## Interview Summary
This project demonstrates Business Analyst skills in requirement documentation, user story writing, acceptance criteria, UAT coordination, RTM maintenance, defect tracking, stakeholder communication, and release readiness validation, with supporting automation coverage for regression testing.
