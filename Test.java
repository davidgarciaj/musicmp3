
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (21/12)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private MusicOrganizer mp3;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        // initialise instance variable mp3
        mp3 = new MusicOrganizer();
    }

    /**
     * Test to the method checkIndex.
     */
    public void testeoCheckIndex()
    {
        // provando sin objetos dentro
        System.out.println("No hemos metido aun objeto");
        mp3.checkIndex(0);
        // provando con objetos dentro
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero incorrecto");
        mp3.addFile("prueba1.mp3");
        mp3.checkIndex(1);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero correcto");
        mp3.checkIndex(0);
        mp3.removeFile(0);
    }

    /**
     * Test to the method validIndex.
     */
    public void testeoValidIndex()
    {
        // provando sin objetos dentro
        System.out.println("No hemos metido aun objeto");
        if(mp3.validIndex(0)== true){
            System.out.println("El método ValidIndex ha devuelto verdadero");
        }
        else{
            System.out.println("El método ValidIndex ha devuelto falso");
        }
        // provando con objetos dentro
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero incorrecto");
        mp3.addFile("prueba1.mp3");
        if(mp3.validIndex(1)== true){
            System.out.println("El método ValidIndex ha devuelto verdadero");
        }
        else{
            System.out.println("El método ValidIndex ha devuelto falso");
        }
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero correcto");
        if(mp3.validIndex(0)== true){
            System.out.println("El método ValidIndex ha devuelto verdadero");
        }
        else{
            System.out.println("El método ValidIndex ha devuelto falso");
        }
        mp3.removeFile(0);
    }
    
     /**
     * Test to the method listFile.
     */
    public void testeoListFile()
    {
        // provando sin objetos dentro
        System.out.println("No hemos metido aun objeto");
        mp3.listFile(0);
        // provando con objetos dentro
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero incorrecto");
        mp3.addFile("prueba1.mp3");
        mp3.listFile(1);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero correcto");
        mp3.listFile(0);
        mp3.removeFile(0);
    }

    /**
     * Test to the method removeFile.
     */
    public void testeoRemoveFile()
    {
        // provando sin objetos dentro
        System.out.println("No hemos metido aun objeto");
        System.out.println("Tenemos actualmente " + mp3.getNumberOfFiles() + " objetos.");
        mp3.removeFile(0);
         System.out.println("Y ahora tenemos actualmente " + mp3.getNumberOfFiles() + " objetos.");
        // provando con objetos dentro
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero incorrecto");
        mp3.addFile("prueba1.mp3");
         System.out.println("Tenemos actualmente " + mp3.getNumberOfFiles() + " objetos.");
        mp3.removeFile(1);
         System.out.println("Y ahora tenemos actualmente " + mp3.getNumberOfFiles() + " objetos.");
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Hemos metido un objeto y un numero correcto");
         System.out.println("Tenemos actualmente " + mp3.getNumberOfFiles() + " objetos.");
        mp3.removeFile(0);
         System.out.println("Y ahora tenemos actualmente " + mp3.getNumberOfFiles() + " objetos.");
    }
}
