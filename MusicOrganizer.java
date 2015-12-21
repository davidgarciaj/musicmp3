import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
    
    /**
     * Return if the number that i give him is a number of one song.
     */
    public void checkIndex(int song){
        if(validIndex(song)){
            System.out.println("El numero dado contiene la canción --> " + files.get(song));
        }
        else{
            System.out.println("El número que me has dado no pertenece a ninguna canción.");
            if(files.size() != 0){
                System.out.println("Por favor inserta un número dentro del rango [0 - " + (files.size()-1) + "].");
            }
            else{
                System.out.println("No se han introducido canciones, introduce alguna primero.");
            }
        }
    }
    /**
     * Return if the number that i give him is a number of one song.
     */
    public boolean validIndex(int song){
        boolean correct = false;
        if(song >= 0 && song < files.size()){
            correct = true;
        }
        return correct;
    }
}
