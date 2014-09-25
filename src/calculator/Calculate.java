/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;

/**
 *
 * @author rodki143
 */
public class Calculate {

    private static Calculate instance;

    public static Calculate getInstance(){
        if(instance == null){
            instance = new Calculate();
            return instance;
        }
        return instance;
    }
}
