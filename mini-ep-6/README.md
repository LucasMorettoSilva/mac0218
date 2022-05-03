## Caddy File Server

This folder contains code to create and run a simple Caddy File Server in a Docker container. 

The files inside folder `./pages` will be exposed by the server when started.

### Build docker image

To build the docker image for the given Dockerfile use:

```sh
docker build -t mini-ep-6 .
```

### Run container

To run the container from the previous created image do:

```sh
docker run --name mini-ep-6 --rm -p 8080:80 mini-ep-6
```

Once the container is running the server will expose the files in [http://localhost:8080](http://localhost:8080)

### Create shared volume for static files

You can run the command bellow to create a shared volume between the host and the container to store the static files.
This way you do not need to create new images when updating the files inside `./pages`.

```sh
docker run --name mini-ep-6 --rm -p 8080:80 -v ${PWD}/pages:/usr/src/pages mini-ep-6
```
