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
 * A set of items which are alike in some way.  Has an implicit id which is the
 * index of this Cluster in its parent Clustering's 'clusterList'.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class Cluster implements org.apache.thrift.TBase<Cluster, Cluster._Fields>, java.io.Serializable, Cloneable, Comparable<Cluster> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Cluster");

  private static final org.apache.thrift.protocol.TField CLUSTER_MEMBER_INDEX_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterMemberIndexList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField CONFIDENCE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("confidenceList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CHILD_INDEX_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("childIndexList", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ClusterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ClusterTupleSchemeFactory());
  }

  private List<Integer> clusterMemberIndexList; // optional
  private List<Double> confidenceList; // optional
  private List<Integer> childIndexList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The items in this cluster.  Values are indices into the
     * 'clusterMemberList' of the Clustering which contains this Cluster.
     */
    CLUSTER_MEMBER_INDEX_LIST((short)1, "clusterMemberIndexList"),
    /**
     * Co-indexed with 'clusterMemberIndexList'. The i^{th} value represents the
     * confidence that mention clusterMemberIndexList[i] belongs to this cluster.
     */
    CONFIDENCE_LIST((short)2, "confidenceList"),
    /**
     * A set of clusters (implicit ids/indices) from which this cluster was
     * created. This cluster should represent the union of all the items in all
     * of the child clusters.  (For hierarchical clustering only).
     */
    CHILD_INDEX_LIST((short)3, "childIndexList");

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
        case 1: // CLUSTER_MEMBER_INDEX_LIST
          return CLUSTER_MEMBER_INDEX_LIST;
        case 2: // CONFIDENCE_LIST
          return CONFIDENCE_LIST;
        case 3: // CHILD_INDEX_LIST
          return CHILD_INDEX_LIST;
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
  private static final _Fields optionals[] = {_Fields.CLUSTER_MEMBER_INDEX_LIST,_Fields.CONFIDENCE_LIST,_Fields.CHILD_INDEX_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLUSTER_MEMBER_INDEX_LIST, new org.apache.thrift.meta_data.FieldMetaData("clusterMemberIndexList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.CONFIDENCE_LIST, new org.apache.thrift.meta_data.FieldMetaData("confidenceList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    tmpMap.put(_Fields.CHILD_INDEX_LIST, new org.apache.thrift.meta_data.FieldMetaData("childIndexList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Cluster.class, metaDataMap);
  }

  public Cluster() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Cluster(Cluster other) {
    if (other.isSetClusterMemberIndexList()) {
      List<Integer> __this__clusterMemberIndexList = new ArrayList<Integer>(other.clusterMemberIndexList);
      this.clusterMemberIndexList = __this__clusterMemberIndexList;
    }
    if (other.isSetConfidenceList()) {
      List<Double> __this__confidenceList = new ArrayList<Double>(other.confidenceList);
      this.confidenceList = __this__confidenceList;
    }
    if (other.isSetChildIndexList()) {
      List<Integer> __this__childIndexList = new ArrayList<Integer>(other.childIndexList);
      this.childIndexList = __this__childIndexList;
    }
  }

  public Cluster deepCopy() {
    return new Cluster(this);
  }

  @Override
  public void clear() {
    this.clusterMemberIndexList = null;
    this.confidenceList = null;
    this.childIndexList = null;
  }

  public int getClusterMemberIndexListSize() {
    return (this.clusterMemberIndexList == null) ? 0 : this.clusterMemberIndexList.size();
  }

  public java.util.Iterator<Integer> getClusterMemberIndexListIterator() {
    return (this.clusterMemberIndexList == null) ? null : this.clusterMemberIndexList.iterator();
  }

  public void addToClusterMemberIndexList(int elem) {
    if (this.clusterMemberIndexList == null) {
      this.clusterMemberIndexList = new ArrayList<Integer>();
    }
    this.clusterMemberIndexList.add(elem);
  }

  /**
   * The items in this cluster.  Values are indices into the
   * 'clusterMemberList' of the Clustering which contains this Cluster.
   */
  public List<Integer> getClusterMemberIndexList() {
    return this.clusterMemberIndexList;
  }

  /**
   * The items in this cluster.  Values are indices into the
   * 'clusterMemberList' of the Clustering which contains this Cluster.
   */
  public Cluster setClusterMemberIndexList(List<Integer> clusterMemberIndexList) {
    this.clusterMemberIndexList = clusterMemberIndexList;
    return this;
  }

  public void unsetClusterMemberIndexList() {
    this.clusterMemberIndexList = null;
  }

  /** Returns true if field clusterMemberIndexList is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterMemberIndexList() {
    return this.clusterMemberIndexList != null;
  }

  public void setClusterMemberIndexListIsSet(boolean value) {
    if (!value) {
      this.clusterMemberIndexList = null;
    }
  }

  public int getConfidenceListSize() {
    return (this.confidenceList == null) ? 0 : this.confidenceList.size();
  }

  public java.util.Iterator<Double> getConfidenceListIterator() {
    return (this.confidenceList == null) ? null : this.confidenceList.iterator();
  }

  public void addToConfidenceList(double elem) {
    if (this.confidenceList == null) {
      this.confidenceList = new ArrayList<Double>();
    }
    this.confidenceList.add(elem);
  }

  /**
   * Co-indexed with 'clusterMemberIndexList'. The i^{th} value represents the
   * confidence that mention clusterMemberIndexList[i] belongs to this cluster.
   */
  public List<Double> getConfidenceList() {
    return this.confidenceList;
  }

  /**
   * Co-indexed with 'clusterMemberIndexList'. The i^{th} value represents the
   * confidence that mention clusterMemberIndexList[i] belongs to this cluster.
   */
  public Cluster setConfidenceList(List<Double> confidenceList) {
    this.confidenceList = confidenceList;
    return this;
  }

  public void unsetConfidenceList() {
    this.confidenceList = null;
  }

  /** Returns true if field confidenceList is set (has been assigned a value) and false otherwise */
  public boolean isSetConfidenceList() {
    return this.confidenceList != null;
  }

  public void setConfidenceListIsSet(boolean value) {
    if (!value) {
      this.confidenceList = null;
    }
  }

  public int getChildIndexListSize() {
    return (this.childIndexList == null) ? 0 : this.childIndexList.size();
  }

  public java.util.Iterator<Integer> getChildIndexListIterator() {
    return (this.childIndexList == null) ? null : this.childIndexList.iterator();
  }

  public void addToChildIndexList(int elem) {
    if (this.childIndexList == null) {
      this.childIndexList = new ArrayList<Integer>();
    }
    this.childIndexList.add(elem);
  }

  /**
   * A set of clusters (implicit ids/indices) from which this cluster was
   * created. This cluster should represent the union of all the items in all
   * of the child clusters.  (For hierarchical clustering only).
   */
  public List<Integer> getChildIndexList() {
    return this.childIndexList;
  }

  /**
   * A set of clusters (implicit ids/indices) from which this cluster was
   * created. This cluster should represent the union of all the items in all
   * of the child clusters.  (For hierarchical clustering only).
   */
  public Cluster setChildIndexList(List<Integer> childIndexList) {
    this.childIndexList = childIndexList;
    return this;
  }

  public void unsetChildIndexList() {
    this.childIndexList = null;
  }

  /** Returns true if field childIndexList is set (has been assigned a value) and false otherwise */
  public boolean isSetChildIndexList() {
    return this.childIndexList != null;
  }

  public void setChildIndexListIsSet(boolean value) {
    if (!value) {
      this.childIndexList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLUSTER_MEMBER_INDEX_LIST:
      if (value == null) {
        unsetClusterMemberIndexList();
      } else {
        setClusterMemberIndexList((List<Integer>)value);
      }
      break;

    case CONFIDENCE_LIST:
      if (value == null) {
        unsetConfidenceList();
      } else {
        setConfidenceList((List<Double>)value);
      }
      break;

    case CHILD_INDEX_LIST:
      if (value == null) {
        unsetChildIndexList();
      } else {
        setChildIndexList((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLUSTER_MEMBER_INDEX_LIST:
      return getClusterMemberIndexList();

    case CONFIDENCE_LIST:
      return getConfidenceList();

    case CHILD_INDEX_LIST:
      return getChildIndexList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLUSTER_MEMBER_INDEX_LIST:
      return isSetClusterMemberIndexList();
    case CONFIDENCE_LIST:
      return isSetConfidenceList();
    case CHILD_INDEX_LIST:
      return isSetChildIndexList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Cluster)
      return this.equals((Cluster)that);
    return false;
  }

  public boolean equals(Cluster that) {
    if (that == null)
      return false;

    boolean this_present_clusterMemberIndexList = true && this.isSetClusterMemberIndexList();
    boolean that_present_clusterMemberIndexList = true && that.isSetClusterMemberIndexList();
    if (this_present_clusterMemberIndexList || that_present_clusterMemberIndexList) {
      if (!(this_present_clusterMemberIndexList && that_present_clusterMemberIndexList))
        return false;
      if (!this.clusterMemberIndexList.equals(that.clusterMemberIndexList))
        return false;
    }

    boolean this_present_confidenceList = true && this.isSetConfidenceList();
    boolean that_present_confidenceList = true && that.isSetConfidenceList();
    if (this_present_confidenceList || that_present_confidenceList) {
      if (!(this_present_confidenceList && that_present_confidenceList))
        return false;
      if (!this.confidenceList.equals(that.confidenceList))
        return false;
    }

    boolean this_present_childIndexList = true && this.isSetChildIndexList();
    boolean that_present_childIndexList = true && that.isSetChildIndexList();
    if (this_present_childIndexList || that_present_childIndexList) {
      if (!(this_present_childIndexList && that_present_childIndexList))
        return false;
      if (!this.childIndexList.equals(that.childIndexList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_clusterMemberIndexList = true && (isSetClusterMemberIndexList());
    list.add(present_clusterMemberIndexList);
    if (present_clusterMemberIndexList)
      list.add(clusterMemberIndexList);

    boolean present_confidenceList = true && (isSetConfidenceList());
    list.add(present_confidenceList);
    if (present_confidenceList)
      list.add(confidenceList);

    boolean present_childIndexList = true && (isSetChildIndexList());
    list.add(present_childIndexList);
    if (present_childIndexList)
      list.add(childIndexList);

    return list.hashCode();
  }

  @Override
  public int compareTo(Cluster other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClusterMemberIndexList()).compareTo(other.isSetClusterMemberIndexList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterMemberIndexList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterMemberIndexList, other.clusterMemberIndexList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfidenceList()).compareTo(other.isSetConfidenceList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfidenceList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confidenceList, other.confidenceList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChildIndexList()).compareTo(other.isSetChildIndexList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChildIndexList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.childIndexList, other.childIndexList);
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
    StringBuilder sb = new StringBuilder("Cluster(");
    boolean first = true;

    if (isSetClusterMemberIndexList()) {
      sb.append("clusterMemberIndexList:");
      if (this.clusterMemberIndexList == null) {
        sb.append("null");
      } else {
        sb.append(this.clusterMemberIndexList);
      }
      first = false;
    }
    if (isSetConfidenceList()) {
      if (!first) sb.append(", ");
      sb.append("confidenceList:");
      if (this.confidenceList == null) {
        sb.append("null");
      } else {
        sb.append(this.confidenceList);
      }
      first = false;
    }
    if (isSetChildIndexList()) {
      if (!first) sb.append(", ");
      sb.append("childIndexList:");
      if (this.childIndexList == null) {
        sb.append("null");
      } else {
        sb.append(this.childIndexList);
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

  private static class ClusterStandardSchemeFactory implements SchemeFactory {
    public ClusterStandardScheme getScheme() {
      return new ClusterStandardScheme();
    }
  }

  private static class ClusterStandardScheme extends StandardScheme<Cluster> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Cluster struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CLUSTER_MEMBER_INDEX_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.clusterMemberIndexList = new ArrayList<Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.clusterMemberIndexList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setClusterMemberIndexListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONFIDENCE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.confidenceList = new ArrayList<Double>(_list3.size);
                double _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readDouble();
                  struct.confidenceList.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setConfidenceListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CHILD_INDEX_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                struct.childIndexList = new ArrayList<Integer>(_list6.size);
                int _elem7;
                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                {
                  _elem7 = iprot.readI32();
                  struct.childIndexList.add(_elem7);
                }
                iprot.readListEnd();
              }
              struct.setChildIndexListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Cluster struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.clusterMemberIndexList != null) {
        if (struct.isSetClusterMemberIndexList()) {
          oprot.writeFieldBegin(CLUSTER_MEMBER_INDEX_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.clusterMemberIndexList.size()));
            for (int _iter9 : struct.clusterMemberIndexList)
            {
              oprot.writeI32(_iter9);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.confidenceList != null) {
        if (struct.isSetConfidenceList()) {
          oprot.writeFieldBegin(CONFIDENCE_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.confidenceList.size()));
            for (double _iter10 : struct.confidenceList)
            {
              oprot.writeDouble(_iter10);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.childIndexList != null) {
        if (struct.isSetChildIndexList()) {
          oprot.writeFieldBegin(CHILD_INDEX_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.childIndexList.size()));
            for (int _iter11 : struct.childIndexList)
            {
              oprot.writeI32(_iter11);
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

  private static class ClusterTupleSchemeFactory implements SchemeFactory {
    public ClusterTupleScheme getScheme() {
      return new ClusterTupleScheme();
    }
  }

  private static class ClusterTupleScheme extends TupleScheme<Cluster> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Cluster struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetClusterMemberIndexList()) {
        optionals.set(0);
      }
      if (struct.isSetConfidenceList()) {
        optionals.set(1);
      }
      if (struct.isSetChildIndexList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetClusterMemberIndexList()) {
        {
          oprot.writeI32(struct.clusterMemberIndexList.size());
          for (int _iter12 : struct.clusterMemberIndexList)
          {
            oprot.writeI32(_iter12);
          }
        }
      }
      if (struct.isSetConfidenceList()) {
        {
          oprot.writeI32(struct.confidenceList.size());
          for (double _iter13 : struct.confidenceList)
          {
            oprot.writeDouble(_iter13);
          }
        }
      }
      if (struct.isSetChildIndexList()) {
        {
          oprot.writeI32(struct.childIndexList.size());
          for (int _iter14 : struct.childIndexList)
          {
            oprot.writeI32(_iter14);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Cluster struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.clusterMemberIndexList = new ArrayList<Integer>(_list15.size);
          int _elem16;
          for (int _i17 = 0; _i17 < _list15.size; ++_i17)
          {
            _elem16 = iprot.readI32();
            struct.clusterMemberIndexList.add(_elem16);
          }
        }
        struct.setClusterMemberIndexListIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.confidenceList = new ArrayList<Double>(_list18.size);
          double _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = iprot.readDouble();
            struct.confidenceList.add(_elem19);
          }
        }
        struct.setConfidenceListIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.childIndexList = new ArrayList<Integer>(_list21.size);
          int _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readI32();
            struct.childIndexList.add(_elem22);
          }
        }
        struct.setChildIndexListIsSet(true);
      }
    }
  }

}

