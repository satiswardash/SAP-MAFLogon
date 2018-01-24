package com.incture.mobility.metrodata;

import android.app.Application;

import com.incture.mobility.metrodata.models.ProductDataSingleton;


/**
 * Subclass of Android Application class to hold product data as a global variable.
 */
public class MetrodataApp extends Application
{
    /**
     * Container for product data received from the OData service
     */
    public ProductDataSingleton northwindData = null;

    /**
     * Initialize the parent class and initialize the Singletons
     */
    @Override
    public void onCreate()
    {
        super.onCreate();

        initSingleton();

    }

    /**
     * Initialize the Singleton (instance of ProductDataSingleton)
     */
    private void initSingleton()
    {
        ProductDataSingleton.createInstance();
        northwindData = ProductDataSingleton.getInstance();
    }

}
