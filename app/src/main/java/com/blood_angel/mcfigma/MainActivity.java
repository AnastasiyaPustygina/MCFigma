package com.blood_angel.mcfigma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MaterialToolbar toolbar = (MaterialToolbar) findViewById(R.id.mtb_main);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setColorFilter(Color.WHITE);
        toolbar.setTitle("Имя");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "BACK", Toast.LENGTH_SHORT).show();
            }
        });
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.edit:
                        Toast.makeText(MainActivity.this, "EDIT", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.exit:
                        Toast.makeText(MainActivity.this, "EXIT", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }
}