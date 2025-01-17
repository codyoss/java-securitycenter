/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for creating a source.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1beta1.CreateSourceRequest}
 */
public final class CreateSourceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1beta1.CreateSourceRequest)
    CreateSourceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSourceRequest.newBuilder() to construct.
  private CreateSourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSourceRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateSourceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.securitycenter.v1beta1.Source.Builder subBuilder = null;
              if (source_ != null) {
                subBuilder = source_.toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloud.securitycenter.v1beta1.Source.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(source_);
                source_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1beta1_CreateSourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1beta1_CreateSourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1beta1.CreateSourceRequest.class,
            com.google.cloud.securitycenter.v1beta1.CreateSourceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_FIELD_NUMBER = 2;
  private com.google.cloud.securitycenter.v1beta1.Source source_;
  /**
   *
   *
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
   */
  public boolean hasSource() {
    return source_ != null;
  }
  /**
   *
   *
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
   */
  public com.google.cloud.securitycenter.v1beta1.Source getSource() {
    return source_ == null
        ? com.google.cloud.securitycenter.v1beta1.Source.getDefaultInstance()
        : source_;
  }
  /**
   *
   *
   * <pre>
   * The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
   */
  public com.google.cloud.securitycenter.v1beta1.SourceOrBuilder getSourceOrBuilder() {
    return getSource();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (source_ != null) {
      output.writeMessage(2, getSource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (source_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSource());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.securitycenter.v1beta1.CreateSourceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1beta1.CreateSourceRequest other =
        (com.google.cloud.securitycenter.v1beta1.CreateSourceRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource().equals(other.getSource())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.securitycenter.v1beta1.CreateSourceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for creating a source.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1beta1.CreateSourceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1beta1.CreateSourceRequest)
      com.google.cloud.securitycenter.v1beta1.CreateSourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_CreateSourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_CreateSourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1beta1.CreateSourceRequest.class,
              com.google.cloud.securitycenter.v1beta1.CreateSourceRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1beta1.CreateSourceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (sourceBuilder_ == null) {
        source_ = null;
      } else {
        source_ = null;
        sourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1beta1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1beta1_CreateSourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.CreateSourceRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1beta1.CreateSourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.CreateSourceRequest build() {
      com.google.cloud.securitycenter.v1beta1.CreateSourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1beta1.CreateSourceRequest buildPartial() {
      com.google.cloud.securitycenter.v1beta1.CreateSourceRequest result =
          new com.google.cloud.securitycenter.v1beta1.CreateSourceRequest(this);
      result.parent_ = parent_;
      if (sourceBuilder_ == null) {
        result.source_ = source_;
      } else {
        result.source_ = sourceBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.securitycenter.v1beta1.CreateSourceRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1beta1.CreateSourceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1beta1.CreateSourceRequest other) {
      if (other == com.google.cloud.securitycenter.v1beta1.CreateSourceRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasSource()) {
        mergeSource(other.getSource());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.securitycenter.v1beta1.CreateSourceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.securitycenter.v1beta1.CreateSourceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.securitycenter.v1beta1.Source source_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1beta1.Source,
            com.google.cloud.securitycenter.v1beta1.Source.Builder,
            com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>
        sourceBuilder_;
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public boolean hasSource() {
      return sourceBuilder_ != null || source_ != null;
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.Source getSource() {
      if (sourceBuilder_ == null) {
        return source_ == null
            ? com.google.cloud.securitycenter.v1beta1.Source.getDefaultInstance()
            : source_;
      } else {
        return sourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public Builder setSource(com.google.cloud.securitycenter.v1beta1.Source value) {
      if (sourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        sourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public Builder setSource(
        com.google.cloud.securitycenter.v1beta1.Source.Builder builderForValue) {
      if (sourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        sourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public Builder mergeSource(com.google.cloud.securitycenter.v1beta1.Source value) {
      if (sourceBuilder_ == null) {
        if (source_ != null) {
          source_ =
              com.google.cloud.securitycenter.v1beta1.Source.newBuilder(source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        sourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public Builder clearSource() {
      if (sourceBuilder_ == null) {
        source_ = null;
        onChanged();
      } else {
        source_ = null;
        sourceBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.Source.Builder getSourceBuilder() {

      onChanged();
      return getSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    public com.google.cloud.securitycenter.v1beta1.SourceOrBuilder getSourceOrBuilder() {
      if (sourceBuilder_ != null) {
        return sourceBuilder_.getMessageOrBuilder();
      } else {
        return source_ == null
            ? com.google.cloud.securitycenter.v1beta1.Source.getDefaultInstance()
            : source_;
      }
    }
    /**
     *
     *
     * <pre>
     * The Source being created, only the display_name and description will be
     * used. All other fields will be ignored.
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v1beta1.Source source = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1beta1.Source,
            com.google.cloud.securitycenter.v1beta1.Source.Builder,
            com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>
        getSourceFieldBuilder() {
      if (sourceBuilder_ == null) {
        sourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1beta1.Source,
                com.google.cloud.securitycenter.v1beta1.Source.Builder,
                com.google.cloud.securitycenter.v1beta1.SourceOrBuilder>(
                getSource(), getParentForChildren(), isClean());
        source_ = null;
      }
      return sourceBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1beta1.CreateSourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1beta1.CreateSourceRequest)
  private static final com.google.cloud.securitycenter.v1beta1.CreateSourceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1beta1.CreateSourceRequest();
  }

  public static com.google.cloud.securitycenter.v1beta1.CreateSourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSourceRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSourceRequest>() {
        @java.lang.Override
        public CreateSourceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateSourceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateSourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1beta1.CreateSourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
