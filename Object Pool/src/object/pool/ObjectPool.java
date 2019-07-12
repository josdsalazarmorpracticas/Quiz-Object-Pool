/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object.pool;

/**
 *
 * @author Estudiante
 */
public class ObjectPool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OliphauntPool pool = new OliphauntPool();
        Oliphaunt oliphaunt1 = pool.checkOut();
        System.out.println("Checked out {} "+ oliphaunt1);
        System.out.println(pool.toString());
        Oliphaunt oliphaunt2 = pool.checkOut();
        System.out.println("Checked out {} "+ oliphaunt2);
        Oliphaunt oliphaunt3 = pool.checkOut();
        System.out.println("Checked out {} "+ oliphaunt3);
        System.out.println(pool.toString());
        System.out.println("Checking in {} "+ oliphaunt1);
        pool.checkIn(oliphaunt1);
        System.out.println("Checking in {} "+ oliphaunt2);
        pool.checkIn(oliphaunt2);
        System.out.println(pool.toString());
        Oliphaunt oliphaunt4 = pool.checkOut();
        System.out.println("Checked out {} "+ oliphaunt4);
        Oliphaunt oliphaunt5 = pool.checkOut();
        System.out.println("Checked out {} "+oliphaunt5);
        System.out.println(pool.toString());
    }
    
}
