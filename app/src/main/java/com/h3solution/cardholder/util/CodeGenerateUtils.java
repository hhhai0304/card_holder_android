package com.h3solution.cardholder.util;

import android.graphics.Bitmap;
import android.util.Log;

import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class CodeGenerateUtils {

    public static Bitmap getBarcodeFromContent(String content) {
        BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
        try {
            return barcodeEncoder.encodeBitmap(content, BarcodeFormat.CODABAR, Config.BARCODE_WIDTH, Config.BARCODE_HEIGHT);
        } catch (Exception e) {
            Log.e("", "CodeGenerateUtils -> getBarcodeFromContent()" + e.toString());
        }
        return null;
    }
}