package ma.enset.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class IntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        TextView textView1= findViewById(R.id.textView4);
        TextView textView2= findViewById(R.id.textView5);

        Bundle bundle= getIntent().getExtras();
        String username= bundle.getString("editTextUsername");
        String password= bundle.getString("editTextPassword");
        String tvUsername= bundle.getString("textViewUsername");
        String tvPassword= bundle.getString("textViewPassword");

        textView1.setText(tvUsername+" "+username);
        textView2.setText(tvPassword+" "+password);

    }
    public void back(View view){
        Intent myIntent=new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }
}