package com.example.sqlsandbox03

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import kotlin.text.append



public class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, "incident.db", null, 1) {

    public val INCIDENT_TABLE = "INCIDENT_TABLE"
    public val COL_ID = "COLUMN_ID"
    public val COL_INCIDENT_NAME = "INCIDENT_NAME"
    public var COL_INCIDENT_TYPE = "INCIDENT_TYPE"
    public var COL_INCIDENT_LOC = "INCIDENT_LOC"
    public val COL_START = "START"

    override fun onCreate(db: SQLiteDatabase?) {
        var createTableStatement = buildString {
            append("CREATE TABLE ")
            append(INCIDENT_TABLE)
            append("( ")
            append(COL_ID)
            append("INTEGER PRIMARY KEY AUTOINCREMENT, ")
            append(COL_INCIDENT_NAME)
            append("TEXT, ")
            append(COL_INCIDENT_TYPE)
            append("TEXT, ")
            append(COL_INCIDENT_LOC)
            append("TEXT, ")
            append(COL_START)
            append("TEXT")
    }

        db?.execSQL(createTableStatement)
    }

    override fun onUpgrade(
        db: SQLiteDatabase?,
        oldVersion: Int,
        newVersion: Int
    ) {

    }

    public fun addOne(incident: Incident): Boolean {

        SQLiteDatabase db = this.writableDatabase

        return true
    }

}