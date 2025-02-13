# Mongo & mongo-express

## Run

```
docker compose -f .\services\mongo\docker-compose.yml -p mongodb up -d
```

### mongo-express

The following should take you to mongo express
```
http://localhost:7000
```

Use ```suriya``` as username and ```pass``` as the password.

#### Default values

when the **ME_CONFIG_BASICAUTH_USERNAME** and **ME_CONFIG_BASICAUTH_PASSWORD** is missing

```
admin:pass
```

## Connection string Viewer

This will connect to the default

```
mongodb://localhost:27017
```

## Connection string for code

Use this to connection to your own db ```mydb```

```
mongodb://localhost:27017/mydb
```

## Insert record

```
db.mycollect.insertOne({"name": "suriya", "age": 30})
```