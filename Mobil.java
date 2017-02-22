
package mobil;
public class Mobil {
    int kecMax;
    int percepatan;
    int kecAktual;
    boolean started;
    
    public Mobil() {
    }

    public Mobil(int kecMax, int percepatan, int kecAktual) {
        this.kecMax = kecMax;
        this.percepatan = percepatan;
        this.kecAktual = kecAktual;
        this.started = false;
    }

    public int getKecAktual() {
        return kecAktual;
    }

    public int getKecMax() {
        return kecMax;
    }

    public int getPercepatan() {
        return percepatan;
    }

    public boolean isStarted() {
        return started;
    }

    public void setKecAktual(int kecAktual) {
        this.kecAktual = kecAktual;
    }

    public void setKecMax(int kecMax) {
        this.kecMax = kecMax;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public void setPercepatan(int percepatan) {
        this.percepatan = percepatan;
    }
    public void Start(){
        if (!started){
            this.setKecAktual(0);
        }
    }
    public void Stop(){
        this.setKecAktual(0);
        this.started = true;
        System.out.println();
        System.out.println("Kecepatan Mobil " + this.getKecAktual());
        System.out.println();
        
    } 
    public void Rem(){
        this.setKecAktual(this.getKecAktual()/2);
    }
    public void gantiGigi(int Gigi){
        this.setPercepatan(percepatan);
        switch(Gigi){
            case 0:
                this.setPercepatan(0);
                break;
            case 1:
                this.setPercepatan(10);
                break;
            case 2:
                this.setPercepatan(20);
                break;
            case 3:
                this.setPercepatan(30);
                break;
            case 4:
                this.setPercepatan(40);
                break;    
        }
    }
    public void Gas(){
        if (this.getKecAktual()+ this.getPercepatan() < this.getKecMax()) {
        this.setKecAktual(this.getKecAktual()+this.getPercepatan());        
    } else this.setKecAktual(this.getKecMax());
        
    }
    }
        
    
    
   

