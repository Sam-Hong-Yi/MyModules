package sg.edu.rp.c346.id22024848.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView twModule;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        twModule=findViewById(R.id.textViewModule);
        btnBack=findViewById(R.id.buttonBack);
        Intent intentReceived=getIntent();
        String module=intentReceived.getStringExtra("Module");
        if(module.equals("C346")){
            twModule.setText("Module Code: "+module+"\n Module Name: Android Programming\nAcademic Year: 2020\nSemester: 1\nModuleCredit: 4\nVenue: W66M");
        }
        else{
            twModule.setText("Module Code: "+module+"\n Module Name: iPad Programming\nAcademic Year: 2020\nSemester: 1\nModuleCredit: 4\nVenue: W66M");
        }
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent= new Intent(ModuleDetailActivity.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }
}