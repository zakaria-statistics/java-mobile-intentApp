package ma.enset.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
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
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}