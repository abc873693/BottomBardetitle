package rainvisitor.bottombardetitle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;

public class MainActivity extends AppCompatActivity {

    BottomBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.getTabWithId(R.id.tab_access_alarm).setPadding(0,30,0,0);
        bottomBar.getTabWithId(R.id.tab_add_circle).setPadding(0,30,0,0);
        bottomBar.getTabWithId(R.id.tab_attach_file).setPadding(0,30,0,0);
    }
}
