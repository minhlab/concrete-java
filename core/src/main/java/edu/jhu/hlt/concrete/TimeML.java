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
 * A wrapper for various TimeML annotations.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class TimeML implements org.apache.thrift.TBase<TimeML, TimeML._Fields>, java.io.Serializable, Cloneable, Comparable<TimeML> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimeML");

  private static final org.apache.thrift.protocol.TField TIME_MLCLASS_FIELD_DESC = new org.apache.thrift.protocol.TField("timeMLClass", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIME_MLTENSE_FIELD_DESC = new org.apache.thrift.protocol.TField("timeMLTense", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_MLASPECT_FIELD_DESC = new org.apache.thrift.protocol.TField("timeMLAspect", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimeMLStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimeMLTupleSchemeFactory());
  }

  private String timeMLClass; // optional
  private String timeMLTense; // optional
  private String timeMLAspect; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The TimeML class for situations representing TimeML events
     */
    TIME_MLCLASS((short)1, "timeMLClass"),
    /**
     * The TimeML tense for situations representing TimeML events
     */
    TIME_MLTENSE((short)2, "timeMLTense"),
    /**
     * The TimeML aspect for situations representing TimeML events
     */
    TIME_MLASPECT((short)3, "timeMLAspect");

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
        case 1: // TIME_MLCLASS
          return TIME_MLCLASS;
        case 2: // TIME_MLTENSE
          return TIME_MLTENSE;
        case 3: // TIME_MLASPECT
          return TIME_MLASPECT;
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
  private static final _Fields optionals[] = {_Fields.TIME_MLCLASS,_Fields.TIME_MLTENSE,_Fields.TIME_MLASPECT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIME_MLCLASS, new org.apache.thrift.meta_data.FieldMetaData("timeMLClass", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_MLTENSE, new org.apache.thrift.meta_data.FieldMetaData("timeMLTense", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIME_MLASPECT, new org.apache.thrift.meta_data.FieldMetaData("timeMLAspect", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimeML.class, metaDataMap);
  }

  public TimeML() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimeML(TimeML other) {
    if (other.isSetTimeMLClass()) {
      this.timeMLClass = other.timeMLClass;
    }
    if (other.isSetTimeMLTense()) {
      this.timeMLTense = other.timeMLTense;
    }
    if (other.isSetTimeMLAspect()) {
      this.timeMLAspect = other.timeMLAspect;
    }
  }

  public TimeML deepCopy() {
    return new TimeML(this);
  }

  @Override
  public void clear() {
    this.timeMLClass = null;
    this.timeMLTense = null;
    this.timeMLAspect = null;
  }

  /**
   * The TimeML class for situations representing TimeML events
   */
  public String getTimeMLClass() {
    return this.timeMLClass;
  }

  /**
   * The TimeML class for situations representing TimeML events
   */
  public TimeML setTimeMLClass(String timeMLClass) {
    this.timeMLClass = timeMLClass;
    return this;
  }

  public void unsetTimeMLClass() {
    this.timeMLClass = null;
  }

  /** Returns true if field timeMLClass is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeMLClass() {
    return this.timeMLClass != null;
  }

  public void setTimeMLClassIsSet(boolean value) {
    if (!value) {
      this.timeMLClass = null;
    }
  }

  /**
   * The TimeML tense for situations representing TimeML events
   */
  public String getTimeMLTense() {
    return this.timeMLTense;
  }

  /**
   * The TimeML tense for situations representing TimeML events
   */
  public TimeML setTimeMLTense(String timeMLTense) {
    this.timeMLTense = timeMLTense;
    return this;
  }

  public void unsetTimeMLTense() {
    this.timeMLTense = null;
  }

  /** Returns true if field timeMLTense is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeMLTense() {
    return this.timeMLTense != null;
  }

  public void setTimeMLTenseIsSet(boolean value) {
    if (!value) {
      this.timeMLTense = null;
    }
  }

  /**
   * The TimeML aspect for situations representing TimeML events
   */
  public String getTimeMLAspect() {
    return this.timeMLAspect;
  }

  /**
   * The TimeML aspect for situations representing TimeML events
   */
  public TimeML setTimeMLAspect(String timeMLAspect) {
    this.timeMLAspect = timeMLAspect;
    return this;
  }

  public void unsetTimeMLAspect() {
    this.timeMLAspect = null;
  }

  /** Returns true if field timeMLAspect is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeMLAspect() {
    return this.timeMLAspect != null;
  }

  public void setTimeMLAspectIsSet(boolean value) {
    if (!value) {
      this.timeMLAspect = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIME_MLCLASS:
      if (value == null) {
        unsetTimeMLClass();
      } else {
        setTimeMLClass((String)value);
      }
      break;

    case TIME_MLTENSE:
      if (value == null) {
        unsetTimeMLTense();
      } else {
        setTimeMLTense((String)value);
      }
      break;

    case TIME_MLASPECT:
      if (value == null) {
        unsetTimeMLAspect();
      } else {
        setTimeMLAspect((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIME_MLCLASS:
      return getTimeMLClass();

    case TIME_MLTENSE:
      return getTimeMLTense();

    case TIME_MLASPECT:
      return getTimeMLAspect();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIME_MLCLASS:
      return isSetTimeMLClass();
    case TIME_MLTENSE:
      return isSetTimeMLTense();
    case TIME_MLASPECT:
      return isSetTimeMLAspect();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimeML)
      return this.equals((TimeML)that);
    return false;
  }

  public boolean equals(TimeML that) {
    if (that == null)
      return false;

    boolean this_present_timeMLClass = true && this.isSetTimeMLClass();
    boolean that_present_timeMLClass = true && that.isSetTimeMLClass();
    if (this_present_timeMLClass || that_present_timeMLClass) {
      if (!(this_present_timeMLClass && that_present_timeMLClass))
        return false;
      if (!this.timeMLClass.equals(that.timeMLClass))
        return false;
    }

    boolean this_present_timeMLTense = true && this.isSetTimeMLTense();
    boolean that_present_timeMLTense = true && that.isSetTimeMLTense();
    if (this_present_timeMLTense || that_present_timeMLTense) {
      if (!(this_present_timeMLTense && that_present_timeMLTense))
        return false;
      if (!this.timeMLTense.equals(that.timeMLTense))
        return false;
    }

    boolean this_present_timeMLAspect = true && this.isSetTimeMLAspect();
    boolean that_present_timeMLAspect = true && that.isSetTimeMLAspect();
    if (this_present_timeMLAspect || that_present_timeMLAspect) {
      if (!(this_present_timeMLAspect && that_present_timeMLAspect))
        return false;
      if (!this.timeMLAspect.equals(that.timeMLAspect))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_timeMLClass = true && (isSetTimeMLClass());
    list.add(present_timeMLClass);
    if (present_timeMLClass)
      list.add(timeMLClass);

    boolean present_timeMLTense = true && (isSetTimeMLTense());
    list.add(present_timeMLTense);
    if (present_timeMLTense)
      list.add(timeMLTense);

    boolean present_timeMLAspect = true && (isSetTimeMLAspect());
    list.add(present_timeMLAspect);
    if (present_timeMLAspect)
      list.add(timeMLAspect);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimeML other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimeMLClass()).compareTo(other.isSetTimeMLClass());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeMLClass()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeMLClass, other.timeMLClass);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeMLTense()).compareTo(other.isSetTimeMLTense());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeMLTense()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeMLTense, other.timeMLTense);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeMLAspect()).compareTo(other.isSetTimeMLAspect());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeMLAspect()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeMLAspect, other.timeMLAspect);
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
    StringBuilder sb = new StringBuilder("TimeML(");
    boolean first = true;

    if (isSetTimeMLClass()) {
      sb.append("timeMLClass:");
      if (this.timeMLClass == null) {
        sb.append("null");
      } else {
        sb.append(this.timeMLClass);
      }
      first = false;
    }
    if (isSetTimeMLTense()) {
      if (!first) sb.append(", ");
      sb.append("timeMLTense:");
      if (this.timeMLTense == null) {
        sb.append("null");
      } else {
        sb.append(this.timeMLTense);
      }
      first = false;
    }
    if (isSetTimeMLAspect()) {
      if (!first) sb.append(", ");
      sb.append("timeMLAspect:");
      if (this.timeMLAspect == null) {
        sb.append("null");
      } else {
        sb.append(this.timeMLAspect);
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

  private static class TimeMLStandardSchemeFactory implements SchemeFactory {
    public TimeMLStandardScheme getScheme() {
      return new TimeMLStandardScheme();
    }
  }

  private static class TimeMLStandardScheme extends StandardScheme<TimeML> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimeML struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIME_MLCLASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timeMLClass = iprot.readString();
              struct.setTimeMLClassIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIME_MLTENSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timeMLTense = iprot.readString();
              struct.setTimeMLTenseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_MLASPECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.timeMLAspect = iprot.readString();
              struct.setTimeMLAspectIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimeML struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.timeMLClass != null) {
        if (struct.isSetTimeMLClass()) {
          oprot.writeFieldBegin(TIME_MLCLASS_FIELD_DESC);
          oprot.writeString(struct.timeMLClass);
          oprot.writeFieldEnd();
        }
      }
      if (struct.timeMLTense != null) {
        if (struct.isSetTimeMLTense()) {
          oprot.writeFieldBegin(TIME_MLTENSE_FIELD_DESC);
          oprot.writeString(struct.timeMLTense);
          oprot.writeFieldEnd();
        }
      }
      if (struct.timeMLAspect != null) {
        if (struct.isSetTimeMLAspect()) {
          oprot.writeFieldBegin(TIME_MLASPECT_FIELD_DESC);
          oprot.writeString(struct.timeMLAspect);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimeMLTupleSchemeFactory implements SchemeFactory {
    public TimeMLTupleScheme getScheme() {
      return new TimeMLTupleScheme();
    }
  }

  private static class TimeMLTupleScheme extends TupleScheme<TimeML> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimeML struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTimeMLClass()) {
        optionals.set(0);
      }
      if (struct.isSetTimeMLTense()) {
        optionals.set(1);
      }
      if (struct.isSetTimeMLAspect()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTimeMLClass()) {
        oprot.writeString(struct.timeMLClass);
      }
      if (struct.isSetTimeMLTense()) {
        oprot.writeString(struct.timeMLTense);
      }
      if (struct.isSetTimeMLAspect()) {
        oprot.writeString(struct.timeMLAspect);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimeML struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.timeMLClass = iprot.readString();
        struct.setTimeMLClassIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timeMLTense = iprot.readString();
        struct.setTimeMLTenseIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timeMLAspect = iprot.readString();
        struct.setTimeMLAspectIsSet(true);
      }
    }
  }

}

