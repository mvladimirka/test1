package com.raizlabs.android.dbflow.config;

import hr.tvz.android.listavladimir.MyApplication;
import hr.tvz.android.listavladimir.NoteTable_Table;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class MyDatabaseMyDatabase_Database extends DatabaseDefinition {
  public MyDatabaseMyDatabase_Database(DatabaseHolder holder) {
    addModelAdapter(new NoteTable_Table(this), holder);
  }

  @Override
  public final Class<?> getAssociatedDatabaseClassFile() {
    return MyApplication.MyDatabase.class;
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 1;
  }

  @Override
  public final String getDatabaseName() {
    return "MyDatabase";
  }
}
