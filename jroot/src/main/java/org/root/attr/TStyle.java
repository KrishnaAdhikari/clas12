/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.root.attr;

/**
 *
 * @author gavalian
 */
public class TStyle {
    
    private static Integer axisFrameLineWidth    = 1;
    private static String  axisFontStringName    = "Helvetica";
    private static Integer axisFontSize          = 18;
    
    
    private static String  statBoxFontStringName = "Courier New";
    private static Integer statBoxFontSize       = 18;
    private static Boolean statBoxOptions        = true;
    private static Double  statBoxTextGap        = 1.2;
            
    public  static void setAxisFont(String name, int size){
        TStyle.axisFontStringName = name;
        TStyle.axisFontSize = size;
    }
    
    public static int getAxisFontSize(){
        return TStyle.axisFontSize;
    }
    
    public static String getAxisFontName(){
        return TStyle.axisFontStringName;
    }
    
    public  static void setStatBoxFont(String name, int size){
        TStyle.statBoxFontStringName = name;
        TStyle.statBoxFontSize = size;
    }
    
    public static int getStatBoxFontSize(){
        return TStyle.statBoxFontSize;
    }
    
    public static String getStatBoxFontName(){
        return TStyle.statBoxFontStringName;
    }
    
    public static void setFrameLineWidth(int width){
        TStyle.axisFrameLineWidth = width;
    }
    
    public static int getFrameLineWidth(){
        return TStyle.axisFrameLineWidth;
    }
    
    public static void setOptStat(boolean flag){
        TStyle.statBoxOptions = flag;
    }
    
    public static boolean getOptStat(){
        return TStyle.statBoxOptions;
    }
    
    public static void setStatBoxTextGap(double value){
        TStyle.statBoxTextGap = value;
    }
    
    public static double getStatBoxTextGap(){
        return TStyle.statBoxTextGap;
    }
}
