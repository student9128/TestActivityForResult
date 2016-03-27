package com.jing.testactivityforresult;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends Activity {

	private Button btn;  
    private EditText et_1;  
    private EditText et_2;  
    public static final String KEY_USER_ID="USER_ID";  
    public static final String KEY_USER_PASSWORD="USER_PASSWORD";  
      
    /** Called when the activity is first created. */  
    @Override  
    public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_edit);  
        btn=(Button)findViewById(R.id.btn);  
        et_1=(EditText)findViewById(R.id.et_1);  
        et_2=(EditText)findViewById(R.id.et_2);  
          
          
        btn.setOnClickListener(new OnClickListener() {  
              
            @Override  
            public void onClick(View v) {  
                // TODO Auto-generated method stub  
                Intent intent=new Intent();  
                intent.putExtra(KEY_USER_ID, et_1.getText().toString());  
                intent.putExtra(KEY_USER_PASSWORD, et_2.getText().toString());  
                setResult(RESULT_OK, intent);  
                finish();  
            }  
        });           
    }  

}
