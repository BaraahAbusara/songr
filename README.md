#Songr Spring Boot 

This project is implemented using **spring boot** application.
It is made as a music library to get albums data to enjoy whenever you want.
To run my application open your browser on `localhost:8080` , now you are in the home page .  
next you can go to the following routs :
- `/hello ` which is going to take you to hello page which is going to greet you. 
- `/hello?name=yourName` which is going to take you to hello page and greet you by your name.
- **Example**: if you went to `localhost:8080/hello?name=bara'ah`   
  you will get Hello bara'ah !.
- `/capitalize/{name}` which is going to take you to capitalize page and capitalize what you have specified in the name colored in red.  
**Example**: if you went to `localhost:8080/capitalize/bara'ah`   
you will get bara'ah capitalized => BARA'AH (red colored).
- `/album` which will take you to album page that will show you an album in JSON format. 
- `/albums` which will take you to albums page and show you a list of albums in JSON format. 