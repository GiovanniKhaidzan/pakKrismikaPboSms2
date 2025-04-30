
package latihan4.nilai;

/**
 *
 * @author GIOVANI DAVINCI
 */
public class Nilai {
    private int prak;
    private int tgs;
    private int uts;
    private int uas;
    
    
   public Nilai(int prak , int tgs, int uts, int uas){
       this.prak = prak;
       this.tgs = tgs;
       this.uts = uts;
       this.uas = uas;
   }

    /**
     * @return the prak
     */
    public int getPrak() {
        return prak;
    }

    /**
     * @param prak the prak to set
     */
    public void setPrak(int prak) {
        this.prak = prak;
    }

    /**
     * @return the tgs
     */
    public int getTgs() {
        return tgs;
    }

    /**
     * @param tgs the tgs to set
     */
    public void setTgs(int tgs) {
        this.tgs = tgs;
    }

    /**
     * @return the uts
     */
    public int getUts() {
        return uts;
    }

    /**
     * @param uts the uts to set
     */
    public void setUts(int uts) {
        this.uts = uts;
    }

    /**
     * @return the uas
     */
    public int getUas() {
        return uas;
    }

    /**
     * @param uas the uas to set
     */
    public void setUas(int uas) {
        this.uas = uas;
    }
   
   
   
}
