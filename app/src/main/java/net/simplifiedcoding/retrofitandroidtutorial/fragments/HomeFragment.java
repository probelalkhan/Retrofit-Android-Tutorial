package net.simplifiedcoding.retrofitandroidtutorial.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import net.simplifiedcoding.retrofitandroidtutorial.R;
import net.simplifiedcoding.retrofitandroidtutorial.storage.SharedPrefManager;

public class HomeFragment extends Fragment {

    private TextView textViewEmail, textViewName, textViewSchool;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textViewEmail = view.findViewById(R.id.textViewEmail);
        textViewName = view.findViewById(R.id.textViewName);
        textViewSchool = view.findViewById(R.id.textViewSchool);

        textViewEmail.setText(SharedPrefManager.getInstance(getActivity()).getUser().getEmail());
        textViewName.setText(SharedPrefManager.getInstance(getActivity()).getUser().getName());
        textViewSchool.setText(SharedPrefManager.getInstance(getActivity()).getUser().getSchool());
    }
}
