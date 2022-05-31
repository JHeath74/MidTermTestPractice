package edu.weber.cs.w01378454.midtermtestpractice;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.math.BigDecimal;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BottomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private View root;

    double num1;
    double num2;
    String mathsign;
    double answer;

    private onButtonListener mCallBack;

    public interface onButtonListener{
        void MathButtonPressed(double num1, double num2, String mathsign, double answer);
    }

    public BottomFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BottomFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BottomFragment newInstance(String param1, String param2) {
        BottomFragment fragment = new BottomFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);

        try{
            mCallBack = (onButtonListener)activity;
        }catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString() + " Must Implement OnButtonListener");
        }
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
        return root = inflater.inflate(R.layout.fragment_bottom, container, false);
    }



    @Override
    public void onStart() {
        super.onStart();

        Button btnOne = root.findViewById(R.id.btnOne);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1 == 0)
                {
                    num1 = 1;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 1;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
               }
            }
        });

        Button btnTwo = root.findViewById(R.id.btnTwo);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == 0)
                {
                    num1 = 2;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 2;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }
            }
        });

        Button btnThree = root.findViewById(R.id.btnThree);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == 0)
                {
                    num1 = 3;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 3;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }
            }
        });

        Button btnFour = root.findViewById(R.id.btnFour);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == 0)
                {
                    num1 = 4;
                    Log.d("Button 4 Test", "Button 4" + num1);
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 4;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }
            }
        });

        Button btnFive = root.findViewById(R.id.btnFive);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == 0)
                {
                    num1 = 5;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 5;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }
            }
        });

        Button btnSix = root.findViewById(R.id.btnSix);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1 == 0)
                {
                    num1 = 6;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 6;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }
            }
        });

        Button btnSeven = root.findViewById(R.id.btnSeven);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == 0)
                {
                    num1 = 7;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 7;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }
            }
        });

        Button btnEight = root.findViewById(R.id.btnEight);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == 0)
                {
                    num1 = 8;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }else{
                    num2 = 8;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }
            }
        });

        Button btnNine = root.findViewById(R.id.btnNine);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(num1 == 0)
                {
                    num1 = 9;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);

                }else{
                    num2 = 9;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                }

            }
        });

        Button btnAdd = root.findViewById(R.id.btnAdd);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    answer = num1 + num2;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                    mathsign = ("+");

            }
        });

        Button btnMinus = root.findViewById(R.id.btnMinus);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    answer = num1 - num2;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                    mathsign = ("-");


            }
        });

        Button btnMultiply = root.findViewById(R.id.btnMultiply);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    answer = num1 * num2;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                    mathsign = ("*");

            }
        });

        Button btnDivide = root.findViewById(R.id.btnDivide);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    answer = num1 / num2;
                    mCallBack.MathButtonPressed(num1,num2,mathsign,answer);
                    mathsign = ("\\");
              }
        });

        Button btnClear = root.findViewById(R.id.btnClear);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             /* txtnum1.setText("");
                num1 = 0;
                txtnum2.setText("");
                num2 = 0;
                txtMathSign.setText("");
                txtAnswer.setText("");*/

            }
        });



    }
}