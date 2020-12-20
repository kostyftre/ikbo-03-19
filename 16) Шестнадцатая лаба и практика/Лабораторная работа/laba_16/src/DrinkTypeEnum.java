

public enum DrinkTypeEnum {
    BEER("wine"),
    WINE("wine"),
    VODKA("vodka"),
    BRANDY("brandy"),
    SHAMPAGNE("shampagne"),
    WHISKEY("whiskey"),
    TEQUILA("tequila"),
    RUM("rum"),
    VERMUTH("vermuth"),
    LIQUOR("liquor"),
    JAGERMEISTER("jagermeister"),
    JUICE("juice"),
    COFFEE("coffee"),
    GREEN_TEA("green_tea"),
    BLACK_TEA("black_tea"),
    MILK("milk"),
    WATER("water"),
    SODA("soda");

    String name;
    DrinkTypeEnum(String name){
        this.name = name;
    }

    public static DrinkTypeEnum fromString(String str){
        try{
            return DrinkTypeEnum.valueOf(str.toUpperCase());
        }
        catch(IllegalArgumentException exc){
            System.out.println("Такого напитка нет: " + str);
            return null;
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "type: " + name + " ";
    }
}
