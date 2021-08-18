<p align="center">
    <img width="500" height="auto" src="dio.png" alt="PHP Censor" />
</p>

**Cities API** is a Java Spring Boot API to management states, countries and cities.

# Team:

- [Arturo Batistute](https://github.com/ArturoBatistute)


## Used:

* Java 11+ with SpringBoot
* Maven

## Database

```bash
Its possible to run a postgreSQL in your host or start docker container with PostgreSQL using the following command?

$ docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

* Attention to user and password parameters
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

## Deployment

* Deployment on Heroku in progress..

