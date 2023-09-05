package com.example.dobcalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelectedDate : TextView? = null
    private var tvAgeInMinutes : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker : Button = findViewById(R.id.button3)

        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMinutes = findViewById(R.id.tvAgeInMinutes)

        btnDatePicker.setOnClickListener { view ->

            clickDatePicker()

        }

    }

    fun clickDatePicker() {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{
                view, selectedYear, selectedMonth, selectedDayOfMonth ->
                Toast.makeText(this,
                    "Year was $selectedYear, month was ${selectedMonth+1}, day of month was $selectedDayOfMonth", Toast.LENGTH_LONG).show()

                val selectedDate = "$selectedDayOfMonth/${selectedMonth+1}/$selectedYear"

                tvSelectedDate?.setText(selectedDate)

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.KOREA)

                val theDate = sdf.parse(selectedDate)
                theDate?.let {
                    val selectedDateInMinute = theDate.getTime() / 60000

                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))

                    val currentDateInMinutes = currentDate.time / 60000

                    val differenceInMinutes = currentDateInMinutes - selectedDateInMinute

                    tvAgeInMinutes?.text = differenceInMinutes.toString()
                }

                                              },
            year,
            month,
            day
            )

        dpd.datePicker.maxDate = System.currentTimeMillis() - 86400000
        dpd.show()


    }
}