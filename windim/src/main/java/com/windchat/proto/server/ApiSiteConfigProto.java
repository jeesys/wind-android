// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: server/api_site_config.proto

package com.windchat.proto.server;

public final class ApiSiteConfigProto {
  private ApiSiteConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ApiSiteConfigRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiSiteConfigRequest)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code site.ApiSiteConfigRequest}
   */
  public  static final class ApiSiteConfigRequest extends
      com.google.protobuf.GeneratedMessageLite<
          ApiSiteConfigRequest, ApiSiteConfigRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiSiteConfigRequest)
      ApiSiteConfigRequestOrBuilder {
    private ApiSiteConfigRequest() {
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

    public static ApiSiteConfigRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSiteConfigRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSiteConfigRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSiteConfigRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSiteConfigRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSiteConfigRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSiteConfigRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiSiteConfigRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSiteConfigRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSiteConfigRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiSiteConfigRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiSiteConfigRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiSiteConfigRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiSiteConfigRequest)
        ApiSiteConfigRequestOrBuilder {
      // Construct using com.windchat.proto.server.ApiSiteConfigProto.ApiSiteConfigRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:site.ApiSiteConfigRequest)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiSiteConfigRequest();
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
          ApiSiteConfigRequest other = (ApiSiteConfigRequest) arg1;
          if (visitor == MergeFromVisitor
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
          if (PARSER == null) {    synchronized (ApiSiteConfigRequest.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiSiteConfigRequest)
    private static final ApiSiteConfigRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiSiteConfigRequest();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiSiteConfigRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiSiteConfigRequest> PARSER;

    public static com.google.protobuf.Parser<ApiSiteConfigRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ApiSiteConfigResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:site.ApiSiteConfigResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    boolean hasSiteConfig();
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    com.windchat.proto.core.ConfigProto.SiteConfig getSiteConfig();
  }
  /**
   * Protobuf type {@code site.ApiSiteConfigResponse}
   */
  public  static final class ApiSiteConfigResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ApiSiteConfigResponse, ApiSiteConfigResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:site.ApiSiteConfigResponse)
      ApiSiteConfigResponseOrBuilder {
    private ApiSiteConfigResponse() {
    }
    public static final int SITE_CONFIG_FIELD_NUMBER = 1;
    private com.windchat.proto.core.ConfigProto.SiteConfig siteConfig_;
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    public boolean hasSiteConfig() {
      return siteConfig_ != null;
    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    public com.windchat.proto.core.ConfigProto.SiteConfig getSiteConfig() {
      return siteConfig_ == null ? com.windchat.proto.core.ConfigProto.SiteConfig.getDefaultInstance() : siteConfig_;
    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    private void setSiteConfig(com.windchat.proto.core.ConfigProto.SiteConfig value) {
      if (value == null) {
        throw new NullPointerException();
      }
      siteConfig_ = value;

      }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    private void setSiteConfig(
        com.windchat.proto.core.ConfigProto.SiteConfig.Builder builderForValue) {
      siteConfig_ = builderForValue.build();

    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    private void mergeSiteConfig(com.windchat.proto.core.ConfigProto.SiteConfig value) {
      if (siteConfig_ != null &&
          siteConfig_ != com.windchat.proto.core.ConfigProto.SiteConfig.getDefaultInstance()) {
        siteConfig_ =
          com.windchat.proto.core.ConfigProto.SiteConfig.newBuilder(siteConfig_).mergeFrom(value).buildPartial();
      } else {
        siteConfig_ = value;
      }

    }
    /**
     * <pre>
     *信息配置，Key为SiteConfigKey
     * </pre>
     *
     * <code>optional .core.SiteConfig site_config = 1;</code>
     */
    private void clearSiteConfig() {  siteConfig_ = null;

    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (siteConfig_ != null) {
        output.writeMessage(1, getSiteConfig());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (siteConfig_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getSiteConfig());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static ApiSiteConfigResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSiteConfigResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSiteConfigResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static ApiSiteConfigResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static ApiSiteConfigResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSiteConfigResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSiteConfigResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static ApiSiteConfigResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static ApiSiteConfigResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static ApiSiteConfigResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ApiSiteConfigResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code site.ApiSiteConfigResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ApiSiteConfigResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:site.ApiSiteConfigResponse)
        ApiSiteConfigResponseOrBuilder {
      // Construct using com.windchat.proto.server.ApiSiteConfigProto.ApiSiteConfigResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteConfig site_config = 1;</code>
       */
      public boolean hasSiteConfig() {
        return instance.hasSiteConfig();
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteConfig site_config = 1;</code>
       */
      public com.windchat.proto.core.ConfigProto.SiteConfig getSiteConfig() {
        return instance.getSiteConfig();
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteConfig site_config = 1;</code>
       */
      public Builder setSiteConfig(com.windchat.proto.core.ConfigProto.SiteConfig value) {
        copyOnWrite();
        instance.setSiteConfig(value);
        return this;
        }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteConfig site_config = 1;</code>
       */
      public Builder setSiteConfig(
          com.windchat.proto.core.ConfigProto.SiteConfig.Builder builderForValue) {
        copyOnWrite();
        instance.setSiteConfig(builderForValue);
        return this;
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteConfig site_config = 1;</code>
       */
      public Builder mergeSiteConfig(com.windchat.proto.core.ConfigProto.SiteConfig value) {
        copyOnWrite();
        instance.mergeSiteConfig(value);
        return this;
      }
      /**
       * <pre>
       *信息配置，Key为SiteConfigKey
       * </pre>
       *
       * <code>optional .core.SiteConfig site_config = 1;</code>
       */
      public Builder clearSiteConfig() {  copyOnWrite();
        instance.clearSiteConfig();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:site.ApiSiteConfigResponse)
    }
    protected final Object dynamicMethod(
        MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new ApiSiteConfigResponse();
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
          ApiSiteConfigResponse other = (ApiSiteConfigResponse) arg1;
          siteConfig_ = visitor.visitMessage(siteConfig_, other.siteConfig_);
          if (visitor == MergeFromVisitor
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
                  com.windchat.proto.core.ConfigProto.SiteConfig.Builder subBuilder = null;
                  if (siteConfig_ != null) {
                    subBuilder = siteConfig_.toBuilder();
                  }
                  siteConfig_ = input.readMessage(com.windchat.proto.core.ConfigProto.SiteConfig.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(siteConfig_);
                    siteConfig_ = subBuilder.buildPartial();
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
          if (PARSER == null) {    synchronized (ApiSiteConfigResponse.class) {
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


    // @@protoc_insertion_point(class_scope:site.ApiSiteConfigResponse)
    private static final ApiSiteConfigResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ApiSiteConfigResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static ApiSiteConfigResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ApiSiteConfigResponse> PARSER;

    public static com.google.protobuf.Parser<ApiSiteConfigResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
