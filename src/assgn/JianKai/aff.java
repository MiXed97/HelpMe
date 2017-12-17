package assgn.JianKai;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class aff implements RegisterInterface{
    
    String Aid;
    String name;
    String password;
    String password2;
    String IC;
    String tel;
    String email;
    String resname;
    String resadd;
    String rescat;
    String postal;
    String theerror="";

    
    public aff(){}
    
    public aff(String Aid,String name,String password,String IC,String tel,String email,String resname,String resadd,String postal,String rescat)
    {
        this.Aid = Aid;
        this.name = name;
        this.password = password;
        this.IC = IC;
        this.tel = tel;
        this.email = email;
        this.resname = resname;
        this.resadd = resadd;
        this.postal = postal;
        this.rescat = rescat;
    }
    
public aff(String Aid,String name,String password,String password2,String IC,String tel,String email,String resname,String resadd,String postal,String rescat)
    {
        this.Aid = Aid;
        this.name = name;
        this.password = password;
        this.password2 = password2;
        this.IC = IC;
        this.tel = tel;
        this.email = email;
        this.resname = resname;
        this.resadd = resadd;
        this.postal = postal;
        this.rescat = rescat;
    }

    public String getAid() {
        return Aid;
    }

    public void setAid(String Aid) {
        this.Aid = Aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getResadd() {
        return resadd;
    }

    public void setResadd(String resadd) {
        this.resadd = resadd;
    }

    public String getRescat() {
        return rescat;
    }

    public void setRescat(String rescat) {
        this.rescat = rescat;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Override
    public boolean checkName() {
        boolean result = true;
        
        char c[] = name.toCharArray();
        int namelength = c.length;
        for(int i=0;i<namelength;i++)
        {
            if (Character.isDigit(c[i])) {
                theerror += "Do not enter digit in your name \n";
                return false;
            }
        }
        
        if (name.isEmpty()) {
            theerror += "Please enter your name \n";
            return false;
            
        }
        return result;
        
    }
    
       @Override
    public boolean checkPassword() {
        boolean result = true; 
           if (password.isEmpty()) {
               theerror += "Please enter password\n";
               return false;
           }
           
           if (!password.equals(password2)) {
               theerror += "Password entered not same\n";
               return false;
           }
           
           return result;
           
    }
    
    

    @Override
    public boolean checkIC() {
        boolean result = true;
        char d[] = IC.toCharArray();
        int iclength = d.length;
        if (iclength != 12) {
            theerror += "IC length error \n";
            return false;
        }
        
        for (int o = 0; o < iclength; o++) {
            if (!Character.isDigit(d[o])) {
                theerror += "Please enter digit only for IC number\n";
                return false;
            }
        }
        
        if (IC.isEmpty()) {
            theerror += "Please enter your IC \n";
            return false;
        }
        
        if (iclength != 12) {
            theerror += "Error IC length\n";
            return false;
        }
        
        return result;
    }

    @Override
    public boolean checkTel() {
        boolean result = true;
        if (tel.isEmpty()) {
            theerror += "Please enter your telephone number \n";
            return false;
        }
        
        char e[] = tel.toCharArray();
        int tellength = e.length;
        for (int p = 0; p < tellength; p++) {
            if (!Character.isDigit(e[p])) {
                theerror += "Please enter digit for telephone number only \n";
                return false;
            }
        }
        
        if (tellength != 10 || tellength != 10) {
            theerror += "Error telephone length\n";
            return false;
        }
        return result;
    }

    @Override
    public boolean checkEmail(){
        boolean result = true;
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email))) 
        {
            theerror += "Please enter valid email \n";
            return false;
        }
        
        if (email.isEmpty()) {
            theerror += "Please enter email \n";
            return false;
        }
        return result;
    }

    @Override
    public boolean checkRes() {
        boolean result = true;
        if (resname.isEmpty()) {
            theerror += "Please enter resturant name\n";
            return false;
        }
        
        return result;
    }

    @Override
    public boolean checkResAdd() {
        boolean result = true;
        if (resadd.isEmpty()) {
            theerror += "Please enter resturant address\n";
            return false;
        }
        
        return result;
    }

    @Override
    public boolean checkPostal() {
        boolean result = true;
        if (postal.isEmpty()) {
            theerror += "Please enter resturant postal\n";
            return false;
        }
        
        return result;
    }
    
        public String toString(){
        return theerror;
    }
}
