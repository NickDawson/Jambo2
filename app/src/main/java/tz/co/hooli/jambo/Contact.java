package tz.co.hooli.jambo;

/**
 * Created by nickjobs on 10/27/15.
 */
public class Contact {

    //Variables
    private int _id;
    private String _name;
    private String _phone_number;
    private String _device;
    private String _address;
    private String _photograph;


    //Constructor
    public Contact(String name, String phone_number, String device, String address, String photograph){
        this._name = name;
        this._phone_number = phone_number;
        this._device = device;
        this._address = address;
        this._photograph = photograph;
    }

    //ID getter and setter functions
    public int getID(){
        return _id;
    }

    public void setID(int id){
        this._id = id;
    }

    //Name getter and setter functions
    public String getName(){
        return this._name;
    }

    public void setName(String name){
          this._name = name;
    }

    //PhoneNumber getter and setter functions
    public String getPhoneNumber(){
        return this._phone_number;
    }
    public void setPhoneNumber(String phone_number){
        this._phone_number = phone_number;
    }
    //Email getter and setter functions
    public String getDevice(){
        return this._device;
    }

    public void setDevice(String device){
        this._device = device;
    }

    // Postal Address getter and setter functions
    public String getPostalAddress(){
        return this._address;
    }

    public void setPostalAddress(String address){
        this._address = address;
    }

    // Photograph getter and setter functions
    public String getPhotograph(){
        return this._photograph;
    }

    public void setPhotograph(String photograph){
        this._photograph = photograph;
    }
}
