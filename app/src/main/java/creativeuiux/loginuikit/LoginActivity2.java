package creativeuiux.loginuikit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class LoginActivity2 extends AppCompatActivity {

    EditText edtpass;
    ImageView toogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

       /* edtpass = (EditText)findViewById(R.id.edtpass);
        toogle = (ImageView)findViewById(R.id.toogle);

        toogle.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                switch ( event.getAction() ) {
                    case MotionEvent.ACTION_DOWN:
                        edtpass.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                        break;
                    case MotionEvent.ACTION_UP:
                        edtpass.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT);
                        break;
                }
                return true;
            }
        });*/
    }

}
