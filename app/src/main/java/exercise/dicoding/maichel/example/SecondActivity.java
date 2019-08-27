package exercise.dicoding.maichel.example;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        text = (TextView)findViewById(R.id.rand_numb);

        Random r = new Random();
        int numb = r.nextInt(15);

        text.setText(String.valueOf(numb));
    }
}
