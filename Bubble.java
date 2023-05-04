package Algoritmos;

public class Bubble {
    private long[] a;
    private int nElems;
    public Bubble(int max){
        a = new long[max];
        nElems = 0;
    }
    public void insere(long value){
        a[nElems] = value;
        nElems++;
    }
    public void mostra(){
        for(int j=0; j< nElems; j++){
            System.out.print(a[j] + " ");
            System.out.println("");
        }
    }
    public void troca(int um, int dois){
        long temp = a[um];
        a[um] = a[dois];
        a[dois] = temp;
    }
    public void bolha(){
        int out, in;
        for(out=nElems-1; out>1;out--){
            for(in=0;in<out;in++){
                if (a[in] > a[out+1]) {
                    troca(in, in+1);
                }
            }
        }
    }
    
    


}
