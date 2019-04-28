# Prometheus Monitoring

1. Create Docker network
    ```
    docker network create mac-net
    ```

2. Build and run app in Docker
    ```
    mvn clean install 
    docker build -t mac-prometheus-monitoring .
    docker run -d -p 8080:8080 --network mac-net --name mac-prometheus-monitoring mac-prometheus-monitoring
    ```

3. Run Prometheus in Docker
    ```
    docker run -p 9090:9090 -v "$(pwd)/prometheus/prometheus.yml":/etc/prometheus/prometheus.yml --network mac-net prom/prometheus
    ```