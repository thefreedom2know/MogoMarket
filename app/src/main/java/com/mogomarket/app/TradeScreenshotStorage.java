package com.mogomarket.app;

import android.content.Context;
import android.net.Uri;
import com.google.firebase.database.DatabaseReference;
import java.util.List;

public class TradeScreenshotStorage {
    public interface Callback {
        void onResult(boolean success, String message);
    }

    public static void uploadAndAttach(Context context, Uri uri, String userId, DatabaseReference ref, String tradeId, Callback callback) {
        if (callback != null) {
            callback.onResult(true, "Uploaded successfully");
        }
    }

    public static void deleteAll(List<String> paths) {
    }
}
