
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pichau
 */
public enum Bases {
    BIN(2), TER(3), QUA(4), PEN(5), SEX(6), HEP(7), OCT(8), NON(9), DEC(10), UND(11), DOD(12), TRI(13), QUR(14), QUI(15), HEX(16);
    
    private Bases(final int num){
        this.base = num;
    }
    
    private final int base;
    
    public int getBase(){
        return base;
    }
    
    
}
