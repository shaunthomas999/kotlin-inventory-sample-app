# Kotlin Inventory Sample App

This is a sample REST application for managing inventory of products 
* Application stack is Kotlin, Spring-boot, Spring-data-jpa, Spring-data-rest, H2 (embedded) database and gradle. 
* Use the following command to clean the build and run the application
  * Clean the build > `./gradlew clean`
  * Run the application > `./gradlew bootRun`
* REST API of the application can be accessed at `http://localhost:8080/products`
* The application provides CRUD operations on the domain model Product (see the data class inside src folder)
* The application configuration is made in `application.yml` file inside resources folder
* At the start of this Spring-boot application, DDL commands `schema-h2.sql` file and DML commands in `data-h2.sql` 
 file are executed.
* Currently 2 entries are made into Product database table using the sample data present in `data-h2.sql` file

