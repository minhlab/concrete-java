/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete.learn;

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
 * Annotation task including information for pulling data.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class AnnotationTask implements org.apache.thrift.TBase<AnnotationTask, AnnotationTask._Fields>, java.io.Serializable, Cloneable, Comparable<AnnotationTask> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnnotationTask");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LANGUAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("language", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField UNIT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("unitType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField UNITS_FIELD_DESC = new org.apache.thrift.protocol.TField("units", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnnotationTaskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnnotationTaskTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.services.AnnotationTaskType type; // required
  private String language; // optional
  private edu.jhu.hlt.concrete.services.AnnotationUnitType unitType; // required
  private List<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier> units; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Type of annotation task
     * 
     * @see edu.jhu.hlt.concrete.services.AnnotationTaskType
     */
    TYPE((short)1, "type"),
    /**
     * Language of the data for the task
     */
    LANGUAGE((short)2, "language"),
    /**
     * Entire communication or individual sentences
     * 
     * @see edu.jhu.hlt.concrete.services.AnnotationUnitType
     */
    UNIT_TYPE((short)3, "unitType"),
    /**
     * Identifiers for each annotation unit
     */
    UNITS((short)4, "units");

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
        case 1: // TYPE
          return TYPE;
        case 2: // LANGUAGE
          return LANGUAGE;
        case 3: // UNIT_TYPE
          return UNIT_TYPE;
        case 4: // UNITS
          return UNITS;
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
  private static final _Fields optionals[] = {_Fields.LANGUAGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, edu.jhu.hlt.concrete.services.AnnotationTaskType.class)));
    tmpMap.put(_Fields.LANGUAGE, new org.apache.thrift.meta_data.FieldMetaData("language", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNIT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("unitType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, edu.jhu.hlt.concrete.services.AnnotationUnitType.class)));
    tmpMap.put(_Fields.UNITS, new org.apache.thrift.meta_data.FieldMetaData("units", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnnotationTask.class, metaDataMap);
  }

  public AnnotationTask() {
  }

  public AnnotationTask(
    edu.jhu.hlt.concrete.services.AnnotationTaskType type,
    edu.jhu.hlt.concrete.services.AnnotationUnitType unitType,
    List<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier> units)
  {
    this();
    this.type = type;
    this.unitType = unitType;
    this.units = units;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnnotationTask(AnnotationTask other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetLanguage()) {
      this.language = other.language;
    }
    if (other.isSetUnitType()) {
      this.unitType = other.unitType;
    }
    if (other.isSetUnits()) {
      List<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier> __this__units = new ArrayList<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier>(other.units.size());
      for (edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier other_element : other.units) {
        __this__units.add(new edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier(other_element));
      }
      this.units = __this__units;
    }
  }

  public AnnotationTask deepCopy() {
    return new AnnotationTask(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.language = null;
    this.unitType = null;
    this.units = null;
  }

  /**
   * Type of annotation task
   * 
   * @see edu.jhu.hlt.concrete.services.AnnotationTaskType
   */
  public edu.jhu.hlt.concrete.services.AnnotationTaskType getType() {
    return this.type;
  }

  /**
   * Type of annotation task
   * 
   * @see edu.jhu.hlt.concrete.services.AnnotationTaskType
   */
  public AnnotationTask setType(edu.jhu.hlt.concrete.services.AnnotationTaskType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * Language of the data for the task
   */
  public String getLanguage() {
    return this.language;
  }

  /**
   * Language of the data for the task
   */
  public AnnotationTask setLanguage(String language) {
    this.language = language;
    return this;
  }

  public void unsetLanguage() {
    this.language = null;
  }

  /** Returns true if field language is set (has been assigned a value) and false otherwise */
  public boolean isSetLanguage() {
    return this.language != null;
  }

  public void setLanguageIsSet(boolean value) {
    if (!value) {
      this.language = null;
    }
  }

  /**
   * Entire communication or individual sentences
   * 
   * @see edu.jhu.hlt.concrete.services.AnnotationUnitType
   */
  public edu.jhu.hlt.concrete.services.AnnotationUnitType getUnitType() {
    return this.unitType;
  }

  /**
   * Entire communication or individual sentences
   * 
   * @see edu.jhu.hlt.concrete.services.AnnotationUnitType
   */
  public AnnotationTask setUnitType(edu.jhu.hlt.concrete.services.AnnotationUnitType unitType) {
    this.unitType = unitType;
    return this;
  }

  public void unsetUnitType() {
    this.unitType = null;
  }

  /** Returns true if field unitType is set (has been assigned a value) and false otherwise */
  public boolean isSetUnitType() {
    return this.unitType != null;
  }

  public void setUnitTypeIsSet(boolean value) {
    if (!value) {
      this.unitType = null;
    }
  }

  public int getUnitsSize() {
    return (this.units == null) ? 0 : this.units.size();
  }

  public java.util.Iterator<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier> getUnitsIterator() {
    return (this.units == null) ? null : this.units.iterator();
  }

  public void addToUnits(edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier elem) {
    if (this.units == null) {
      this.units = new ArrayList<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier>();
    }
    this.units.add(elem);
  }

  /**
   * Identifiers for each annotation unit
   */
  public List<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier> getUnits() {
    return this.units;
  }

  /**
   * Identifiers for each annotation unit
   */
  public AnnotationTask setUnits(List<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier> units) {
    this.units = units;
    return this;
  }

  public void unsetUnits() {
    this.units = null;
  }

  /** Returns true if field units is set (has been assigned a value) and false otherwise */
  public boolean isSetUnits() {
    return this.units != null;
  }

  public void setUnitsIsSet(boolean value) {
    if (!value) {
      this.units = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((edu.jhu.hlt.concrete.services.AnnotationTaskType)value);
      }
      break;

    case LANGUAGE:
      if (value == null) {
        unsetLanguage();
      } else {
        setLanguage((String)value);
      }
      break;

    case UNIT_TYPE:
      if (value == null) {
        unsetUnitType();
      } else {
        setUnitType((edu.jhu.hlt.concrete.services.AnnotationUnitType)value);
      }
      break;

    case UNITS:
      if (value == null) {
        unsetUnits();
      } else {
        setUnits((List<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case LANGUAGE:
      return getLanguage();

    case UNIT_TYPE:
      return getUnitType();

    case UNITS:
      return getUnits();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case LANGUAGE:
      return isSetLanguage();
    case UNIT_TYPE:
      return isSetUnitType();
    case UNITS:
      return isSetUnits();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnnotationTask)
      return this.equals((AnnotationTask)that);
    return false;
  }

  public boolean equals(AnnotationTask that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_language = true && this.isSetLanguage();
    boolean that_present_language = true && that.isSetLanguage();
    if (this_present_language || that_present_language) {
      if (!(this_present_language && that_present_language))
        return false;
      if (!this.language.equals(that.language))
        return false;
    }

    boolean this_present_unitType = true && this.isSetUnitType();
    boolean that_present_unitType = true && that.isSetUnitType();
    if (this_present_unitType || that_present_unitType) {
      if (!(this_present_unitType && that_present_unitType))
        return false;
      if (!this.unitType.equals(that.unitType))
        return false;
    }

    boolean this_present_units = true && this.isSetUnits();
    boolean that_present_units = true && that.isSetUnits();
    if (this_present_units || that_present_units) {
      if (!(this_present_units && that_present_units))
        return false;
      if (!this.units.equals(that.units))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_language = true && (isSetLanguage());
    list.add(present_language);
    if (present_language)
      list.add(language);

    boolean present_unitType = true && (isSetUnitType());
    list.add(present_unitType);
    if (present_unitType)
      list.add(unitType.getValue());

    boolean present_units = true && (isSetUnits());
    list.add(present_units);
    if (present_units)
      list.add(units);

    return list.hashCode();
  }

  @Override
  public int compareTo(AnnotationTask other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLanguage()).compareTo(other.isSetLanguage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLanguage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.language, other.language);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnitType()).compareTo(other.isSetUnitType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnitType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unitType, other.unitType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnits()).compareTo(other.isSetUnits());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnits()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.units, other.units);
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
    StringBuilder sb = new StringBuilder("AnnotationTask(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetLanguage()) {
      if (!first) sb.append(", ");
      sb.append("language:");
      if (this.language == null) {
        sb.append("null");
      } else {
        sb.append(this.language);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("unitType:");
    if (this.unitType == null) {
      sb.append("null");
    } else {
      sb.append(this.unitType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("units:");
    if (this.units == null) {
      sb.append("null");
    } else {
      sb.append(this.units);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    if (unitType == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'unitType' was not present! Struct: " + toString());
    }
    if (units == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'units' was not present! Struct: " + toString());
    }
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

  private static class AnnotationTaskStandardSchemeFactory implements SchemeFactory {
    public AnnotationTaskStandardScheme getScheme() {
      return new AnnotationTaskStandardScheme();
    }
  }

  private static class AnnotationTaskStandardScheme extends StandardScheme<AnnotationTask> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AnnotationTask struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = edu.jhu.hlt.concrete.services.AnnotationTaskType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LANGUAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.language = iprot.readString();
              struct.setLanguageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UNIT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.unitType = edu.jhu.hlt.concrete.services.AnnotationUnitType.findByValue(iprot.readI32());
              struct.setUnitTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UNITS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.units = new ArrayList<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier>(_list0.size);
                edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier();
                  _elem1.read(iprot);
                  struct.units.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setUnitsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AnnotationTask struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.language != null) {
        if (struct.isSetLanguage()) {
          oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
          oprot.writeString(struct.language);
          oprot.writeFieldEnd();
        }
      }
      if (struct.unitType != null) {
        oprot.writeFieldBegin(UNIT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.unitType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.units != null) {
        oprot.writeFieldBegin(UNITS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.units.size()));
          for (edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier _iter3 : struct.units)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnnotationTaskTupleSchemeFactory implements SchemeFactory {
    public AnnotationTaskTupleScheme getScheme() {
      return new AnnotationTaskTupleScheme();
    }
  }

  private static class AnnotationTaskTupleScheme extends TupleScheme<AnnotationTask> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AnnotationTask struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.type.getValue());
      oprot.writeI32(struct.unitType.getValue());
      {
        oprot.writeI32(struct.units.size());
        for (edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier _iter4 : struct.units)
        {
          _iter4.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetLanguage()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLanguage()) {
        oprot.writeString(struct.language);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AnnotationTask struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.type = edu.jhu.hlt.concrete.services.AnnotationTaskType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      struct.unitType = edu.jhu.hlt.concrete.services.AnnotationUnitType.findByValue(iprot.readI32());
      struct.setUnitTypeIsSet(true);
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.units = new ArrayList<edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier>(_list5.size);
        edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new edu.jhu.hlt.concrete.services.AnnotationUnitIdentifier();
          _elem6.read(iprot);
          struct.units.add(_elem6);
        }
      }
      struct.setUnitsIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.language = iprot.readString();
        struct.setLanguageIsSet(true);
      }
    }
  }

}

