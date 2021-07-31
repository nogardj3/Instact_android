package com.quvesoft.instact;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;


public class SplashActivity extends AppCompatActivity {
    String TAG = "yhjoo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_splash);

        Single.timer(3,TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.w(TAG,"subscribe");
                    }

                    @Override
                    public void onSuccess(Long aLong) {
                                                Log.w(TAG,"success");
                        startActivity(new Intent(SplashActivity.this,MainActivity.class));
                        finish();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.w(TAG,"error");
                    }
                });
    }
}
