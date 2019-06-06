package br.com.digitalhouse.reviewandsharedpreferences.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {

    private String name;
    private String phone;
    private int avatar;

    public Contact() {
    }

    public Contact(String name, String phone, int avatar) {
        this.name = name;
        this.phone = phone;
        this.avatar = avatar;
    }

    protected Contact(Parcel in) {
        name = in.readString();
        phone = in.readString();
        avatar = in.readInt();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(phone);
        dest.writeInt(avatar);
    }
}
