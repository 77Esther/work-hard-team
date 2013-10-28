package com.program.workhard;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class Login extends Activity {
	//����ȡ������½��ť
	private Button resetBtn,loginBtn;
	//�����û��������������
	private EditText userEditText,pwdEditText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("�û���½");
		setContentView(R.layout.login);
		resetBtn=(Button)findViewById(R.id.button1);//ʵ����ȡ����ť���
        loginBtn=(Button)findViewById(R.id.button2);//ʵ������½��ť���
        userEditText=(EditText)findViewById(R.id.editText2);//ʵ�����û�����������
        pwdEditText=(EditText)findViewById(R.id.editText1);//ʵ����������������
    }
    private void showDialog(String msg){
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setMessage(msg)
    		.setCancelable(false)
    		.setPositiveButton("ȷ��",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int id) {
				}
			});
    	AlertDialog alert = builder.create();
    	alert.show();
    }
}
