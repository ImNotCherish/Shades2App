package asdf.zxcv.shades2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ColorFragment.OnListFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListFragmentInteraction(String item) {
        ColorFragment colorFragment = (ColorFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        if(colorFragment != null && colorFragment.isInLayout()) {
            colorFragment.setText(item);
        }
        else{
            Intent intent = new Intent(this, DescriptionActivity.class);
            intent.putExtra("Information", item);
            startActivity(intent);
        }
    }
}
