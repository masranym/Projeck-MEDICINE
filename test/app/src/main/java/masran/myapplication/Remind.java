package masran.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Mas'Z on 3/21/2018.
 */

public class Remind extends AppCompatActivity {
    Notification.Builder notification;
    final int id=11;
    EditText edit;
    Spinner spinner;
    private String text;
    String free=" ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remind);
        edit = (EditText) findViewById(R.id.edittext);
        spinner =(Spinner)findViewById(R.id.sptime);

        Button buttonremind = (Button) findViewById(R.id.gobutton);
        buttonremind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Remind.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
    public void showNotification(View view) {
                String text =spinner.getSelectedItem().toString();
                String name = edit.getText().toString();
                notification = new Notification.Builder(Remind.this);
                notification.setSmallIcon(R.drawable.b);
                notification.setWhen(System.currentTimeMillis());
                notification.setContentTitle("ได้เวลาทานยาแล้ว");
                notification.setTicker("มีข้อความใหม่");
                notification.setContentText("รับประทานยา"+name+free+text);
                Intent i = new Intent(this,Remind.class);
        PendingIntent panding=PendingIntent.getActivity(this,0,i,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(panding);
        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(id,notification.build());

        edit.setText("");

    }

    public void setText(String text) {
        this.text = text;

    }
}
