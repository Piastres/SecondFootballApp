package com.example.user.secondfootballapp.tournament.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



import com.example.user.secondfootballapp.PersonalActivity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerTournamentInfoAdapter extends FragmentPagerAdapter {

    Logger log = LoggerFactory.getLogger(PersonalActivity.class);

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    FragmentManager fm;
    public ViewPagerTournamentInfoAdapter(FragmentManager fm) {
        super(fm);
        this.fm = fm;
    }

    @Override
    public Fragment getItem(int position) {


//        Fragment fragment = new TournamentTimeTableFragment() ;
//        if (position == 1){
//            fragment = new TournamentCommandFragment();
//        } else if (position == 2){
//            fragment = new TournamentPlayersFragment();
//        }
//        return fragment;
//    }

//        fm.beginTransaction()
////                .replace(R.id.tournamentInfoViewPager, mFragmentList.get(position))
//                .addToBackStack(null)
//                .show(mFragmentList.get(position))
////                    .hide(new TournamentCommandFragment())
//                .commit();
//        log.info("INFO: position", position);
//        log.info("INFO: position", mFragmentList.get(position).getTag());
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

}
