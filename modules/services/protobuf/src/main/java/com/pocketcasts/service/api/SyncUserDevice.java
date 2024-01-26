// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

// Protobuf Java Version: 3.25.1
package com.pocketcasts.service.api;

/**
 * Protobuf type {@code api.SyncUserDevice}
 */
public  final class SyncUserDevice extends
    com.google.protobuf.GeneratedMessageLite<
        SyncUserDevice, SyncUserDevice.Builder> implements
    // @@protoc_insertion_point(message_implements:api.SyncUserDevice)
    SyncUserDeviceOrBuilder {
  private SyncUserDevice() {
  }
  private int bitField0_;
  public static final int DEVICE_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue deviceId_;
  /**
   * <code>.google.protobuf.StringValue device_id = 1;</code>
   */
  @java.lang.Override
  public boolean hasDeviceId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.StringValue device_id = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getDeviceId() {
    return deviceId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : deviceId_;
  }
  /**
   * <code>.google.protobuf.StringValue device_id = 1;</code>
   */
  private void setDeviceId(com.google.protobuf.StringValue value) {
    value.getClass();
  deviceId_ = value;
    bitField0_ |= 0x00000001;
    }
  /**
   * <code>.google.protobuf.StringValue device_id = 1;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeDeviceId(com.google.protobuf.StringValue value) {
    value.getClass();
  if (deviceId_ != null &&
        deviceId_ != com.google.protobuf.StringValue.getDefaultInstance()) {
      deviceId_ =
        com.google.protobuf.StringValue.newBuilder(deviceId_).mergeFrom(value).buildPartial();
    } else {
      deviceId_ = value;
    }
    bitField0_ |= 0x00000001;
  }
  /**
   * <code>.google.protobuf.StringValue device_id = 1;</code>
   */
  private void clearDeviceId() {  deviceId_ = null;
    bitField0_ = (bitField0_ & ~0x00000001);
  }

  public static final int DEVICE_TYPE_FIELD_NUMBER = 2;
  private com.google.protobuf.Int32Value deviceType_;
  /**
   * <code>.google.protobuf.Int32Value device_type = 2;</code>
   */
  @java.lang.Override
  public boolean hasDeviceType() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.google.protobuf.Int32Value device_type = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int32Value getDeviceType() {
    return deviceType_ == null ? com.google.protobuf.Int32Value.getDefaultInstance() : deviceType_;
  }
  /**
   * <code>.google.protobuf.Int32Value device_type = 2;</code>
   */
  private void setDeviceType(com.google.protobuf.Int32Value value) {
    value.getClass();
  deviceType_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>.google.protobuf.Int32Value device_type = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeDeviceType(com.google.protobuf.Int32Value value) {
    value.getClass();
  if (deviceType_ != null &&
        deviceType_ != com.google.protobuf.Int32Value.getDefaultInstance()) {
      deviceType_ =
        com.google.protobuf.Int32Value.newBuilder(deviceType_).mergeFrom(value).buildPartial();
    } else {
      deviceType_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>.google.protobuf.Int32Value device_type = 2;</code>
   */
  private void clearDeviceType() {  deviceType_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public static final int TIMES_STARTED_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Int64Value timesStartedAt_;
  /**
   * <pre>
   * times in seconds
   * </pre>
   *
   * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
   */
  @java.lang.Override
  public boolean hasTimesStartedAt() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * times in seconds
   * </pre>
   *
   * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getTimesStartedAt() {
    return timesStartedAt_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : timesStartedAt_;
  }
  /**
   * <pre>
   * times in seconds
   * </pre>
   *
   * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
   */
  private void setTimesStartedAt(com.google.protobuf.Int64Value value) {
    value.getClass();
  timesStartedAt_ = value;
    bitField0_ |= 0x00000004;
    }
  /**
   * <pre>
   * times in seconds
   * </pre>
   *
   * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimesStartedAt(com.google.protobuf.Int64Value value) {
    value.getClass();
  if (timesStartedAt_ != null &&
        timesStartedAt_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
      timesStartedAt_ =
        com.google.protobuf.Int64Value.newBuilder(timesStartedAt_).mergeFrom(value).buildPartial();
    } else {
      timesStartedAt_ = value;
    }
    bitField0_ |= 0x00000004;
  }
  /**
   * <pre>
   * times in seconds
   * </pre>
   *
   * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
   */
  private void clearTimesStartedAt() {  timesStartedAt_ = null;
    bitField0_ = (bitField0_ & ~0x00000004);
  }

  public static final int TIME_SILENCE_REMOVAL_FIELD_NUMBER = 4;
  private com.google.protobuf.Int64Value timeSilenceRemoval_;
  /**
   * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
   */
  @java.lang.Override
  public boolean hasTimeSilenceRemoval() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getTimeSilenceRemoval() {
    return timeSilenceRemoval_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : timeSilenceRemoval_;
  }
  /**
   * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
   */
  private void setTimeSilenceRemoval(com.google.protobuf.Int64Value value) {
    value.getClass();
  timeSilenceRemoval_ = value;
    bitField0_ |= 0x00000008;
    }
  /**
   * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeSilenceRemoval(com.google.protobuf.Int64Value value) {
    value.getClass();
  if (timeSilenceRemoval_ != null &&
        timeSilenceRemoval_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
      timeSilenceRemoval_ =
        com.google.protobuf.Int64Value.newBuilder(timeSilenceRemoval_).mergeFrom(value).buildPartial();
    } else {
      timeSilenceRemoval_ = value;
    }
    bitField0_ |= 0x00000008;
  }
  /**
   * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
   */
  private void clearTimeSilenceRemoval() {  timeSilenceRemoval_ = null;
    bitField0_ = (bitField0_ & ~0x00000008);
  }

  public static final int TIME_VARIABLE_SPEED_FIELD_NUMBER = 5;
  private com.google.protobuf.Int64Value timeVariableSpeed_;
  /**
   * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
   */
  @java.lang.Override
  public boolean hasTimeVariableSpeed() {
    return ((bitField0_ & 0x00000010) != 0);
  }
  /**
   * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getTimeVariableSpeed() {
    return timeVariableSpeed_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : timeVariableSpeed_;
  }
  /**
   * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
   */
  private void setTimeVariableSpeed(com.google.protobuf.Int64Value value) {
    value.getClass();
  timeVariableSpeed_ = value;
    bitField0_ |= 0x00000010;
    }
  /**
   * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeVariableSpeed(com.google.protobuf.Int64Value value) {
    value.getClass();
  if (timeVariableSpeed_ != null &&
        timeVariableSpeed_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
      timeVariableSpeed_ =
        com.google.protobuf.Int64Value.newBuilder(timeVariableSpeed_).mergeFrom(value).buildPartial();
    } else {
      timeVariableSpeed_ = value;
    }
    bitField0_ |= 0x00000010;
  }
  /**
   * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
   */
  private void clearTimeVariableSpeed() {  timeVariableSpeed_ = null;
    bitField0_ = (bitField0_ & ~0x00000010);
  }

  public static final int TIME_INTRO_SKIPPING_FIELD_NUMBER = 6;
  private com.google.protobuf.Int64Value timeIntroSkipping_;
  /**
   * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
   */
  @java.lang.Override
  public boolean hasTimeIntroSkipping() {
    return ((bitField0_ & 0x00000020) != 0);
  }
  /**
   * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getTimeIntroSkipping() {
    return timeIntroSkipping_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : timeIntroSkipping_;
  }
  /**
   * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
   */
  private void setTimeIntroSkipping(com.google.protobuf.Int64Value value) {
    value.getClass();
  timeIntroSkipping_ = value;
    bitField0_ |= 0x00000020;
    }
  /**
   * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeIntroSkipping(com.google.protobuf.Int64Value value) {
    value.getClass();
  if (timeIntroSkipping_ != null &&
        timeIntroSkipping_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
      timeIntroSkipping_ =
        com.google.protobuf.Int64Value.newBuilder(timeIntroSkipping_).mergeFrom(value).buildPartial();
    } else {
      timeIntroSkipping_ = value;
    }
    bitField0_ |= 0x00000020;
  }
  /**
   * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
   */
  private void clearTimeIntroSkipping() {  timeIntroSkipping_ = null;
    bitField0_ = (bitField0_ & ~0x00000020);
  }

  public static final int TIME_SKIPPING_FIELD_NUMBER = 7;
  private com.google.protobuf.Int64Value timeSkipping_;
  /**
   * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
   */
  @java.lang.Override
  public boolean hasTimeSkipping() {
    return ((bitField0_ & 0x00000040) != 0);
  }
  /**
   * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getTimeSkipping() {
    return timeSkipping_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : timeSkipping_;
  }
  /**
   * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
   */
  private void setTimeSkipping(com.google.protobuf.Int64Value value) {
    value.getClass();
  timeSkipping_ = value;
    bitField0_ |= 0x00000040;
    }
  /**
   * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeSkipping(com.google.protobuf.Int64Value value) {
    value.getClass();
  if (timeSkipping_ != null &&
        timeSkipping_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
      timeSkipping_ =
        com.google.protobuf.Int64Value.newBuilder(timeSkipping_).mergeFrom(value).buildPartial();
    } else {
      timeSkipping_ = value;
    }
    bitField0_ |= 0x00000040;
  }
  /**
   * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
   */
  private void clearTimeSkipping() {  timeSkipping_ = null;
    bitField0_ = (bitField0_ & ~0x00000040);
  }

  public static final int TIME_LISTENED_FIELD_NUMBER = 8;
  private com.google.protobuf.Int64Value timeListened_;
  /**
   * <code>.google.protobuf.Int64Value time_listened = 8;</code>
   */
  @java.lang.Override
  public boolean hasTimeListened() {
    return ((bitField0_ & 0x00000080) != 0);
  }
  /**
   * <code>.google.protobuf.Int64Value time_listened = 8;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getTimeListened() {
    return timeListened_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : timeListened_;
  }
  /**
   * <code>.google.protobuf.Int64Value time_listened = 8;</code>
   */
  private void setTimeListened(com.google.protobuf.Int64Value value) {
    value.getClass();
  timeListened_ = value;
    bitField0_ |= 0x00000080;
    }
  /**
   * <code>.google.protobuf.Int64Value time_listened = 8;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeListened(com.google.protobuf.Int64Value value) {
    value.getClass();
  if (timeListened_ != null &&
        timeListened_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
      timeListened_ =
        com.google.protobuf.Int64Value.newBuilder(timeListened_).mergeFrom(value).buildPartial();
    } else {
      timeListened_ = value;
    }
    bitField0_ |= 0x00000080;
  }
  /**
   * <code>.google.protobuf.Int64Value time_listened = 8;</code>
   */
  private void clearTimeListened() {  timeListened_ = null;
    bitField0_ = (bitField0_ & ~0x00000080);
  }

  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static com.pocketcasts.service.api.SyncUserDevice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }

  public static com.pocketcasts.service.api.SyncUserDevice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.pocketcasts.service.api.SyncUserDevice parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.pocketcasts.service.api.SyncUserDevice prototype) {
    return DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code api.SyncUserDevice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.pocketcasts.service.api.SyncUserDevice, Builder> implements
      // @@protoc_insertion_point(builder_implements:api.SyncUserDevice)
      com.pocketcasts.service.api.SyncUserDeviceOrBuilder {
    // Construct using com.pocketcasts.service.api.SyncUserDevice.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.google.protobuf.StringValue device_id = 1;</code>
     */
    @java.lang.Override
    public boolean hasDeviceId() {
      return instance.hasDeviceId();
    }
    /**
     * <code>.google.protobuf.StringValue device_id = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.StringValue getDeviceId() {
      return instance.getDeviceId();
    }
    /**
     * <code>.google.protobuf.StringValue device_id = 1;</code>
     */
    public Builder setDeviceId(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.setDeviceId(value);
      return this;
      }
    /**
     * <code>.google.protobuf.StringValue device_id = 1;</code>
     */
    public Builder setDeviceId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      copyOnWrite();
      instance.setDeviceId(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue device_id = 1;</code>
     */
    public Builder mergeDeviceId(com.google.protobuf.StringValue value) {
      copyOnWrite();
      instance.mergeDeviceId(value);
      return this;
    }
    /**
     * <code>.google.protobuf.StringValue device_id = 1;</code>
     */
    public Builder clearDeviceId() {  copyOnWrite();
      instance.clearDeviceId();
      return this;
    }

    /**
     * <code>.google.protobuf.Int32Value device_type = 2;</code>
     */
    @java.lang.Override
    public boolean hasDeviceType() {
      return instance.hasDeviceType();
    }
    /**
     * <code>.google.protobuf.Int32Value device_type = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int32Value getDeviceType() {
      return instance.getDeviceType();
    }
    /**
     * <code>.google.protobuf.Int32Value device_type = 2;</code>
     */
    public Builder setDeviceType(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.setDeviceType(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Int32Value device_type = 2;</code>
     */
    public Builder setDeviceType(
        com.google.protobuf.Int32Value.Builder builderForValue) {
      copyOnWrite();
      instance.setDeviceType(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value device_type = 2;</code>
     */
    public Builder mergeDeviceType(com.google.protobuf.Int32Value value) {
      copyOnWrite();
      instance.mergeDeviceType(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Int32Value device_type = 2;</code>
     */
    public Builder clearDeviceType() {  copyOnWrite();
      instance.clearDeviceType();
      return this;
    }

    /**
     * <pre>
     * times in seconds
     * </pre>
     *
     * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
     */
    @java.lang.Override
    public boolean hasTimesStartedAt() {
      return instance.hasTimesStartedAt();
    }
    /**
     * <pre>
     * times in seconds
     * </pre>
     *
     * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int64Value getTimesStartedAt() {
      return instance.getTimesStartedAt();
    }
    /**
     * <pre>
     * times in seconds
     * </pre>
     *
     * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
     */
    public Builder setTimesStartedAt(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.setTimesStartedAt(value);
      return this;
      }
    /**
     * <pre>
     * times in seconds
     * </pre>
     *
     * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
     */
    public Builder setTimesStartedAt(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      copyOnWrite();
      instance.setTimesStartedAt(builderForValue.build());
      return this;
    }
    /**
     * <pre>
     * times in seconds
     * </pre>
     *
     * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
     */
    public Builder mergeTimesStartedAt(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.mergeTimesStartedAt(value);
      return this;
    }
    /**
     * <pre>
     * times in seconds
     * </pre>
     *
     * <code>.google.protobuf.Int64Value times_started_at = 3;</code>
     */
    public Builder clearTimesStartedAt() {  copyOnWrite();
      instance.clearTimesStartedAt();
      return this;
    }

    /**
     * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
     */
    @java.lang.Override
    public boolean hasTimeSilenceRemoval() {
      return instance.hasTimeSilenceRemoval();
    }
    /**
     * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int64Value getTimeSilenceRemoval() {
      return instance.getTimeSilenceRemoval();
    }
    /**
     * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
     */
    public Builder setTimeSilenceRemoval(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.setTimeSilenceRemoval(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
     */
    public Builder setTimeSilenceRemoval(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeSilenceRemoval(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
     */
    public Builder mergeTimeSilenceRemoval(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.mergeTimeSilenceRemoval(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_silence_removal = 4;</code>
     */
    public Builder clearTimeSilenceRemoval() {  copyOnWrite();
      instance.clearTimeSilenceRemoval();
      return this;
    }

    /**
     * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
     */
    @java.lang.Override
    public boolean hasTimeVariableSpeed() {
      return instance.hasTimeVariableSpeed();
    }
    /**
     * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int64Value getTimeVariableSpeed() {
      return instance.getTimeVariableSpeed();
    }
    /**
     * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
     */
    public Builder setTimeVariableSpeed(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.setTimeVariableSpeed(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
     */
    public Builder setTimeVariableSpeed(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeVariableSpeed(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
     */
    public Builder mergeTimeVariableSpeed(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.mergeTimeVariableSpeed(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_variable_speed = 5;</code>
     */
    public Builder clearTimeVariableSpeed() {  copyOnWrite();
      instance.clearTimeVariableSpeed();
      return this;
    }

    /**
     * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
     */
    @java.lang.Override
    public boolean hasTimeIntroSkipping() {
      return instance.hasTimeIntroSkipping();
    }
    /**
     * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int64Value getTimeIntroSkipping() {
      return instance.getTimeIntroSkipping();
    }
    /**
     * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
     */
    public Builder setTimeIntroSkipping(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.setTimeIntroSkipping(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
     */
    public Builder setTimeIntroSkipping(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeIntroSkipping(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
     */
    public Builder mergeTimeIntroSkipping(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.mergeTimeIntroSkipping(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_intro_skipping = 6;</code>
     */
    public Builder clearTimeIntroSkipping() {  copyOnWrite();
      instance.clearTimeIntroSkipping();
      return this;
    }

    /**
     * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
     */
    @java.lang.Override
    public boolean hasTimeSkipping() {
      return instance.hasTimeSkipping();
    }
    /**
     * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int64Value getTimeSkipping() {
      return instance.getTimeSkipping();
    }
    /**
     * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
     */
    public Builder setTimeSkipping(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.setTimeSkipping(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
     */
    public Builder setTimeSkipping(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeSkipping(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
     */
    public Builder mergeTimeSkipping(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.mergeTimeSkipping(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_skipping = 7;</code>
     */
    public Builder clearTimeSkipping() {  copyOnWrite();
      instance.clearTimeSkipping();
      return this;
    }

    /**
     * <code>.google.protobuf.Int64Value time_listened = 8;</code>
     */
    @java.lang.Override
    public boolean hasTimeListened() {
      return instance.hasTimeListened();
    }
    /**
     * <code>.google.protobuf.Int64Value time_listened = 8;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Int64Value getTimeListened() {
      return instance.getTimeListened();
    }
    /**
     * <code>.google.protobuf.Int64Value time_listened = 8;</code>
     */
    public Builder setTimeListened(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.setTimeListened(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Int64Value time_listened = 8;</code>
     */
    public Builder setTimeListened(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeListened(builderForValue.build());
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_listened = 8;</code>
     */
    public Builder mergeTimeListened(com.google.protobuf.Int64Value value) {
      copyOnWrite();
      instance.mergeTimeListened(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Int64Value time_listened = 8;</code>
     */
    public Builder clearTimeListened() {  copyOnWrite();
      instance.clearTimeListened();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:api.SyncUserDevice)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.pocketcasts.service.api.SyncUserDevice();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "deviceId_",
            "deviceType_",
            "timesStartedAt_",
            "timeSilenceRemoval_",
            "timeVariableSpeed_",
            "timeIntroSkipping_",
            "timeSkipping_",
            "timeListened_",
          };
          java.lang.String info =
              "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001" +
              "\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u1009\u0005\u0007\u1009" +
              "\u0006\b\u1009\u0007";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.pocketcasts.service.api.SyncUserDevice> parser = PARSER;
        if (parser == null) {
          synchronized (com.pocketcasts.service.api.SyncUserDevice.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.pocketcasts.service.api.SyncUserDevice>(
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


  // @@protoc_insertion_point(class_scope:api.SyncUserDevice)
  private static final com.pocketcasts.service.api.SyncUserDevice DEFAULT_INSTANCE;
  static {
    SyncUserDevice defaultInstance = new SyncUserDevice();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SyncUserDevice.class, defaultInstance);
  }

  public static com.pocketcasts.service.api.SyncUserDevice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SyncUserDevice> PARSER;

  public static com.google.protobuf.Parser<SyncUserDevice> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

