package com.example.sqlsandbox03

import java.sql.Date

//no idea if I'm building this right... data or constructor required??
data class Incident public constructor(
    val IncidentID: Int,
    var IncidentName: String,
    var IncidentType: String,
    var IncidentLoc: String,
    val IncidentStart: Date,
    var IncidentEnd: Date
) {

}