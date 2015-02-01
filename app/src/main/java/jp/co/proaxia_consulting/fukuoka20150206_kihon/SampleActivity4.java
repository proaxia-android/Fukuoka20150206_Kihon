package jp.co.proaxia_consulting.fukuoka20150206_kihon;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class SampleActivity4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample4);

        // ②ソースにリスナを登録します
        findViewById(R.id.button).setOnClickListener(new SampleClickListener());
    }

    // ①リスナクラスを宣言します
    class SampleClickListener implements OnClickListener
    {
        // ボタンが押されたとき、このメソッドが呼び出されます
        public void onClick(View v)
        {
            // テキストビューのテキストを変更します
            TextView tv = (TextView) findViewById(R.id.textView);
            tv.setText("ありがとうございます。");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sample4, menu);
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
