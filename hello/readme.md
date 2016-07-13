# Docker elasticsearch

Optimized for docker container, decrease memory footprint. using jdk 8 -Xms48m -Xnm128m -Xmx256m -server -XX:+G1GC

## Run

To run an elasticsearch instance
you may run
```
docker run --restart=always -v /data/esdata:/usr/share/elasticsearch/data -d --name es -p 192.168.7.9:9200:9200 -p 192.168.7.9:9300:9300 netroby/docker-elasticsearch elasticsearch
```
Then elasticsearch will up and running , it will using 9200 and 9300 listen incoming query.



## Donate me please

![Scan QRCode donate me via Alipay](https://www.netroby.com/assets/images/alipayme.jpg)

**Scan QRCode donate me via Alipay**
