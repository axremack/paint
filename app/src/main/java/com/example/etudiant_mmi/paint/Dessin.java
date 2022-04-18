package com.example.etudiant_mmi.paint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class Dessin extends FrameLayout {
    private Paint pinceau_;
    private Paint pinceau2_;
    private ArrayList<Courbe> courbes_;

    private ArrayList<Ligne> lignes_;
    private Ligne li_;

    public void setLigne(Ligne l){
        li_ = l;
    }

    public Dessin(Context contexte) {
        super(contexte);
        pinceau_ = new Paint();
        pinceau2_ = new Paint();
        setBackgroundColor(0xFFEEEEEE);
        setWillNotDraw(false);
        setLayoutParams(new LayoutParams(
                LayoutParams.MATCH_PARENT,
                LayoutParams.MATCH_PARENT));
        courbes_ = new ArrayList<Courbe>();

        lignes_ = new ArrayList<Ligne>();
        li_ = null;


        pinceau2_.setStyle(Paint.Style.FILL);
        pinceau2_.setStyle(Paint.Style.STROKE);
        pinceau2_.setColor(0xFF0000FF);
        pinceau2_.setStrokeWidth(4);

        /*Courbe c = new Courbe();
        Courbe c1 = new Courbe();
        c.ajouterPoint( new Point(100, 200));
        c.ajouterPoint( new Point(300, 400));
        c1.ajouterPoint( new Point(10, 20));
        c1.ajouterPoint( new Point(30, 40));
        ajouter(c);
        ajouter(c1);*/
    }

    protected void onDraw(Canvas toile) {
        super.onDraw(toile);

        /*for (int i = 0; i < courbes_.size(); i++){
            courbes_.get(i).dessiner(pinceau_, toile);
        }*/

        for (int i = 0; i < lignes_.size(); i++){
            lignes_.get(i).dessiner(pinceau_, toile);
        }

        if(li_ != null){
            li_.dessiner(pinceau2_, toile);
        }


    }

    void ajouter(Courbe courbe){
        courbes_.add(courbe);
    }

    void ajouter(Ligne ligne){
        lignes_.add(ligne);
    }
}