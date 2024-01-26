// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

// Protobuf Java Version: 3.25.1
package com.pocketcasts.service.api;

/**
 * Protobuf type {@code api.Int32Setting}
 */
public  final class Int32Setting extends
    com.google.protobuf.GeneratedMessageLite<
        Int32Setting, Int32Setting.Builder> implements
    // @@protoc_insertion_point(message_implements:api.Int32Setting)
    Int32SettingOrBuilder {
  private Int32Setting() {
  }
  private int bitField0_;
  public static final int VALUE_FIELD_NUMBER = 1;
  private com.google.protobuf.Int32Value value_;
  /**
   * <code>.google.protobuf.Int32Value value = 1;</code>
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Int32Value value = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getValue() {
    return value_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : value_;
  }
  /**
   * <code>.google.protobuf.Int32Value value = 1;</code>
   */
  private void setValue(com.google.protobuf.Int32Value value) {
    value.getClass();
  value_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>.google.protobuf.Int32Value value = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeValue(com.google.protobuf.Int32Value value) {
    value.getClass();
  if (value_ != null &&
        value_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      value_ =
        com.google.protobuf.Int32Value.newBuilder(value_).mergeFrom(value).buildPartial();
    } else {
      value_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>.google.protobuf.Int32Value value = 1;</code>
   */
  private void clearValue() {  value_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int CHANGED_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue changed_;
  /**
   * <code>.google.protobuf.BoolValue changed = 2;</code>
   */
  @java.lang.Override
  public boolean hasChanged() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.google.protobuf.BoolValue changed = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getChanged() {
    return changed_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : changed_;
  }
  /**
   * <code>.google.protobuf.BoolValue changed = 2;</code>
   */
  private void setChanged(com.google.protobuf.BoolValue value) {
    value.getClass();
  changed_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>.google.protobuf.BoolValue changed = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeChanged(com.google.protobuf.BoolValue value) {
    value.getClass();
  if (changed_ != null &&
        changed_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
      changed_ =
        com.google.protobuf.BoolValue.newBuilder(changed_).mergeFrom(value).buildPartial();
    } else {
      changed_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>.google.protobuf.BoolValue changed = 2;</code>
   */
  private void clearChanged() {  changed_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int MODIFIED_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp modifiedAt_;
  /**
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  @java.lang.Override
  public boolean hasModifiedAt() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getModifiedAt() {
    return modifiedAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : modifiedAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  private void setModifiedAt(com.google.protobuf.Timestamp value) {
    value.getClass();
  modifiedAt_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeModifiedAt(com.google.protobuf.Timestamp value) {
    value.getClass();
  if (modifiedAt_ != null &&
        modifiedAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      modifiedAt_ =
        com.google.protobuf.Timestamp.newBuilder(modifiedAt_).mergeFrom(value).buildPartial();
    } else {
      modifiedAt_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <code>.google.protobuf.Timestamp modified_at = 3;</code>
   */
  private void clearModifiedAt() {  modifiedAt_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.pocketcasts.service.api.Int32Setting parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.pocketcasts.service.api.Int32Setting parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.pocketcasts.service.api.Int32Setting parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.pocketcasts.service.api.Int32Setting prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code api.Int32Setting}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.pocketcasts.service.api.Int32Setting, Builder> implements
      // @@protoc_insertion_point(builder_implements:api.Int32Setting)
      com.pocketcasts.service.api.Int32SettingOrBuilder {
    // Construct using com.pocketcasts.service.api.Int32Setting.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.google.protobuf.Int32Value value = 1;</code>
     */
    @java.lang.Override
    public boolean hasValue() {
      return instance.hasValue();
    }
    /**
     * <code>.google.protobuf.Int32Value value = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int32Value getValue() {
      return instance.getValue();
    }
    /**
     * <code>.google.protobuf.Int32Value value = 1;</code>
     */
    public Builder setValue(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Int32Value value = 1;</code>
     */
    public Builder setValue(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setValue(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value value = 1;</code>
     */
    public Builder mergeValue(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeValue(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value value = 1;</code>
     */
    public Builder clearValue() {  copyOnWrite();
      instance.clearValue();
      return this;
    }

    /**
     * <code>.google.protobuf.BoolValue changed = 2;</code>
     */
    @java.lang.Override
    public boolean hasChanged() {
      return instance.hasChanged();
    }
    /**
     * <code>.google.protobuf.BoolValue changed = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.BoolValue getChanged() {
      return instance.getChanged();
    }
    /**
     * <code>.google.protobuf.BoolValue changed = 2;</code>
     */
    public Builder setChanged(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.setChanged(value);
      return this;
      }
    /**
     * <code>.google.protobuf.BoolValue changed = 2;</code>
     */
    public Builder setChanged(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      copyOnWrite();
      instance.setChanged(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue changed = 2;</code>
     */
    public Builder mergeChanged(com.google.protobuf.BoolValue value) {
      copyOnWrite();
      instance.mergeChanged(value);
      return this;
    }
    /**
     * <code>.google.protobuf.BoolValue changed = 2;</code>
     */
    public Builder clearChanged() {  copyOnWrite();
      instance.clearChanged();
      return this;
    }

    /**
     * <code>.google.protobuf.Timestamp modified_at = 3;</code>
     */
    @java.lang.Override
    public boolean hasModifiedAt() {
      return instance.hasModifiedAt();
    }
    /**
     * <code>.google.protobuf.Timestamp modified_at = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getModifiedAt() {
      return instance.getModifiedAt();
    }
    /**
     * <code>.google.protobuf.Timestamp modified_at = 3;</code>
     */
    public Builder setModifiedAt(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setModifiedAt(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Timestamp modified_at = 3;</code>
     */
    public Builder setModifiedAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setModifiedAt(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp modified_at = 3;</code>
     */
    public Builder mergeModifiedAt(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeModifiedAt(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp modified_at = 3;</code>
     */
    public Builder clearModifiedAt() {  copyOnWrite();
      instance.clearModifiedAt();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:api.Int32Setting)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.pocketcasts.service.api.Int32Setting();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "value_",
            "changed_",
            "modifiedAt_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002" +
              "\u1009\u0001\u0003\u1009\u0002";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.pocketcasts.service.api.Int32Setting> parser = PARSER;
        if (parser == null) {
          synchronized (com.pocketcasts.service.api.Int32Setting.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.pocketcasts.service.api.Int32Setting>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:api.Int32Setting)
  private static final com.pocketcasts.service.api.Int32Setting DEFAULT_INSTANCE;
  static {
    Int32Setting defaultInstance = new Int32Setting();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Int32Setting.class, defaultInstance);
  }

  public static com.pocketcasts.service.api.Int32Setting getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Int32Setting> PARSER;

  public static com.google.protobuf.Parser<Int32Setting> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

