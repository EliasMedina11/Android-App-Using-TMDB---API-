package webview.project.movies.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import webview.project.movies.Adapters.GridLayoutAdapter;
import webview.project.movies.DetallesActivity;
import webview.project.movies.MainActivity;
import webview.project.movies.R;

/**
 * Created by lfarias on 4/17/17.
 */
public class GridLayoutViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public ImageView moviePoster;
    RelativeLayout layoutItemGrid;
    private static Context mContext;
        public GridLayoutViewHolder(View v) {
        super(v);
        moviePoster = (ImageView) v.findViewById(R.id.movie_image_id);
        layoutItemGrid = (RelativeLayout) v.findViewById(R.id.relative_grid_layout);
    }

    public void setOnClickListeners() {
        layoutItemGrid.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "a,msdhjkashdkask", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(mContext, DetallesActivity.class);
        mContext.startActivity(i);
    }
}


