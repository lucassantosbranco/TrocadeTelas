package br.ulbra.trocadetelas;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    Button btnTela2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTela2 = findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    Tela2Activity.class
            );
            startActivity(intent);
        });
    }
}