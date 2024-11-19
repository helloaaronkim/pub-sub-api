// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pubsub_api.proto

// Protobuf Java Version: 3.25.3
package com.salesforce.eventbus.protobuf;

public interface SchemaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:eventbus.v1.SchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Schema fingerprint for this event, which is a hash of the schema.
   * </pre>
   *
   * <code>string schema_id = 1;</code>
   * @return The schemaId.
   */
  java.lang.String getSchemaId();
  /**
   * <pre>
   * Schema fingerprint for this event, which is a hash of the schema.
   * </pre>
   *
   * <code>string schema_id = 1;</code>
   * @return The bytes for schemaId.
   */
  com.google.protobuf.ByteString
      getSchemaIdBytes();
}
