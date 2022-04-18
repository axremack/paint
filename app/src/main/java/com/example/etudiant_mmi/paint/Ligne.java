package com.example.etudiant_mmi.paint;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

import java.util.ArrayList;

public class Ligne {

    private Point p1_;
    private Point p2_;

    public void setP1(Point p) {
        p1_ = p;
    }

    public void setP2(Point p) {
        p2_ = p;
    }

    public Ligne() {
        p1_ = null;
        p2_ = null;
    }

    public void dessiner(Paint pinceau, Canvas toile) {
        pinceau.setStyle(Paint.Style.FILL);
        pinceau.setStyle(Paint.Style.STROKE);
        pinceau.setColor(0xFF00FF00);
        pinceau.setStrokeWidth(4);

        if(p1_ != null && p2_ != null){
            int x1 = p1_.x;
            int x2 = p2_.x;
            int y1 = p1_.y;
            int y2 = p2_.y;
            toile.drawLine(x1, y1, x2, y2, pinceau);
        }

    }

}
