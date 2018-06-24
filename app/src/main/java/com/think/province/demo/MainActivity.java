package com.think.province.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner province;
    private Spinner city;
    private String tCity;
    private String tProvince;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        province = (Spinner) findViewById(R.id.sp_province);
        city = (Spinner) findViewById(R.id.sp_city);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.province,
                R.layout.spinner_checked_text);
        province.setAdapter(adapter);
        province.setOnItemSelectedListener(new MySpinnerItemSelected());
        city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tCity = city.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    // 二级联动adapter
    class MySpinnerItemSelected implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Spinner spinner = (Spinner) parent;
            String pro = (String) spinner.getItemAtPosition(position);
            tProvince = province.getSelectedItem().toString();
            // 处理省的市的显示
            ArrayAdapter<CharSequence> cityadapter = ArrayAdapter.createFromResource(getApplicationContext(),
                    R.array.def, R.layout.spinner_checked_text);
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

            city.setAdapter(cityadapter);

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }


}
