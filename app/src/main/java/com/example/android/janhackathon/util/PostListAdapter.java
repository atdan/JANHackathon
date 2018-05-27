//package com.example.android.janhackathon.util;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//
//
//import com.example.android.janhackathon.R;
//import com.example.android.janhackathon.model.Post;
//
//import java.util.ArrayList;
//
///**
// * Created by Eets_Nostredame on 17/04/2018.
// */
//
//public class PostListAdapter extends RecyclerView.Adapter<PostListAdapter.ViewHolder> {
//    private static final String TAG = "PostListAdapter";
//    private static final int NUM_GRID_COL = 4;
//
//    int gridWidth, imageWidth;
//    private ArrayList<Post> mPosts;
//    private Context mContext;
//    private ItemClickListener mClickListener;
//
//
//    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//
//        ImageView mPostImage;
//        public ViewHolder(View itemView) {
//            super(itemView);
//            //mPostImage = (ImageView)itemView.findViewById(R.id.post_image);
//
//             gridWidth = mContext.getResources().getDisplayMetrics().widthPixels;
//             imageWidth = gridWidth/NUM_GRID_COL;
//
//            mPostImage.setMaxWidth(imageWidth);
//            mPostImage.setMaxHeight(imageWidth);
//        }
//
//        @Override
//        public void onClick(View view) {
//
//        }
//    }
//
//    public PostListAdapter( Context context,ArrayList<Post> mPosts) {
//        this.mPosts = mPosts;
//        this.mContext = context;
//    }
//
//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
////        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_view_post,parent,false);
//        return new ViewHolder(View );
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position) {
//        UniversalImageLoader.setImage(mPosts.get(position).getImage(), holder.mPostImage);
//
//        holder.mPostImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d(TAG, "onClick: Selected a post");
//
//            }
//        });
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return mPosts.size();
//    }
//
//    // allows clicks events to be caught
//    void setClickListener(ItemClickListener itemClickListener) {
//        this.mClickListener = itemClickListener;
//    }
//
//    // parent activity will implement this method to respond to click events
//    public interface ItemClickListener {
//        void onItemClick(View view, int position);
//    }
//
//
//}
