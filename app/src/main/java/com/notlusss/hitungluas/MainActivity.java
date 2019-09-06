package com.notlusss.hitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnHitung;
    private EditText edtPanjang;
    private EditText edtLebar;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHitung = (Button) findViewById(R.id.btn_hitung);
        edtLebar = (EditText) findViewById(R.id.edit_lebar);
        edtPanjang = (EditText) findViewById(R.id.edit_panjang);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjang = edtPanjang.getText().toString().trim();
                String lebar = edtLebar.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p*l;

                txtHasil.setText("Hasil: "+ luas);
            }
        });
    }

}
