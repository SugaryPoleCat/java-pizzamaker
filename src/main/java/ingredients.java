public class ingredients {
    String owner;
    ingredients_type name;
    int amount = 0;
    public void poop(String owner, ingredients_type name){
        this.owner = owner;
        this.name = name;
        this.amount += 1;
        if(this.amount > 3){
            this.amount = 3;
        }
    }
}
