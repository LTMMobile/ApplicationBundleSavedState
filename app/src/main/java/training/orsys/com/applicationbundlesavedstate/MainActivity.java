package training.orsys.com.applicationbundlesavedstate;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends Activity {

    private String _s;
    private EditText _editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        _editText = (EditText)findViewById(R.id.editText1);

        if( savedInstanceState == null ) {
            _s = "";
        }else {
            //_s = savedInstanceState.getString("key1");
            //_editText.setText(_s);
        }
        Log.v("ltm","OnCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v("ltm","OnDestroy");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.v("ltm", savedInstanceState.getString("key1"));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("key1", String.valueOf(_editText.getText()));
    }
}
