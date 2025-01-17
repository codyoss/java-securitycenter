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
// source: google/cloud/securitycenter/v1/run_asset_discovery_response.proto

package com.google.cloud.securitycenter.v1;

public final class RunAssetDiscoveryResponseOuterClass {
  private RunAssetDiscoveryResponseOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v1_RunAssetDiscoveryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_RunAssetDiscoveryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/cloud/securitycenter/v1/run_ass"
          + "et_discovery_response.proto\022\036google.clou"
          + "d.securitycenter.v1\032\036google/protobuf/dur"
          + "ation.proto\032\037google/protobuf/timestamp.p"
          + "roto\032\034google/api/annotations.proto\"\347\001\n\031R"
          + "unAssetDiscoveryResponse\022N\n\005state\030\001 \001(\0162"
          + "?.google.cloud.securitycenter.v1.RunAsse"
          + "tDiscoveryResponse.State\022+\n\010duration\030\002 \001"
          + "(\0132\031.google.protobuf.Duration\"M\n\005State\022\025"
          + "\n\021STATE_UNSPECIFIED\020\000\022\r\n\tCOMPLETED\020\001\022\016\n\n"
          + "SUPERSEDED\020\002\022\016\n\nTERMINATED\020\003B\332\001\n\"com.goo"
          + "gle.cloud.securitycenter.v1P\001ZLgoogle.go"
          + "lang.org/genproto/googleapis/cloud/secur"
          + "itycenter/v1;securitycenter\252\002\036Google.Clo"
          + "ud.SecurityCenter.V1\312\002\036Google\\Cloud\\Secu"
          + "rityCenter\\V1\352\002!Google::Cloud::SecurityC"
          + "enter::V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_securitycenter_v1_RunAssetDiscoveryResponse_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_RunAssetDiscoveryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v1_RunAssetDiscoveryResponse_descriptor,
            new java.lang.String[] {
              "State", "Duration",
            });
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
