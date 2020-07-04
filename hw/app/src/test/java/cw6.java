public class cw6 {



    private String name;
    private int image ;
     private int attack ;
     private int defence;

    public cw6(String name, int image, int attack, int defence, int tatal) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.defence = defence;
        this.tatal = tatal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getTatal() {
        return tatal;
    }

    public void setTatal(int tatal) {
        this.tatal = tatal;
    }

    private int tatal ;

}
