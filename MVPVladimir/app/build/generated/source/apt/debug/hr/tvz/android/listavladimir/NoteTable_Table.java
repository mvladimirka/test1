package hr.tvz.android.listavladimir;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.OperatorGroup;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class NoteTable_Table extends ModelAdapter<MyApplication.NoteTable> {
  /**
   * Primary Key */
  public static final Property<Integer> id = new Property<Integer>(MyApplication.NoteTable.class, "id");

  public static final Property<String> title = new Property<String>(MyApplication.NoteTable.class, "title");

  public static final Property<String> date = new Property<String>(MyApplication.NoteTable.class, "date");

  public static final Property<String> content = new Property<String>(MyApplication.NoteTable.class, "content");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,title,date,content};

  public NoteTable_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<MyApplication.NoteTable> getModelClass() {
    return MyApplication.NoteTable.class;
  }

  @Override
  public final String getTableName() {
    return "`NoteTable`";
  }

  @Override
  public final MyApplication.NoteTable newInstance() {
    return new MyApplication.NoteTable();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`title`":  {
        return title;
      }
      case "`date`":  {
        return date;
      }
      case "`content`":  {
        return content;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, MyApplication.NoteTable model) {
    values.put("`id`", model.id);
    values.put("`title`", model.getTitle());
    values.put("`date`", model.getDate());
    values.put("`content`", model.getContent());
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement,
      MyApplication.NoteTable model, int start) {
    statement.bindLong(1 + start, model.id);
    statement.bindStringOrNull(2 + start, model.getTitle());
    statement.bindStringOrNull(3 + start, model.getDate());
    statement.bindStringOrNull(4 + start, model.getContent());
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement,
      MyApplication.NoteTable model) {
    statement.bindLong(1, model.id);
    statement.bindStringOrNull(2, model.getTitle());
    statement.bindStringOrNull(3, model.getDate());
    statement.bindStringOrNull(4, model.getContent());
    statement.bindLong(5, model.id);
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement,
      MyApplication.NoteTable model) {
    statement.bindLong(1, model.id);
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `NoteTable`(`id`,`title`,`date`,`content`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `NoteTable` SET `id`=?,`title`=?,`date`=?,`content`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `NoteTable` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `NoteTable`(`id` INTEGER, `title` TEXT, `date` TEXT, `content` TEXT, PRIMARY KEY(`id`))";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, MyApplication.NoteTable model) {
    model.id = cursor.getIntOrDefault("id");
    model.setTitle(cursor.getStringOrDefault("title"));
    model.setDate(cursor.getStringOrDefault("date"));
    model.setContent(cursor.getStringOrDefault("content"));
  }

  @Override
  public final boolean exists(MyApplication.NoteTable model, DatabaseWrapper wrapper) {
    return SQLite.selectCountOf()
    .from(MyApplication.NoteTable.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(MyApplication.NoteTable model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.id));
    return clause;
  }
}
