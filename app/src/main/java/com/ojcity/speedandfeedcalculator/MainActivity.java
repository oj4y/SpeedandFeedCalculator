package com.ojcity.speedandfeedcalculator;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView sfmSFM;
    //    private EditText sfmSFM;
    private EditText sfmRPM;
    private EditText sfmDia;

    private TextView rpmRPM;
    private EditText rpmSFM;
    private EditText rpmDia;

    private TextView ipmIPM;
    private EditText ipmIPT;
    private EditText ipmNoTeeth;
    private EditText ipmRPM;

    private TextView iptIPT;
    private EditText iptIPM;
    private EditText iptNoTeeth;
    private EditText iptRPM;

    private TextView iprIPR;
    private EditText iprIPM;
    private EditText iprRPM;

    private TextView cimCIM;
    private EditText cimFd;
    private EditText cimWOC;
    private EditText cimDOC;

    private TextView hpHP;
    private EditText hpCIM;
    private EditText hpUHP;

    private FloatingActionButton fab;

    private double sfmN = 1;
    private double rpmN = 1;
    private double diaN = 1;
    // SFM
    private TextWatcher sfmRpmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String rpmS = sfmRPM.getText().toString().trim();
            String diaS = sfmDia.getText().toString().trim();
            double result;

            try {
                result = calculateSfm(Integer.parseInt(rpmS), Double.parseDouble(diaS));
            } catch (NumberFormatException e) {
                sfmSFM.setText("");
                return;
            }

            sfmSFM.setText(Double.toString(result));

        }

    };
    private TextWatcher sfmDiaTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String rpmS = sfmRPM.getText().toString().trim();
            String diaS = sfmDia.getText().toString().trim();
            double result;

            try {
                result = calculateSfm(Integer.parseInt(rpmS), Double.parseDouble(diaS));
            } catch (NumberFormatException e) {
                sfmSFM.setText("");
                return;
            }

            sfmSFM.setText(Double.toString(result));

        }

    };
    // RPM
    private TextWatcher rpmSfmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String sfmS = rpmSFM.getText().toString().trim();
            String diaS = rpmDia.getText().toString().trim();
            double result;

            try {
                result = calculateRpm(Double.parseDouble(sfmS), Double.parseDouble(diaS));
            } catch (NumberFormatException e) {
                rpmRPM.setText("");
                return;
            }

            rpmRPM.setText(Double.toString(result));

        }
    };
    private TextWatcher rpmDiaTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String sfmS = rpmSFM.getText().toString().trim();
            String diaS = rpmDia.getText().toString().trim();
            double result;

            try {
                result = calculateRpm(Double.parseDouble(sfmS), Double.parseDouble(diaS));
            } catch (NumberFormatException e) {
                rpmRPM.setText("");
                return;
            }

            rpmRPM.setText(Double.toString(result));

        }
    };
    // IPM
    private TextWatcher ipmIptTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String iptS = ipmIPT.getText().toString().trim();
            String noTeethS = ipmNoTeeth.getText().toString().trim();
            String rpmS = ipmRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpm(Double.parseDouble(iptS), Integer.parseInt(noTeethS),
                        Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                ipmIPM.setText("");
                return;
            }

            ipmIPM.setText(Double.toString(result));

        }
    };
    private TextWatcher ipmNoTeethTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String iptS = ipmIPT.getText().toString().trim();
            String noTeethS = ipmNoTeeth.getText().toString().trim();
            String rpmS = ipmRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpm(Double.parseDouble(iptS), Integer.parseInt(noTeethS),
                        Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                ipmIPM.setText("");
                return;
            }

            ipmIPM.setText(Double.toString(result));

        }
    };
    private TextWatcher ipmRpmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String iptS = ipmIPT.getText().toString().trim();
            String noTeethS = ipmNoTeeth.getText().toString().trim();
            String rpmS = ipmRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpm(Double.parseDouble(iptS), Integer.parseInt(noTeethS),
                        Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                ipmIPM.setText("");
                return;
            }

            ipmIPM.setText(Double.toString(result));

        }
    };
    // IPT
    private TextWatcher iptIpmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String ipmS = iptIPM.getText().toString().trim();
            String noTeethS = iptNoTeeth.getText().toString().trim();
            String rpmS = iptRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpt(Double.parseDouble(ipmS), Integer.parseInt(noTeethS),
                        Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                iptIPT.setText("");
                return;
            }

            iptIPT.setText(Double.toString(result));

        }
    };
    private TextWatcher iptNoTeethTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String ipmS = iptIPM.getText().toString().trim();
            String noTeethS = iptNoTeeth.getText().toString().trim();
            String rpmS = iptRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpt(Double.parseDouble(ipmS), Integer.parseInt(noTeethS),
                        Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                iptIPT.setText("");
                return;
            }

            iptIPT.setText(Double.toString(result));

        }
    };
    private TextWatcher iptRpmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String ipmS = iptIPM.getText().toString().trim();
            String noTeethS = iptNoTeeth.getText().toString().trim();
            String rpmS = iptRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpt(Double.parseDouble(ipmS), Integer.parseInt(noTeethS),
                        Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                iptIPT.setText("");
                return;
            }

            iptIPT.setText(Double.toString(result));

        }
    };
    // IPR
    private TextWatcher iprIpmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String ipmS = iprIPM.getText().toString().trim();
            String rpmS = iprRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpr(Double.parseDouble(ipmS), Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                iprIPR.setText("");
                return;
            }

            iprIPR.setText(Double.toString(result));

        }
    };
    private TextWatcher iprRpmTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String ipmS = iprIPM.getText().toString().trim();
            String rpmS = iprRPM.getText().toString().trim();

            double result;

            try {
                result = calculateIpr(Double.parseDouble(ipmS), Integer.parseInt(rpmS));
            } catch (NumberFormatException e) {
                iprIPR.setText("");
                return;
            }

            iprIPR.setText(Double.toString(result));

        }
    };
    // CIM
    private TextWatcher cimFdTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String fdS = cimFd.getText().toString().trim();
            String wocS = cimWOC.getText().toString().trim();
            String docS = cimDOC.getText().toString().trim();

            double result;

            try {
                result = calculateCim(Double.parseDouble(fdS), Double.parseDouble(wocS),
                        Double.parseDouble(docS));
            } catch (NumberFormatException e) {
                cimCIM.setText("");
                return;
            }

            cimCIM.setText(Double.toString(result));

        }
    };
    private TextWatcher cimWocTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String fdS = cimFd.getText().toString().trim();
            String wocS = cimWOC.getText().toString().trim();
            String docS = cimDOC.getText().toString().trim();

            double result;

            try {
                result = calculateCim(Double.parseDouble(fdS), Double.parseDouble(wocS),
                        Double.parseDouble(docS));
            } catch (NumberFormatException e) {
                cimCIM.setText("");
                return;
            }

            cimCIM.setText(Double.toString(result));

        }
    };
    private TextWatcher cimDocTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String fdS = cimFd.getText().toString().trim();
            String wocS = cimWOC.getText().toString().trim();
            String docS = cimDOC.getText().toString().trim();

            double result;

            try {
                result = calculateCim(Double.parseDouble(fdS), Double.parseDouble(wocS),
                        Double.parseDouble(docS));
            } catch (NumberFormatException e) {
                cimCIM.setText("");
                return;
            }

            cimCIM.setText(Double.toString(result));

        }
    };
    // HP
    private TextWatcher hpCimTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String cimS = hpCIM.getText().toString().trim();
            String uhpS = hpUHP.getText().toString().trim();

            double result;

            try {
                result = calculateHp(Double.parseDouble(cimS), Double.parseDouble(uhpS));
            } catch (NumberFormatException e) {
                hpHP.setText("");
                return;
            }

            hpHP.setText(Double.toString(result));

        }
    };
    private TextWatcher hpUhpTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String cimS = hpCIM.getText().toString().trim();
            String uhpS = hpUHP.getText().toString().trim();

            double result;

            try {
                result = calculateHp(Double.parseDouble(cimS), Double.parseDouble(uhpS));
            } catch (NumberFormatException e) {
                hpHP.setText("");
                return;
            }

            hpHP.setText(Double.toString(result));

        }
    };

    private double calculateSfm(int rpm, double dia) {
        return rpm * dia / 3.82;
    }

    private double calculateRpm(double sfm, double dia) {
        return 3.82 * sfm / dia;
    }

    private double calculateIpm(double ipt, int noTeeth, int rpm) {
        return ipt * noTeeth * rpm;
    }

    private double calculateIpt(double ipm, int noTeeth, int rpm) {
        return ipm / (noTeeth * rpm);
    }

    private double calculateIpr(double ipm, int rpm) {
        return ipm / rpm;
    }

    private double calculateCim(double fd, double woc, double doc) {
        return fd * woc * doc;
    }

    private double calculateHp(double cim, double uhp) {
        return cim * uhp;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        sfmSFM = (EditText) findViewById(R.id.sfm_sfm);
        sfmSFM = (TextView) findViewById(R.id.sfm_sfm);
        sfmRPM = (EditText) findViewById(R.id.sfm_rpm);
        sfmDia = (EditText) findViewById(R.id.sfm_dia);
        sfmRPM.addTextChangedListener(sfmRpmTextWatcher);
        sfmDia.addTextChangedListener(sfmDiaTextWatcher);

        rpmRPM = (TextView) findViewById(R.id.rpm_rpm);
        rpmSFM = (EditText) findViewById(R.id.rpm_sfm);
        rpmDia = (EditText) findViewById(R.id.rpm_dia);
        rpmSFM.addTextChangedListener(rpmSfmTextWatcher);
        rpmDia.addTextChangedListener(rpmDiaTextWatcher);

        ipmIPM = (TextView) findViewById(R.id.ipm_ipm);
        ipmIPT = (EditText) findViewById(R.id.ipm_ipt);
        ipmNoTeeth = (EditText) findViewById(R.id.ipm_noteeth);
        ipmRPM = (EditText) findViewById(R.id.ipm_rpm);
        ipmIPT.addTextChangedListener(ipmIptTextWatcher);
        ipmNoTeeth.addTextChangedListener(ipmNoTeethTextWatcher);
        ipmRPM.addTextChangedListener(ipmRpmTextWatcher);

        iptIPT = (TextView) findViewById(R.id.ipt_ipt);
        iptIPM = (EditText) findViewById(R.id.ipt_ipm);
        iptNoTeeth = (EditText) findViewById(R.id.ipt_noteeth);
        iptRPM = (EditText) findViewById(R.id.ipt_rpm);
        iptIPM.addTextChangedListener(iptIpmTextWatcher);
        iptNoTeeth.addTextChangedListener(iptNoTeethTextWatcher);
        iptRPM.addTextChangedListener(iptRpmTextWatcher);

        iprIPR = (TextView) findViewById(R.id.ipr_ipr);
        iprIPM = (EditText) findViewById(R.id.ipr_ipm);
        iprRPM = (EditText) findViewById(R.id.ipr_rpm);
        iprIPM.addTextChangedListener(iprIpmTextWatcher);
        iprRPM.addTextChangedListener(iprRpmTextWatcher);

        cimCIM = (TextView) findViewById(R.id.cim_cim);
        cimFd = (EditText) findViewById(R.id.cim_fd);
        cimWOC = (EditText) findViewById(R.id.cim_woc);
        cimDOC = (EditText) findViewById(R.id.cim_doc);
        cimFd.addTextChangedListener(cimFdTextWatcher);
        cimWOC.addTextChangedListener(cimWocTextWatcher);
        cimDOC.addTextChangedListener(cimDocTextWatcher);

        hpHP = (TextView) findViewById(R.id.hp_hp);
        hpCIM = (EditText) findViewById(R.id.hp_cim);
        hpUHP = (EditText) findViewById(R.id.hp_uhp);
        hpCIM.addTextChangedListener(hpCimTextWatcher);
        hpUHP.addTextChangedListener(hpUhpTextWatcher);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearForm((ViewGroup) findViewById(R.id.main_layout));
            }
        });

        // hide fab on landscape
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fab.hide();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            MaterialDialog aboutDialog = new MaterialDialog.Builder(this)
                    .title(R.string.about_title)
                    .content(R.string.about_content)
                    .show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void clearForm(ViewGroup group) {
        for (int i = 0, count = group.getChildCount(); i < count; ++i) {
            View view = group.getChildAt(i);
            if (view instanceof EditText) {
                ((EditText) view).setText("");
            }

            if (view instanceof ViewGroup && (((ViewGroup) view).getChildCount() > 0))
                clearForm((ViewGroup) view);
        }
    }
}
