
package com.parshwa.clima;


class ClimaData
{
    Integer pressure;
    Integer humidity ;
    //Integer code;
    Double temp ;
    Double speed ;
    Double lat ;
    Double lon ;
    String description ;
    String name ;
    //String message;
    
    public void display()
    {
        System.out.println("TEMPERATURE : "+temp+"\nPRESSURE : "+pressure+"\nHUMIDITY : "+humidity+"\nWIND SPEED : "+speed+"\nWEATHER DESCRIPTION : "+description+"\nCITY NAME : "+name+"\nLATITUDE : "+lat+"\nLONGITUDE : "+lon);
    }
            
}