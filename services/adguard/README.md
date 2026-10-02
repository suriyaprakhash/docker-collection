# AdGuard Home

Network-wide ad & tracker blocking DNS.

## Running

```
docker compose up -d
```

Web UI at `http://<NAS-IP>:3001/` - by default but now filpped over to run on 8080

- First run opens a setup wizard — default credentials are `admin` / `admin` (you'll be asked to set a new password)
- Pick your upstream DNS servers in the wizard (e.g. `9.9.9.9`, `1.1.1.1`)

## Using it

Point your devices (or your router's DNS setting) at the NAS IP address so all traffic goes through AdGuard Home.

## Port conflicts

If port 53 is already in use on the NAS (e.g. another DNS service), change the host-side mapping, e.g. `5353:53/tcp` and `5353:53/udp`, and use that port on your clients instead.
