Simple Bank Account System
📖 About the Project
This project is a simple command-line banking application developed in Java. Its main goal is to practically apply the fundamental concepts of Object-Oriented Programming (OOP) in a clear and functional context.

The system allows for customer registration and the creation of two different types of bank accounts: Checking and Savings, each with its own specific rules and behaviors.

✅ Features
Customer Registration: Allows for the creation of new customers with basic information.

Account Creation: Supports two types of accounts:

Checking Account: With an overdraft limit feature.

Savings Account: With logic for monthly interest yield.

Banking Operations:

Deposit

Withdraw (respecting the rules of each account type)

Balance inquiry

Interactive Menu: A user-friendly command-line interface for navigating through the options.

💡 OOP Concepts Applied
This project was designed to be a case study for the following OOP pillars:

Encapsulation: Attributes are protected with the private modifier, and access is controlled through public methods (getters, deposit(), withdraw()).

Inheritance: The CheckingAccount and SavingsAccount classes inherit common attributes and methods from the abstract Account class.

Polymorphism: The withdraw() method is overridden in the CheckingAccount class to implement a different behavior (considering the overdraft limit) than its parent class.

Abstraction: The Account class is abstract, defining a common contract that cannot be instantiated directly, forcing specialization.

🛠️ Technologies Used
Java 11+: Core language for the application.

Lombok: A library to reduce boilerplate code (like getters, setters, and constructors) in domain classes.

🚀 How to Run the Project
Prerequisites
Before you begin, you will need to have the following installed on your machine:

JDK 11 or higher.

Git.

A build tool like Maven or Gradle.

Your favorite IDE (e.g., IntelliJ IDEA, Eclipse, VS Code).

Step-by-Step
Clone the repository:

Bash

git clone https://github.com/seu-usuario/seu-repositorio.git
Navigate to the project directory:

Bash

cd seu-repositorio
Run the application:

Option 1: Using an IDE (Recommended)

Open the project in your IDE.

Locate the BankAccountMain.java file inside the src/main/java/br/com/gmarqueszx/bankaccount/executable package.

Right-click on the file and select "Run 'BankAccountMain.main()'".

Option 2: Using Maven

Bash

mvn compile exec:java -Dexec.mainClass="br.com.gmarqueszx.bankaccount.executable.BankAccountMain"
Option 3: Using Gradle

Bash

gradle run
📁 Project Structure
The project is organized into the following packages to separate responsibilities:

src/main/java/br/com/gmarqueszx/bankaccount/
├── domain/      # Contains the core business entities (Account, Customer, etc.)
├── view/        # Contains the user interface class (BankMenu)
└── executable/  # Contains the main class to start the application (BankAccountMain)
👨‍💻 Author
João Gabriel

GitHub: @gmarqueszx

LinkedIn: https://www.linkedin.com/in/joaogabrielmarques/

📄 License
This project i
