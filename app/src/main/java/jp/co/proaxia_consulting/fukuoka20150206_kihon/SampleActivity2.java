package jp.co.proaxia_consulting.fukuoka20150206_kihon;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;


public class SampleActivity2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// この例はxmlファイルを用いずにレイアウトを作成する例です
// AndroidStudioにて自動生成されたコード：コメントアウト
//        setContentView(R.layout.activity_sample2);

// ここからコード追加
        // リニアレイアウトを作成します
        LinearLayout ll = new LinearLayout(this);
        // 列として並べるか、行として並べるかを指定
//        ll.setOrientation(LinearLayout.VERTICAL); // 列
        ll.setOrientation(LinearLayout.HORIZONTAL); // 行
        setContentView(ll);

        // ボタンを10個作成します
        Button[] bt = new Button[10];

        for(int i=0; i<bt.length; i++)
        {
            bt[i] = new Button(this);
            bt[i].setText(Integer.toString(i));
            ll.addView(bt[i]); // レイアウトにボタンを追加します
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sample2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
