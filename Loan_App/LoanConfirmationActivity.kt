public class LoanConfirmationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan_confirmation);
        
        TextView loanDetails = findViewById(R.id.loanDetails);
        Button backToMainBtn = findViewById(R.id.backToMainBtn);
        
        String amount = getIntent().getStringExtra("loanAmount");
        String purpose = getIntent().getStringExtra("loanPurpose");
        
        loanDetails.setText("Loan Amount: " + amount + "\nPurpose: " + purpose);
        
        backToMainBtn.setOnClickListener(v -> {
            Intent intent = new Intent(LoanConfirmationActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
