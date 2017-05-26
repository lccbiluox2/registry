/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.hortonworks.registries.schemaregistry.serdes.avro;
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TestRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TestRecord\",\"namespace\":\"com.hortonworks.registries.schemaregistry.serdes.avro\",\"fields\":[{\"name\":\"field1\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"field2\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public String field1;
  @Deprecated public String field2;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TestRecord() {}

  /**
   * All-args constructor.
   */
  public TestRecord(String me, String field2) {
    this.field1 = me;
    this.field2 = field2;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return field1;
    case 1: return field2;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: field1 = (String)value$; break;
    case 1: field2 = (String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'me' field.
   */
  public String getField1() {
    return field1;
  }

  /**
   * Sets the value of the 'me' field.
   * @param value the value to set.
   */
  public void setField1(String value) {
    this.field1 = value;
  }

  /**
   * Gets the value of the 'field2' field.
   */
  public String getField2() {
    return field2;
  }

  /**
   * Sets the value of the 'field2' field.
   * @param value the value to set.
   */
  public void setField2(String value) {
    this.field2 = value;
  }

  /** Creates a new AddedFieldTestRecord RecordBuilder */
  public static TestRecord.Builder newBuilder() {
    return new TestRecord.Builder();
  }

  /** Creates a new AddedFieldTestRecord RecordBuilder by copying an existing Builder */
  public static TestRecord.Builder newBuilder(TestRecord.Builder other) {
    return new TestRecord.Builder(other);
  }

  /** Creates a new AddedFieldTestRecord RecordBuilder by copying an existing AddedFieldTestRecord instance */
  public static TestRecord.Builder newBuilder(TestRecord other) {
    return new TestRecord.Builder(other);
  }

  /**
   * RecordBuilder for AddedFieldTestRecord instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestRecord>
    implements org.apache.avro.data.RecordBuilder<TestRecord> {

    private String field1;
    private String field2;

    /** Creates a new Builder */
    private Builder() {
      super(TestRecord.SCHEMA$);
    }

    /** Creates a Builder by copying an existing Builder */
    private Builder(TestRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.field1)) {
        this.field1 = data().deepCopy(fields()[0].schema(), other.field1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.field2)) {
        this.field2 = data().deepCopy(fields()[1].schema(), other.field2);
        fieldSetFlags()[1] = true;
      }
    }

    /** Creates a Builder by copying an existing AddedFieldTestRecord instance */
    private Builder(TestRecord other) {
            super(TestRecord.SCHEMA$);
      if (isValidValue(fields()[0], other.field1)) {
        this.field1 = data().deepCopy(fields()[0].schema(), other.field1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.field2)) {
        this.field2 = data().deepCopy(fields()[1].schema(), other.field2);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'me' field */
    public String getField1() {
      return field1;
    }

    /** Sets the value of the 'me' field */
    public TestRecord.Builder setField1(String value) {
      validate(fields()[0], value);
      this.field1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /** Checks whether the 'me' field has been set */
    public boolean hasField1() {
      return fieldSetFlags()[0];
    }

    /** Clears the value of the 'me' field */
    public TestRecord.Builder clearField1() {
      field1 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'field2' field */
    public String getField2() {
      return field2;
    }

    /** Sets the value of the 'field2' field */
    public TestRecord.Builder setField2(String value) {
      validate(fields()[1], value);
      this.field2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /** Checks whether the 'field2' field has been set */
    public boolean hasField2() {
      return fieldSetFlags()[1];
    }

    /** Clears the value of the 'field2' field */
    public TestRecord.Builder clearField2() {
      field2 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public TestRecord build() {
      try {
        TestRecord record = new TestRecord();
        record.field1 = fieldSetFlags()[0] ? this.field1 : (String) defaultValue(fields()[0]);
        record.field2 = fieldSetFlags()[1] ? this.field2 : (String) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
