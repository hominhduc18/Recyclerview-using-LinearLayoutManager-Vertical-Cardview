package com.example.myapplication;

import static com.example.myapplication.R.layout.iterm_user;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Useradapter extends RecyclerView.Adapter<Useradapter.UserViewHolder>{
    private Context context;
    private List<User> mlistUser;

    //tao contructer với biến truyền vào context


    public Useradapter(Context context) {
        this.context = context;
    }
// hàm set data cho context
    public void setData(List<User> list){
        this.mlistUser = list;
        notifyDataSetChanged();//thực hiện load dữ liệu vào
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //khai báo view từ VIEW
        View view = LayoutInflater.from(parent.getContext()).inflate(iterm_user,parent, false);

        return new UserViewHolder(view);
    }

    // ham xử lý dữ liệu lên
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = mlistUser.get(position);
        if(user == null){
            return;
        }
        holder.imgUser.setImageResource(user.getResourceID());
        holder.tvName.setText(user.getName());

    }

    @Override
    public int getItemCount() {
        if(mlistUser != null){
            return mlistUser.size();
        }
        return 0;
    }

    public class  UserViewHolder extends RecyclerView.ViewHolder{
        //khia báo thành phần trong item_user.xml
        private ImageView imgUser;
        private TextView tvName;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
// ánh xạ thông qua iteamView
            imgUser = itemView.findViewById(R.id.img_user);
            tvName = itemView.findViewById(R.id.tv_name);

        }
    }
}
