// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pubsub_api.proto

// Protobuf Java Version: 3.25.3
package com.salesforce.eventbus.protobuf;

/**
 * <pre>
 *
 * A request message for GetTopic. Note that the tenant/org is not directly referenced
 * in the request, but is implicitly identified by the authentication headers.
 * </pre>
 *
 * Protobuf type {@code eventbus.v1.TopicRequest}
 */
public final class TopicRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:eventbus.v1.TopicRequest)
    TopicRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TopicRequest.newBuilder() to construct.
  private TopicRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TopicRequest() {
    topicName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TopicRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.salesforce.eventbus.protobuf.PubSubProto.internal_static_eventbus_v1_TopicRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.salesforce.eventbus.protobuf.PubSubProto.internal_static_eventbus_v1_TopicRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.salesforce.eventbus.protobuf.TopicRequest.class, com.salesforce.eventbus.protobuf.TopicRequest.Builder.class);
  }

  public static final int TOPIC_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object topicName_ = "";
  /**
   * <pre>
   * The name of the topic to retrieve.
   * </pre>
   *
   * <code>string topic_name = 1;</code>
   * @return The topicName.
   */
  @java.lang.Override
  public java.lang.String getTopicName() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topicName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the topic to retrieve.
   * </pre>
   *
   * <code>string topic_name = 1;</code>
   * @return The bytes for topicName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTopicNameBytes() {
    java.lang.Object ref = topicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topicName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topicName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topicName_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.salesforce.eventbus.protobuf.TopicRequest)) {
      return super.equals(obj);
    }
    com.salesforce.eventbus.protobuf.TopicRequest other = (com.salesforce.eventbus.protobuf.TopicRequest) obj;

    if (!getTopicName()
        .equals(other.getTopicName())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTopicName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.salesforce.eventbus.protobuf.TopicRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.salesforce.eventbus.protobuf.TopicRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.salesforce.eventbus.protobuf.TopicRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.salesforce.eventbus.protobuf.TopicRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *
   * A request message for GetTopic. Note that the tenant/org is not directly referenced
   * in the request, but is implicitly identified by the authentication headers.
   * </pre>
   *
   * Protobuf type {@code eventbus.v1.TopicRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:eventbus.v1.TopicRequest)
      com.salesforce.eventbus.protobuf.TopicRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.salesforce.eventbus.protobuf.PubSubProto.internal_static_eventbus_v1_TopicRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.salesforce.eventbus.protobuf.PubSubProto.internal_static_eventbus_v1_TopicRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.salesforce.eventbus.protobuf.TopicRequest.class, com.salesforce.eventbus.protobuf.TopicRequest.Builder.class);
    }

    // Construct using com.salesforce.eventbus.protobuf.TopicRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topicName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.salesforce.eventbus.protobuf.PubSubProto.internal_static_eventbus_v1_TopicRequest_descriptor;
    }

    @java.lang.Override
    public com.salesforce.eventbus.protobuf.TopicRequest getDefaultInstanceForType() {
      return com.salesforce.eventbus.protobuf.TopicRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.salesforce.eventbus.protobuf.TopicRequest build() {
      com.salesforce.eventbus.protobuf.TopicRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.salesforce.eventbus.protobuf.TopicRequest buildPartial() {
      com.salesforce.eventbus.protobuf.TopicRequest result = new com.salesforce.eventbus.protobuf.TopicRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.salesforce.eventbus.protobuf.TopicRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topicName_ = topicName_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.salesforce.eventbus.protobuf.TopicRequest) {
        return mergeFrom((com.salesforce.eventbus.protobuf.TopicRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.salesforce.eventbus.protobuf.TopicRequest other) {
      if (other == com.salesforce.eventbus.protobuf.TopicRequest.getDefaultInstance()) return this;
      if (!other.getTopicName().isEmpty()) {
        topicName_ = other.topicName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              topicName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object topicName_ = "";
    /**
     * <pre>
     * The name of the topic to retrieve.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return The topicName.
     */
    public java.lang.String getTopicName() {
      java.lang.Object ref = topicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the topic to retrieve.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return The bytes for topicName.
     */
    public com.google.protobuf.ByteString
        getTopicNameBytes() {
      java.lang.Object ref = topicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the topic to retrieve.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @param value The topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      topicName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the topic to retrieve.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTopicName() {
      topicName_ = getDefaultInstance().getTopicName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the topic to retrieve.
     * </pre>
     *
     * <code>string topic_name = 1;</code>
     * @param value The bytes for topicName to set.
     * @return This builder for chaining.
     */
    public Builder setTopicNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      topicName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:eventbus.v1.TopicRequest)
  }

  // @@protoc_insertion_point(class_scope:eventbus.v1.TopicRequest)
  private static final com.salesforce.eventbus.protobuf.TopicRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.salesforce.eventbus.protobuf.TopicRequest();
  }

  public static com.salesforce.eventbus.protobuf.TopicRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TopicRequest>
      PARSER = new com.google.protobuf.AbstractParser<TopicRequest>() {
    @java.lang.Override
    public TopicRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TopicRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TopicRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.salesforce.eventbus.protobuf.TopicRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

