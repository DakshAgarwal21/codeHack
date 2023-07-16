package com.example.codehack;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdderAdapter extends FragmentStateAdapter {

    //Here this creates the tab layout of the profile of user

    public FragmentAdderAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 1:
                return new CertificateProfileFragment();
        }
        return new com.collegemeet.android.revafest.PostsFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
