package com.example.testshake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private SensorManager sensorManager;
//    private float acelVal;
//    private float acelLast;
//    private float shake;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sensorManager=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
//        sensorManager.registerListener(sensorListener,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),SensorManager.SENSOR_DELAY_NORMAL);
//
//        acelVal=SensorManager.GRAVITY_EARTH;
//        acelLast=SensorManager.GRAVITY_EARTH;
//        shake=0.00f;

        Intent intent=new Intent(this,ExampleService.class);
        startForegroundService(intent);

    }
//    public final SensorEventListener sensorListener= new SensorEventListener() {
//        @Override
//        public void onSensorChanged(SensorEvent sensorEvent) {
//            float x=sensorEvent.values[0];
//            float y=sensorEvent.values[1];
//            float z=sensorEvent.values[2];
//
//            acelLast=acelVal;
//            acelVal=(float)Math.sqrt((double)(x*x+y*y+z*z));
//            float delta=acelVal-acelLast;
//            shake=shake*0.9f+delta;
//
//            if(shake>12)
//            {
//                Intent intent= new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(intent);
//            }
//
//        }
//
//        @Override
//        public void onAccuracyChanged(Sensor sensor, int i) {
//
//        }
//    };
}