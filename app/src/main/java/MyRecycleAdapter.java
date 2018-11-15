import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



import com.example.student.myapplication.R;

import java.util.List;

public class MyRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Object> dataList;

    public MyRecycleAdapter(List<Object> myDataset) {
        dataList = myDataset;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        if(viewType == 0)
        {
            TextView view = (TextView) LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.header_layout, viewGroup, false);
            return new HeaderViewHolder(view);
        }
        else{
            TextView view = (TextView) LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.student_layout, viewGroup, false);
            return new StudentViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        HeaderViewHolder myViewHolder = (HeaderViewHolder) viewHolder;

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if(position == 0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView tvStudentime;
        TextView tvStudentprezime;
        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStudentime = itemView.findViewById(R.id.textViewIme);
            tvStudentprezime = itemView.findViewById(R.id.textViewPrezime);
        }
    }
    class HeaderViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView_student);
        }
    }
}
