/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.*;
import java.awt.image.*;
import ij.process.*;
/**
 *
 * @author James
 */

/**
This class represents an expandable array of images.
@see ImagePlus
*/
public class ImageStack {
    private static final int BYTE=0, SHORT=1, FLOAT=2, RGB=3, UNKNOWN=-1;
    static final int INITIAL_SIZE = 25;
    static final String outOfRange = "Argument out of range: ";
    private int type = UNKNOWN;
    private int nSlices = 0;
    private Object[] stack;
    private String[] label;
    private int width, height;
    private Rectangle roi;
    private ColorModel cm;
    private double min=Double.MAX_VALUE;
    private double max;
    private float[] cTable;
    private int viewers;
} 
