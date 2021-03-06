/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete;

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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * An email address, optionally accompanied by a display_name. These
 * values are typically extracted from strings such as:
 * <tt> "John Smith" &lt;john\@xyz.com&gt; </tt>.
 * 
 * \see RFC2822 http://tools.ietf.org/html/rfc2822
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class EmailAddress implements org.apache.thrift.TBase<EmailAddress, EmailAddress._Fields>, java.io.Serializable, Cloneable, Comparable<EmailAddress> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EmailAddress");

  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EmailAddressStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EmailAddressTupleSchemeFactory());
  }

  private String address; // optional
  private String displayName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADDRESS((short)1, "address"),
    DISPLAY_NAME((short)2, "displayName");

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
        case 1: // ADDRESS
          return ADDRESS;
        case 2: // DISPLAY_NAME
          return DISPLAY_NAME;
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
  private static final _Fields optionals[] = {_Fields.ADDRESS,_Fields.DISPLAY_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EmailAddress.class, metaDataMap);
  }

  public EmailAddress() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EmailAddress(EmailAddress other) {
    if (other.isSetAddress()) {
      this.address = other.address;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
  }

  public EmailAddress deepCopy() {
    return new EmailAddress(this);
  }

  @Override
  public void clear() {
    this.address = null;
    this.displayName = null;
  }

  public String getAddress() {
    return this.address;
  }

  public EmailAddress setAddress(String address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public EmailAddress setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADDRESS:
      return getAddress();

    case DISPLAY_NAME:
      return getDisplayName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADDRESS:
      return isSetAddress();
    case DISPLAY_NAME:
      return isSetDisplayName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EmailAddress)
      return this.equals((EmailAddress)that);
    return false;
  }

  public boolean equals(EmailAddress that) {
    if (that == null)
      return false;

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_address = true && (isSetAddress());
    list.add(present_address);
    if (present_address)
      list.add(address);

    boolean present_displayName = true && (isSetDisplayName());
    list.add(present_displayName);
    if (present_displayName)
      list.add(displayName);

    return list.hashCode();
  }

  @Override
  public int compareTo(EmailAddress other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayName()).compareTo(other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayName, other.displayName);
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
    StringBuilder sb = new StringBuilder("EmailAddress(");
    boolean first = true;

    if (isSetAddress()) {
      sb.append("address:");
      if (this.address == null) {
        sb.append("null");
      } else {
        sb.append(this.address);
      }
      first = false;
    }
    if (isSetDisplayName()) {
      if (!first) sb.append(", ");
      sb.append("displayName:");
      if (this.displayName == null) {
        sb.append("null");
      } else {
        sb.append(this.displayName);
      }
      first = false;
    }
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

  private static class EmailAddressStandardSchemeFactory implements SchemeFactory {
    public EmailAddressStandardScheme getScheme() {
      return new EmailAddressStandardScheme();
    }
  }

  private static class EmailAddressStandardScheme extends StandardScheme<EmailAddress> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EmailAddress struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.address = iprot.readString();
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EmailAddress struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.address != null) {
        if (struct.isSetAddress()) {
          oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
          oprot.writeString(struct.address);
          oprot.writeFieldEnd();
        }
      }
      if (struct.displayName != null) {
        if (struct.isSetDisplayName()) {
          oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
          oprot.writeString(struct.displayName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EmailAddressTupleSchemeFactory implements SchemeFactory {
    public EmailAddressTupleScheme getScheme() {
      return new EmailAddressTupleScheme();
    }
  }

  private static class EmailAddressTupleScheme extends TupleScheme<EmailAddress> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EmailAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAddress()) {
        optionals.set(0);
      }
      if (struct.isSetDisplayName()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAddress()) {
        oprot.writeString(struct.address);
      }
      if (struct.isSetDisplayName()) {
        oprot.writeString(struct.displayName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EmailAddress struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.address = iprot.readString();
        struct.setAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.displayName = iprot.readString();
        struct.setDisplayNameIsSet(true);
      }
    }
  }

}

