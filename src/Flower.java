public class Flower {
    private String flowerName;
    private float cost;
    private int lifeSpan;
    private String country;

    public Flower(final String flowerName,final float cost,final String country) {
        this.flowerName = flowerName;
        this.cost = cost;
        this.country = country;
        this.lifeSpan = 3;
    }

    @Override
    public String toString() {
        return "Цветок: " +
                "Наименование='" + flowerName + '\'' +
                ", цена (в рублях) =" + cost +
                ", время стояния цветка (в днях) =" + lifeSpan +
                ", страна происхождения='" + country + '\'' +
                ' ';
    }

    //Constructor
    public Flower(final String flowerName,final float cost,final int lifeSpan,final String country) {
        this.lifeSpan = lifeSpan;
        if (flowerName ==null || flowerName.isEmpty() || flowerName.isBlank()){
            this.flowerName = "Тип цветка не указан";
        } else {
            this.flowerName = flowerName;
        }
        if (country ==null || country.isEmpty() || country.isBlank()){
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <10F){
            this.cost = 1;
        }else{
            this.cost = cost;
        }

    }

    public String getFlowerName() {
        return flowerName;
    }

    public float getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public String getCountry() {
        return country;
    }
}