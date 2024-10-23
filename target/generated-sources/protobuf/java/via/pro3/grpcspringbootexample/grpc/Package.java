// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TextConverter.proto

package via.pro3.grpcspringbootexample.grpc;

/**
 * Protobuf type {@code Package}
 */
public  final class Package extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Package)
    PackageOrBuilder {
  // Use Package.newBuilder() to construct.
  private Package(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Package() {
    id_ = 0;
    batchNr_ = 0;
    name_ = "";
    description_ = "";
    weight_ = 0F;
    productionDate_ = "";
    expirationDate_ = "";
    productNr_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Package(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 16: {

            batchNr_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 45: {

            weight_ = input.readFloat();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            productionDate_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            expirationDate_ = s;
            break;
          }
          case 64: {

            productNr_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.internal_static_Package_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.internal_static_Package_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.pro3.grpcspringbootexample.grpc.Package.class, via.pro3.grpcspringbootexample.grpc.Package.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   * DC_ID
   * </pre>
   *
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int BATCH_NR_FIELD_NUMBER = 2;
  private int batchNr_;
  /**
   * <pre>
   * DC_ID
   * </pre>
   *
   * <code>int32 batch_nr = 2;</code>
   */
  public int getBatchNr() {
    return batchNr_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * DC_Name
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * DC_Name
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Description
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHT_FIELD_NUMBER = 5;
  private float weight_;
  /**
   * <pre>
   * Weight
   * </pre>
   *
   * <code>float weight = 5;</code>
   */
  public float getWeight() {
    return weight_;
  }

  public static final int PRODUCTION_DATE_FIELD_NUMBER = 6;
  private volatile java.lang.Object productionDate_;
  /**
   * <pre>
   * DATE (kan også være en Timestamp)
   * </pre>
   *
   * <code>string production_date = 6;</code>
   */
  public java.lang.String getProductionDate() {
    java.lang.Object ref = productionDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productionDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * DATE (kan også være en Timestamp)
   * </pre>
   *
   * <code>string production_date = 6;</code>
   */
  public com.google.protobuf.ByteString
      getProductionDateBytes() {
    java.lang.Object ref = productionDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productionDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPIRATION_DATE_FIELD_NUMBER = 7;
  private volatile java.lang.Object expirationDate_;
  /**
   * <pre>
   * DATE (kan også være en Timestamp)
   * </pre>
   *
   * <code>string expiration_date = 7;</code>
   */
  public java.lang.String getExpirationDate() {
    java.lang.Object ref = expirationDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expirationDate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * DATE (kan også være en Timestamp)
   * </pre>
   *
   * <code>string expiration_date = 7;</code>
   */
  public com.google.protobuf.ByteString
      getExpirationDateBytes() {
    java.lang.Object ref = expirationDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      expirationDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCT_NR_FIELD_NUMBER = 8;
  private int productNr_;
  /**
   * <pre>
   * DC_ID
   * </pre>
   *
   * <code>int32 product_nr = 8;</code>
   */
  public int getProductNr() {
    return productNr_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (batchNr_ != 0) {
      output.writeInt32(2, batchNr_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    if (weight_ != 0F) {
      output.writeFloat(5, weight_);
    }
    if (!getProductionDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, productionDate_);
    }
    if (!getExpirationDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, expirationDate_);
    }
    if (productNr_ != 0) {
      output.writeInt32(8, productNr_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (batchNr_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, batchNr_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
    }
    if (weight_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, weight_);
    }
    if (!getProductionDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, productionDate_);
    }
    if (!getExpirationDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, expirationDate_);
    }
    if (productNr_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(8, productNr_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.pro3.grpcspringbootexample.grpc.Package)) {
      return super.equals(obj);
    }
    via.pro3.grpcspringbootexample.grpc.Package other = (via.pro3.grpcspringbootexample.grpc.Package) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getBatchNr()
        == other.getBatchNr());
    result = result && getName()
        .equals(other.getName());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && (
        java.lang.Float.floatToIntBits(getWeight())
        == java.lang.Float.floatToIntBits(
            other.getWeight()));
    result = result && getProductionDate()
        .equals(other.getProductionDate());
    result = result && getExpirationDate()
        .equals(other.getExpirationDate());
    result = result && (getProductNr()
        == other.getProductNr());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + BATCH_NR_FIELD_NUMBER;
    hash = (53 * hash) + getBatchNr();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getWeight());
    hash = (37 * hash) + PRODUCTION_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getProductionDate().hashCode();
    hash = (37 * hash) + EXPIRATION_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getExpirationDate().hashCode();
    hash = (37 * hash) + PRODUCT_NR_FIELD_NUMBER;
    hash = (53 * hash) + getProductNr();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.pro3.grpcspringbootexample.grpc.Package parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.pro3.grpcspringbootexample.grpc.Package prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code Package}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Package)
      via.pro3.grpcspringbootexample.grpc.PackageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.internal_static_Package_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.internal_static_Package_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.pro3.grpcspringbootexample.grpc.Package.class, via.pro3.grpcspringbootexample.grpc.Package.Builder.class);
    }

    // Construct using via.pro3.grpcspringbootexample.grpc.Package.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      batchNr_ = 0;

      name_ = "";

      description_ = "";

      weight_ = 0F;

      productionDate_ = "";

      expirationDate_ = "";

      productNr_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.internal_static_Package_descriptor;
    }

    public via.pro3.grpcspringbootexample.grpc.Package getDefaultInstanceForType() {
      return via.pro3.grpcspringbootexample.grpc.Package.getDefaultInstance();
    }

    public via.pro3.grpcspringbootexample.grpc.Package build() {
      via.pro3.grpcspringbootexample.grpc.Package result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public via.pro3.grpcspringbootexample.grpc.Package buildPartial() {
      via.pro3.grpcspringbootexample.grpc.Package result = new via.pro3.grpcspringbootexample.grpc.Package(this);
      result.id_ = id_;
      result.batchNr_ = batchNr_;
      result.name_ = name_;
      result.description_ = description_;
      result.weight_ = weight_;
      result.productionDate_ = productionDate_;
      result.expirationDate_ = expirationDate_;
      result.productNr_ = productNr_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.pro3.grpcspringbootexample.grpc.Package) {
        return mergeFrom((via.pro3.grpcspringbootexample.grpc.Package)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.pro3.grpcspringbootexample.grpc.Package other) {
      if (other == via.pro3.grpcspringbootexample.grpc.Package.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (other.getBatchNr() != 0) {
        setBatchNr(other.getBatchNr());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.getWeight() != 0F) {
        setWeight(other.getWeight());
      }
      if (!other.getProductionDate().isEmpty()) {
        productionDate_ = other.productionDate_;
        onChanged();
      }
      if (!other.getExpirationDate().isEmpty()) {
        expirationDate_ = other.expirationDate_;
        onChanged();
      }
      if (other.getProductNr() != 0) {
        setProductNr(other.getProductNr());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.pro3.grpcspringbootexample.grpc.Package parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.pro3.grpcspringbootexample.grpc.Package) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private int batchNr_ ;
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 batch_nr = 2;</code>
     */
    public int getBatchNr() {
      return batchNr_;
    }
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 batch_nr = 2;</code>
     */
    public Builder setBatchNr(int value) {
      
      batchNr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 batch_nr = 2;</code>
     */
    public Builder clearBatchNr() {
      
      batchNr_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * DC_Name
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * DC_Name
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * DC_Name
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DC_Name
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DC_Name
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description
     * </pre>
     *
     * <code>string description = 4;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Description
     * </pre>
     *
     * <code>string description = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description
     * </pre>
     *
     * <code>string description = 4;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description
     * </pre>
     *
     * <code>string description = 4;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description
     * </pre>
     *
     * <code>string description = 4;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private float weight_ ;
    /**
     * <pre>
     * Weight
     * </pre>
     *
     * <code>float weight = 5;</code>
     */
    public float getWeight() {
      return weight_;
    }
    /**
     * <pre>
     * Weight
     * </pre>
     *
     * <code>float weight = 5;</code>
     */
    public Builder setWeight(float value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Weight
     * </pre>
     *
     * <code>float weight = 5;</code>
     */
    public Builder clearWeight() {
      
      weight_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object productionDate_ = "";
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string production_date = 6;</code>
     */
    public java.lang.String getProductionDate() {
      java.lang.Object ref = productionDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productionDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string production_date = 6;</code>
     */
    public com.google.protobuf.ByteString
        getProductionDateBytes() {
      java.lang.Object ref = productionDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productionDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string production_date = 6;</code>
     */
    public Builder setProductionDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productionDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string production_date = 6;</code>
     */
    public Builder clearProductionDate() {
      
      productionDate_ = getDefaultInstance().getProductionDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string production_date = 6;</code>
     */
    public Builder setProductionDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productionDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object expirationDate_ = "";
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string expiration_date = 7;</code>
     */
    public java.lang.String getExpirationDate() {
      java.lang.Object ref = expirationDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expirationDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string expiration_date = 7;</code>
     */
    public com.google.protobuf.ByteString
        getExpirationDateBytes() {
      java.lang.Object ref = expirationDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        expirationDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string expiration_date = 7;</code>
     */
    public Builder setExpirationDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      expirationDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string expiration_date = 7;</code>
     */
    public Builder clearExpirationDate() {
      
      expirationDate_ = getDefaultInstance().getExpirationDate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DATE (kan også være en Timestamp)
     * </pre>
     *
     * <code>string expiration_date = 7;</code>
     */
    public Builder setExpirationDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      expirationDate_ = value;
      onChanged();
      return this;
    }

    private int productNr_ ;
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 product_nr = 8;</code>
     */
    public int getProductNr() {
      return productNr_;
    }
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 product_nr = 8;</code>
     */
    public Builder setProductNr(int value) {
      
      productNr_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * DC_ID
     * </pre>
     *
     * <code>int32 product_nr = 8;</code>
     */
    public Builder clearProductNr() {
      
      productNr_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:Package)
  }

  // @@protoc_insertion_point(class_scope:Package)
  private static final via.pro3.grpcspringbootexample.grpc.Package DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.pro3.grpcspringbootexample.grpc.Package();
  }

  public static via.pro3.grpcspringbootexample.grpc.Package getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Package>
      PARSER = new com.google.protobuf.AbstractParser<Package>() {
    public Package parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Package(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Package> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Package> getParserForType() {
    return PARSER;
  }

  public via.pro3.grpcspringbootexample.grpc.Package getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
