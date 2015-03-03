/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Marc
 */
public class Trumpet implements IInstrument{
    private String color;
    private String sound;
    private int volume;
    public Trumpet(){
        color = "golden";
        sound = "pouet";
        volume = 5;
    }
    
    @Override
    public String play() {
        return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return color;
    }
    
}
