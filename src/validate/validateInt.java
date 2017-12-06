/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

/**
 *
 * @author Student
 */
public interface validateInt {
    
    public boolean checkSize(int size, String value);
    public boolean checkSameSize(int size, String value);
    public boolean checkAlpha(String value);
    public boolean checkName(String value);
    public boolean checkDigit(String value);
    public boolean checkEmail(String value);
    public boolean isEmpty(String value);
}
