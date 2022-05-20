#!/bin/bash

DEMO_URL=http://localhost:8080/pokemon

# Check jar file or native image exist
if [ ! -f ./target/*.jar ] || [ ! -f ./target/random-pokemon ]; then
    echo "Jar file or native image not found, building..."
    chmod +x mvnw
    ./mvnw -DskipTests -Pnative clean package
fi

# Check psrecord exist
if ! command -v psrecord > /dev/null; then
  echo "psrecord not found, installing..."

  if ! command -v pip > /dev/null; then
      echo "pip not found, install manual"
  fi

  pip install psrecord
fi

# Check ab exist
if ! command -v ab > /dev/null; then
  echo "ab not found, please install ab (apache benchmark)"
fi

## Run Benchmark
sleep 1
./scripts/test-single.sh  "java -jar target/random-pokemon.jar" $DEMO_URL random-pokemon-jar "Java Runtime"
sleep 1
./scripts/test-single.sh  "./target/random-pokemon" $DEMO_URL random-pokemon-native "GraalVM Native Image"