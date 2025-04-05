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
- Pyroscope (Profiling)
  - http://pyroscope:4041 - the push agent
  - http://pyroscope:4040 - the UI

## Links & correlation

- Loki to zipkin
  - Add Derived fields
    - [Config](./img/loki-link-zipkin-config.png)
    - [Actual sample](./img/loki-link-zipkin-sample.png)

- Zipkin to loki
  - Trace to logs
    - [Config](./img/zipkin-link-loki-config.png)
    - [Actual sample](./img/zipkin-link-loki-sample.png)

## Sample spring boot app

[Check here](https://github.com/suriyaprakhash/springboot-instrumentation/tree/master) for a sample spring boot app using this 