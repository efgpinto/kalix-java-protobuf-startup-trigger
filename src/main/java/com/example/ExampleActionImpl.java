package com.example;

import com.google.protobuf.Empty;
import kalix.javasdk.action.Action;
import kalix.javasdk.action.ActionCreationContext;

// This class was initially generated based on the .proto definition by Kalix tooling.
// This is the implementation for the Action Service described in your com/example/example_action.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class ExampleActionImpl extends AbstractExampleAction {

  public ExampleActionImpl(ActionCreationContext creationContext) {}

  @Override
  public Action.Effect<Empty> init(Empty empty) {
    System.out.println("Example action initialized");
    throw new RuntimeException("The command handler for `Init` is not implemented, yet");
  }
}