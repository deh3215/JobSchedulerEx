package com.example.a32150.jobschedulerex;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by 32150 on 2017/12/11.
 */

public class MyService extends JobService{


    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("JOB", "onStartJob");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Log.d("JOB", "onStopJob");
        return false;
    }
}
