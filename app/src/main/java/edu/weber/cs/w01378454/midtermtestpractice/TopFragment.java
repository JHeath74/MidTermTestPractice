package edu.weber.cs.w01378454.midtermtestpractice;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TopFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View root;

    private TextView textnum1;
    private TextView textnum2;
    private TextView textMathSign;
    private TextView textAnswer;


    public TopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TopFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TopFragment newInstance(String param1, String param2) {
        TopFragment fragment = new TopFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return root = inflater.inflate(R.layout.fragment_top, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        textnum1 = root.findViewById(R.id.textnum1);
        textnum2 = root.findViewById(R.id.textnum2);
        textMathSign = root.findViewById(R.id.textMathSign);
        textAnswer = root.findViewById(R.id.textAnswer);
        updateMathText(num1, num2, mathsign, answer);
    }

    @Override
    public void onPause() {
        super.onPause();

        SharedPreferences prefs = getActivity().getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = prefs.edit();

        prefsEditor.putInt("textnum1", textnum1.getInt());
        prefsEditor.putInt("textnum2", textnum2.getInt());
        prefsEditor.putString("textMathSign", textMathSign.getString());
        prefsEditor.putInt("textAnswer", textAnswer.getInt());

        prefsEditor.commit();

    }

    @Override
    public void onResume() {
        super.onResume();

        SharedPreferences prefs = getActivity().getPreferences(Context.MODE_PRIVATE);
        int textnum1 = prefs.getInt("textnum1", 0);
        int textnum2 = prefs.getInt("textnum2", 0);
        String textMathSign = prefs.getString("textnum1", "+");
        int textAnswer = prefs.getInt("textAnswer", 0);



    }

    public void updateMathText(double num1, double num2,String mathsign,double answer) {

        BigDecimal n1 = new BigDecimal(num1);
        BigDecimal n2 = new BigDecimal(num2);
        BigDecimal n3 = new BigDecimal(answer);

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);

        textnum1.setText(numberFormat.format(n1.doubleValue()));
        textnum2.setText(numberFormat.format(n2.doubleValue()));
        textMathSign.setText(mathsign);
        textAnswer.setText(numberFormat.format(n3.doubleValue()));
    }
}