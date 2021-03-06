package com.coinomi.wallet.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.coinomi.wallet.R;
import com.coinomi.wallet.util.Fonts;

import butterknife.ButterKnife;

public class ContactUsActivity extends BaseWalletActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_contact_us);
        ButterKnife.bind(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);

        TextView version = findViewById(R.id.about_version);
        if (getWalletApplication().packageInfo() != null) {
            version.setText(getWalletApplication().packageInfo().versionName);
        } else {
            version.setVisibility(View.INVISIBLE);
        }

        Fonts.setTypeface(findViewById(R.id.translation_globe), Fonts.Font.COINOMI_FONT_ICONS);
    }
}
