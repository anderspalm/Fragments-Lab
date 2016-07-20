package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.LayoutInflaterCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {

 //This is a blank fragment
 //Implement your own version of Fragments for this lab
// ListView mlistView;
 private OnListItemClickListener mlistItemClickListener;
 private int mTabPosition, mListItemPosition;
 private static final String TAB_NUM = "list_number";
 int tab_number_variable = 0;

 public interface OnListItemClickListener {
  void onListItemClicked(int tabPosition, int listItemPosition);
 }

 public static PlaceholderFragment newInstance(int tab_num_input,
                                               OnListItemClickListener the_listener){
  PlaceholderFragment the_fragment_instance = new PlaceholderFragment();
  Bundle bundle_args = new Bundle();
  bundle_args.putInt(TAB_NUM, tab_num_input);
  the_fragment_instance.setArguments(bundle_args);
  the_fragment_instance.mlistItemClickListener = the_listener;
  return the_fragment_instance;
 }

// @Override
// public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstance){
////
////  View inflated_list_items = inflater.inflate(R.layout.fragment_list, viewGroup, false);
////  mlistView = (ListView) inflated_list_items.findViewById(R.id.listview_fragment);
////  return inflated_list_items;
// }

 public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstance){

  ArrayAdapter<String> adapter;

  tab_number_variable = getArguments().getInt(TAB_NUM, 0); //Getting the argument
View view = null;

  //Setting the adapter based on the ViewPager position we provided in the argument
    switch (tab_number_variable){
     case 0:
      view = inflater.inflate(R.layout.picture, viewGroup, false);

      break;
     case 1:
      view = inflater.inflate(R.layout.text_ref, viewGroup, false);
      TextView textView = (TextView) view.findViewById(R.id.text_reference);
      textView.setText(getResources().getString(R.string.text_one));
      break;
     case 2:
      view = inflater.inflate(R.layout.text_ref, viewGroup, false);
      TextView textView1 = (TextView) view.findViewById(R.id.text_reference);
      textView1.setText(getResources().getString(R.string.text_two));
      break;
     default: break;
     }
    return view;
    }

 public void onViewCreated(ViewGroup viewGroup, @Nullable Bundle savedInstanceState) {
  super.onViewCreated(viewGroup, savedInstanceState);
 }


 }
