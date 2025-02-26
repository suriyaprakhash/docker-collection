# Postgres database

## Run

```
docker compose -f .\services\postgres\docker-compose.yml -p postgres up -d
```

### Login to PostgresAdmin tool
To view **postgres admin**,
```
http://localhost:8888/
```
Username - contact@suriyaprakhash.com
Password - test

### Connect to postgres server

In the **postgres admin** connect to the pg database server via **Add New Server**,

- General tab, give a profile name *eg. local postgres*
- Connection tab 
  - **Hostname:** postgresdb or localhost
  - **Port:** 5432
  - **Username:** postgres
  - **Password:** test

Right click and Create DB. Right click the created DB and select **query tool** within the database,

```sql
CREATE TABLE product (
  name VARCHAR(255),
  type VARCHAR(255),
  year INT
);
```

The table will be created in **the public** by default. Have fun :).