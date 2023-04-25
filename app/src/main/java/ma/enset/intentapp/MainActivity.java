package ma.enset.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void submit(View view){
        TextView textViewUsername= findViewById(R.id.textView1);
        TextView textViewPassword= findViewById(R.id.textView2);
        EditText editTextUsername= findViewById(R.id.editText);
        EditText editTextPassword= findViewById(R.id.editText2);

        Intent myIntent=new Intent(this, IntentActivity.class);
        Bundle bundle=new Bundle();

        bundle.putString("editTextUsername", editTextUsername.getText().toString());
        bundle.putString("editTextPassword", editTextPassword.getText().toString());
        bundle.putString("textViewUsername", textViewUsername.getText().toString());
        bundle.putString("textViewPassword", textViewPassword.getText().toString());
        myIntent.putExtras(bundle);
        startActivity(myIntent);
    }
}