package com.farehawker.Model;

/**
 * Created by 1 on 3/16/2018.
 */

public class OnewayModelClass {
    private String airlinename,flightcode,flightnumber,seatavalble,numstop,price,arrivingtime,departuretime;;
    private int image;
    private String resultindex;

    public String getAirlinename() {
        return airlinename;
    }

    public void setAirlinename(String airlinename) {
        this.airlinename = airlinename;
    }

    public String getFlightcode() {
        return flightcode;
    }

    public void setFlightcode(String flightcode) {
        this.flightcode = flightcode;
    }

    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getSeatavalble() {
        return seatavalble;
    }

    public void setSeatavalble(String seatavalble) {
        this.seatavalble = seatavalble;
    }

    public String getNumstop() {
        return numstop;
    }

    public String getResultindex() {
        return resultindex;
    }

    public void setResultindex(String resultindex) {
        this.resultindex = resultindex;
    }

    public void setNumstop(String numstop) {
        this.numstop = numstop;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    //public String getImageurl() {
      //  return imageurl;
    //}

    //public void setImageurl(String imageurl) {
    //    this.imageurl = imageurl;
   // }

    public int getImage() {
        return image;
    }

    public String getArrivingtime() {
        return arrivingtime;
    }

    public void setArrivingtime(String arrivingtime) {
        this.arrivingtime = arrivingtime;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public void setImage(int image) {
        this.image = image;
    }
}