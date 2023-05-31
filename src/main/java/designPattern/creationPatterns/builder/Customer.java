package designPattern.creationPatterns.builder;

/*
 I have a simple class customer . It was simple at the begining
 ,but no longer any more new Atributes have been add in the life cycle of the projects
 some attribute are optional and are some mandatory

  so think of new desing patter :builder patter(to build object as per needed attributes)
 */
public class Customer {

    public String phone;
    public String userName;
    public String age;
    public String email;
    public String passsword;
    public String id;

    private Customer(String phone, String userName, String age, String email, String passsword, String id) {
        this.phone = phone;
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.passsword = passsword;
        this.id = id;
    }

    static class Builder {

        private String phone;
        private String userName;
        private String age;
        private String email;
        private String passsword;
        private String id;

        public Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder withUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder withAge(String age) {
            this.age = age;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String passsword) {
            this.passsword = passsword;
            return this;
        }

        public Builder withage(String age) {
            this.age = age;
            return this;
        }

        public Customer build() {
            return new Customer(phone, userName, age, email, passsword, id);
        }


    }
}
