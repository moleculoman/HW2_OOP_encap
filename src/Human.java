public class Human {
    private int age;
    public String name;
    private String city;
    public String jobTitle;


    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        if (city ==null || city.isEmpty() || city.isBlank()){
            this.city = "Информация не указана";
        }else{
            this.city = city;
        }
    }
    Human(int age, String name, String city, String jobTitle) {
        this.age = age;
        this.city = city;
        if (name == null || name.isEmpty()){
            this.name = "Информация не указана";
        }else{
            this.name = name;
        }
        if (jobTitle ==null || jobTitle.isBlank()){
            this.jobTitle = "Информация не указана";
        }else{
            this.jobTitle = jobTitle;
        }
    }


    public void setAge(int age) {
            if (age<0){
                this.age = 0;
            }else{
                this.age = age;
            }
        }
        public int getAge() {
            return this.age;
        }
}