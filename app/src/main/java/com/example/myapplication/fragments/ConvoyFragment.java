package com.example.myapplication.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.activities.contecntlist.contectlist;
import com.example.myapplication.activities.maplocation.MapsActivity;
import com.example.myapplication.adpaters.ConvoyAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ConvoyFragment extends Fragment {
    private RecyclerView recyclerView;
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_convoy,container,false);

        recyclerView = view.findViewById(R.id.recycler_convoy);
        textView = (TextView)view.findViewById(R.id.createaccount);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ConvoyAdapter(getContext()));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent map = new Intent(getContext(), contectlist.class);
                startActivity(map);
            }
        });

        return view;
    }
}
