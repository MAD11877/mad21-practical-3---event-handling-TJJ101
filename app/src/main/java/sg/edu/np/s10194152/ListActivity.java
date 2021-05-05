package sg.edu.np.s10194152;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView androidimgbg2 = findViewById(R.id.androidimg2);
        ImageView androidimg2 = findViewById(R.id.androidimg2);

        AlertDialog.Builder profile  = new AlertDialog.Builder(this);
        profile.setTitle("Profile");
        profile.setMessage("MADness");
        //profile.setCancelable();
        //profile.setPositiveButton();

        androidimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}