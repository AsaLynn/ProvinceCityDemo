package com.think.province.demo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PopupDemoActivity extends AppCompatActivity implements View.OnClickListener {

    protected TextView tv1;
    protected TextView tv2;
    protected LinearLayout rootLl;
    private PopupWindow popupWindow;
    private String[] provinces;
    private String TAG = this.getClass().getSimpleName();
    private RadioGroup radioGroup;
    private ArrayAdapter cityadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_popup_demo);
        initView();
        provinces = getResources().getStringArray(R.array.province);
        /*for (int i = 0; i < provinces.length; i++) {
            Log.i(TAG, "onCreate: ***--->" + provinces[i]);
        }*/
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.tv1) {
            showPopup();
        } else if (view.getId() == R.id.tv2) {

        }
    }

    private void showPopup() {
        if (null == popupWindow) {
            popupWindow = new PopupWindow(this);
            popupWindow.setWidth(rootLl.getWidth());
            popupWindow.setHeight((rootLl.getHeight() / 3) * 2);
            View popView = View.inflate(this, R.layout.layout_pop, null);
            radioGroup = popView.findViewById(R.id.rg);
            final ListView listView = popView.findViewById(R.id.lv);
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    String pro = provinces[checkedId];
                    Log.i(TAG, "onCheckedChanged: ***" + pro);
                    cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.def,
                            R.layout.spinner_checked_text);
                    if (pro.equals("北京")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.北京,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("天津")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.天津,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("河北")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.河北,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("山西")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.山西,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("内蒙古")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.内蒙古,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("辽宁")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.辽宁,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("吉林")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.吉林,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("黑龙江")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.黑龙江,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("上海")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.上海,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("江苏")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.江苏,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("浙江")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.浙江,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("安徽")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.安徽,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("福建")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.福建,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("江西")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.江西,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("山东")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.山东,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("河南")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.河南,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("湖北")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.湖北,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("湖南")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.湖南,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("广东")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.广东,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("广西")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.广西,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("海南")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.海南,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("重庆")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.重庆,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("四川")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.四川,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("贵州")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.贵州,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("云南")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.云南,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("西藏")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.西藏,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("陕西")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.陕西,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("甘肃")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.甘肃,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("青海")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.青海,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("宁夏")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.宁夏,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("新疆")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.新疆,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("台湾")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.台湾,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("香港")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.香港,
                                R.layout.spinner_checked_text);
                    } else if (pro.equals("澳门")) {
                        cityadapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.澳门,
                                R.layout.spinner_checked_text);
                    }

                    listView.setAdapter(cityadapter);
                }
            });
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String item = (String) cityadapter.getItem(position);
                    Toast.makeText(PopupDemoActivity.this, item, Toast.LENGTH_SHORT).show();
                    popupWindow.dismiss();
                }
            });
            ViewGroup.LayoutParams layoutParams = radioGroup.getLayoutParams();
            layoutParams.width = RadioGroup.LayoutParams.MATCH_PARENT;
            //12dp---->转换成像素
            int dpValue = 12;
            float scale = getResources().getDisplayMetrics().density;
            int pxValue = (int) (dpValue * scale + 0.5f);
            int top = pxValue;
            int bottom = pxValue;
            for (int i = 0; i < provinces.length; i++) {
                RadioButton radioButton = new RadioButton(this);
                radioButton.setId(i);
                radioButton.setChecked(false);
                radioButton.setText(provinces[i]);
                radioButton.setTextColor(getResources().getColorStateList(R.color.rb_c_sc));
                radioButton.setButtonDrawable(new ColorDrawable(Color.TRANSPARENT));
                radioButton.setBackgroundResource(R.drawable.bg_rb_d_sc);
                radioButton.setLayoutParams(layoutParams);
                radioButton.setPadding(0, top, 0, bottom);
                radioButton.setGravity(Gravity.CENTER);
                radioGroup.addView(radioButton);
            }
            popupWindow.setContentView(popView);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(Color.WHITE));

            RadioButton rb = (RadioButton) radioGroup.getChildAt(0);
            rb.setChecked(true);
        }


        popupWindow.showAsDropDown(tv1);
    }

    private void initView() {
        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setOnClickListener(PopupDemoActivity.this);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setOnClickListener(PopupDemoActivity.this);
        rootLl = (LinearLayout) findViewById(R.id.root_ll);
    }
}
