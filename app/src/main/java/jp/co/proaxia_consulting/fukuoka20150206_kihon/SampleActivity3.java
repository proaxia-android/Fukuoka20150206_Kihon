package jp.co.proaxia_consulting.fukuoka20150206_kihon;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


public class SampleActivity3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// この例はxmlファイルを用いずにレイアウトを作成する例です
// AndroidStudioにて自動生成されたコード：コメントアウト
//        setContentView(R.layout.activity_sample3);

// ここからコード追加
        // テーブルレイアウトを作成します
        TableLayout tl = new TableLayout(this);
        setContentView(tl);

        // 1行目
        TextView tv1 = new TextView(this);
        tv1.setText("user");
        EditText et1 = new EditText(this);
        et1.setWidth(300);
        TableRow tr1 = new TableRow(this);
        tr1.addView(tv1);
        tr1.addView(et1);

        // 2行目
        TextView tv2 = new TextView(this);
        tv2.setText("password");
        EditText et2 = new EditText(this);
        TableRow tr2 = new TableRow(this);
        tr2.addView(tv2);
        tr2.addView(et2);

        // 3行目
        Button bt = new Button(this);
        bt.setText("ログイン");
        // 2列にまたがって配置
        TableRow.LayoutParams rowLayout = new TableRow.LayoutParams();
        rowLayout.span = 2;
        TableRow tr3 = new TableRow(this);
        tr3.addView(bt, rowLayout);

        tl.addView(tr1);
        tl.addView(tr2);
        tl.addView(tr3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sample3, menu);
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
