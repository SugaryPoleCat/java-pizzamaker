public class pizza {
    String name;
    String crust_thickness;
    String crust_type;
    String[] pizza_ingredients;
    public pizza(String name, crust_thickness crust_thickness, crust_type crust_type) throws Exception {
        if(name == null) {
            throw new Exception("Name cannot be null");
        }
        this.name = name;
        if(crust_thickness == null) {
            throw new Exception("Name cannot be null");
        }
        this.crust_thickness = String.valueOf(crust_thickness);
        if(crust_type == null) {
            throw new Exception("Name cannot be null");
        }
        this.crust_type = String.valueOf(crust_type);
    }
    private String capCrust(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }
    private String cap(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
    public void addIngredient(ingredients_type ing) {
        // code
        ingredients poop = ingredients.poop(this.name, ing);
    }
    @Override
    public String toString() {
        String reply = this.capCrust(this.name);
        reply += "\nCrust thickness: " + this.capCrust(this.crust_thickness) + " | Crust type: " + this.capCrust(this.crust_type);
        return reply;
    }
}