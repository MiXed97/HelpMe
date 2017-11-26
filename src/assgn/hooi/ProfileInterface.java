
package assgn.hooi;


public interface ProfileInterface {
    public void setName(String name);
    public void setPhone(String phone);
    public void setAddress(String address);
    public void setEmail(String email);
    public String getName();
    public String getPhone();
    public String getAddress();
    public String getEmail();
    public boolean matchPhone(String phone);
}
