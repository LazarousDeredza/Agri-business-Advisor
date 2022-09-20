package com.example.agribusinessadvisor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoteListFragment extends Fragment {
    private RecyclerView mNoteRecyclerView;

    private NoteAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_note_list, container, false);

        mNoteRecyclerView = (RecyclerView) view.findViewById(R.id.note_recycler_view);
        mNoteRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
        updateUI();
    }

    private void updateUI(){
        NoteLab noteLab = NoteLab.get(getActivity());
        List<Note> notes = noteLab.getNotes();

        if(mAdapter == null){
            mAdapter = new NoteAdapter(notes);
            mNoteRecyclerView.setAdapter(mAdapter);
        }
        else{
            mAdapter.notifyDataSetChanged();
        }


    }


    private class NoteHolder extends RecyclerView.ViewHolder
    implements View.OnClickListener{

        private TextView mTitleTextView;
        private TextView mDateTextView;
        private Note mNote;

        public NoteHolder(LayoutInflater inflater, ViewGroup parent){
            super(inflater.inflate(R.layout.list_item_note, parent, false));

            itemView.setOnClickListener(this);

            mTitleTextView = (TextView) itemView.findViewById(R.id.note_title);
            mDateTextView = (TextView) itemView.findViewById(R.id.note_date);

        }

        public void bind(Note note){
            mNote = note;

            mTitleTextView.setText(mNote.getTitle());
            mDateTextView.setText(mNote.getDate().toString());
        }

        @Override
        public void onClick(View view){
            Intent intent = NoteActivity.newIntent(getActivity(), mNote.getId());
            startActivity(intent);
        }

    }

    private class NoteAdapter extends RecyclerView.Adapter<NoteHolder>{

        private List<Note> mNotes;

        public NoteAdapter(List<Note> notes){
            mNotes = notes;
        }

        @NonNull
        @Override
        public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new NoteHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull NoteHolder holder, int position) {

            Note note = mNotes.get(position);
            holder.bind(note);

        }

        @Override
        public int getItemCount() {
            return mNotes.size();
        }
    }
}
