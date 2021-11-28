Example project to test given scenario with Java,Maven and RestAssured.

Built With Intellij - IDE to create project Maven - Dependency Management RestAssured - Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs. Java 8

Project Structure APITest |__SRC | |__TEST | |__JAVA | |__ORG.EXAMPLE | |__DeletePet.java | |__GetPet.java | |__PostPet.java| |___pom.xml | |____ReadME.MD

Getting Started Download the project from Git Repository and open in intellij or Eclipse (Project is made using intellij). After download install all necessary dependencies shown in pom.xml file. To support this TestNG, RESTAssured,hamcrest and google code dependencies are already placed in pom.xml file.

What things you need to install the software and how to install them project was created using RestAssured and MAVEN in intellij

Give examples Installing If you are using Intellij to run the program then it should download all relevant dependencies automatically. But using another platform need dependencies download appropriately.

Running the tests -  Once all dependencies are download and project is ready to run. please go to project PetStore under PetStore>SRC>TEST>JAVA>org.example The project can be run from the class or from each method level.

Project runs through all 3 scenarios as per requirement.

Coding Style BDD format has been used in the form of Given, When, Then. Also, all 3 scenarios will cover Assertion.