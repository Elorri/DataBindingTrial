package com.elorri.android.databingtrial;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Elorri on 24/08/2016.
 */
public class User extends BaseObservable {

    String firstName;
    String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
        notifyPropertyChanged(com.elorri.android.databingtrial.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.elorri.android.databingtrial.BR.lastName);
    }
}
