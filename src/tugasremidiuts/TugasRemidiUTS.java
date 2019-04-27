
package TugasRemidiUTS;

public class TugasRemidiUTS {

    public static void main(String[] args) {
        
        INTEL intel1 = new INTEL(2);
        AMD amd1 = new AMD (3);
        Komputer komp = new Komputer(intel1);
                
            komp.cetakInfo();
            komp.memasang(intel1);
            komp.mencabut(amd1);
            komp.cetakInfo();
    }
    
}
