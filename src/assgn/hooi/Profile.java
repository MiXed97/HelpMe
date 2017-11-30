
package assgn.hooi;


public class Profile implements ProfileInterface{

    private String name;
    private String phone;
    private String address;
    private String email;
    
    public Profile(String name,String phone,String address,String email){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public boolean matchPhone(String phone) {
        boolean status = true;
        
        if(!this.phone.equals(phone))
            status = false;
        
        return status;     
    }
    
    
}
