package com.example.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    View fathur;
    EditText edttext1;
    TextView txtview1;
    Button btn1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        cara untuk memanggil tampilan fragment
        fathur = inflater.inflate(R.layout.activity_fragment_satu,container,false);
        edttext1 = fathur.findViewById(R.id.edittext1);
        txtview1 = fathur.findViewById((R.id.textview1));
        btn1 = fathur.findViewById(R.id.button1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = edttext1.getText().toString();
                input = input.toLowerCase();
                String[] arrayInput = input.split( " ");
                String hasil = "";
                for (int i = arrayInput.length-1; i > 0; i--){
                    System.out.println(arrayInput[i]);
                    if (arrayInput[i].equals("bohong")) {
                        arrayInput[i-1] = malek(arrayInput[i-1]);
                    }
                    hasil = arrayInput[0];
                }
                txtview1.setText(hasil);
            }
        });
        return fathur;
    }

    public String malek(String inputan){
        String result = "";
        if(inputan.equals("bohong")){
            result = "jujur";
        }else {
            result = "bohong";
        }
    return result;
    }
}
