package com.example.etudiant_mmi.paint;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;

public class Ecouteur implements View.OnTouchListener {
    private Courbe c_;
    private Ligne l_;

    public void Ecouteur(){
        c_ = null;
        l_ = null;
    }

    /*public boolean onTouch(View vue,MotionEvent evnt) {
        Dessin dessin = (Dessin)vue;

        int action = evnt.getAction();
        int x = (int)evnt.getX();
        int y = (int)evnt.getY();

        if (action == MotionEvent.ACTION_DOWN){
            c_ = new Courbe();
            c_.ajouterPoint(new Point(x,y));
            dessin.ajouter(c_);
        }
        else if (action == MotionEvent.ACTION_UP){

        }
        else if (action == MotionEvent.ACTION_MOVE){
            c_.ajouterPoint(new Point(x,y));
        }

        dessin.invalidate();
        return true;
    }*/


    public boolean onTouch(View vue,MotionEvent evnt) {
        Dessin dessin = (Dessin)vue;

        int action = evnt.getAction();
        int x = (int)evnt.getX();
        int y = (int)evnt.getY();

        if (action == MotionEvent.ACTION_DOWN){
            l_ = new Ligne();
            l_.setP1(new Point(x,y));
            dessin.setLigne(l_);
        }
        else if (action == MotionEvent.ACTION_UP){
            l_.setP2(new Point(x,y));
            dessin.ajouter(l_);
            dessin.setLigne(null);
        }
        else if (action == MotionEvent.ACTION_MOVE){
            l_.setP2(new Point(x,y));
            dessin.setLigne(l_);
        }

        dessin.invalidate();
        return true;
    }
}
