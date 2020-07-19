package com.raywenderlich.listmaker

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Parcelable interface allows TaskList to be Bundled when navigating between Activities
 */
@Parcelize // Kotlin Android Extention notation -- eliminates need for Parcelable boilerplate
class TaskList(val name: String, val tasks: ArrayList<String> = ArrayList()) : Parcelable