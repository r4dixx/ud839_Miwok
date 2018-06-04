package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is a {@link ArrayAdapter} providing layout for each list based on pre-defined data source, which is a list of {@link Word objects}
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    /**
     * Custom constructor
     *
     * @param context to inflate the layout file
     * @param words   is a list of word objects to display in the list
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // We initialize the ArrayAdapter for the context and the Words list
        // We're using 0 as second type argument because the adapter is not going to use it (it can be of any value)
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    /**
     * We provide a list item view for the AdapterView
     *
     * @param position    is the array position to be displayed in the list item view
     * @param convertView the recycled view to populate
     * @param parent      the parent ViewGroup used for inflation
     * @return the View for the position in the AdapterView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextViews in the list_item.xml layout (one with default translation, one with Miwok translation). Then set the given text on the appropriate TextView
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = listItemView.findViewById((R.id.image));
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Set theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color for the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews so it can be show in the ListView
        return listItemView;
    }
}
