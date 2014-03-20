/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package me.distributedaccounts.mgmt.service.event;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EventData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventData\",\"namespace\":\"me.distributedaccounts.mgmt.service.event\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"timestampMillis\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public long timestampMillis;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public EventData() {}

  /**
   * All-args constructor.
   */
  public EventData(java.lang.CharSequence id, java.lang.Long timestampMillis) {
    this.id = id;
    this.timestampMillis = timestampMillis;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return timestampMillis;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: timestampMillis = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'timestampMillis' field.
   */
  public java.lang.Long getTimestampMillis() {
    return timestampMillis;
  }

  /**
   * Sets the value of the 'timestampMillis' field.
   * @param value the value to set.
   */
  public void setTimestampMillis(java.lang.Long value) {
    this.timestampMillis = value;
  }

  /** Creates a new EventData RecordBuilder */
  public static me.distributedaccounts.mgmt.service.event.EventData.Builder newBuilder() {
    return new me.distributedaccounts.mgmt.service.event.EventData.Builder();
  }
  
  /** Creates a new EventData RecordBuilder by copying an existing Builder */
  public static me.distributedaccounts.mgmt.service.event.EventData.Builder newBuilder(me.distributedaccounts.mgmt.service.event.EventData.Builder other) {
    return new me.distributedaccounts.mgmt.service.event.EventData.Builder(other);
  }
  
  /** Creates a new EventData RecordBuilder by copying an existing EventData instance */
  public static me.distributedaccounts.mgmt.service.event.EventData.Builder newBuilder(me.distributedaccounts.mgmt.service.event.EventData other) {
    return new me.distributedaccounts.mgmt.service.event.EventData.Builder(other);
  }
  
  /**
   * RecordBuilder for EventData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventData>
    implements org.apache.avro.data.RecordBuilder<EventData> {

    private java.lang.CharSequence id;
    private long timestampMillis;

    /** Creates a new Builder */
    private Builder() {
      super(me.distributedaccounts.mgmt.service.event.EventData.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(me.distributedaccounts.mgmt.service.event.EventData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestampMillis)) {
        this.timestampMillis = data().deepCopy(fields()[1].schema(), other.timestampMillis);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing EventData instance */
    private Builder(me.distributedaccounts.mgmt.service.event.EventData other) {
            super(me.distributedaccounts.mgmt.service.event.EventData.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timestampMillis)) {
        this.timestampMillis = data().deepCopy(fields()[1].schema(), other.timestampMillis);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public me.distributedaccounts.mgmt.service.event.EventData.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public me.distributedaccounts.mgmt.service.event.EventData.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timestampMillis' field */
    public java.lang.Long getTimestampMillis() {
      return timestampMillis;
    }
    
    /** Sets the value of the 'timestampMillis' field */
    public me.distributedaccounts.mgmt.service.event.EventData.Builder setTimestampMillis(long value) {
      validate(fields()[1], value);
      this.timestampMillis = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timestampMillis' field has been set */
    public boolean hasTimestampMillis() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timestampMillis' field */
    public me.distributedaccounts.mgmt.service.event.EventData.Builder clearTimestampMillis() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public EventData build() {
      try {
        EventData record = new EventData();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.timestampMillis = fieldSetFlags()[1] ? this.timestampMillis : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
