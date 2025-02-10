# Mongo

## Run

```
docker compose -f .\services\mongo\docker-compose.yml -p mongodb up -d
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