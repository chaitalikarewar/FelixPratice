package com.chai.employeemangementapp.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.chai.employeemangementapp.R;
import com.chai.employeemangementapp.fragment.AddFragment;
import com.chai.employeemangementapp.fragment.DeleteFragment;
import com.chai.employeemangementapp.fragment.SearchFragment;
import com.chai.employeemangementapp.fragment.UpdateFragment;

public class HomeActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.add_employee:
                    changeFragment(new AddFragment());
                    return true;
                case R.id.search_employee:
                    changeFragment(new SearchFragment());
                    return true;
                case R.id.update_employee:
                    changeFragment(new UpdateFragment());
                    return true;
                case R.id.delete_employee:
                    changeFragment(new DeleteFragment());
                    return true;
            }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        changeFragment(new AddFragment());
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void changeFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.parent, fragment);
        transaction.commit();
    }
}
