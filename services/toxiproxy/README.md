# Toxiproxy

## Run

```
docker compose up -d
```

Navigate to the UI at,
```
http://localhost:8484/
```

Viewing proxied app, for eg. https://pixie.suriyaprakhash.com running the https://b9tl7fbxi2.execute-api.us-east-2.amazonaws.com/

```
https://localhost:8800
```

when you try with http - you get bad request

## Config

Check for the **toxiproxy.json** file to add proxy. Alternatively, use the **toxiproxy ui**
