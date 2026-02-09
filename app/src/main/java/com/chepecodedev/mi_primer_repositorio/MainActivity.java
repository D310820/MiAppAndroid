package com.chepecodedev.mi_primer_repositorio;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Enlaza el botón
        Button btnGitHub = findViewById(R.id.btnGitHub);

        // Configura el clic
        btnGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String githubUrl = "https://github.com/D310820/MiAppAndroid.git";
                // Crea el intent para abrir el navegador
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl));

                // Verifica que haya una app que pueda manejar el intent (navegador)
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    // Mensaje si no hay navegador instalado
                    Toast.makeText(MainActivity.this,
                            "No se encontró un navegador para abrir el enlace",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}