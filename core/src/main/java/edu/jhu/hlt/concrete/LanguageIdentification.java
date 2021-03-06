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
 * A theory about what languages are present in a given communication
 * or piece of communication.  Note that it is possible to have more
 * than one language present in a given communication.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class LanguageIdentification implements org.apache.thrift.TBase<LanguageIdentification, LanguageIdentification._Fields>, java.io.Serializable, Cloneable, Comparable<LanguageIdentification> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LanguageIdentification");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField LANGUAGE_TO_PROBABILITY_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("languageToProbabilityMap", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LanguageIdentificationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LanguageIdentificationTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.UUID uuid; // required
  private edu.jhu.hlt.concrete.AnnotationMetadata metadata; // required
  private Map<String,Double> languageToProbabilityMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Unique identifier for this language identification.
     */
    UUID((short)1, "uuid"),
    /**
     * Information about where this language identification came from.
     */
    METADATA((short)2, "metadata"),
    /**
     * A list mapping from a language to the probability that that
     * language occurs in a given communication.  Each language code should
     * occur at most once in this list.  The probabilities do <i>not</i>
     * need to sum to one -- for example, if a single communication is known
     * to contain both English and French, then it would be appropriate
     * to assign a probability of 1 to both langauges.  (Manually
     * annotated LanguageProb objects should always have probabilities
     * of either zero or one; machine-generated LanguageProbs may have
     * intermediate probabilities.)
     * 
     * Note: The string key should represent the ISO 639-3 three-letter code.
     */
    LANGUAGE_TO_PROBABILITY_MAP((short)3, "languageToProbabilityMap");

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
        case 1: // UUID
          return UUID;
        case 2: // METADATA
          return METADATA;
        case 3: // LANGUAGE_TO_PROBABILITY_MAP
          return LANGUAGE_TO_PROBABILITY_MAP;
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
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AnnotationMetadata.class)));
    tmpMap.put(_Fields.LANGUAGE_TO_PROBABILITY_MAP, new org.apache.thrift.meta_data.FieldMetaData("languageToProbabilityMap", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LanguageIdentification.class, metaDataMap);
  }

  public LanguageIdentification() {
  }

  public LanguageIdentification(
    edu.jhu.hlt.concrete.UUID uuid,
    edu.jhu.hlt.concrete.AnnotationMetadata metadata,
    Map<String,Double> languageToProbabilityMap)
  {
    this();
    this.uuid = uuid;
    this.metadata = metadata;
    this.languageToProbabilityMap = languageToProbabilityMap;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LanguageIdentification(LanguageIdentification other) {
    if (other.isSetUuid()) {
      this.uuid = new edu.jhu.hlt.concrete.UUID(other.uuid);
    }
    if (other.isSetMetadata()) {
      this.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata(other.metadata);
    }
    if (other.isSetLanguageToProbabilityMap()) {
      Map<String,Double> __this__languageToProbabilityMap = new HashMap<String,Double>(other.languageToProbabilityMap);
      this.languageToProbabilityMap = __this__languageToProbabilityMap;
    }
  }

  public LanguageIdentification deepCopy() {
    return new LanguageIdentification(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.metadata = null;
    this.languageToProbabilityMap = null;
  }

  /**
   * Unique identifier for this language identification.
   */
  public edu.jhu.hlt.concrete.UUID getUuid() {
    return this.uuid;
  }

  /**
   * Unique identifier for this language identification.
   */
  public LanguageIdentification setUuid(edu.jhu.hlt.concrete.UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  public void unsetUuid() {
    this.uuid = null;
  }

  /** Returns true if field uuid is set (has been assigned a value) and false otherwise */
  public boolean isSetUuid() {
    return this.uuid != null;
  }

  public void setUuidIsSet(boolean value) {
    if (!value) {
      this.uuid = null;
    }
  }

  /**
   * Information about where this language identification came from.
   */
  public edu.jhu.hlt.concrete.AnnotationMetadata getMetadata() {
    return this.metadata;
  }

  /**
   * Information about where this language identification came from.
   */
  public LanguageIdentification setMetadata(edu.jhu.hlt.concrete.AnnotationMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public int getLanguageToProbabilityMapSize() {
    return (this.languageToProbabilityMap == null) ? 0 : this.languageToProbabilityMap.size();
  }

  public void putToLanguageToProbabilityMap(String key, double val) {
    if (this.languageToProbabilityMap == null) {
      this.languageToProbabilityMap = new HashMap<String,Double>();
    }
    this.languageToProbabilityMap.put(key, val);
  }

  /**
   * A list mapping from a language to the probability that that
   * language occurs in a given communication.  Each language code should
   * occur at most once in this list.  The probabilities do <i>not</i>
   * need to sum to one -- for example, if a single communication is known
   * to contain both English and French, then it would be appropriate
   * to assign a probability of 1 to both langauges.  (Manually
   * annotated LanguageProb objects should always have probabilities
   * of either zero or one; machine-generated LanguageProbs may have
   * intermediate probabilities.)
   * 
   * Note: The string key should represent the ISO 639-3 three-letter code.
   */
  public Map<String,Double> getLanguageToProbabilityMap() {
    return this.languageToProbabilityMap;
  }

  /**
   * A list mapping from a language to the probability that that
   * language occurs in a given communication.  Each language code should
   * occur at most once in this list.  The probabilities do <i>not</i>
   * need to sum to one -- for example, if a single communication is known
   * to contain both English and French, then it would be appropriate
   * to assign a probability of 1 to both langauges.  (Manually
   * annotated LanguageProb objects should always have probabilities
   * of either zero or one; machine-generated LanguageProbs may have
   * intermediate probabilities.)
   * 
   * Note: The string key should represent the ISO 639-3 three-letter code.
   */
  public LanguageIdentification setLanguageToProbabilityMap(Map<String,Double> languageToProbabilityMap) {
    this.languageToProbabilityMap = languageToProbabilityMap;
    return this;
  }

  public void unsetLanguageToProbabilityMap() {
    this.languageToProbabilityMap = null;
  }

  /** Returns true if field languageToProbabilityMap is set (has been assigned a value) and false otherwise */
  public boolean isSetLanguageToProbabilityMap() {
    return this.languageToProbabilityMap != null;
  }

  public void setLanguageToProbabilityMapIsSet(boolean value) {
    if (!value) {
      this.languageToProbabilityMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UUID:
      if (value == null) {
        unsetUuid();
      } else {
        setUuid((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((edu.jhu.hlt.concrete.AnnotationMetadata)value);
      }
      break;

    case LANGUAGE_TO_PROBABILITY_MAP:
      if (value == null) {
        unsetLanguageToProbabilityMap();
      } else {
        setLanguageToProbabilityMap((Map<String,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID:
      return getUuid();

    case METADATA:
      return getMetadata();

    case LANGUAGE_TO_PROBABILITY_MAP:
      return getLanguageToProbabilityMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UUID:
      return isSetUuid();
    case METADATA:
      return isSetMetadata();
    case LANGUAGE_TO_PROBABILITY_MAP:
      return isSetLanguageToProbabilityMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LanguageIdentification)
      return this.equals((LanguageIdentification)that);
    return false;
  }

  public boolean equals(LanguageIdentification that) {
    if (that == null)
      return false;

    boolean this_present_uuid = true && this.isSetUuid();
    boolean that_present_uuid = true && that.isSetUuid();
    if (this_present_uuid || that_present_uuid) {
      if (!(this_present_uuid && that_present_uuid))
        return false;
      if (!this.uuid.equals(that.uuid))
        return false;
    }

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_languageToProbabilityMap = true && this.isSetLanguageToProbabilityMap();
    boolean that_present_languageToProbabilityMap = true && that.isSetLanguageToProbabilityMap();
    if (this_present_languageToProbabilityMap || that_present_languageToProbabilityMap) {
      if (!(this_present_languageToProbabilityMap && that_present_languageToProbabilityMap))
        return false;
      if (!this.languageToProbabilityMap.equals(that.languageToProbabilityMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uuid = true && (isSetUuid());
    list.add(present_uuid);
    if (present_uuid)
      list.add(uuid);

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    boolean present_languageToProbabilityMap = true && (isSetLanguageToProbabilityMap());
    list.add(present_languageToProbabilityMap);
    if (present_languageToProbabilityMap)
      list.add(languageToProbabilityMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(LanguageIdentification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLanguageToProbabilityMap()).compareTo(other.isSetLanguageToProbabilityMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLanguageToProbabilityMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.languageToProbabilityMap, other.languageToProbabilityMap);
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
    StringBuilder sb = new StringBuilder("LanguageIdentification(");
    boolean first = true;

    sb.append("uuid:");
    if (this.uuid == null) {
      sb.append("null");
    } else {
      sb.append(this.uuid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.metadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("languageToProbabilityMap:");
    if (this.languageToProbabilityMap == null) {
      sb.append("null");
    } else {
      sb.append(this.languageToProbabilityMap);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (uuid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uuid' was not present! Struct: " + toString());
    }
    if (metadata == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadata' was not present! Struct: " + toString());
    }
    if (languageToProbabilityMap == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'languageToProbabilityMap' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (uuid != null) {
      uuid.validate();
    }
    if (metadata != null) {
      metadata.validate();
    }
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

  private static class LanguageIdentificationStandardSchemeFactory implements SchemeFactory {
    public LanguageIdentificationStandardScheme getScheme() {
      return new LanguageIdentificationStandardScheme();
    }
  }

  private static class LanguageIdentificationStandardScheme extends StandardScheme<LanguageIdentification> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LanguageIdentification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.uuid = new edu.jhu.hlt.concrete.UUID();
              struct.uuid.read(iprot);
              struct.setUuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
              struct.metadata.read(iprot);
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LANGUAGE_TO_PROBABILITY_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.languageToProbabilityMap = new HashMap<String,Double>(2*_map0.size);
                String _key1;
                double _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readDouble();
                  struct.languageToProbabilityMap.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setLanguageToProbabilityMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, LanguageIdentification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uuid != null) {
        oprot.writeFieldBegin(UUID_FIELD_DESC);
        struct.uuid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        struct.metadata.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.languageToProbabilityMap != null) {
        oprot.writeFieldBegin(LANGUAGE_TO_PROBABILITY_MAP_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, struct.languageToProbabilityMap.size()));
          for (Map.Entry<String, Double> _iter4 : struct.languageToProbabilityMap.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeDouble(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LanguageIdentificationTupleSchemeFactory implements SchemeFactory {
    public LanguageIdentificationTupleScheme getScheme() {
      return new LanguageIdentificationTupleScheme();
    }
  }

  private static class LanguageIdentificationTupleScheme extends TupleScheme<LanguageIdentification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LanguageIdentification struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.uuid.write(oprot);
      struct.metadata.write(oprot);
      {
        oprot.writeI32(struct.languageToProbabilityMap.size());
        for (Map.Entry<String, Double> _iter5 : struct.languageToProbabilityMap.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          oprot.writeDouble(_iter5.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LanguageIdentification struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uuid = new edu.jhu.hlt.concrete.UUID();
      struct.uuid.read(iprot);
      struct.setUuidIsSet(true);
      struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
      struct.metadata.read(iprot);
      struct.setMetadataIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
        struct.languageToProbabilityMap = new HashMap<String,Double>(2*_map6.size);
        String _key7;
        double _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = iprot.readString();
          _val8 = iprot.readDouble();
          struct.languageToProbabilityMap.put(_key7, _val8);
        }
      }
      struct.setLanguageToProbabilityMapIsSet(true);
    }
  }

}

