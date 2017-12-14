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
    
    public ListLinkInt<student> stud = new ListLink<>();
    
    public ListLinkInt<aff> affiliate = new ListLink<>();
    
    public store(){}
    //get restaurant name
    public void setResname(ListLinkInt<aff> affiliate)
    {
        this.affiliate = affiliate;
    }
    
    public ListLinkInt<aff> getResname()
    {
        return affiliate;
    }

    
    //get affiliate ID
    public void setAffID(ListLinkInt<aff> affiliate)
    {
        this.affiliate = affiliate;
    }
    
    public ListLinkInt<aff> getAffID()
    {
        return affiliate;
    }
   
    //get student
    public ListLinkInt<student> getStud() {
        return stud;
    }

    public void setStud(ListLinkInt<student> stud) {
        this.stud = stud;
    }
    
    

}
