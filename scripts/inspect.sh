#!/bin/bash

docker images --format "{{.Size}}\t{{.Repository}}" random-pokemon-* | sort -k1 -h