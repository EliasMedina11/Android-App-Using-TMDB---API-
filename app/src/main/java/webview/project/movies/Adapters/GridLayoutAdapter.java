package webview.project.movies.Adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import webview.project.movies.Entities.MovieData;
import webview.project.movies.R;
import webview.project.movies.Utils.GridLayoutViewHolder;

/**
 * Created by Elias on 13/04/2017.
 */
public class GridLayoutAdapter extends RecyclerView.Adapter<GridLayoutViewHolder> {
    public List<MovieData> myMovieDataList;
    public static final String BASE_POSTER_URL = "https://image.tmdb.org/t/p/w150";
    public Context context;

    public GridLayoutAdapter(Context context, List<MovieData> movieDataList) {
        myMovieDataList = movieDataList;
        this.context = context;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public GridLayoutViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View recyclerLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_grid, parent, false);
        GridLayoutViewHolder viewHolder = new GridLayoutViewHolder(recyclerLayoutView);
        return viewHolder;
    }

    @Override
    public int getItemCount() {
        return myMovieDataList.size();
    }

    @Override
    public void onBindViewHolder(GridLayoutViewHolder holder, int position) {
           MovieData movie = myMovieDataList.get(position);
            Picasso.with(context)
                    .load(BASE_POSTER_URL + movie.getPoster_path())
                    .into(holder.moviePoster);
             int idMovie = movie.getId();
// Pasar el id de la pelicula para armar el detalle
        holder.setOnClickListeners();
    }

}

