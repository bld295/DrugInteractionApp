package team4.drugapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DrugDictionaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug_dictionary);
    }
    public void startSettingsActivity (View view){
        Intent startSettingsIntent= new Intent(this, SettingsActivity.class);
        startActivity(startSettingsIntent);
    }
}
