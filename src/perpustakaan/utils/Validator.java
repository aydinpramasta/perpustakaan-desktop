/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan.utils;

/**
 *
 * @author aydin
 */
public class Validator {

    public static boolean isEmpty(String value) {
        return value.equals("");
    }

    public static boolean isNotInteger(String value) {
        try {
            Integer.parseInt(value);

            return false;
        } catch (NumberFormatException exception) {
            return true;
        }
    }

    public static boolean isNotLong(String value) {
        try {
            Long.parseLong(value);

            return false;
        } catch (NumberFormatException exception) {
            return true;
        }
    }
}
