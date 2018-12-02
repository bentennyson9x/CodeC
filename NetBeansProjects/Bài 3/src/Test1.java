
import java.util.concurrent.atomic.AtomicInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Test1 {
    
    static void Swap(AtomicInteger a){
        a.getAndIncrement();
    }
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger();
        a.getAndSet(10);
        Swap(a);
        System.out.println(""+a.get());
    }
}
