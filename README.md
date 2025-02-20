# Fintech Lab - 1
## Question-1: Setup the spring boot application and print the hello world message
Step 1: Go to Spring Initializer (Visit https://start.spring.io/. )<br>
Step 2: Configure the project:
* Project: Select Maven
* Language: Java
* Spring Boot: 3.4.2
* Project Metadata:
  * Group: com.example
  * Artifact: MyProject_1
  * Name: MyProject_1
  * Description: Demo project for Spring Boot (Hello World)
  * Package Name: com.example.MyProject_1
  * Packaging: Select Jar
  * Java: 17 <br>

Step 3: Click on ADD DEPENDENCIES and select Spring Web <br>
Step 4: Click on GENERATE. The project gets generated as a zip file. <br>
Step 5: Extract the zip file to the folder. <br>
Step 6: Go to Eclipse —> Click on File —> Click on Import —> Click on Existing Maven Projects —> Browse to the folder and click on finish. <br>
Step 7: There is an Lab1Q1Application.java file src/main/java. Create a new class named HelloWorld.java and write the code given in the file and run the application. <br>

## Question-2: Setup the spring boot application with hello world message in separate package named controller
Step 1: Make a new package named com.example.Lab1_Q1.controller <br>
Step 2: Under that package, make a new class named HelloWorldController and write the code given. <br>
Step 3: Run the Application.java <br>
        If you get that ‘the server is already running on port’ in the console after running then, <br>
       	``` netstat -ano | findstr :<yourPortNumber> ``` <br>
	``` taskkill /PID <typeyourPIDhere> /F ``` <br>
        Erase the <yourPortNumber> and write 8080 and click on Enter —> Copy the second link and paste it on the command prompt. Erase the <typeyourPIDhere> and   write PID number and click on Enter. Now, run the Application.java again.<br>
Step 4: Go to http://localhost:8080/hello in the microsoft edge and the output gets displayed.

## Question-3: Test the above application in POSTMAN
Open POSTMAN and write the url http://localhost:8080/hello in the GET field and click on send. <br>
Hello World gets printed in the Body.
