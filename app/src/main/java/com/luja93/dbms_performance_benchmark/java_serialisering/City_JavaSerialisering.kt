package com.luja93.dbms_performance_benchmark.java_serialisering

import com.google.gson.annotations.SerializedName

/**
 *
 */
data class City_JavaSerialisering(
    val id: Long,
    var uid: Long,
    var lat: Float,
    var lon: Float,
    var name: String,
    var place: String
) : java.io.Serializable