package com.example;

import com.google.protobuf.Empty;
import kalix.javasdk.action.Action;
import kalix.javasdk.action.ActionCreationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Action Service described in your com/example/example_action.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class ExampleActionImpl extends AbstractExampleAction {

  private static final Logger logger = LoggerFactory.getLogger(ExampleActionImpl.class);


  public ExampleActionImpl(ActionCreationContext creationContext) {}

  @Override
  public Action.Effect<Empty> init(Empty empty) {
    logger.info("Example action initializing...");

    // do something here
    // ...

    return effects().reply(Empty.getDefaultInstance());
  }
}