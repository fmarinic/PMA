package com.example.student.myapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
//
public class MyRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    static  final int TYPE_HEADER = 0;
    static  final int TYPE_STUDENT = 1;

    private List<Object> dataList;
    //konstruktor
    public MyRecycleAdapter(List<Object> myDataset) {
        this.dataList = myDataset;
    }

    @NonNull
    @Override
    //kako stvoriti view?
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) { //viewType vraca getItemViewType kad se procita
        if(viewType == TYPE_HEADER)
        {

            View view = (TextView) LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.header_layout, viewGroup, false);
            return new HeaderViewHolder(view);
        }
        else{
            View view = (TextView) LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.student_layout, viewGroup, false);
            return new StudentViewHolder(view);
        }
    }

    @Override
    //kako da poveze view s podacima?
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {

        Object data = dataList.get(position);

        if(viewHolder instanceof HeaderViewHolder && data instanceof  String){//povjeriti koji je viewholder tipa
            String headerTitle = (String) data;
            ((HeaderViewHolder)viewHolder).title.setText(headerTitle);
        }else if(viewHolder instanceof  StudentViewHolder && data instanceof Studenti){
            Studenti student = (Studenti) data;
            ((StudentViewHolder)viewHolder).tvStudentName.setText(student.getsIme());
            ((StudentViewHolder)viewHolder).tvStudentSurname.setText(student.getsPrezime());
        }

    }

    @Override
    //broj itema?
    public int getItemCount() {
        return dataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(dataList.get(position) instanceof  String){
            return TYPE_HEADER;
        }
        else {
            return TYPE_STUDENT;
        }
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView tvStudentName;
        TextView tvStudentSurname;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStudentName = itemView.findViewById(R.id.textViewIme);
            tvStudentSurname = itemView.findViewById(R.id.textViewPrezime);
        }
    }
    class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView_headerTitle);
        }
    }
}
