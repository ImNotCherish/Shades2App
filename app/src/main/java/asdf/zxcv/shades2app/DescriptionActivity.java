package asdf.zxcv.shades2app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DescriptionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.fragment_description);
        Intent intent = getIntent();
        String shadeInformation = intent.getStringExtra("Information");
        TextView information = findViewById(R.id.description);
        information.setText(shadeInformation);

    }
}
