/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package me.distributedaccounts.mgmt.service.event;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AccountClosedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AccountClosedEvent\",\"namespace\":\"me.distributedaccounts.mgmt.service.event\",\"fields\":[{\"name\":\"eventData\",\"type\":{\"type\":\"record\",\"name\":\"EventData\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"timestampMillis\",\"type\":\"long\"}]}},{\"name\":\"stateEffects\",\"type\":[{\"type\":\"record\",\"name\":\"AccountCreatedEffect\",\"fields\":[{\"name\":\"accountData\",\"type\":{\"type\":\"record\",\"name\":\"AccountData\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"balance\",\"type\":\"float\"},{\"name\":\"active\",\"type\":\"boolean\"},{\"name\":\"description\",\"type\":\"string\"}]}}]},{\"type\":\"record\",\"name\":\"AccountUpdatedEffect\",\"fields\":[{\"name\":\"accountData\",\"type\":\"AccountData\"}]},{\"type\":\"record\",\"name\":\"AccountDeletedEffect\",\"fields\":[{\"name\":\"accountId\",\"type\":\"string\"}]}]},{\"name\":\"accountId\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public me.distributedaccounts.mgmt.service.event.EventData eventData;
  @Deprecated public java.lang.Object stateEffects;
  @Deprecated public java.lang.CharSequence accountId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public AccountClosedEvent() {}

  /**
   * All-args constructor.
   */
  public AccountClosedEvent(me.distributedaccounts.mgmt.service.event.EventData eventData, java.lang.Object stateEffects, java.lang.CharSequence accountId) {
    this.eventData = eventData;
    this.stateEffects = stateEffects;
    this.accountId = accountId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventData;
    case 1: return stateEffects;
    case 2: return accountId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventData = (me.distributedaccounts.mgmt.service.event.EventData)value$; break;
    case 1: stateEffects = (java.lang.Object)value$; break;
    case 2: accountId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'eventData' field.
   */
  public me.distributedaccounts.mgmt.service.event.EventData getEventData() {
    return eventData;
  }

  /**
   * Sets the value of the 'eventData' field.
   * @param value the value to set.
   */
  public void setEventData(me.distributedaccounts.mgmt.service.event.EventData value) {
    this.eventData = value;
  }

  /**
   * Gets the value of the 'stateEffects' field.
   */
  public java.lang.Object getStateEffects() {
    return stateEffects;
  }

  /**
   * Sets the value of the 'stateEffects' field.
   * @param value the value to set.
   */
  public void setStateEffects(java.lang.Object value) {
    this.stateEffects = value;
  }

  /**
   * Gets the value of the 'accountId' field.
   */
  public java.lang.CharSequence getAccountId() {
    return accountId;
  }

  /**
   * Sets the value of the 'accountId' field.
   * @param value the value to set.
   */
  public void setAccountId(java.lang.CharSequence value) {
    this.accountId = value;
  }

  /** Creates a new AccountClosedEvent RecordBuilder */
  public static me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder newBuilder() {
    return new me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder();
  }
  
  /** Creates a new AccountClosedEvent RecordBuilder by copying an existing Builder */
  public static me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder newBuilder(me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder other) {
    return new me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder(other);
  }
  
  /** Creates a new AccountClosedEvent RecordBuilder by copying an existing AccountClosedEvent instance */
  public static me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder newBuilder(me.distributedaccounts.mgmt.service.event.AccountClosedEvent other) {
    return new me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder(other);
  }
  
  /**
   * RecordBuilder for AccountClosedEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AccountClosedEvent>
    implements org.apache.avro.data.RecordBuilder<AccountClosedEvent> {

    private me.distributedaccounts.mgmt.service.event.EventData eventData;
    private java.lang.Object stateEffects;
    private java.lang.CharSequence accountId;

    /** Creates a new Builder */
    private Builder() {
      super(me.distributedaccounts.mgmt.service.event.AccountClosedEvent.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventData)) {
        this.eventData = data().deepCopy(fields()[0].schema(), other.eventData);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.stateEffects)) {
        this.stateEffects = data().deepCopy(fields()[1].schema(), other.stateEffects);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.accountId)) {
        this.accountId = data().deepCopy(fields()[2].schema(), other.accountId);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AccountClosedEvent instance */
    private Builder(me.distributedaccounts.mgmt.service.event.AccountClosedEvent other) {
            super(me.distributedaccounts.mgmt.service.event.AccountClosedEvent.SCHEMA$);
      if (isValidValue(fields()[0], other.eventData)) {
        this.eventData = data().deepCopy(fields()[0].schema(), other.eventData);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.stateEffects)) {
        this.stateEffects = data().deepCopy(fields()[1].schema(), other.stateEffects);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.accountId)) {
        this.accountId = data().deepCopy(fields()[2].schema(), other.accountId);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'eventData' field */
    public me.distributedaccounts.mgmt.service.event.EventData getEventData() {
      return eventData;
    }
    
    /** Sets the value of the 'eventData' field */
    public me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder setEventData(me.distributedaccounts.mgmt.service.event.EventData value) {
      validate(fields()[0], value);
      this.eventData = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'eventData' field has been set */
    public boolean hasEventData() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'eventData' field */
    public me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder clearEventData() {
      eventData = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'stateEffects' field */
    public java.lang.Object getStateEffects() {
      return stateEffects;
    }
    
    /** Sets the value of the 'stateEffects' field */
    public me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder setStateEffects(java.lang.Object value) {
      validate(fields()[1], value);
      this.stateEffects = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'stateEffects' field has been set */
    public boolean hasStateEffects() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'stateEffects' field */
    public me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder clearStateEffects() {
      stateEffects = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'accountId' field */
    public java.lang.CharSequence getAccountId() {
      return accountId;
    }
    
    /** Sets the value of the 'accountId' field */
    public me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder setAccountId(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.accountId = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'accountId' field has been set */
    public boolean hasAccountId() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'accountId' field */
    public me.distributedaccounts.mgmt.service.event.AccountClosedEvent.Builder clearAccountId() {
      accountId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public AccountClosedEvent build() {
      try {
        AccountClosedEvent record = new AccountClosedEvent();
        record.eventData = fieldSetFlags()[0] ? this.eventData : (me.distributedaccounts.mgmt.service.event.EventData) defaultValue(fields()[0]);
        record.stateEffects = fieldSetFlags()[1] ? this.stateEffects : (java.lang.Object) defaultValue(fields()[1]);
        record.accountId = fieldSetFlags()[2] ? this.accountId : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}