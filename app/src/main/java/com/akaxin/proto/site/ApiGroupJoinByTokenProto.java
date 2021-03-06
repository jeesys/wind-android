// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: site/api_group_joinByToken.proto

package com.akaxin.proto.site;

public final class ApiGroupJoinByTokenProto {
  private ApiGroupJoinByTokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiGroupJoinByTokenRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupJoinByTokenRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *群组id
     * </pre>
     *
     * <code>optional string site_group_id = 1;</code>
     */
    String getSiteGroupId();
    /**
     * <pre>
     *群组id
     * </pre>
     *
     * <code>optional string site_group_id = 1;</code>
     */
    com.google.protobuf.ByteString
        getSiteGroupIdBytes();

    /**
     * <pre>
     *群token
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    String getToken();
    /**
     * <pre>
     *群token
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();
  }
  /**
   * Protobuf type {@code site.ApiGroupJoinByTokenRequest}
   */
  public  static final class ApiGroupJoinByTokenRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupJoinByTokenRequest, ApiGroupJoinByTokenRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupJoinByTokenRequest)
      ApiGroupJoinByTokenRequestOrBuilder {
    private ApiGroupJoinByTokenRequest() {
      siteGroupId_ = "";
      token_ = "";
    }
    public static final int SITE_GROUP_ID_FIELD_NUMBER = 1;
    private String siteGroupId_;
    /**
     * <pre>
     *群组id
     * </pre>
     *
     * <code>optional string site_group_id = 1;</code>
     */
    public String getSiteGroupId() {
      return siteGroupId_;
    }
    /**
     * <pre>
     *群组id
     * </pre>
     *
     * <code>optional string site_group_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSiteGroupIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(siteGroupId_);
    }
    /**
     * <pre>
     *群组id
     * </pre>
     *
     * <code>optional string site_group_id = 1;</code>
     */
    private void setSiteGroupId(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      siteGroupId_ = value;
    }
    /**
     * <pre>
     *群组id
     * </pre>
     *
     * <code>optional string site_group_id = 1;</code>
     */
    private void clearSiteGroupId() {

      siteGroupId_ = getDefaultInstance().getSiteGroupId();
    }
    /**
     * <pre>
     *群组id
     * </pre>
     *
     * <code>optional string site_group_id = 1;</code>
     */
    private void setSiteGroupIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      siteGroupId_ = value.toStringUtf8();
    }

    public static final int TOKEN_FIELD_NUMBER = 2;
    private String token_;
    /**
     * <pre>
     *群token
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    public String getToken() {
      return token_;
    }
    /**
     * <pre>
     *群token
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(token_);
    }
    /**
     * <pre>
     *群token
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    private void setToken(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      token_ = value;
    }
    /**
     * <pre>
     *群token
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    private void clearToken() {

      token_ = getDefaultInstance().getToken();
    }
    /**
     * <pre>
     *群token
     * </pre>
     *
     * <code>optional string token = 2;</code>
     */
    private void setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      token_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!siteGroupId_.isEmpty()) {
        output.writeString(1, getSiteGroupId());
      }
      if (!token_.isEmpty()) {
        output.writeString(2, getToken());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!siteGroupId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSiteGroupId());
      }
      if (!token_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getToken());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupJoinByTokenRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupJoinByTokenRequest)
        com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequestOrBuilder {
      // Construct using com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *群组id
       * </pre>
       *
       * <code>optional string site_group_id = 1;</code>
       */
      public String getSiteGroupId() {
        return instance.getSiteGroupId();
      }
      /**
       * <pre>
       *群组id
       * </pre>
       *
       * <code>optional string site_group_id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getSiteGroupIdBytes() {
        return instance.getSiteGroupIdBytes();
      }
      /**
       * <pre>
       *群组id
       * </pre>
       *
       * <code>optional string site_group_id = 1;</code>
       */
      public Builder setSiteGroupId(
          String value) {
        copyOnWrite();
        instance.setSiteGroupId(value);
        return this;
      }
      /**
       * <pre>
       *群组id
       * </pre>
       *
       * <code>optional string site_group_id = 1;</code>
       */
      public Builder clearSiteGroupId() {
        copyOnWrite();
        instance.clearSiteGroupId();
        return this;
      }
      /**
       * <pre>
       *群组id
       * </pre>
       *
       * <code>optional string site_group_id = 1;</code>
       */
      public Builder setSiteGroupIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSiteGroupIdBytes(value);
        return this;
      }

      /**
       * <pre>
       *群token
       * </pre>
       *
       * <code>optional string token = 2;</code>
       */
      public String getToken() {
        return instance.getToken();
      }
      /**
       * <pre>
       *群token
       * </pre>
       *
       * <code>optional string token = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        return instance.getTokenBytes();
      }
      /**
       * <pre>
       *群token
       * </pre>
       *
       * <code>optional string token = 2;</code>
       */
      public Builder setToken(
          String value) {
        copyOnWrite();
        instance.setToken(value);
        return this;
      }
      /**
       * <pre>
       *群token
       * </pre>
       *
       * <code>optional string token = 2;</code>
       */
      public Builder clearToken() {
        copyOnWrite();
        instance.clearToken();
        return this;
      }
      /**
       * <pre>
       *群token
       * </pre>
       *
       * <code>optional string token = 2;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTokenBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiGroupJoinByTokenRequest)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest other = (com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest) arg1;
          siteGroupId_ = visitor.visitString(!siteGroupId_.isEmpty(), siteGroupId_,
              !other.siteGroupId_.isEmpty(), other.siteGroupId_);
          token_ = visitor.visitString(!token_.isEmpty(), token_,
              !other.token_.isEmpty(), other.token_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  String s = input.readStringRequireUtf8();

                  siteGroupId_ = s;
                  break;
                }
                case 18: {
                  String s = input.readStringRequireUtf8();

                  token_ = s;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiGroupJoinByTokenRequest)
    private static final com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupJoinByTokenRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupJoinByTokenRequest> PARSER;

    public static com.google.protobuf.Parser<ApiGroupJoinByTokenRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiGroupJoinByTokenResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiGroupJoinByTokenResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiGroupJoinByTokenResponse}
   */
  public  static final class ApiGroupJoinByTokenResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiGroupJoinByTokenResponse, ApiGroupJoinByTokenResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiGroupJoinByTokenResponse)
      ApiGroupJoinByTokenResponseOrBuilder {
    private ApiGroupJoinByTokenResponse() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      memoizedSerializedSize = size;
      return size;
    }

    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiGroupJoinByTokenResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiGroupJoinByTokenResponse)
        com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponseOrBuilder {
      // Construct using com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:site.ApiGroupJoinByTokenResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse other = (com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse) arg1;
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!input.skipField(tag)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:site.ApiGroupJoinByTokenResponse)
    private static final com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiGroupJoinByTokenResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static com.akaxin.proto.site.ApiGroupJoinByTokenProto.ApiGroupJoinByTokenResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiGroupJoinByTokenResponse> PARSER;

    public static com.google.protobuf.Parser<ApiGroupJoinByTokenResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
