FROM ubuntu:16.04
MAINTAINER Fabian Otto

# install java
RUN apt-get update
RUN apt-get install -y openjdk-8-jre

# copy entrypoint script on docker and set permissions
COPY entrypoint.sh /
RUN chmod u+x /entrypoint.sh

# install kafka
ADD http://apache.mirror.digionline.de/kafka/0.10.1.0/kafka_2.11-0.10.1.0.tgz /kafka.tgz
RUN tar -xzf /kafka.tgz && mv /kafka_2.11-0.10.1.0 /kafka

# expose kafka port
EXPOSE 2181
EXPOSE 9092

ENTRYPOINT /entrypoint.sh
