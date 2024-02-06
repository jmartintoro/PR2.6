package com.example.fragmentsjoelmartin.ui.sensor;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentsjoelmartin.R;
import com.example.fragmentsjoelmartin.databinding.FragmentDashboardBinding;
import com.example.fragmentsjoelmartin.databinding.FragmentSensorBinding;
import com.example.fragmentsjoelmartin.ui.dashboard.DashboardViewModel;

public class SensorFragment extends Fragment {

    private FragmentSensorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SensorViewModel sensorViewModel =
                new ViewModelProvider(this).get(SensorViewModel.class);

        binding = FragmentSensorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSensor;
        sensorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}