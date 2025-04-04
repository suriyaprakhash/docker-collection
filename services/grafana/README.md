# Grafana

## Run

```
docker compose -f .\services\grafana\docker-compose.yml -p grafana up -d
```

## Login

Use the default,

```admin``` and ```admin```

to login.

## Configuring data backends

- Add loki (logs)
  - Provide the URL to be http://loki:3100 (since it is using loki-network it should connect to your grafana)
- Add Zipkin (distributed tracing)
  - http://zipkin:9411
- Add prometheus (metrics, alerts)
  - http://prometheus:9090