package com.example.front;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CardView btnGeladeira;
    private CardView btnFreezer;
    private CardView btnDespensa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnGeladeira = findViewById(R.id.abrirGeladeira);
        btnFreezer = findViewById(R.id.abrirFreezer);
        btnDespensa = findViewById(R.id.abrirDespensa);

        btnGeladeira.setOnClickListener(v -> {
            startActivity(new Intent(this, GeladeiraActivity.class));
        });

        btnFreezer.setOnClickListener(v -> {
            Log.d("DEBUG", "Intent do Freezer chamada!");
            startActivity(new Intent(this, FreezerActivity.class));
        });

        btnDespensa.setOnClickListener(v -> {
            startActivity(new Intent(this, DespensaActivity.class));
        });
    }
}
