/*
 * This file is generated by jOOQ.
*/
package org.jooq.meta.mysql.information_schema.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.mysql.information_schema.InformationSchema;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines extends TableImpl<Record> {

    private static final long serialVersionUID = -41886606;

    /**
     * The reference instance of <code>information_schema.ROUTINES</code>
     */
    public static final Routines ROUTINES = new Routines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.ROUTINES.SPECIFIC_NAME</code>.
     */
    public static final TableField<Record, String> SPECIFIC_NAME = createField("SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_CATALOG</code>.
     */
    public static final TableField<Record, String> ROUTINE_CATALOG = createField("ROUTINE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_SCHEMA</code>.
     */
    public static final TableField<Record, String> ROUTINE_SCHEMA = createField("ROUTINE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_NAME</code>.
     */
    public static final TableField<Record, String> ROUTINE_NAME = createField("ROUTINE_NAME", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_TYPE</code>.
     */
    public static final TableField<Record, String> ROUTINE_TYPE = createField("ROUTINE_TYPE", org.jooq.impl.SQLDataType.VARCHAR(9).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.DATA_TYPE</code>.
     */
    public static final TableField<Record, String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.CLOB, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public static final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_OCTET_LENGTH</code>.
     */
    public static final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.NUMERIC_PRECISION</code>.
     */
    public static final TableField<Record, UInteger> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.NUMERIC_SCALE</code>.
     */
    public static final TableField<Record, UInteger> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.DATETIME_PRECISION</code>.
     */
    public static final TableField<Record, UInteger> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_SET_NAME</code>.
     */
    public static final TableField<Record, String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.COLLATION_NAME</code>.
     */
    public static final TableField<Record, String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR(64), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.DTD_IDENTIFIER</code>.
     */
    public static final TableField<Record, String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.CLOB, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_BODY</code>.
     */
    public static final TableField<Record, String> ROUTINE_BODY = createField("ROUTINE_BODY", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_DEFINITION</code>.
     */
    public static final TableField<Record, String> ROUTINE_DEFINITION = createField("ROUTINE_DEFINITION", org.jooq.impl.SQLDataType.CLOB, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.EXTERNAL_NAME</code>.
     */
    public static final TableField<Record, byte[]> EXTERNAL_NAME = createField("EXTERNAL_NAME", org.jooq.impl.SQLDataType.BINARY, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.EXTERNAL_LANGUAGE</code>.
     */
    public static final TableField<Record, byte[]> EXTERNAL_LANGUAGE = createField("EXTERNAL_LANGUAGE", org.jooq.impl.SQLDataType.BINARY, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.PARAMETER_STYLE</code>.
     */
    public static final TableField<Record, String> PARAMETER_STYLE = createField("PARAMETER_STYLE", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.IS_DETERMINISTIC</code>.
     */
    public static final TableField<Record, String> IS_DETERMINISTIC = createField("IS_DETERMINISTIC", org.jooq.impl.SQLDataType.VARCHAR(3).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.SQL_DATA_ACCESS</code>.
     */
    public static final TableField<Record, String> SQL_DATA_ACCESS = createField("SQL_DATA_ACCESS", org.jooq.impl.SQLDataType.VARCHAR(17).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.SQL_PATH</code>.
     */
    public static final TableField<Record, byte[]> SQL_PATH = createField("SQL_PATH", org.jooq.impl.SQLDataType.BINARY, ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.SECURITY_TYPE</code>.
     */
    public static final TableField<Record, String> SECURITY_TYPE = createField("SECURITY_TYPE", org.jooq.impl.SQLDataType.VARCHAR(7).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.CREATED</code>.
     */
    public static final TableField<Record, Timestamp> CREATED = createField("CREATED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.LAST_ALTERED</code>.
     */
    public static final TableField<Record, Timestamp> LAST_ALTERED = createField("LAST_ALTERED", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.SQL_MODE</code>.
     */
    public static final TableField<Record, String> SQL_MODE = createField("SQL_MODE", org.jooq.impl.SQLDataType.VARCHAR(503).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.ROUTINE_COMMENT</code>.
     */
    public static final TableField<Record, String> ROUTINE_COMMENT = createField("ROUTINE_COMMENT", org.jooq.impl.SQLDataType.CLOB.nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.DEFINER</code>.
     */
    public static final TableField<Record, String> DEFINER = createField("DEFINER", org.jooq.impl.SQLDataType.VARCHAR(93).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.CHARACTER_SET_CLIENT</code>.
     */
    public static final TableField<Record, String> CHARACTER_SET_CLIENT = createField("CHARACTER_SET_CLIENT", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.COLLATION_CONNECTION</code>.
     */
    public static final TableField<Record, String> COLLATION_CONNECTION = createField("COLLATION_CONNECTION", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), ROUTINES, "");

    /**
     * The column <code>information_schema.ROUTINES.DATABASE_COLLATION</code>.
     */
    public static final TableField<Record, String> DATABASE_COLLATION = createField("DATABASE_COLLATION", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), ROUTINES, "");

    /**
     * No further instances allowed
     */
    private Routines() {
        this(DSL.name("ROUTINES"), null);
    }

    private Routines(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Routines(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}