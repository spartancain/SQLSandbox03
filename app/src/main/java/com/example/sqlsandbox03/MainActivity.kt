package com.example.sqlsandbox03

import android.R.id
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.content.MediaType.Companion.PlainText
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.RecyclerView
import com.example.sqlsandbox03.ui.theme.SQLSandbox03Theme
import com.example.sqlsandbox03.R
import java.time.Instant
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Period
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MainActivity : ComponentActivity() {

    //references to layout controls (member variables)
    private lateinit var bSubmitIncident: Button
    private lateinit var bShowIncidents: Button
    private lateinit var incidentID: id
    private lateinit var ptIncidentName: TextView
    private lateinit var acIncidentType: AutoCompleteTextView
    private lateinit var acIncidentLoc: AutoCompleteTextView
    private lateinit var rvIncidentList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        bSubmitIncident = findViewById(R.id.bSubmitIncident)
        bShowIncidents = findViewById(R.id.bShowIncidents)
        ptIncidentName = findViewById(R.id.ptIncidentName)
        acIncidentType = findViewById(R.id.acIncidentType)
        acIncidentLoc = findViewById(R.id.acIncidentLoc)
        rvIncidentList = findViewById(R.id.rvIncidentList)

        //Button listeners for submit and show
        bSubmitIncident.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                // Action to perform when the button is clicked
                var incidentID = -1
                var incidentName = ptIncidentName.text.toString()
                var incidentType = acIncidentType.text.toString()
                var incidentLoc = acIncidentLoc.text.toString()
                val incident = Incident(incidentID,incidentName,incidentType,incidentLoc)

                try {
                    val toast = Toast.makeText(this@MainActivity, incident.toString(), Toast.LENGTH_SHORT)
                    toast.show()
                }
                catch (e: Exception) {
                    val toast = Toast.makeText(this@MainActivity, "Error Submitting Incident", Toast.LENGTH_SHORT)
                    toast.show()
                }

                val databaseHelper = DatabaseHelper(this@MainActivity)

            }
        })

        bShowIncidents.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // Action to perform when the button is clicked
            val toast = Toast.makeText(this@MainActivity, "Show Incident Button", Toast.LENGTH_SHORT)
                toast.show()
            }
        })

    }

}
