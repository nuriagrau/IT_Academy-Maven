package Tasca7.S1_T07_n2exercici1;


public class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

    public static @interface JsonSerializable {
        public @interface JsonElement {
            public String key() default "";
        }

        @JsonElement(key = "filePath")
        String filepath = "/Users/macbookprodenuria/IdeaProjects/IT_Academy/Maven/Sprint1/src/main/java/Tasca7/S1_T07_n2exercici1/jackson_user.json";

    }

}
