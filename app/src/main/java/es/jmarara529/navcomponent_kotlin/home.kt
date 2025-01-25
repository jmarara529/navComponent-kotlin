package es.jmarara529.navcomponent_kotlin

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class home() : Fragment(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<home> {
        override fun createFromParcel(parcel: Parcel): home {
            return home(parcel)
        }

        override fun newArray(size: Int): Array<home?> {
            return arrayOfNulls(size)
        }
    }


}