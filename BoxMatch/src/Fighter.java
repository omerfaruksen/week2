
public class Fighter {
    //Niteliklerimizi tanımladık
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    //Kurucu metodumuzu oluşturduk.
    Fighter(String name, int damage, int health, int weight, int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        if (dodge>=0 && dodge<=100){            //Sporcuların bloklama oranını koşula bağladık
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }
        this.dodge=dodge;

    }

    int hit (Fighter foe){
        System.out.println(this.name+ "=>"+ foe.name+ " "+this.damage+ " hasar vurdu");
        if (foe.isDodge()){
            System.out.println("--------------------------");
            System.out.println(foe.name+ " gelen hasarı blokladı.");
            System.out.println("--------------------------");
            return foe.health;
        }
        if (foe.health - this.damage<0){
            return 0;
        }
        return foe.health-this.damage;
    }
    //Bloklama ihtimalini boolean ile oluşturduk.
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodge;
    }


}
