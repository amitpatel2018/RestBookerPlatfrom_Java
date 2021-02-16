# automationintesting
This is Pilot project to automate Booking a Single Room functionality using BDD framework (Cucumber), Java.

Pre-requisite:
1. Install Java
2. Set java path in Environemnt variable 
3. Download IDE of your choice (Here I am using Eclipse IDE)

Create and configure Project in Eclipse
1. Create Maven Project in Eclipse
2. Configure POM.xml with required dependencies
   Here I am using WebDriverManager dependencies for dynamically adding browser drivers instead of manually downloading and adding to project. 

Structure Maven Project
1. Create packages for page objects, step definitions
2. Add Webelements and related methods in Page objects
3. Call page object methods in your step definition class as required.

what this project is not focusing on:
1. Error Handling 
2. Generating Log files
3. Integrating with CI/CD tools
4. Handling Reports
5. Running project from command line
6. Screenshots for failure testcases
