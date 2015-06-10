package com.oldgoat5.bmstacticalreference.navigation.balkans;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oldgoat5.bmstacticalreference.R;

/********************************************************************
 * Copyright © Michael Evans - All Rights Reserved.
 *
 * @author Michael Evans
 * @since 6/8/2015
 *********************************************************************/
public class CroatiaBalkansChartFragment extends Fragment
{
    Context CONTEXT;

    private View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.croatia_balkans_chart_fragment_layout, container, false);

        Log.d("CroatiaBalkans", "onCreateView()");

        if (this.isAdded())
        {
            CONTEXT = getActivity();
        }

        return view;
    }
}
