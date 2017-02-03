package css.cis3334.participation3tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etBillAmount;
    EditText etNumParty;
    TextView textViewTotalTip;
    TextView textViewPerPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBillAmount = (EditText) findViewById((R.id.BillAmountEditText));
        etNumParty = (EditText) findViewById((R.id.NumPartyEditText));
        textViewTotalTip = (TextView) findViewById((R.id.TotalTipTextView));
        textViewPerPerson = (TextView) findViewById((R.id.PerPersonTextView));

    }

    public void TipButtonClick(View view) {

        Integer NumberOfPeople = Integer.parseInt(etNumParty.getText().toString());
        Double TipBillAmount = Double.parseDouble(etBillAmount.getText().toString()) * 0.1;
        Double IndividualTipAmount = TipBillAmount / NumberOfPeople;

        textViewTotalTip.setText("The total tip is $" + TipBillAmount.toString());

        if (NumberOfPeople <= 1){
            textViewPerPerson.setText("You should tip $" + TipBillAmount.toString());
        } else {
            textViewPerPerson.setText("Each person should tip $" + IndividualTipAmount.toString());
        }
    }

}
