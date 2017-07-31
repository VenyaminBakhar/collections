package proptask;

/**
 * Created by Вениамин on 7/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        MapAndProp mapAndProp = new MapAndProp();
        mapAndProp.MapInit("C:\\Users\\Вениамин\\Desktop\\collections\\src\\main\\resources\\prop.properties");
        mapAndProp.showAllElements();
    }
}
