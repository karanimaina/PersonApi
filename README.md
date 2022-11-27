# Person  REST API application

The REST API to the  Person API  application  is described below.

## Create a new person

### Request 

    'POST http://localhost:8088/api/person/add'
    
    
    curl -i -H 'Accept: application/json' -d 
    "name":"felix",
    "location":"Nairobi"
    


### Response

    HTTP/1.1 201 Created
    Date: 2022-11-27T08:40:01.759+00:00
    Status: 201 Created
    Connection: keep-alive
    Content-Type: application/json
    Content-Length: 36
    
   {
    "status": 201,
    "data": {
        "id": 1,
        "name": "felix",
        "location": "Nairobi"
    },
    "message": "person added succesfully"
}





## Get All Persons

### Request 

    GET  http://localhost:8088/api/person/all  curl -i -H 'Accept: application/json '    

### Response

    HTTP/1.1 200 OK
    Date: 2022-11-27T08:40:01.759+00:0
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 2
    
    {
    "status": 200,
    "data": [
        {
            "id": 1,
            "name": "felix",
            "location": "Nairobi"
        }
    ],
    "message": "data retrieved successfully"
}

## Get a person by id

### Request

    `GET "http://localhost:8088/api/person/1 curl -i -H 'Accept: application/json' http://localhost:8087/api/update/poduct/dto
    
    ### Response
    
    
    HTTP/1.1 200 OK
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 200 OK
    Connection: close
    Content-Type: application/json
    Content-Length: 36
    
    "status": 200,
    "data": [
        {
            "id": 1,
            "name": "felix",
            "location": "Nairobi"
        }
    ],
    "message": "data retrieved successfully"
}
   
## Update product Details

### Request

    curl -i -H 'Accept: application/json' http://localhost:8088/api/person/1
    {
           "name": "felix",
           "location": "Nairobi"   
    }
    
    
### Response

    HTTP/1.1 404 Not Found
    Date: Thu, 24 Feb 2011 12:36:30 GMT
    Status: 404 Not Found
    Connection: close
    Content-Type: application/json
    Content-Length: 35
    
    {
    "status": 200,
    "data": [
        {
            "id": 1,
            "name": "felix",
            "location": "Nairobi"
        }
    ],
    "message": "data retrieved successfully"
}


### Delete a pesrson

`DELETE http://localhost:8088/delete/person/1`

    curl -i -H 'Accept: application/json'http://localhost:8087/delete/product/1

### Response

    HTTP/1.1 201 Created
    Date: Thu, 24 Feb 2011 12:36:31 GMT
    Status: 201 Created
    Connection: close
    Content-Type: application/json
    Location: /thing/2
    Content-Length: 35
    
    {
    "date": "2022-11-26 02:28:15",
    "status": 200,
    "data": 'peson has been deleted ",
    "message": "person with record 1 deleted successfully"
    }


##   License

Copyright (c) 2022 Felix Maina

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
