package com.chavesgu.images_picker.lib.engine;

import com.chavesgu.images_picker.lib.entity.LocalMedia;
import com.chavesgu.images_picker.lib.listener.OnResultCallbackListener;

/**
 * @author：luck
 * @date：2020/4/22 11:36 AM
 * @describe：PictureSelectorEngine
 */
public interface PictureSelectorEngine {

    /**
     * Create ImageLoad Engine
     *
     * @return
     */
    ImageEngine createEngine();

    /**
     * Create Result Listener
     *
     * @return
     */
    OnResultCallbackListener<LocalMedia> getResultCallbackListener();
}
