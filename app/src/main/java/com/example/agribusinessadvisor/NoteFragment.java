package com.example.agribusinessadvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.Date;
import java.util.UUID;

public class NoteFragment extends Fragment {
    private static final String ARG_NOTE_ID = "note_id";
    private static final String DIALOG_DATE = "DialogDate";

    private static final int REQUEST_DATE = 0;

    private Note mNote;
    private EditText mTitleField;
    private Button mDateButton;

    public static NoteFragment newInstance(UUID noteId){
        Bundle args = new Bundle();
        args.putSerializable(ARG_NOTE_ID, noteId);

        NoteFragment fragment = new NoteFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        UUID noteId = (UUID) getArguments().getSerializable(ARG_NOTE_ID);
        mNote = NoteLab.get(getActivity()).getNote(noteId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_note, container, false);

        mTitleField = (EditText) v.findViewById(R.id.note_title);
        mTitleField.setText(mNote.getTitle());
        mTitleField.addTextChangedListener(new
                                                   TextWatcher() {
                                                       @Override
                                                       public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                                                       }

                                                       @Override
                                                       public void onTextChanged(CharSequence s, int start, int before, int count) {
                                                           mNote.setTitle(s.toString());

                                                       }

                                                       @Override
                                                       public void afterTextChanged(Editable editable) {

                                                       }
                                                   });

        mDateButton = (Button) v.findViewById(R.id.note_date);

        updateDate();
        mDateButton.setOnClickListener(new
                                               View.OnClickListener() {
                                                   @Override
                                                   public void onClick(View v) {
                                                       FragmentManager manager = getFragmentManager();
                                                       DatePickerFragment dialog =
                                                               DatePickerFragment.newInstance(mNote.getDate());

                                                       dialog.setTargetFragment(NoteFragment.this, REQUEST_DATE);

                                                       dialog.show(manager, DIALOG_DATE);
                                                   }
                                               });

        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode != Activity.RESULT_OK){
            return;
        }

        if(requestCode == REQUEST_DATE){
            Date date = (Date) data
                    .getSerializableExtra(DatePickerFragment.EXTRA_DATE);
            mNote.setDate(date);

            updateDate();
        }
    }

    private void updateDate() {
        mDateButton.setText(mNote.getDate().toString());
    }

}
