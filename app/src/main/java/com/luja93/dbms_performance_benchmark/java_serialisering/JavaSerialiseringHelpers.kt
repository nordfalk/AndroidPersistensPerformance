package com.luja93.dbms_performance_benchmark.java_serialisering

import android.content.Context
import com.luja93.dbms_performance_benchmark.BaseHelpers
import java.io.Serializable

/**
 */
object JavaSerialiseringHelpers : BaseHelpers<City_JavaSerialisering, Object>() {

    //region SETUP
    override fun buildDb(context: Context): Object {
        DiskCache.init(context.filesDir)
        return Object()
    }

    override fun loadCities(context: Context) {
        loadCitiesData<List<City_JavaSerialisering>>(context)
    }
    //endregion

    private val DATABASE_NAME = "cities-serialiseret.ser"

    //region BENCHMARK HELPERS
    override fun insertCities(db: Object, cities: List<City_JavaSerialisering>) {
        DiskCache.save(DATABASE_NAME, cities as Serializable)
    }

    override fun readCities(db: Object): List<City_JavaSerialisering> {
        return DiskCache.load(DATABASE_NAME) as List<City_JavaSerialisering>
    }

    override fun updateCities(db: Object, cities: List<City_JavaSerialisering>) {
        DiskCache.save(DATABASE_NAME, cities as Serializable)
    }

    override fun deleteCities(db: Object) {
        DiskCache.delete(DATABASE_NAME)
    }
    //endregion

}