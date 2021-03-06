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
 * A sound wave. A separate optional field is defined for each
 * suppported format. Typically, a Sound object will only define
 * a single field.
 * 
 * Note: we may want to have separate fields for separate channels
 * (left vs right), etc.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-13")
public class Sound implements org.apache.thrift.TBase<Sound, Sound._Fields>, java.io.Serializable, Cloneable, Comparable<Sound> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Sound");

  private static final org.apache.thrift.protocol.TField WAV_FIELD_DESC = new org.apache.thrift.protocol.TField("wav", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MP3_FIELD_DESC = new org.apache.thrift.protocol.TField("mp3", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SPH_FIELD_DESC = new org.apache.thrift.protocol.TField("sph", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("path", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SoundStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SoundTupleSchemeFactory());
  }

  private ByteBuffer wav; // optional
  private ByteBuffer mp3; // optional
  private ByteBuffer sph; // optional
  private String path; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    WAV((short)1, "wav"),
    MP3((short)2, "mp3"),
    SPH((short)3, "sph"),
    /**
     * An absolute path to a file on disk where the sound file can be
     * found. It is assumed that this path will be accessable from any
     * machine that the system is run on (i.e., it should be a shared
     * disk, or possibly a mirrored directory).
     */
    PATH((short)4, "path");

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
        case 1: // WAV
          return WAV;
        case 2: // MP3
          return MP3;
        case 3: // SPH
          return SPH;
        case 4: // PATH
          return PATH;
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
  private static final _Fields optionals[] = {_Fields.WAV,_Fields.MP3,_Fields.SPH,_Fields.PATH};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.WAV, new org.apache.thrift.meta_data.FieldMetaData("wav", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.MP3, new org.apache.thrift.meta_data.FieldMetaData("mp3", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SPH, new org.apache.thrift.meta_data.FieldMetaData("sph", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.PATH, new org.apache.thrift.meta_data.FieldMetaData("path", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Sound.class, metaDataMap);
  }

  public Sound() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Sound(Sound other) {
    if (other.isSetWav()) {
      this.wav = org.apache.thrift.TBaseHelper.copyBinary(other.wav);
    }
    if (other.isSetMp3()) {
      this.mp3 = org.apache.thrift.TBaseHelper.copyBinary(other.mp3);
    }
    if (other.isSetSph()) {
      this.sph = org.apache.thrift.TBaseHelper.copyBinary(other.sph);
    }
    if (other.isSetPath()) {
      this.path = other.path;
    }
  }

  public Sound deepCopy() {
    return new Sound(this);
  }

  @Override
  public void clear() {
    this.wav = null;
    this.mp3 = null;
    this.sph = null;
    this.path = null;
  }

  public byte[] getWav() {
    setWav(org.apache.thrift.TBaseHelper.rightSize(wav));
    return wav == null ? null : wav.array();
  }

  public ByteBuffer bufferForWav() {
    return org.apache.thrift.TBaseHelper.copyBinary(wav);
  }

  public Sound setWav(byte[] wav) {
    this.wav = wav == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(wav, wav.length));
    return this;
  }

  public Sound setWav(ByteBuffer wav) {
    this.wav = org.apache.thrift.TBaseHelper.copyBinary(wav);
    return this;
  }

  public void unsetWav() {
    this.wav = null;
  }

  /** Returns true if field wav is set (has been assigned a value) and false otherwise */
  public boolean isSetWav() {
    return this.wav != null;
  }

  public void setWavIsSet(boolean value) {
    if (!value) {
      this.wav = null;
    }
  }

  public byte[] getMp3() {
    setMp3(org.apache.thrift.TBaseHelper.rightSize(mp3));
    return mp3 == null ? null : mp3.array();
  }

  public ByteBuffer bufferForMp3() {
    return org.apache.thrift.TBaseHelper.copyBinary(mp3);
  }

  public Sound setMp3(byte[] mp3) {
    this.mp3 = mp3 == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(mp3, mp3.length));
    return this;
  }

  public Sound setMp3(ByteBuffer mp3) {
    this.mp3 = org.apache.thrift.TBaseHelper.copyBinary(mp3);
    return this;
  }

  public void unsetMp3() {
    this.mp3 = null;
  }

  /** Returns true if field mp3 is set (has been assigned a value) and false otherwise */
  public boolean isSetMp3() {
    return this.mp3 != null;
  }

  public void setMp3IsSet(boolean value) {
    if (!value) {
      this.mp3 = null;
    }
  }

  public byte[] getSph() {
    setSph(org.apache.thrift.TBaseHelper.rightSize(sph));
    return sph == null ? null : sph.array();
  }

  public ByteBuffer bufferForSph() {
    return org.apache.thrift.TBaseHelper.copyBinary(sph);
  }

  public Sound setSph(byte[] sph) {
    this.sph = sph == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(sph, sph.length));
    return this;
  }

  public Sound setSph(ByteBuffer sph) {
    this.sph = org.apache.thrift.TBaseHelper.copyBinary(sph);
    return this;
  }

  public void unsetSph() {
    this.sph = null;
  }

  /** Returns true if field sph is set (has been assigned a value) and false otherwise */
  public boolean isSetSph() {
    return this.sph != null;
  }

  public void setSphIsSet(boolean value) {
    if (!value) {
      this.sph = null;
    }
  }

  /**
   * An absolute path to a file on disk where the sound file can be
   * found. It is assumed that this path will be accessable from any
   * machine that the system is run on (i.e., it should be a shared
   * disk, or possibly a mirrored directory).
   */
  public String getPath() {
    return this.path;
  }

  /**
   * An absolute path to a file on disk where the sound file can be
   * found. It is assumed that this path will be accessable from any
   * machine that the system is run on (i.e., it should be a shared
   * disk, or possibly a mirrored directory).
   */
  public Sound setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  /** Returns true if field path is set (has been assigned a value) and false otherwise */
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case WAV:
      if (value == null) {
        unsetWav();
      } else {
        setWav((ByteBuffer)value);
      }
      break;

    case MP3:
      if (value == null) {
        unsetMp3();
      } else {
        setMp3((ByteBuffer)value);
      }
      break;

    case SPH:
      if (value == null) {
        unsetSph();
      } else {
        setSph((ByteBuffer)value);
      }
      break;

    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case WAV:
      return getWav();

    case MP3:
      return getMp3();

    case SPH:
      return getSph();

    case PATH:
      return getPath();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case WAV:
      return isSetWav();
    case MP3:
      return isSetMp3();
    case SPH:
      return isSetSph();
    case PATH:
      return isSetPath();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Sound)
      return this.equals((Sound)that);
    return false;
  }

  public boolean equals(Sound that) {
    if (that == null)
      return false;

    boolean this_present_wav = true && this.isSetWav();
    boolean that_present_wav = true && that.isSetWav();
    if (this_present_wav || that_present_wav) {
      if (!(this_present_wav && that_present_wav))
        return false;
      if (!this.wav.equals(that.wav))
        return false;
    }

    boolean this_present_mp3 = true && this.isSetMp3();
    boolean that_present_mp3 = true && that.isSetMp3();
    if (this_present_mp3 || that_present_mp3) {
      if (!(this_present_mp3 && that_present_mp3))
        return false;
      if (!this.mp3.equals(that.mp3))
        return false;
    }

    boolean this_present_sph = true && this.isSetSph();
    boolean that_present_sph = true && that.isSetSph();
    if (this_present_sph || that_present_sph) {
      if (!(this_present_sph && that_present_sph))
        return false;
      if (!this.sph.equals(that.sph))
        return false;
    }

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!this.path.equals(that.path))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_wav = true && (isSetWav());
    list.add(present_wav);
    if (present_wav)
      list.add(wav);

    boolean present_mp3 = true && (isSetMp3());
    list.add(present_mp3);
    if (present_mp3)
      list.add(mp3);

    boolean present_sph = true && (isSetSph());
    list.add(present_sph);
    if (present_sph)
      list.add(sph);

    boolean present_path = true && (isSetPath());
    list.add(present_path);
    if (present_path)
      list.add(path);

    return list.hashCode();
  }

  @Override
  public int compareTo(Sound other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWav()).compareTo(other.isSetWav());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWav()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.wav, other.wav);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMp3()).compareTo(other.isSetMp3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMp3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mp3, other.mp3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSph()).compareTo(other.isSetSph());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSph()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sph, other.sph);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.path, other.path);
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
    StringBuilder sb = new StringBuilder("Sound(");
    boolean first = true;

    if (isSetWav()) {
      sb.append("wav:");
      if (this.wav == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.wav, sb);
      }
      first = false;
    }
    if (isSetMp3()) {
      if (!first) sb.append(", ");
      sb.append("mp3:");
      if (this.mp3 == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.mp3, sb);
      }
      first = false;
    }
    if (isSetSph()) {
      if (!first) sb.append(", ");
      sb.append("sph:");
      if (this.sph == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.sph, sb);
      }
      first = false;
    }
    if (isSetPath()) {
      if (!first) sb.append(", ");
      sb.append("path:");
      if (this.path == null) {
        sb.append("null");
      } else {
        sb.append(this.path);
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

  private static class SoundStandardSchemeFactory implements SchemeFactory {
    public SoundStandardScheme getScheme() {
      return new SoundStandardScheme();
    }
  }

  private static class SoundStandardScheme extends StandardScheme<Sound> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Sound struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // WAV
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.wav = iprot.readBinary();
              struct.setWavIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MP3
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mp3 = iprot.readBinary();
              struct.setMp3IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sph = iprot.readBinary();
              struct.setSphIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.path = iprot.readString();
              struct.setPathIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Sound struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.wav != null) {
        if (struct.isSetWav()) {
          oprot.writeFieldBegin(WAV_FIELD_DESC);
          oprot.writeBinary(struct.wav);
          oprot.writeFieldEnd();
        }
      }
      if (struct.mp3 != null) {
        if (struct.isSetMp3()) {
          oprot.writeFieldBegin(MP3_FIELD_DESC);
          oprot.writeBinary(struct.mp3);
          oprot.writeFieldEnd();
        }
      }
      if (struct.sph != null) {
        if (struct.isSetSph()) {
          oprot.writeFieldBegin(SPH_FIELD_DESC);
          oprot.writeBinary(struct.sph);
          oprot.writeFieldEnd();
        }
      }
      if (struct.path != null) {
        if (struct.isSetPath()) {
          oprot.writeFieldBegin(PATH_FIELD_DESC);
          oprot.writeString(struct.path);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SoundTupleSchemeFactory implements SchemeFactory {
    public SoundTupleScheme getScheme() {
      return new SoundTupleScheme();
    }
  }

  private static class SoundTupleScheme extends TupleScheme<Sound> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Sound struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetWav()) {
        optionals.set(0);
      }
      if (struct.isSetMp3()) {
        optionals.set(1);
      }
      if (struct.isSetSph()) {
        optionals.set(2);
      }
      if (struct.isSetPath()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetWav()) {
        oprot.writeBinary(struct.wav);
      }
      if (struct.isSetMp3()) {
        oprot.writeBinary(struct.mp3);
      }
      if (struct.isSetSph()) {
        oprot.writeBinary(struct.sph);
      }
      if (struct.isSetPath()) {
        oprot.writeString(struct.path);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Sound struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.wav = iprot.readBinary();
        struct.setWavIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mp3 = iprot.readBinary();
        struct.setMp3IsSet(true);
      }
      if (incoming.get(2)) {
        struct.sph = iprot.readBinary();
        struct.setSphIsSet(true);
      }
      if (incoming.get(3)) {
        struct.path = iprot.readString();
        struct.setPathIsSet(true);
      }
    }
  }

}

