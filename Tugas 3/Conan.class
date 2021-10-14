public class Conan{

    public static class Human{
        public String nama;
        public int umur;
        public String alamat;
        public int tabungan;
    
        Human(String nama, int umur, String alamat, int tabungan){
            this.nama = nama;
            this.umur = umur;
            this.alamat = alamat;
            this.tabungan = tabungan;
        }
    }

    public static void main(String[] args) {
        Human mafiaDon = new Human("Kai", 45, "New York", 80000000);
        Human mafiaUnderboss = new Human("Adit", 25, "Manhattan", 1250000);
        Human mafiaCapo = new Human("Hoseok", 22, "California", 200000);
        Human nonmafia = new Human("Idir", 20, "Karang Tengah", 22000);

        System.out.println(getCharacteristic(mafiaDon));
        System.out.println(getCharacteristic(mafiaUnderboss));
        System.out.println(getCharacteristic(mafiaCapo));
        System.out.println(getCharacteristic(nonmafia));
        
    }

    public static String getCharacteristic(Human human){
        String syndicate = getSyndicate(
          human.umur,
          human.alamat,  
          human.tabungan
        );

        switch(syndicate.toLowerCase()){
            case"don":
            case"underboss":
            case"capo":
                return human.nama + " kemungkinan adalah seorang anggota mafia dengan pangkat " + syndicate ;
            default:
                return human.nama + " tidak mencurigakan";
        }
    }

    public static String getSyndicate(int umur, String alamat, int tabungan){
        if(umur > 40 & tabungan > 10000000){
            switch(alamat.toLowerCase()){
                case "nevada":
                case "new york":
                case "havana":
                    return "Don";
                default :
                return "";
            }
        }

        else if((umur >= 25  & umur<=40) && (tabungan >= 1000000 || tabungan <= 2000000)){
            switch(alamat.toLowerCase()){
                case "new jersey":
                case "manhattan":
                case "nevada":
                    return "Underboss";
                default :
                return "";
            }
        }

        else if((umur >= 18  & umur<=24) && (tabungan < 1000000)){
            switch(alamat.toLowerCase()){
                case "california":
                case "detroit":
                case "boston":
                    return "Capo";
                default :
                return "";
            }
        }
        
        else{
            return "";
        }
    }
    
}
