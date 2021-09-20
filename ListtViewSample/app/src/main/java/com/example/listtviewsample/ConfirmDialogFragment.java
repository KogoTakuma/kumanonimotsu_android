package com.example.listtviewsample;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;


public class ConfirmDialogFragment extends DialogFragment {

    final String[] items = {"冷蔵", "不在票", "大型"};
    final ArrayList<Integer> checkedItems = new ArrayList<Integer>();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("の荷物登録確認");
        builder.setMessage(R.string.dialog_msg);
        builder.setPositiveButton(R.string.dialog_btn_ok, new DialogButtonClickListener());
        builder.setNegativeButton(R.string.dialog_btn_ng, new DialogButtonClickListener());
        AlertDialog dialog = builder.create();
       return dialog;
    }

    private class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public void onClick(DialogInterface dialog, int which){
            String msg  ="";
            //アクション分岐
            switch(which) {
                //if positivebutton
                case DialogInterface.BUTTON_POSITIVE:
                    //荷物登録用のメッセージを格納
                    msg = getString(R.string.dialog_ok_toast);
                    break;
                //if negative
                case DialogInterface.BUTTON_NEGATIVE:
                    //キャンセル用のメッセージ
                    msg = getString(R.string.dialog_ng_toast);
                    break;
            }
            Toast.makeText(getActivity(),msg, Toast.LENGTH_LONG).show();
        }

    }
}




