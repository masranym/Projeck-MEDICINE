package masran.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Mas'Z on 3/21/2018.
 */

public class Health extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health);

//        Button buttonremind = (Button) findViewById(R.id.gobutton);
//        buttonremind.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Health.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
