package com.example.etudiant_mmi.paint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

import java.util.ArrayList;

public class Courbe {

    private ArrayList<Point> points_;

    public Courbe() {
        points_ = new ArrayList<>();
    }

    public void ajouterPoint(Point point) {
        points_.add(point);
    }

    public void dessiner(Paint pinceau,Canvas toile) {
        pinceau.setStyle(Paint.Style.FILL);
        pinceau.setStyle(Paint.Style.STROKE);
        pinceau.setColor(0xFF00FF00);
        pinceau.setStrokeWidth(4);

        for (int i = 1; i < points_.size(); ++i) {
            int x1 = points_.get(i-1).x; int x2 = points_.get(i).x;
            int y1 = points_.get(i-1).y; int y2 = points_.get(i).y;
            toile.drawLine(x1,y1,x2,y2,pinceau);
        }
    }
}