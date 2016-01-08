package iutbg.lpiem.observeur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Observeur{
    int count=0;
    TextView tvCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCount=(TextView)findViewById(R.id.tvCount);
        AsyncCount asyncCount=new AsyncCount();
        asyncCount.addObserveur(this);
        asyncCount.execute();
    }

    @Override
    public void update() {
        count++;
        tvCount.setText(""+count);
    }
}
