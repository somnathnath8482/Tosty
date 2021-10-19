package com.somnath.toster;

import android.content.Context;
import android.widget.Toast;

public class Toster {
                            public void prompt(String s, Context context){
                                Toast.makeText(context, s, Toast.LENGTH_LONG).show();

                            }

}
