public class LoanRequestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_request);
        
        EditText loanAmount = findViewById(R.id.loanAmount);
        EditText loanPurpose = findViewById(R.id.loanPurpose);
        Button submitLoanRequest = findViewById(R.id.submitLoanRequest);
        
        submitLoanRequest.setOnClickListener(v -> {
            String amount = loanAmount.getText().toString();
            String purpose = loanPurpose.getText().toString();
            
            // For now, just pass this information to the confirmation screen
            Intent intent = new Intent(LoanRequestActivity.this, LoanConfirmationActivity.class);
            intent.putExtra("loanAmount", amount);
            intent.putExtra("loanPurpose", purpose);
            startActivity(intent);
        });
    }
}
