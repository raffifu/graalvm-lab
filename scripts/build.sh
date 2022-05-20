#!/bin/bash

docker build . -f dockerfile/Dockerfile-jdk -t random-pokemon-jdk
docker build . -f dockerfile/Dockerfile-jre -t random-pokemon-jre
docker build . -f dockerfile/Dockerfile-distroless -t random-pokemon-distroless
docker build . -f dockerfile/Dockerfile-native -t random-pokemon-native