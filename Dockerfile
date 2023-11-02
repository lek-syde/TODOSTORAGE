FROM ubuntu:latest
LABEL authors="leksyde"

ENTRYPOINT ["top", "-b"]