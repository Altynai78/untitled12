public class Main {
    public static void main(String[] args) {
        Medik medik= new Medik();
        Magis magis=new Magis();
        Warror warror= new Warror();
        Hero[] geroi ={magis,medik,warror};
        for (int i = 0; i < geroi.length; i++) {
            geroi[i].appliSyperAbiliti();
        }

    }
}