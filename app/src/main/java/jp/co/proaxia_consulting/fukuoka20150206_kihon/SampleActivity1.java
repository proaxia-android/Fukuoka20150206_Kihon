package jp.co.proaxia_consulting.fukuoka20150206_kihon;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


// ①画面をあらわすクラスを拡張してアプリとします
public class SampleActivity1 extends ActionBarActivity {

    @Override
    // ②画面を起動したときに呼び出されるメソッドを記述します
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// この例はxmlファイルを用いずにレイアウトを作成する例です
// AndroidStudioにて自動生成されたコード：コメントアウト
//        setContentView(R.layout.activity_sample1);

// ここからコード追加
        // ③レイアウトを作成します
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        // レイアウトを画面に設定します
        setContentView(ll);

        // ④ビューを作成します
        TextView tv1 = new TextView(this);
        tv1.setText("ようこそアンドロイドへ!");
        TextView tv2 = new TextView(this);
        tv2.setText("アンドロイドをはじめましょう!");

        // レイアウトにビューを追加します
        ll.addView(tv1);
        ll.addView(tv2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sample1, menu);
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
