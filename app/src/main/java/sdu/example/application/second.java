package sdu.example.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void dlina(View v) {
        Intent intent = new Intent(second.this, dlina.class);
        startActivity(intent);
    }

    public void massa(View v) {
        Intent intent = new Intent(second.this, massa.class);
        startActivity(intent);
    }

    public void area(View v) {
        Intent intent = new Intent(second.this, area.class);
        startActivity(intent);
    }

    public void volume(View v) {
        Intent intent = new Intent(second.this, volume.class);
        startActivity(intent);
    }
}
