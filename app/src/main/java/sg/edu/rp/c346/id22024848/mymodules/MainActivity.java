package sg.edu.rp.c346.id22024848.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView twAndroid;
    TextView twIpad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twAndroid=findViewById(R.id.textViewAndroid);
        twIpad=findViewById(R.id.textViewIpad);

        twAndroid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);
            }
        });
        twIpad.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "C349");
                startActivity(intent);
            }
        });

    }
}