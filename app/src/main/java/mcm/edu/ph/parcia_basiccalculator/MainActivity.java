package mcm.edu.ph.parcia_basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMultiplication, btnAddition, btnSubtraction, btnModulo, btnDivision;

        btnAddition = findViewById(R.id.btnAddition);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnModulo = findViewById(R.id.btnModulo);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnDivision = findViewById(R.id.btnDivision);


        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnModulo.setOnClickListener(this);
        btnDivision.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch (v.getId()) {
            case R.id.btnAddition:
                answer = op1 + op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnSubtraction:
                answer = op1 - op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnMultiplication:
                answer = op1 * op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnModulo:
                answer = op1 % op2;
                txtAnswer.setText(Double.toString(answer));
                break;
            case R.id.btnDivision:
                answer = op1 / op2;
                txtAnswer.setText(Double.toString(answer));
                break;


        }
    }
}