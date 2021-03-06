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
public class HashTag implements org.apache.thrift.TBase<HashTag, HashTag._Fields>, java.io.Serializable, Cloneable, Comparable<HashTag> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HashTag");

  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField START_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("startOffset", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField END_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("endOffset", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HashTagStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HashTagTupleSchemeFactory());
  }

  private String text; // optional
  private int startOffset; // optional
  private int endOffset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEXT((short)1, "text"),
    START_OFFSET((short)2, "startOffset"),
    END_OFFSET((short)3, "endOffset");

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
        case 1: // TEXT
          return TEXT;
        case 2: // START_OFFSET
          return START_OFFSET;
        case 3: // END_OFFSET
          return END_OFFSET;
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
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TEXT,_Fields.START_OFFSET,_Fields.END_OFFSET};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.START_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("startOffset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.END_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("endOffset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HashTag.class, metaDataMap);
  }

  public HashTag() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HashTag(HashTag other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetText()) {
      this.text = other.text;
    }
    this.startOffset = other.startOffset;
    this.endOffset = other.endOffset;
  }

  public HashTag deepCopy() {
    return new HashTag(this);
  }

  @Override
  public void clear() {
    this.text = null;
    setStartOffsetIsSet(false);
    this.startOffset = 0;
    setEndOffsetIsSet(false);
    this.endOffset = 0;
  }

  public String getText() {
    return this.text;
  }

  public HashTag setText(String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  public int getStartOffset() {
    return this.startOffset;
  }

  public HashTag setStartOffset(int startOffset) {
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

  public HashTag setEndOffset(int endOffset) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

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

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TEXT:
      return getText();

    case START_OFFSET:
      return getStartOffset();

    case END_OFFSET:
      return getEndOffset();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TEXT:
      return isSetText();
    case START_OFFSET:
      return isSetStartOffset();
    case END_OFFSET:
      return isSetEndOffset();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HashTag)
      return this.equals((HashTag)that);
    return false;
  }

  public boolean equals(HashTag that) {
    if (that == null)
      return false;

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

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

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_text = true && (isSetText());
    list.add(present_text);
    if (present_text)
      list.add(text);

    boolean present_startOffset = true && (isSetStartOffset());
    list.add(present_startOffset);
    if (present_startOffset)
      list.add(startOffset);

    boolean present_endOffset = true && (isSetEndOffset());
    list.add(present_endOffset);
    if (present_endOffset)
      list.add(endOffset);

    return list.hashCode();
  }

  @Override
  public int compareTo(HashTag other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetText()).compareTo(other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("HashTag(");
    boolean first = true;

    if (isSetText()) {
      sb.append("text:");
      if (this.text == null) {
        sb.append("null");
      } else {
        sb.append(this.text);
      }
      first = false;
    }
    if (isSetStartOffset()) {
      if (!first) sb.append(", ");
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

  private static class HashTagStandardSchemeFactory implements SchemeFactory {
    public HashTagStandardScheme getScheme() {
      return new HashTagStandardScheme();
    }
  }

  private static class HashTagStandardScheme extends StandardScheme<HashTag> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HashTag struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.startOffset = iprot.readI32();
              struct.setStartOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // END_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.endOffset = iprot.readI32();
              struct.setEndOffsetIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HashTag struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.text != null) {
        if (struct.isSetText()) {
          oprot.writeFieldBegin(TEXT_FIELD_DESC);
          oprot.writeString(struct.text);
          oprot.writeFieldEnd();
        }
      }
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HashTagTupleSchemeFactory implements SchemeFactory {
    public HashTagTupleScheme getScheme() {
      return new HashTagTupleScheme();
    }
  }

  private static class HashTagTupleScheme extends TupleScheme<HashTag> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HashTag struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetText()) {
        optionals.set(0);
      }
      if (struct.isSetStartOffset()) {
        optionals.set(1);
      }
      if (struct.isSetEndOffset()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
      if (struct.isSetStartOffset()) {
        oprot.writeI32(struct.startOffset);
      }
      if (struct.isSetEndOffset()) {
        oprot.writeI32(struct.endOffset);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HashTag struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startOffset = iprot.readI32();
        struct.setStartOffsetIsSet(true);
      }
      if (incoming.get(2)) {
        struct.endOffset = iprot.readI32();
        struct.setEndOffsetIsSet(true);
      }
    }
  }

}

