package com.example.hellolibrary;

import android.content.Context;
import android.widget.Toast;

public class Hi {

    public static void showShortToast(Context _context)
    {
        Toast.makeText(_context, "hi i m library", Toast.LENGTH_LONG).show();
    }
}
