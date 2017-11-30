/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

/**
 *
 * @author Mixed_97
 */
public class Turn implements TurnInterface{
    int curr = 1;
    
    public Turn(){}

    public int getCurr() {
        return curr;    
    }

    public int findTurn(ArrayListInterface <DeliveryMen> deliveryMen){
        int result = curr;
        if(curr != deliveryMen.size())
        {
            curr++;
        }
        else{
            curr = 1;
        }
        return result;
    }
    
}
