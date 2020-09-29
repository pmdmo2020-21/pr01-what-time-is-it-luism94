package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables para guardar los valores de la fecha y hora
        TextView dateText = findViewById(R.id.lblDateContent);
        TextView timeText = findViewById(R.id.lblTimeContent);

        //Variable Date que recoge la fecha y hora actual
        Date dateTime = new Date();
        //Formato para recoger la fecha
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        dateText.setText(format.format(dateTime));
        dateText.setTextSize(18);   //Tamaño de texto para los valores

        //Formato para la hora
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        timeText.setText(timeFormat.format(dateTime));
        timeText.setTextSize(18);   ////Tamaño de texto para los valores

        //Variables TextView para mostrar los valores en la pantalla de Android
        TextView dateHolder = findViewById(R.id.lblDate);
        TextView timeHolder = findViewById(R.id.lblTime);
        dateHolder.setTextSize(20); //Tamaño de texto para los textos Fecha y Hora de la pantalla
        timeHolder.setTextSize(20);
    }
}