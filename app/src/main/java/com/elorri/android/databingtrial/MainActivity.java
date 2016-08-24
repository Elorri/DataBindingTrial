package com.elorri.android.databingtrial;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.elorri.android.databingtrial.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        binding.setUser(user);

        user.setFirstName("Pierre");
        user.setLastName("Dupond");

    }

    public void changeUser(View view) {
        user.setFirstName("Jacques");
        user.setLastName("Michaux");
    }
}
