/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.entities;
import java.util.ArrayList;
/**
 *
 * @author Daniel Plasencia
 */
public class TaskManager {
    
    private ArrayList<String> tasks = new ArrayList<String>();
    
    public void addTask(String task){
        this.tasks.add(task);
    }
    
    public void deleteTask(int posicion){
        this.tasks.remove(posicion);
    }
    
    public ArrayList<String> getTasks(){
        return tasks;
    }
    
}
