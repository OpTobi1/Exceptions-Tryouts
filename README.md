# 🛡️ Java Exception Handling Lab - exceptionKITA

A educational project demonstrating advanced **Exception Handling** mechanisms in Java, string analysis, and user input validation.

## 📝 Project Description
This program manages a product code validation system for a company using the `CCCNNNNCCL` format. The project is divided into three stages to demonstrate different error-handling approaches:

### Part A: Using Built-in Exceptions
Basic logic implementation relying on standard Java system exceptions:
* **StringIndexOutOfBoundsException**: Handles codes that are shorter than the required 10 characters.
* **NumberFormatException**: Handles cases where the "City Code" (characters 4-7) contains non-numeric characters.

### Part B: Custom Exceptions
Implementation using a dedicated `InvalidCodeException` class that extends `Exception`. 
* Manual validation of business rules (length and numeric checks).
* Use of the `throw` keyword to create a controlled program flow.
* **Marketing Rules**: Identifies "Banned" products—valid codes from region `R` with a city code higher than `2000`.

### Part C: Input Type Validation
A utility program that reads an integer and extracts its units digit, using `InputMismatchException` to prevent crashes when a user enters text instead of a number.

---

## 📂 File Structure
| File | Role |
| :--- | :--- |
| `InvalidCodeException.java` | Definition of the custom exception class |
| `MainProductCodes.java` | Main program (Part B) featuring the input loop and summary logic |
| `PartC.java` | Integer input validation logic |

---

## 🛠️ How to Run
To run the project, compile all files within the package directory:

```bash
javac exceptionKITA/*.java
java exceptionKITA.MainProductCodes
