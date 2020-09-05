package th.ac.su.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guessButton = findViewById(R.id.button_guess);
        // guessButton.setText("Hello");
        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numberEditText = findViewById(R.id.number_edit_text);
                String numText = numberEditText.getText().toString();
                int num = Integer.parseInt(numText);

                if (num == 50){
                    Toast t = Toast.makeText(MainActivity.this,"ถูกต้อง",Toast.LENGTH_LONG);
                    t.show();

                } else if(num > 50){
                    Toast t = Toast.makeText(MainActivity.this,"ผิด, มากเกินไป",Toast.LENGTH_LONG);
                    t.show();
                } else {
                    Toast t = Toast.makeText(MainActivity.this,"ผิด, น้อยเกินไป",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }
}