**Cities API** is a Spring Api to management states, country and city.

# Team:

- [Arturo Batistute](https://github.com/ArturoBatistute)


## Used:

* Java 11+ with SpringBoot
* Maven

## Database

```bash
git clone https://github.com/codenation-dev/squad-1-ad-nodejs-kroton-1
cd squad-1-ad-nodejs-kroton-1
npm install
docker-compose up -d
npm sync
npm start
```

## Database

```bash
docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres
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