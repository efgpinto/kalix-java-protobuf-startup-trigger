# java-protobuf-startup-trigger


## Designing

While designing your service it is useful to read [designing services](https://docs.kalix.io/developing/development-process-proto.html)


## Developing

This project has a bare-bones skeleton service ready to go, but in order to adapt and
extend it, it may be useful to read up on [developing services](https://docs.kalix.io/services/)
and in particular the [Java section](https://docs.kalix.io/java-protobuf/index.html)


## Building

You can use Maven to build your project, which will also take care of
generating code based on the `.proto` definitions:

```shell
mvn compile
```


## Running Locally


When running a Kalix service locally, we need to have its companion Kalix Runtime running alongside it.

To start your service locally, run:

```shell
mvn kalix:runAll
```

You will see a log like this:
```shell
09:49:46.484 INFO  com.example.ExampleActionImpl - Example action initializing...
```

This means the init method on the Action was actually run.

## Deploying

To deploy your service, install the `kalix` CLI as documented in
[Setting up a local development environment](https://docs.kalix.io/setting-up/)
and configure a Docker Registry to upload your docker image to.

You will need to update the `dockerImage` property in the `pom.xml` and refer to
[Configuring registries](https://docs.kalix.io/projects/container-registries.html)
for more information on how to make your docker image available to Kalix.

Finally, you use the `kalix` CLI to create a project as described in [Create a new Project](https://docs.kalix.io/projects/create-project.html). Once you have a project you can deploy your service into the project either 
by using `mvn deploy kalix:deploy` which will package, publish your docker image, and deploy your service to Kalix, 
or by first packaging and publishing the docker image through `mvn deploy` and 
then [deploying the image through the `kalix` CLI](https://docs.kalix.io/services/deploy-service.html#_deploy).
