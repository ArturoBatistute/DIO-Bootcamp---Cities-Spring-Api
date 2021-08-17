**Cities API** is a Spring Api to management states, countries and cities.

# Team:

- [Arturo Batistute](https://github.com/ArturoBatistute)


## Used:

* Java 11+ with SpringBoot
* Maven

## Database

```bash
Start docker container with PostgreSQL

$ docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
```

## Available Endpoints

```bash
City Endpoints:
* GET /cities

State Endpoints:
* GET /states

Country Endpoints:
* GET /countries
* GET /countries/id

```