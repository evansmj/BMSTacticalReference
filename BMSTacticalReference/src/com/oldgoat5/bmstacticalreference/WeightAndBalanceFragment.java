package com.oldgoat5.bmstacticalreference;

import java.util.ArrayList;

import android.app.ListFragment;
import android.app.LauncherActivity.ListItem;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;

/*********************************************************************
 * @author Michael Evans
 * @version 1/15/2015
 *
 * Initializes the fragment page for Weight and Balance.
 * Allows user to specify F-16CJ load out on selected hard points.  
 *********************************************************************/
public class WeightAndBalanceFragment extends Fragment
{
    final String[] items = new String[] {"android", "hello", "world", "test"}; //testing
    
    boolean asymmetricMode;
    
    ListItemAdapter adapter; //testing
    CheckBox asymmetricCheckBox;
    ImageView f16Image;
    ListView listView;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;
    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;
    View view;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
            Bundle savedInstanceState)
    {
        view = inflater.inflate(
                R.layout.weight_and_balance_fragment_layout, container, false);
        
        /*adapter = new ListItemAdapter<ListItem>(
                getActivity(), android.R.layout.simple_list_item_1, items);*/    //testing
        adapter = new ListItemAdapter(
                this.getActivity(), generateData());
        
        asymmetricCheckBox = (CheckBox) view.findViewById(
                R.id.asymmetricCheckBox);
        
        asymmetricMode = false;
        
        f16Image = (ImageView) view.findViewById(R.id.f16_image);
        
        listView = (ListView) view.findViewById(R.id.listViewOrdinance);
        
        radioButton1 = (RadioButton) view.findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) view.findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) view.findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) view.findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) view.findViewById(R.id.radioButton5);
        radioButton6 = (RadioButton) view.findViewById(R.id.radioButton6);        
        radioButton7 = (RadioButton) view.findViewById(R.id.radioButton7);        
        radioButton8 = (RadioButton) view.findViewById(R.id.radioButton8);  
        radioButton9 = (RadioButton) view.findViewById(R.id.radioButton9);
        
        listView.setAdapter(adapter);
        
        radioButton1.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton1.toggle();
                }
                else
                {
                    radioButton1.toggle();
                    radioButton9.toggle();
                }
            }
        });
        
        radioButton2.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton2.toggle();
                }
                else
                {
                    radioButton2.toggle();
                    radioButton8.toggle();
                }
            }
        });
        
        radioButton3.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton3.toggle();
                }
                else
                {
                    radioButton3.toggle();
                    radioButton7.toggle();
                }
            }
        });
        
        radioButton4.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton4.toggle();
                }
                else
                {
                    radioButton4.toggle();
                    radioButton6.toggle();
                }
            }
        });
        
        radioButton5.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                radioButton5.toggle();
            }
        });
        
        radioButton6.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton6.toggle();
                }
                else
                {
                    radioButton6.toggle();
                    radioButton4.toggle();
                }
            }
        });
        
        radioButton7.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton7.toggle();
                }
                else
                {
                    radioButton7.toggle();
                    radioButton3.toggle();
                }
            }
        });
        
        radioButton8.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton8.toggle();
                }
                else
                {
                    radioButton8.toggle();
                    radioButton2.toggle();
                }
            }
        });
        
        radioButton9.setOnClickListener(new RadioButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (asymmetricMode)
                {
                    radioButton9.toggle();
                }
                else
                {
                    radioButton9.toggle();
                    radioButton1.toggle();
                }
            }
        });
        
        //stick the database into the scroll view....
        
        return view;
    }

    private ArrayList<RowItem> generateData()
    {
        ArrayList<RowItem> items = new ArrayList<RowItem>();
        items.add(new RowItem(0, "item 1"));
        items.add(new RowItem(1, "These are placeholder items"));
        items.add(new RowItem(2, "will be changed to get from sqlite"));
        items.add(new RowItem(3, "throw salami at your mommy"));
        return items;
    }
    
}
