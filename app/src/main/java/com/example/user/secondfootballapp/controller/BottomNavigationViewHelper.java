package com.example.user.secondfootballapp.controller;

import android.annotation.SuppressLint;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import com.example.user.secondfootballapp.PersonalActivity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class BottomNavigationViewHelper {
    static Logger log = LoggerFactory.getLogger(PersonalActivity.class);
    @SuppressLint("RestrictedApi")
    public static void removeShiftMode(BottomNavigationView view) {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
        try {
            Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
            shiftingMode.setAccessible(true);
            shiftingMode.setBoolean(menuView, false);
            shiftingMode.setAccessible(false);
            for (int i = 0; i < menuView.getChildCount(); i++) {
                BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                //noinspection RestrictedApi
                item.setShiftingMode(false);
                item.setPadding(0, 15, 0, 0);
                // set once again checked value, so view will be updated
                //noinspection RestrictedApi
                item.setChecked(item.getItemData().isChecked());
            }
        } catch (NoSuchFieldException e) {
            log.error("ERROR: BNVHelper. Unable to get shift mode field", e);
        } catch (IllegalAccessException e) {
            log.error("ERROR: BNVHelper. Unable to change value of shift mode", e);
        }
    }
}

