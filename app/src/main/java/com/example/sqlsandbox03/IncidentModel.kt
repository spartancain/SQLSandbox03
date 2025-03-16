package com.example.sqlsandbox03

import java.sql.Date

data class Incident {
    var id: Int,
    var IncidentName: String,
    var IncidentType: String,
    var IncidentLoc: String,
    lateinit var IncidentStart: Date,
    lateinit var IncidentEnd: Date
}