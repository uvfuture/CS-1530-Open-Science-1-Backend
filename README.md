# CS-Open-Science-1-Backend
The Java backend for the Open Science application.

#Starting the project
1. Find the JAR file under skeleton-web-services/target
2. Double-Click
3. Navigate to localhost:8080 to display static (and currently unlinked) frontend

#Features of the project
1. When the program starts, it creates two users with a few information fields filled out. To see them, navigate to /user1/info and /user2/info
2. To see info for all users, navigate to /user/info
3. To create a new user, use Postman. Submit a POST request with an attached JSON object with appropriate fields. If you leave the id blank, it will take the next available one. If you give it an id that's not taken, it will create a user there. if you give it an id that is taken, it will update that user.
4. To delete or update users, you need to "login"
5. To login, navigate to the user id you'd like to login as with /user{id}/login. Submit a Postman POST request with a JSON containing the same username and password, and you will login.
6. To delete a user, use Postman to submit a DELETE request at /user{id}/info.
7. To update a user, use Postman to submit a PUT request at /user{id}/info with an attached JSON containing the values you would like to change
8. To logout a user, use Postman to submit an empty POST request at /user{id}/logout 