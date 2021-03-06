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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class UserMention implements org.apache.thrift.TBase<UserMention, UserMention._Fields>, java.io.Serializable, Cloneable, Comparable<UserMention> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserMention");

  private static final org.apache.thrift.protocol.TField START_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("startOffset", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField END_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("endOffset", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField SCREEN_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("screenName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new UserMentionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new UserMentionTupleSchemeFactory());
  }

  private int startOffset; // optional
  private int endOffset; // optional
  private String screenName; // optional
  private String name; // optional
  private long id; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_OFFSET((short)1, "startOffset"),
    END_OFFSET((short)2, "endOffset"),
    SCREEN_NAME((short)4, "screenName"),
    NAME((short)5, "name"),
    ID((short)6, "id");

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
        case 1: // START_OFFSET
          return START_OFFSET;
        case 2: // END_OFFSET
          return END_OFFSET;
        case 4: // SCREEN_NAME
          return SCREEN_NAME;
        case 5: // NAME
          return NAME;
        case 6: // ID
          return ID;
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
  private static final int __STARTOFFSET_ISSET_ID = 0;
  private static final int __ENDOFFSET_ISSET_ID = 1;
  private static final int __ID_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.START_OFFSET,_Fields.END_OFFSET,_Fields.SCREEN_NAME,_Fields.NAME,_Fields.ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("startOffset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.END_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("endOffset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SCREEN_NAME, new org.apache.thrift.meta_data.FieldMetaData("screenName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserMention.class, metaDataMap);
  }

  public UserMention() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserMention(UserMention other) {
    __isset_bitfield = other.__isset_bitfield;
    this.startOffset = other.startOffset;
    this.endOffset = other.endOffset;
    if (other.isSetScreenName()) {
      this.screenName = other.screenName;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.id = other.id;
  }

  public UserMention deepCopy() {
    return new UserMention(this);
  }

  @Override
  public void clear() {
    setStartOffsetIsSet(false);
    this.startOffset = 0;
    setEndOffsetIsSet(false);
    this.endOffset = 0;
    this.screenName = null;
    this.name = null;
    setIdIsSet(false);
    this.id = 0;
  }

  public int getStartOffset() {
    return this.startOffset;
  }

  public UserMention setStartOffset(int startOffset) {
    this.startOffset = startOffset;
    setStartOffsetIsSet(true);
    return this;
  }

  public void unsetStartOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTOFFSET_ISSET_ID);
  }

  /** Returns true if field startOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetStartOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTOFFSET_ISSET_ID);
  }

  public void setStartOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTOFFSET_ISSET_ID, value);
  }

  public int getEndOffset() {
    return this.endOffset;
  }

  public UserMention setEndOffset(int endOffset) {
    this.endOffset = endOffset;
    setEndOffsetIsSet(true);
    return this;
  }

  public void unsetEndOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDOFFSET_ISSET_ID);
  }

  /** Returns true if field endOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetEndOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDOFFSET_ISSET_ID);
  }

  public void setEndOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDOFFSET_ISSET_ID, value);
  }

  public String getScreenName() {
    return this.screenName;
  }

  public UserMention setScreenName(String screenName) {
    this.screenName = screenName;
    return this;
  }

  public void unsetScreenName() {
    this.screenName = null;
  }

  /** Returns true if field screenName is set (has been assigned a value) and false otherwise */
  public boolean isSetScreenName() {
    return this.screenName != null;
  }

  public void setScreenNameIsSet(boolean value) {
    if (!value) {
      this.screenName = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public UserMention setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public long getId() {
    return this.id;
  }

  public UserMention setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_OFFSET:
      if (value == null) {
        unsetStartOffset();
      } else {
        setStartOffset((Integer)value);
      }
      break;

    case END_OFFSET:
      if (value == null) {
        unsetEndOffset();
      } else {
        setEndOffset((Integer)value);
      }
      break;

    case SCREEN_NAME:
      if (value == null) {
        unsetScreenName();
      } else {
        setScreenName((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_OFFSET:
      return getStartOffset();

    case END_OFFSET:
      return getEndOffset();

    case SCREEN_NAME:
      return getScreenName();

    case NAME:
      return getName();

    case ID:
      return getId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_OFFSET:
      return isSetStartOffset();
    case END_OFFSET:
      return isSetEndOffset();
    case SCREEN_NAME:
      return isSetScreenName();
    case NAME:
      return isSetName();
    case ID:
      return isSetId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserMention)
      return this.equals((UserMention)that);
    return false;
  }

  public boolean equals(UserMention that) {
    if (that == null)
      return false;

    boolean this_present_startOffset = true && this.isSetStartOffset();
    boolean that_present_startOffset = true && that.isSetStartOffset();
    if (this_present_startOffset || that_present_startOffset) {
      if (!(this_present_startOffset && that_present_startOffset))
        return false;
      if (this.startOffset != that.startOffset)
        return false;
    }

    boolean this_present_endOffset = true && this.isSetEndOffset();
    boolean that_present_endOffset = true && that.isSetEndOffset();
    if (this_present_endOffset || that_present_endOffset) {
      if (!(this_present_endOffset && that_present_endOffset))
        return false;
      if (this.endOffset != that.endOffset)
        return false;
    }

    boolean this_present_screenName = true && this.isSetScreenName();
    boolean that_present_screenName = true && that.isSetScreenName();
    if (this_present_screenName || that_present_screenName) {
      if (!(this_present_screenName && that_present_screenName))
        return false;
      if (!this.screenName.equals(that.screenName))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_startOffset = true && (isSetStartOffset());
    list.add(present_startOffset);
    if (present_startOffset)
      list.add(startOffset);

    boolean present_endOffset = true && (isSetEndOffset());
    list.add(present_endOffset);
    if (present_endOffset)
      list.add(endOffset);

    boolean present_screenName = true && (isSetScreenName());
    list.add(present_screenName);
    if (present_screenName)
      list.add(screenName);

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    return list.hashCode();
  }

  @Override
  public int compareTo(UserMention other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStartOffset()).compareTo(other.isSetStartOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startOffset, other.startOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndOffset()).compareTo(other.isSetEndOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endOffset, other.endOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScreenName()).compareTo(other.isSetScreenName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScreenName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.screenName, other.screenName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
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
    StringBuilder sb = new StringBuilder("UserMention(");
    boolean first = true;

    if (isSetStartOffset()) {
      sb.append("startOffset:");
      sb.append(this.startOffset);
      first = false;
    }
    if (isSetEndOffset()) {
      if (!first) sb.append(", ");
      sb.append("endOffset:");
      sb.append(this.endOffset);
      first = false;
    }
    if (isSetScreenName()) {
      if (!first) sb.append(", ");
      sb.append("screenName:");
      if (this.screenName == null) {
        sb.append("null");
      } else {
        sb.append(this.screenName);
      }
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      sb.append(this.id);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserMentionStandardSchemeFactory implements SchemeFactory {
    public UserMentionStandardScheme getScheme() {
      return new UserMentionStandardScheme();
    }
  }

  private static class UserMentionStandardScheme extends StandardScheme<UserMention> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserMention struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // START_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.startOffset = iprot.readI32();
              struct.setStartOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // END_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.endOffset = iprot.readI32();
              struct.setEndOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SCREEN_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.screenName = iprot.readString();
              struct.setScreenNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserMention struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetStartOffset()) {
        oprot.writeFieldBegin(START_OFFSET_FIELD_DESC);
        oprot.writeI32(struct.startOffset);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEndOffset()) {
        oprot.writeFieldBegin(END_OFFSET_FIELD_DESC);
        oprot.writeI32(struct.endOffset);
        oprot.writeFieldEnd();
      }
      if (struct.screenName != null) {
        if (struct.isSetScreenName()) {
          oprot.writeFieldBegin(SCREEN_NAME_FIELD_DESC);
          oprot.writeString(struct.screenName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserMentionTupleSchemeFactory implements SchemeFactory {
    public UserMentionTupleScheme getScheme() {
      return new UserMentionTupleScheme();
    }
  }

  private static class UserMentionTupleScheme extends TupleScheme<UserMention> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserMention struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStartOffset()) {
        optionals.set(0);
      }
      if (struct.isSetEndOffset()) {
        optionals.set(1);
      }
      if (struct.isSetScreenName()) {
        optionals.set(2);
      }
      if (struct.isSetName()) {
        optionals.set(3);
      }
      if (struct.isSetId()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetStartOffset()) {
        oprot.writeI32(struct.startOffset);
      }
      if (struct.isSetEndOffset()) {
        oprot.writeI32(struct.endOffset);
      }
      if (struct.isSetScreenName()) {
        oprot.writeString(struct.screenName);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserMention struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.startOffset = iprot.readI32();
        struct.setStartOffsetIsSet(true);
      }
      if (incoming.get(1)) {
        struct.endOffset = iprot.readI32();
        struct.setEndOffsetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.screenName = iprot.readString();
        struct.setScreenNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
    }
  }

}

