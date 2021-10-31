package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialogFragment;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class Dialoglog extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedIntance){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Informasi")
                .setMessage("JAWABAN ANDA SALAH HOHOHO")
                .setPositiveButton("OKE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        return builder.create();
    }


}
