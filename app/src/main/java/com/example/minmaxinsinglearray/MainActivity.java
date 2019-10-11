package com.example.minmaxinsinglearray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a[] = {2, 45, 7, 89, 54, 13};
        Arrays.sort(a);
        System.out.println("Minimum is:" + a[0]);
        System.out.println("maximum is:" + a[a.length - 1]);
    }
}
