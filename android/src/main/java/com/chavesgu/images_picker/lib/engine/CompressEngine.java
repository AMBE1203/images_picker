package com.chavesgu.images_picker.lib.engine;

import android.content.Context;

import com.chavesgu.images_picker.lib.entity.LocalMedia;
import com.chavesgu.images_picker.lib.listener.OnCallbackListener;

import java.util.List;

/**
 * @author：luck
 * @date：2021/5/19 9:36 AM
 * @describe：CompressEngine
 */
public interface CompressEngine {
    /**
     * compress
     * ## The isCompressed in the localMedia object needs to be changed to true and setCompressPath is the compression path}
     *
     * @param context
     * @param compressData
     * @param listener
     */
    void onCompress(Context context, List<LocalMedia> compressData, OnCallbackListener<List<LocalMedia>> listener);
}
