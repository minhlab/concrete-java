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
 * A theory about the set of situations that are present in a
 * message. See also: Situation
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class SituationSet implements org.apache.thrift.TBase<SituationSet, SituationSet._Fields>, java.io.Serializable, Cloneable, Comparable<SituationSet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SituationSet");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SITUATION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("situationList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField LINKING_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("linkingList", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SituationSetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SituationSetTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.UUID uuid; // required
  private edu.jhu.hlt.concrete.AnnotationMetadata metadata; // required
  private List<Situation> situationList; // required
  private List<edu.jhu.hlt.concrete.Linking> linkingList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Unique identifier for this set.
     */
    UUID((short)1, "uuid"),
    /**
     * Information about where this set came from.
     */
    METADATA((short)2, "metadata"),
    /**
     * List of mentions in this set.
     */
    SITUATION_LIST((short)3, "situationList"),
    /**
     * Entity linking annotations associated with this SituationSet.
     */
    LINKING_LIST((short)4, "linkingList");

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
        case 3: // SITUATION_LIST
          return SITUATION_LIST;
        case 4: // LINKING_LIST
          return LINKING_LIST;
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
  private static final _Fields optionals[] = {_Fields.LINKING_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AnnotationMetadata.class)));
    tmpMap.put(_Fields.SITUATION_LIST, new org.apache.thrift.meta_data.FieldMetaData("situationList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Situation.class))));
    tmpMap.put(_Fields.LINKING_LIST, new org.apache.thrift.meta_data.FieldMetaData("linkingList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.Linking.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SituationSet.class, metaDataMap);
  }

  public SituationSet() {
  }

  public SituationSet(
    edu.jhu.hlt.concrete.UUID uuid,
    edu.jhu.hlt.concrete.AnnotationMetadata metadata,
    List<Situation> situationList)
  {
    this();
    this.uuid = uuid;
    this.metadata = metadata;
    this.situationList = situationList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SituationSet(SituationSet other) {
    if (other.isSetUuid()) {
      this.uuid = new edu.jhu.hlt.concrete.UUID(other.uuid);
    }
    if (other.isSetMetadata()) {
      this.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata(other.metadata);
    }
    if (other.isSetSituationList()) {
      List<Situation> __this__situationList = new ArrayList<Situation>(other.situationList.size());
      for (Situation other_element : other.situationList) {
        __this__situationList.add(new Situation(other_element));
      }
      this.situationList = __this__situationList;
    }
    if (other.isSetLinkingList()) {
      List<edu.jhu.hlt.concrete.Linking> __this__linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>(other.linkingList.size());
      for (edu.jhu.hlt.concrete.Linking other_element : other.linkingList) {
        __this__linkingList.add(new edu.jhu.hlt.concrete.Linking(other_element));
      }
      this.linkingList = __this__linkingList;
    }
  }

  public SituationSet deepCopy() {
    return new SituationSet(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.metadata = null;
    this.situationList = null;
    this.linkingList = null;
  }

  /**
   * Unique identifier for this set.
   */
  public edu.jhu.hlt.concrete.UUID getUuid() {
    return this.uuid;
  }

  /**
   * Unique identifier for this set.
   */
  public SituationSet setUuid(edu.jhu.hlt.concrete.UUID uuid) {
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
   * Information about where this set came from.
   */
  public edu.jhu.hlt.concrete.AnnotationMetadata getMetadata() {
    return this.metadata;
  }

  /**
   * Information about where this set came from.
   */
  public SituationSet setMetadata(edu.jhu.hlt.concrete.AnnotationMetadata metadata) {
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

  public int getSituationListSize() {
    return (this.situationList == null) ? 0 : this.situationList.size();
  }

  public java.util.Iterator<Situation> getSituationListIterator() {
    return (this.situationList == null) ? null : this.situationList.iterator();
  }

  public void addToSituationList(Situation elem) {
    if (this.situationList == null) {
      this.situationList = new ArrayList<Situation>();
    }
    this.situationList.add(elem);
  }

  /**
   * List of mentions in this set.
   */
  public List<Situation> getSituationList() {
    return this.situationList;
  }

  /**
   * List of mentions in this set.
   */
  public SituationSet setSituationList(List<Situation> situationList) {
    this.situationList = situationList;
    return this;
  }

  public void unsetSituationList() {
    this.situationList = null;
  }

  /** Returns true if field situationList is set (has been assigned a value) and false otherwise */
  public boolean isSetSituationList() {
    return this.situationList != null;
  }

  public void setSituationListIsSet(boolean value) {
    if (!value) {
      this.situationList = null;
    }
  }

  public int getLinkingListSize() {
    return (this.linkingList == null) ? 0 : this.linkingList.size();
  }

  public java.util.Iterator<edu.jhu.hlt.concrete.Linking> getLinkingListIterator() {
    return (this.linkingList == null) ? null : this.linkingList.iterator();
  }

  public void addToLinkingList(edu.jhu.hlt.concrete.Linking elem) {
    if (this.linkingList == null) {
      this.linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>();
    }
    this.linkingList.add(elem);
  }

  /**
   * Entity linking annotations associated with this SituationSet.
   */
  public List<edu.jhu.hlt.concrete.Linking> getLinkingList() {
    return this.linkingList;
  }

  /**
   * Entity linking annotations associated with this SituationSet.
   */
  public SituationSet setLinkingList(List<edu.jhu.hlt.concrete.Linking> linkingList) {
    this.linkingList = linkingList;
    return this;
  }

  public void unsetLinkingList() {
    this.linkingList = null;
  }

  /** Returns true if field linkingList is set (has been assigned a value) and false otherwise */
  public boolean isSetLinkingList() {
    return this.linkingList != null;
  }

  public void setLinkingListIsSet(boolean value) {
    if (!value) {
      this.linkingList = null;
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

    case SITUATION_LIST:
      if (value == null) {
        unsetSituationList();
      } else {
        setSituationList((List<Situation>)value);
      }
      break;

    case LINKING_LIST:
      if (value == null) {
        unsetLinkingList();
      } else {
        setLinkingList((List<edu.jhu.hlt.concrete.Linking>)value);
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

    case SITUATION_LIST:
      return getSituationList();

    case LINKING_LIST:
      return getLinkingList();

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
    case SITUATION_LIST:
      return isSetSituationList();
    case LINKING_LIST:
      return isSetLinkingList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SituationSet)
      return this.equals((SituationSet)that);
    return false;
  }

  public boolean equals(SituationSet that) {
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

    boolean this_present_situationList = true && this.isSetSituationList();
    boolean that_present_situationList = true && that.isSetSituationList();
    if (this_present_situationList || that_present_situationList) {
      if (!(this_present_situationList && that_present_situationList))
        return false;
      if (!this.situationList.equals(that.situationList))
        return false;
    }

    boolean this_present_linkingList = true && this.isSetLinkingList();
    boolean that_present_linkingList = true && that.isSetLinkingList();
    if (this_present_linkingList || that_present_linkingList) {
      if (!(this_present_linkingList && that_present_linkingList))
        return false;
      if (!this.linkingList.equals(that.linkingList))
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

    boolean present_situationList = true && (isSetSituationList());
    list.add(present_situationList);
    if (present_situationList)
      list.add(situationList);

    boolean present_linkingList = true && (isSetLinkingList());
    list.add(present_linkingList);
    if (present_linkingList)
      list.add(linkingList);

    return list.hashCode();
  }

  @Override
  public int compareTo(SituationSet other) {
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
    lastComparison = Boolean.valueOf(isSetSituationList()).compareTo(other.isSetSituationList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSituationList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.situationList, other.situationList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLinkingList()).compareTo(other.isSetLinkingList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinkingList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.linkingList, other.linkingList);
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
    StringBuilder sb = new StringBuilder("SituationSet(");
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
    sb.append("situationList:");
    if (this.situationList == null) {
      sb.append("null");
    } else {
      sb.append(this.situationList);
    }
    first = false;
    if (isSetLinkingList()) {
      if (!first) sb.append(", ");
      sb.append("linkingList:");
      if (this.linkingList == null) {
        sb.append("null");
      } else {
        sb.append(this.linkingList);
      }
      first = false;
    }
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
    if (situationList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'situationList' was not present! Struct: " + toString());
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

  private static class SituationSetStandardSchemeFactory implements SchemeFactory {
    public SituationSetStandardScheme getScheme() {
      return new SituationSetStandardScheme();
    }
  }

  private static class SituationSetStandardScheme extends StandardScheme<SituationSet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SituationSet struct) throws org.apache.thrift.TException {
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
          case 3: // SITUATION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.situationList = new ArrayList<Situation>(_list40.size);
                Situation _elem41;
                for (int _i42 = 0; _i42 < _list40.size; ++_i42)
                {
                  _elem41 = new Situation();
                  _elem41.read(iprot);
                  struct.situationList.add(_elem41);
                }
                iprot.readListEnd();
              }
              struct.setSituationListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LINKING_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list43 = iprot.readListBegin();
                struct.linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>(_list43.size);
                edu.jhu.hlt.concrete.Linking _elem44;
                for (int _i45 = 0; _i45 < _list43.size; ++_i45)
                {
                  _elem44 = new edu.jhu.hlt.concrete.Linking();
                  _elem44.read(iprot);
                  struct.linkingList.add(_elem44);
                }
                iprot.readListEnd();
              }
              struct.setLinkingListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SituationSet struct) throws org.apache.thrift.TException {
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
      if (struct.situationList != null) {
        oprot.writeFieldBegin(SITUATION_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.situationList.size()));
          for (Situation _iter46 : struct.situationList)
          {
            _iter46.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.linkingList != null) {
        if (struct.isSetLinkingList()) {
          oprot.writeFieldBegin(LINKING_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.linkingList.size()));
            for (edu.jhu.hlt.concrete.Linking _iter47 : struct.linkingList)
            {
              _iter47.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SituationSetTupleSchemeFactory implements SchemeFactory {
    public SituationSetTupleScheme getScheme() {
      return new SituationSetTupleScheme();
    }
  }

  private static class SituationSetTupleScheme extends TupleScheme<SituationSet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SituationSet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.uuid.write(oprot);
      struct.metadata.write(oprot);
      {
        oprot.writeI32(struct.situationList.size());
        for (Situation _iter48 : struct.situationList)
        {
          _iter48.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetLinkingList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetLinkingList()) {
        {
          oprot.writeI32(struct.linkingList.size());
          for (edu.jhu.hlt.concrete.Linking _iter49 : struct.linkingList)
          {
            _iter49.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SituationSet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uuid = new edu.jhu.hlt.concrete.UUID();
      struct.uuid.read(iprot);
      struct.setUuidIsSet(true);
      struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
      struct.metadata.read(iprot);
      struct.setMetadataIsSet(true);
      {
        org.apache.thrift.protocol.TList _list50 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.situationList = new ArrayList<Situation>(_list50.size);
        Situation _elem51;
        for (int _i52 = 0; _i52 < _list50.size; ++_i52)
        {
          _elem51 = new Situation();
          _elem51.read(iprot);
          struct.situationList.add(_elem51);
        }
      }
      struct.setSituationListIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list53 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>(_list53.size);
          edu.jhu.hlt.concrete.Linking _elem54;
          for (int _i55 = 0; _i55 < _list53.size; ++_i55)
          {
            _elem54 = new edu.jhu.hlt.concrete.Linking();
            _elem54.read(iprot);
            struct.linkingList.add(_elem54);
          }
        }
        struct.setLinkingListIsSet(true);
      }
    }
  }

}

