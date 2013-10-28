package com.program.workhard;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
	//声明取消、登陆按钮
	private Button resetBtn,loginBtn;
	//声明用户名、密码输入框
	private EditText userEditText,pwdEditText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("用户登陆");
		setContentView(R.layout.login);
		resetBtn=(Button)findViewById(R.id.button1);//实例化取消按钮组件
        loginBtn=(Button)findViewById(R.id.button2);//实例化登陆按钮组件
        userEditText=(EditText)findViewById(R.id.editText2);//实例化用户名输入框组件
        pwdEditText=(EditText)findViewById(R.id.editText1);//实例化密码输入框组件
    }
    private void showDialog(String msg){
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setMessage(msg)
    		.setCancelable(false)
    		.setPositiveButton("确定",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int id) {
				}
			});
    	AlertDialog alert = builder.create();
    	alert.show();
    }
}
