package sg.edu.rp.c346.id20016584.billcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textViewTotal;
    TextView textViewPay;
    Button buttonsplit;
    Button buttonreset;
    RadioGroup radiopayment;
    RadioButton radioButtonCash;
    RadioButton radioButtonPayNow;
    ToggleButton toggleButtonsvs;
    ToggleButton toggleButtongst;
    EditText editTextPax;
    EditText editTextAmount;
    EditText editTextDiscount;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTotal=findViewById(R.id.textViewTotal);
        textViewPay=findViewById(R.id.textViewPay);
        buttonsplit=findViewById(R.id.buttonsplit);
        buttonreset=findViewById(R.id.buttonreset);
        radiopayment=findViewById(R.id.radiopayment);
        radioButtonCash=findViewById(R.id.radioButtonCash);
        radioButtonPayNow=findViewById(R.id.radioButtonPayNow);
        toggleButtonsvs=findViewById(R.id.toggleButtonsvs);
        toggleButtongst=findViewById(R.id.toggleButtongst);
        editTextAmount=findViewById(R.id.editTextAmount);
        editTextPax=findViewById(R.id.editTextPax);
        editTextDiscount=findViewById(R.id.editTextDiscount);

}