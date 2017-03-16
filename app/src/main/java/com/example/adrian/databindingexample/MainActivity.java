package com.example.adrian.databindingexample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.adrian.databindingexample.databinding.ActivityMainBinding;
import com.example.adrian.databindingexample.model.SampleDataViewModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final SampleDataViewModel sampleDataViewModel = new SampleDataViewModel(1);
        sampleDataViewModel.text.set("test");
        sampleDataViewModel.id = 1;
        activityMainBinding.setModel(sampleDataViewModel);

        activityMainBinding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "text: " + sampleDataViewModel.getText().get().toString());
            }
        });
    }
}
