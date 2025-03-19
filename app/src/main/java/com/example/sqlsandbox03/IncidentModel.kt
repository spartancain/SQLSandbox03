package com.example.sqlsandbox03

import java.sql.Date

//no idea if I'm building this right... data or constructor required??
data class Incident public constructor(
    val incidentID: Int,
    var incidentName: String,
    var incidentType: String,
    var incidentLoc: String,
    //val incidentStart: Date,
    //var incidentEnd: Date
) {
    override fun toString(): String {
        return buildString {
            append("Incident{")
            append("incidentID=")
            append(incidentID)
            append(", incidentName='")
            append(incidentName)
            append('\'')
            append(", incidentType=")
            append(incidentType)
            append(", incidentLoc=")
            append(incidentLoc)
            //append(", incidentStart=")
            //append(incidentStart)
            append('}')
        }
    }
}