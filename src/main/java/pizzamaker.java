public class pizzamaker {
    public static void main(String[] args) throws Exception {
//        try {
//            pizza mozzarella = new pizza(null, null, null);
//            System.out.println(mozzarella.toString());
//        } catch (Exception e){
//            throw new Exception(e);
//        }
        try{
            pizza mozzarella = new pizza("Mozzarella", crust_thickness.THIN, crust_type.NORMAL);
            System.out.println(mozzarella.toString());
        } catch(Exception e){
            throw new Exception(e);
        }
    }
}