#!/bin/bash

mkdir -p result

# Benchmark micronaut openjdk
docker run \
--name random-pokemon-jre \
-d -p 8080:8080 \
random-pokemon-jre
sleep 5
ab -n 50000 -c 50 -g result/jre.data http://localhost:8080/pokemon
docker stop random-pokemon-jre
docker rm random-pokemon-jre

# Benchmark micronaut native image
docker run \
--name random-pokemon-native \
-d -p 8080:8080 \
random-pokemon-native
sleep 5
ab -n 50000 -c 50 -g result/native.data http://localhost:8080/pokemon
docker stop random-pokemon-native
docker rm random-pokemon-native

# Create chart
gnuplot ./scripts/plot.p