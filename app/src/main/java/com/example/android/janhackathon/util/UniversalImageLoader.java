package com.example.android.janhackathon.util;

import android.content.Context;
import android.widget.ImageView;

import com.example.android.janhackathon.R;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

/**
 * Created by Eets_Nostredame on 18/03/2018.
 */

public class UniversalImageLoader {
    public static final int DEFAULT_IMAGE = R.drawable.ic_android;
    private Context mContext;

    public UniversalImageLoader(Context context){
        mContext = context;
    }


    // add the gradle dependency for universal image loader
    public ImageLoaderConfiguration getConfig(){
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .showImageOnLoading(DEFAULT_IMAGE)
                .showImageForEmptyUri(DEFAULT_IMAGE)
                .showImageOnFail(DEFAULT_IMAGE)
                .considerExifParams(true)
                .cacheInMemory(true).cacheOnDisk(true)
                .resetViewBeforeLoading(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .diskCacheSize(100 * 1024 * 1024).build();

        return configuration;
    }
/**
 * this method can be sued to set images that are static. It can't be used if the images
 * are being changed in the Fragment/Activity - OR if they are being set in a list or
 * a grid
 */
    public static void setImage(String imageUrl, ImageView imageView){
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(imageUrl,imageView);
    }
}
