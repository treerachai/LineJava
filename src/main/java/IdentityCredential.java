/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IdentityCredential implements org.apache.thrift.TBase<IdentityCredential, IdentityCredential._Fields>, java.io.Serializable, Cloneable, Comparable<IdentityCredential> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IdentityCredential");

  private static final org.apache.thrift.protocol.TField PROVIDER_FIELD_DESC = new org.apache.thrift.protocol.TField("provider", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IDENTIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("identifier", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IdentityCredentialStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IdentityCredentialTupleSchemeFactory());
  }

  /**
   * 
   * @see IdentityProvider
   */
  public IdentityProvider provider; // required
  public String identifier; // required
  public String password; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see IdentityProvider
     */
    PROVIDER((short)1, "provider"),
    IDENTIFIER((short)2, "identifier"),
    PASSWORD((short)3, "password");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROVIDER
          return PROVIDER;
        case 2: // IDENTIFIER
          return IDENTIFIER;
        case 3: // PASSWORD
          return PASSWORD;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROVIDER, new org.apache.thrift.meta_data.FieldMetaData("provider", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, IdentityProvider.class)));
    tmpMap.put(_Fields.IDENTIFIER, new org.apache.thrift.meta_data.FieldMetaData("identifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IdentityCredential.class, metaDataMap);
  }

  public IdentityCredential() {
  }

  public IdentityCredential(
    IdentityProvider provider,
    String identifier,
    String password)
  {
    this();
    this.provider = provider;
    this.identifier = identifier;
    this.password = password;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IdentityCredential(IdentityCredential other) {
    if (other.isSetProvider()) {
      this.provider = other.provider;
    }
    if (other.isSetIdentifier()) {
      this.identifier = other.identifier;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
  }

  public IdentityCredential deepCopy() {
    return new IdentityCredential(this);
  }

  @Override
  public void clear() {
    this.provider = null;
    this.identifier = null;
    this.password = null;
  }

  /**
   * 
   * @see IdentityProvider
   */
  public IdentityProvider getProvider() {
    return this.provider;
  }

  /**
   * 
   * @see IdentityProvider
   */
  public IdentityCredential setProvider(IdentityProvider provider) {
    this.provider = provider;
    return this;
  }

  public void unsetProvider() {
    this.provider = null;
  }

  /** Returns true if field provider is set (has been assigned a value) and false otherwise */
  public boolean isSetProvider() {
    return this.provider != null;
  }

  public void setProviderIsSet(boolean value) {
    if (!value) {
      this.provider = null;
    }
  }

  public String getIdentifier() {
    return this.identifier;
  }

  public IdentityCredential setIdentifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  public void unsetIdentifier() {
    this.identifier = null;
  }

  /** Returns true if field identifier is set (has been assigned a value) and false otherwise */
  public boolean isSetIdentifier() {
    return this.identifier != null;
  }

  public void setIdentifierIsSet(boolean value) {
    if (!value) {
      this.identifier = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public IdentityCredential setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROVIDER:
      if (value == null) {
        unsetProvider();
      } else {
        setProvider((IdentityProvider)value);
      }
      break;

    case IDENTIFIER:
      if (value == null) {
        unsetIdentifier();
      } else {
        setIdentifier((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROVIDER:
      return getProvider();

    case IDENTIFIER:
      return getIdentifier();

    case PASSWORD:
      return getPassword();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROVIDER:
      return isSetProvider();
    case IDENTIFIER:
      return isSetIdentifier();
    case PASSWORD:
      return isSetPassword();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IdentityCredential)
      return this.equals((IdentityCredential)that);
    return false;
  }

  public boolean equals(IdentityCredential that) {
    if (that == null)
      return false;

    boolean this_present_provider = true && this.isSetProvider();
    boolean that_present_provider = true && that.isSetProvider();
    if (this_present_provider || that_present_provider) {
      if (!(this_present_provider && that_present_provider))
        return false;
      if (!this.provider.equals(that.provider))
        return false;
    }

    boolean this_present_identifier = true && this.isSetIdentifier();
    boolean that_present_identifier = true && that.isSetIdentifier();
    if (this_present_identifier || that_present_identifier) {
      if (!(this_present_identifier && that_present_identifier))
        return false;
      if (!this.identifier.equals(that.identifier))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(IdentityCredential other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProvider()).compareTo(other.isSetProvider());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProvider()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.provider, other.provider);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdentifier()).compareTo(other.isSetIdentifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdentifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.identifier, other.identifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("IdentityCredential(");
    boolean first = true;

    sb.append("provider:");
    if (this.provider == null) {
      sb.append("null");
    } else {
      sb.append(this.provider);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("identifier:");
    if (this.identifier == null) {
      sb.append("null");
    } else {
      sb.append(this.identifier);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IdentityCredentialStandardSchemeFactory implements SchemeFactory {
    public IdentityCredentialStandardScheme getScheme() {
      return new IdentityCredentialStandardScheme();
    }
  }

  private static class IdentityCredentialStandardScheme extends StandardScheme<IdentityCredential> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IdentityCredential struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROVIDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.provider = IdentityProvider.findByValue(iprot.readI32());
              struct.setProviderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IDENTIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.identifier = iprot.readString();
              struct.setIdentifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, IdentityCredential struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.provider != null) {
        oprot.writeFieldBegin(PROVIDER_FIELD_DESC);
        oprot.writeI32(struct.provider.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.identifier != null) {
        oprot.writeFieldBegin(IDENTIFIER_FIELD_DESC);
        oprot.writeString(struct.identifier);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IdentityCredentialTupleSchemeFactory implements SchemeFactory {
    public IdentityCredentialTupleScheme getScheme() {
      return new IdentityCredentialTupleScheme();
    }
  }

  private static class IdentityCredentialTupleScheme extends TupleScheme<IdentityCredential> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, IdentityCredential struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetProvider()) {
        optionals.set(0);
      }
      if (struct.isSetIdentifier()) {
        optionals.set(1);
      }
      if (struct.isSetPassword()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetProvider()) {
        oprot.writeI32(struct.provider.getValue());
      }
      if (struct.isSetIdentifier()) {
        oprot.writeString(struct.identifier);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, IdentityCredential struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.provider = IdentityProvider.findByValue(iprot.readI32());
        struct.setProviderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.identifier = iprot.readString();
        struct.setIdentifierIsSet(true);
      }
      if (incoming.get(2)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
    }
  }

}
