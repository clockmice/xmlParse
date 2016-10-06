package com.example;

import com.github.goober.coordinatetransformation.positions.RT90Position;
import com.github.goober.coordinatetransformation.positions.WGS84Position;

import java.awt.*;

public class Butik {
    private String name;
    private String address;
    private String city;
    private Point point;
    private String pointxtest;
    private String pointytest;

    public String getPointxtest() {
        String out = "" + point.getCoordinateX();
        return out;
    }

    public String getPointytest() {
        String out = "" + point.getCoordinateY();
        return out;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(double pointX, double pointY) {
        RT90Position rt90Position = new RT90Position(pointX, pointY);
        WGS84Position wgs84Position = rt90Position.toWGS84();
        Point point = new Point(wgs84Position.getLatitude(), wgs84Position.getLongitude());
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
