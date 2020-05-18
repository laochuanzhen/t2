package com.company.human;

/**
 * @description:
 * @author: ASUS
 * @date: Created in 2020/5/16 21:34
 * @version: ${VERSION}
 * @modified By:
 */

import com.company.transports.Airship;
import com.company.transports.Bicycle;
import com.company.transports.HotAirBalloon;
import com.company.transports.Hovercraft;
import com.company.transports.Motorcycle;
import com.company.transports.Plane;
import com.company.transports.Steamship;
import com.company.transports.Submarine;
import com.company.transports.Vehicle;
import java.io.PrintStream;

public class Person {
    private String id;
    private String p_name;

    public void driveMethod(Airship airship) {
        PrintStream var10000 = System.out;
        this.p_name.split(airship.getId());
    }

    public void driveMethod(Bicycle bicycle) {
        bicycle.driveMethod();
        System.out.println(bicycle.getId());
    }
    public void driveMethod(HotAirBalloon hotAirBalloon) {
        hotAirBalloon.driveMethod();
        System.out.println(hotAirBalloon.getId());
    }

    public void driveMethod(Hovercraft hovercraft) {
        hovercraft.driveMethod();
        System.out.println(hovercraft.getId());
    }

    public void driveMethod(Motorcycle motorcycle) {
        motorcycle.driveMethod();
        System.out.println(motorcycle.getId());
    }

    public void driveMethod(Plane plane) {
        plane.driveMethod();
        System.out.println(plane.getId());
    }

    public void driveMethod(Steamship steamship) {
        steamship.driveMethod();
        System.out.println(steamship.getId());
    }

    public void driveMethod(Submarine submarine) {
        submarine.driveMethod();
        System.out.println(submarine.getId());
    }

    public void driveMethod(Vehicle vehicle) {
        vehicle.driveMethod();
        System.out.println(vehicle.getId());
    }

    public Person() {
    }

    public Person(String id, String p_name) {
        this.id = id;
        this.p_name = p_name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_name() {
        return this.p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
}
