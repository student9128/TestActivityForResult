package com.jing.testactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {  
	  
    private Button btn;  
    private TextView tv;  
    public static final int REQUSET = 1;  
  
    @Override  
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {  
        // TODO Auto-generated method stub  
        super.onActivityResult(requestCode, resultCode, data);  
        //requestCode标示请求的标示   resultCode表示有数据  
        if (requestCode == REQUSET && resultCode == RESULT_OK) {  
            String str = "账号"  
                    + data.getStringExtra(EditActivity.KEY_USER_ID) + "\n"  
                    + "密码"  
                    + data.getStringExtra(EditActivity.KEY_USER_PASSWORD);  
            tv.setText(str);  
        }  
        Toast.makeText(  
                this,  
                "requestCode=" + requestCode + ":" + "resultCode=" + resultCode,  
                Toast.LENGTH_LONG).show();  
    }  
  
    /** Called when the activity is first created. */  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        btn = (Button) findViewById(R.id.btn);  
        tv = (TextView) findViewById(R.id.tv01);  
        btn.setOnClickListener(new OnClickListener() {  
  
            @Override  
            public void onClick(View v) {  
                // TODO Auto-generated method stub  
                Intent intent = new Intent(getBaseContext(),  
                        EditActivity.class);  
                //发送意图标示为REQUSET=1  
                startActivityForResult(intent, REQUSET);  
            }  
        });  
  
    }  
}  