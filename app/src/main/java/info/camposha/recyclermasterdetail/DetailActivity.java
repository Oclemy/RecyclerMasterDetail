package info.camposha.recyclermasterdetail;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DetailActivity extends AppCompatActivity {

    //VIEWS
    ImageView img;
    TextView nameTxt,posTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //RECEIVE OUR DATA
        Intent i=getIntent();

        final String name=i.getExtras().getString("Name");
        final String pos=i.getExtras().getString("Position");
        final int image=i.getExtras().getInt("Image");


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, name, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //REFERENCE VIEWS FROM XML
        img= (ImageView) findViewById(R.id.playerImage);
        nameTxt= (TextView) findViewById(R.id.nameTxt);
        posTxt= (TextView) findViewById(R.id.posTxt);

        //ASSIGN DATA TO THOSE VIEWS
        img.setImageResource(image);
        nameTxt.setText("NAME :   "+name);
        posTxt.setText("POSITION : "+pos);



    }

}
