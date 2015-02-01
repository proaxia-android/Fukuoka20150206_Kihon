package jp.co.proaxia_consulting.fukuoka20150206_kihon;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

//@EActivity(R.layout.activity_sample5)
public class SampleActivity5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample5);
    }

    public void onClickBtn(View view){
        // テキストビューのテキストを変更します
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("ありがとうございます。");
    }

// アノテーションを用いたクリック処理
//    @Click(R.id.button3)
//    void onClickBtn2() {
//        TextView tv = (TextView) findViewById(R.id.textView);
//        tv.setText("まいど！");
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sample5, menu);
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
