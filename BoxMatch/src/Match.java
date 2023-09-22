
public class Match {
    //Nitelikleri tanımladık
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    //Kurucu metodumuzu oluşturduk
    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    public void run(){
        if (isCheck()){
                System.out.println("===========Round==========");
                if (isStart()){         //İsStart() metodu ile müsabakaya kimin başlayacağına karar verdik.
                    System.out.println("Müsabakaya " +this.f1.name+ "  başladı");
                    while (this.f1.health>=0 && this.f2.health>=0) {
                        this.f2.health = this.f1.hit(f2);
                        if (isWin()) {
                            break;
                        }
                        this.f1.health = this.f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                    }
                }else {
                    while (this.f1.health>=0 && this.f2.health>=0) {
                        System.out.println("Müsabakaya "+this.f2.name+"  başladı");
                        this.f1.health = this.f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        this.f2.health = this.f1.hit(f2);
                        if (isWin()) {
                            break;
                        }
                    }
                }

                System.out.println(this.f1.name+" sağlık "+ this.f1.health );
                System.out.println(this.f2.name+" sağlık "+ this.f2.health );
            }
        else{
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck(){          //Sporcuların karşılaşıp karşılaşamayacaklarının şartını oluşturduk
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin(){            //Kazananın belirlendiği koşul oluşturuldu
        if (this.f1.health==0){
            System.out.println(this.f2.name+ " Kazandı.");
            return true;
        }
        if (this.f2.health==0){
            System.out.println(this.f1.name+" Kazandı");
            return true;
        }
        return false;
    }

    boolean isStart(){          //İlk vuruşu kimin yapacağının koşulu oluşturuldu
        double numberOne=Math.random()*100;
        return numberOne>=50;
    }


}




