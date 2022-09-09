package com.example.appquiz3bimestre;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class result extends AppCompatActivity {
        TextView username;
        ImageView trophy;

        private SensorManager sensorManager;
        private Sensor gyroscopeSensor;
        private SensorEventListener gryroscopeListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        username = findViewById(R.id.username_result);
        trophy = findViewById(R.id.trophy);

        sensorManager= (SensorManager) getSystemService(SENSOR_SERVICE);
        gyroscopeSensor = sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);

        gryroscopeListener = new SensorEventListener() {

            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                trophy.setRotationX(50);
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };

    }
}