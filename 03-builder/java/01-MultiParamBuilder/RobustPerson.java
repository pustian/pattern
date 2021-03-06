public class RobustPerson {
    // 所有属性都被final修饰
    // 必要参数
    private final int id;
    private final String name;
    
    // 可选参数
    private final int age;
    private final String gender;
    private final double height;
    private final int weight;

    // 构造方法私有，即客户端不能直接创建RobustPerson对象
    private RobustPerson(Builder builder) { 
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    // static final
    public static final class Builder {
        // 所有属性都被final修饰
        // 必要参数
        private final int id;
        private final String name;
        
        // 可选参数
        private int age;
        private String gender;
        private double height;
        private int weight;

        public Builder(int id, String name) { this.id = id; this.name = name; } // 必要参数通过构造方法赋值
        public Builder age(int age) { this.age = age; return this; } // 可选参数通过同名方法赋值
        public Builder gender(String gender) { this.gender = gender; return this; }
        public Builder height(double height) { this.height = height; return this; }
        public Builder weight(int weight) { this.weight = weight; return this; }
        public RobustPerson build() {
            // 
            RobustPerson person = new RobustPerson(this);
            // 复杂业务语义校验，对于校验不通过场景，抛出异常
            if (person.height != 0 && person.weight != 0) { // Builder对象并非线程安全的，不能用this.xxx校验
                double bmi = person.weight / (person.height * person.height);
                if (bmi < 18 || bmi > 25) { // 身体质量指数(BMI)低于18或高于25时表示不健康
                    throw new IllegalArgumentException(person.name+" NOT A ROBUST PERSON!");
                 }
            }
            return person;
        }
    }
    public Builder toBuilder() { // 克隆
        return new Builder(this.id, this.name).age(this.age).gender(this.gender)
            .height(this.height).weight(this.weight);
    }

    @Override
    public String toString() {
        return "name=" + name + ", id=" + id + ", age=" + age + ", gender='" + gender 
            + ", height=" + height + "m, weight=" + weight + "kg}";
    }

}
