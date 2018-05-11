# Taxtoken

## Generated a spring project using Spring boot.
### Part 1:
1. Created simple HTML page.
2. Created Greeting controller to redirect the GET/ request to show the index.html
3.Created user class and usermodel class to hold the information about the users.
4. usermodel has been hardcoded with data as a list .
5. Created user RestController to handle the requests GET /{name}/birthday, GET /{name}/age, POST /user, PUT /user/{name}.
6. Controllers have been annotated as RestControllers
7. Response entity has been returned for POST /user and  PUT /user/{name} requests.

### Part 2: 
1. User class has been annotated as Entity to set it up as JPA entity.
2. Added the required dependencies in pom.xml.
3. Created userrepository class with @Repository annotation to make all the CRUD actions available for the usermodel.
4. used the inbuilt methods like save() and findbyName() to save the user to repo and to get user from repo.

### Part 3:
1. Edited the HTML page to interact with rest of the APIs.
2. Included the scripts for JS , JQUERY and CSS in the html file.
3. Created an app.js file and used JQUERY to handle the post and get requests.
4. Used thymeleaf template to populate the user information dynamically in a pre written template.



