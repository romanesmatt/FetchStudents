# FetchStudents
This project is part of the first lab assignment for SWEN 301 (Scalable Software Development) at Victoria University of Wellington. More specifically, it dives deeper into using a standardized API to connect to an external data source. 

## How It works
The project uses JDBC (Java Database Connectivity) to connect to the given database students.csv. This database contains information of students' names and their respective degree laid out in a table. The objective is to use a CSV-JDBC Driver to send SQL statements and queries to manipulate data in the database. 

## Installation
### Maven
To run the project, you must have Maven installed on your local machine. To install Maven, refer to the link below for instructions:

https://maven.apache.org/

### CSV-JDBC Driver
Install the following jar file containing the JDBC driver and DB:

https://repo1.maven.org/maven2/net/sourceforge/csvjdbc/csvjdbc/1.0.36/csvjdbc-1.0.36.jar
