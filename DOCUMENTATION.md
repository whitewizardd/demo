    `                                                   Overview
This project is a Java Spring Boot application that provides API endpoints for managing Person records.
It includes features for Creating, Updating, Retrieving and Deleting the Person information.
This documentation provides details about the API endpoints, standard request and response formats, sample usage, known limitations,
and setup instructions.

                                                     Table of Contents
1. Endpoints and Request/Response Formats
2. Sample API Usage
3. Known Limitations and Assumptions 
4. Local Setup and Deployment Instructions 
5. Endpoints and Request/Response Formats 

                                                    Add Person: POST /api
# Request Format:
    {
        "firstName": "firstName",
        "lastName": "lastName",
        "sex": "sex",
        "houseNumber": "50",
        "streetName": "jokotagba",
        "state": "state",
        "phoneNumber": "2349061111199"
    }
# Response Format:
    {
        "id": "id",
        "email": "abc@mail.com",
        "message": "Saved Successfully...",
        "status": true
    }
                                                Get Person by email: GET /api/{user_id}
# Request Format:
    "url"/api/{email}
# Response Format:
    {
        "id": "id",
       "firstName": "firstName",
        "lastName": "lastName",
        "email" : "abc@mail.com",
        "sex": "sex",
        "phoneNumber": "2349061111199",
        "address":{
            "id": "id",
            "houseNumber": "50",
            "streetName": "jokotagba",
            "state": "state",
        }
    }
                                              Get Persons by Name: GET /api/name/{name}
# Request Format:
    "url"/api/person/{name}
# Response Format:
    {

    }
                                         Get Person by Phone Number: GET /api/phone/{user_id}
# Request Format:
     "url"/api/phone/{phone}
# Response Format:
    [
        {
           "firstName": "firstName",
            "lastName": "lastName",
            "email" : "abc@mail.com",
            "sex": "sex",
            "phoneNumber": "2349061111199",
            "address":{
                "id": "id",
                "houseNumber": "50",
                "streetName": "jokotagba",
                "state": "state",
            }
        },
        {
           "firstName": "firstName",
            "lastName": "lastName",
            "email" : "abc@mail.com",
            "sex": "sex",
            "phoneNumber": "2349061111199",
            "address":{
                "id": "id",
                "houseNumber": "50",
                "streetName": "jokotagba",
                "state": "state",
            }
        }
    ]
                                               Update Person by ID: PUT /api/{user_id}
# Request Format:
    {
        "firstName": "firstName",
        "lastName": "lastName",
        "sex": "sex"
        "address":{
                "id": "id",
                "houseNumber": "50",
                "streetName": "jokotagba",
                "state": "state",
        }
    }
# Response Format:
    {
        "id": "id",
        "status": true,
        "message":{email} "Successfully updated..."
    }
                                              Delete Person by email: DELETE /api/{user_id}
# Request Format:
    "url"/api/{email}
# Response Format:
        {email} Successfully deleted

                                                    Known Limitations and Assumptions 
This API assumes that person information are unique based on their email addresses and phone number. 

                                                            Local Setup
Check the README file...
                                            
                                                       Deployment Instructions

[//]: # (To set up and deploy the hngTask-2 API on a server, follow these steps:)