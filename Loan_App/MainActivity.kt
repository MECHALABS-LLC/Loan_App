public class MainActivity extends AppCompatActivity {
    private TextView loanStatus;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        loanStatus = findViewById(R.id.loanStatus);
        Button requestLoanBtn = findViewById(R.id.requestLoanBtn);
        
        requestLoanBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoanRequestActivity.class);
            startActivity(intent);
        });
    }
}
