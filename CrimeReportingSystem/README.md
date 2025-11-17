**Crime Reporting System (OOP Project)**

This repository contains the source code for a Crime Reporting System developed as an Object-Oriented Programming (OOP) project. The system provides a centralized, secure platform for citizens to report incidents, and for police and administrative staff to manage, resolve, and analyze these reports.

The application is built using Java with the JavaFX framework for the graphical user interface (GUI).

**Overview & Key Features**

The Crime Reporting System uses a role-based access control (RBAC) structure, leveraging core OOP principles like Inheritance, Encapsulation, and Polymorphism to ensure data security and tailored user experiences.

**Core Features**

- **Role-Based Access Control:** Users are categorized into three roles:

- **Citizen:** Can anonymously submit new crime reports and view the status of their submitted reports.

- **Police Officer:** Can view, search, and manage (resolve) all submitted reports.

- **Admin:** Has full control over the system, including managing user accounts and reports.

- **Secure Reporting:** Allows for anonymous reporting, protecting the privacy of citizens.

- **Real-time Updates:** Provides immediate status updates on reports to the respective users.

- **Data Security:** Encapsulation safeguards sensitive data, such as passwords and report details.

- **Composition:** The CrimeReport class uses composition with a Location class to ensure reports include precise location information.

**Technologies Used**

- **Primary Language:** Java

- **GUI Framework:** JavaFX

- **IDE:** IntelliJ IDEA

**Getting Started**

Follow these steps to clone the repository and run the application locally.

- **Prerequisites**

- **Java Development Kit (JDK):** Ensure you have JDK 8 or later installed.

- **JavaFX SDK:** Since this project uses JavaFX, you may need to configure your IDE or build tool to include the JavaFX libraries, depending on your JDK version.

- **Installation and Execution**

- **Clone the Repository:**

git clone [Your Repository URL Here]
cd CrimeReportingSystem


Open in IDE:

Open the project folder (CrimeReportingSystem) in your preferred Java IDE (IntelliJ IDEA, Eclipse, etc.).

Configure JavaFX (If Needed):

If your IDE doesn't automatically detect JavaFX, you may need to add the JavaFX SDK as a library to the project structure and configure the module path settings for running JavaFX applications.

Run the Main Class:

Locate the MainApp.java class (typically in the gui package).

Run the application from the main method within MainApp.java.

🗺️ Project Structure

The key directories and files are organized as follows:

Directory

Description

src/

Contains all the Java source code (.java files).

src/gui/

JavaFX classes defining the graphical user interface.

src/services/

Contains the business logic, such as AuthServices and CrimeServices.

src/models/

Core domain classes (e.g., Citizen, PoliceOfficer, CrimeReport, Location).

🤝 Contribution

This project was developed by:

Laraib Qadeer (FA24-BCS-047)

Namirah Manzoor (FA24-BCS-089)

Feel free to explore the code and see how the OOP principles were applied!
