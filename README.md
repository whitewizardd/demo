## OverviewThis project is a Java Spring Boot application that provides API endpoints for managing person records.It includes features for adding, updating, retrieving and deleting person information.This documentation provides details about the API endpoints, standard request and response formats, sample usage, known limitations, and setup instructions.
# Table of Contents1. Endpoints and Request/Response Formats2. Sample API Usage3. Known Limitations and Assumptions4. Local Setup and Deployment Instructions ### Endpoints and Request/Response Formats
# Add Person:## POST /api
# Request Format:
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12"}
# Response Format:
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29}
# Get Person by ID:## GET /api/{id}
# Request Format:
{  "id": 153}
# Response Format:
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29}

# Get Person by Email:## GET /api/email/{email}
# Request Format:{  "email": "johndoe@gmail.com"}
# Response Format:
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+234 90-9383-7491",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29}
# Get Persons by Name:## GET /api/name/{name}
# Request Format:{  "name": "John Doe"}
# Response Format:
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29}

# Get Person by Phone Number:## GET /api/phone_number/{phone_number}
# Request Format:
{  "phone_number": "+2349023437391"}
# Response Format:
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29}

# Update Person by ID:## PUT /api/{id}
# Request Format:
`{  "name": "Johnny Doe",  "email": "johnnydoe@example.com",  "phoneNumber": "+234 91-9283-6891",  "address": {    "houseNumber": 20,    "streetName": "Raymond Street",    "city": "Peter Road",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1995-12-12"
}
# Response Format:
{  "name": "Johnny Doe",  "email": "johnnydoe@example.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 20,    "streetName": "Raymond Street",    "city": "Peter Road",    "state": "Lagos",    "country": "Nigeria"},  "dateOfBirth": "1995-12-12",  "age": 27
}

# Delete Person by ID:## DELETE /api/{id}
# Request Format:
{  "id": 153}
# Response Format:
{"message": "success"}
#### Sample API Usage
### Adding a Person
# Request:
POST /apiContent-Type: application/json
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12"}
# Response:
{  "name": "John Doe",  "email": "johndoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29}
### Retrieving a Person by ID
# Request:GET /api/153Content-Type: application/json
# Response:
{  "name": "John Doe",  "email": "johndoe@example.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29
}

### Updating a Person by ID
# Request:UPDATE /api/153Content-Type: application/json
{  "name": "Johnny Doe",  "email": "johnnydoe@gmail.com",  "phoneNumber": "+2349023437391",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12"}
# Response:
{  "name": "Johnny Doe",  "email": "johnnydoe@example.com",  "phoneNumber": "+234 90-9383-7491",  "address": {    "houseNumber": 37,    "streetName": "Ajasa Street",    "city": "Olodi-Apapa",    "state": "Lagos",    "country": "Nigeria"  },  "dateOfBirth": "1993-12-12",  "age": 29}
### Deleting a Person by ID
# Request:DELETE /api/153Content-Type: application/json
# Response:
{  success
}
#### Known Limitations and Assumptions- This API assumes that person records are unique based on their email addresses. - Age calculation is based on the provided date of birth and the current date, and it may not be 100% accurate for leap years.- Error handling and validation messages are not detailed in the sample responses.
#### Local Setup and Deployment InstructionsTo set up and deploy the hngTask-2 API locally or on a server, follow these steps:
1. Clone the repository: git clone <repository_url>2. Navigate to the project directory: cd hngTask-23. Configure the database settings in application.yml4. Build the project: ./mvnw clean install or mvn clean install (if using Maven).5. Run the application: ./mvnw spring-boot:run or mvn spring-boot:run. 
The API will be accessible at http://localhost:7012.
   Thank you for using the hngTask-2 API! If you have any questions or encounter issues, please refer to the documentation or contact the project maintainers.