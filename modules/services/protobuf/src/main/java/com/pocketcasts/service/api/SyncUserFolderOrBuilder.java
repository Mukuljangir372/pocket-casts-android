// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api.proto

// Protobuf Java Version: 3.25.1
package com.pocketcasts.service.api;

public interface SyncUserFolderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.SyncUserFolder)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string folder_uuid = 1;</code>
   * @return The folderUuid.
   */
  java.lang.String getFolderUuid();
  /**
   * <code>string folder_uuid = 1;</code>
   * @return The bytes for folderUuid.
   */
  com.google.protobuf.ByteString
      getFolderUuidBytes();

  /**
   * <code>bool is_deleted = 2;</code>
   * @return The isDeleted.
   */
  boolean getIsDeleted();

  /**
   * <code>string name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 color = 4;</code>
   * @return The color.
   */
  int getColor();

  /**
   * <code>int32 sort_position = 5;</code>
   * @return The sortPosition.
   */
  int getSortPosition();

  /**
   * <code>int32 podcasts_sort_type = 6;</code>
   * @return The podcastsSortType.
   */
  int getPodcastsSortType();

  /**
   * <code>.google.protobuf.Timestamp date_added = 7;</code>
   * @return Whether the dateAdded field is set.
   */
  boolean hasDateAdded();
  /**
   * <code>.google.protobuf.Timestamp date_added = 7;</code>
   * @return The dateAdded.
   */
  com.google.protobuf.Timestamp getDateAdded();
}
