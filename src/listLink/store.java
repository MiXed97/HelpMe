/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listLink;

import assgn.JianKai.aff;

/**
 *
 * @author Student
 */
public class store {
    
    ListLinkInt<student> stud = new ListLink<>();
    ListLinkInt<aff> aff = new ListLink<>();
    
    
    public store(){}

    public ListLinkInt<student> getStud() {
        return stud;
    }

    public void setStud(ListLinkInt<student> stud) {
        this.stud = stud;
    }

    public ListLinkInt<aff> getAff() {
        return aff;
    }

    public void setAff(ListLinkInt<aff> aff) {
        this.aff = aff;
    }
    
    
    

}
