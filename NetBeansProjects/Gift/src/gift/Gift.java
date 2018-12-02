/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gift;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Gift extends Thread implements Runnable {

    /**
     * @param args the command line arguments
     */
    public void run() {
//           int i = 0;
//           while (i++ < 100) {
//            System.out.print("\t\t\t\t\t\t\t\t\t\t    Loading : " + i + "%");
//               try {^
//                   Thread.sleep(300);
//               } catch (InterruptedException ex) {
//                   Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
//               }
//            System.out.print("\r");
//        }
        int i = 0, j = 0;
        while (i++ < 100) {
            System.out.print("\t\t\t\t\t\tLoading :  " + i + "% " + " [");
            j = 0;
            while (j++ < i) {
                System.out.print("#");
            }
            while (j++ < 100) {
                System.out.print(" ");
            }
            System.out.print("]");
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.print("\r");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        boolean kyThi = true;
          Scanner s = new Scanner(System.in);
        int soMonThi = 0;
        String luaChon = null;
        String monThi = null;
        System.out.println("\t\t\t\t\t\t      ************ Đây là chương trình chúc Đinh Thanh Ngọc có một kỳ thi THPT Quốc Gia thật tốt ************");
        System.out.println("");
        System.out.println("");
        System.out.println("\t\t\t\t\t\t                   _____________________________________________________________________________                      ");
        System.out.println("");
        System.out.println("");
       String start = null;
        System.out.println("Are you ready? ( Yes or No ) : ");
        start= s.nextLine();
        if (start.equalsIgnoreCase("Yes")){
             Gift a = new Gift();
        a.start();
        a.join();
        System.out.flush();
        System.out.println("\r");
        Thread r3 = new Thread() {
            public void run() {
                int i = 0;
                while (i++ < 100) {
                    if (i == 0 || i == 2 || i == 3) {
                        for (int j = 0; j <= 3; j++) {
                            if (j == 0) {
                                System.out.print("- Hello em. Vậy ngày mai là ngày thi đầu tiên nên hôm nay anh làm 1 chương trình động viên tinh thần cũng như là chúc em may mắn trong phòng thi =)) ");
                            } else if (j == 1) {
                                System.out.print("- Hello em. Vậy ngày mai là ngày thi đầu tiên nên hôm nay anh làm 1 chương trình động viên tinh thần cũng như là chúc em may mắn trong phòng thi =)) .");
                            } else if (j == 2) {
                                System.out.print("- Hello em. Vậy ngày mai là ngày thi đầu tiên nên hôm nay anh làm 1 chương trình động viên tinh thần cũng như là chúc em may mắn trong phòng thi =)) ..");
                            } else if (j == 3) {
                                System.out.print("- Hello em. Vậy ngày mai là ngày thi đầu tiên nên hôm nay anh làm 1 chương trình động viên tinh thần cũng như là chúc em may mắn trong phòng thi =)) ...");
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                    if (i == 3) {
                        System.out.println("- Hello em. Vậy ngày mai là ngày thi đầu tiên nên hôm nay anh làm 1 chương trình động viên tinh thần cũng như là chúc em may mắn trong phòng thi =))");
                    }
                    if (i == 8 || i == 9 || i == 10) {
                        for (int j = 0; j <= 3; j++) {
                            if (j == 0) {
                                System.out.print(" Hi vọng em vào công nghệ thông tin =)). Vì trường Kim Liên mình anh ít quen ai học công nghệ, cũng là vì cùng trường nên thích ^^  ");
                            } else if (j == 1) {
                                System.out.print(" Hi vọng em vào công nghệ thông tin =)). Vì trường Kim Liên mình anh ít quen ai học công nghệ, cũng là vì cùng trường nên thích ^^  .");
                            } else if (j == 2) {
                                System.out.print(" Hi vọng em vào công nghệ thông tin =)). Vì trường Kim Liên mình anh ít quen ai học công nghệ, cũng là vì cùng trường nên thích ^^  ..");
                            } else if (j == 3) {
                                System.out.print(" Hi vọng em vào công nghệ thông tin =)). Vì trường Kim Liên mình anh ít quen ai học công nghệ, cũng là vì cùng trường nên thích ^^  ...");
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                    if (i == 10) {
                        System.out.println(" Hi vọng em vào công nghệ thông tin =)). Vì trường Kim Liên mình anh ít quen ai học công nghệ, cũng là vì cùng trường nên thích ^^ ");
                    }
                    if (i == 13 || i == 14 || i == 15) {
                        for (int j = 0; j <= 3; j++) {
                            if (j == 0) {
                                System.out.print(" Một phần anh cũng học công nghệ nữa biết đâu anh chúc em lại son nhờ =))) nghề chọn người mahh ");
                            } else if (j == 1) {
                                System.out.print(" Một phần anh cũng học công nghệ nữa biết đâu anh chúc em lại son nhờ =))) nghề chọn người mahh  .");
                            } else if (j == 2) {
                                System.out.print(" Một phần anh cũng học công nghệ nữa biết đâu anh chúc em lại son nhờ =))) nghề chọn người mahh  ..");
                            } else if (j == 3) {
                                System.out.print(" Một phần anh cũng học công nghệ nữa biết đâu anh chúc em lại son nhờ =))) nghề chọn người mahh  ...");
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                    if (i == 15) {
                        System.out.println("- Một phần anh cũng học công nghệ nữa biết đâu anh chúc em lại son nhờ =))) nghề chọn người mahh ");
                    }
                    if (i == 20 || i == 21 || i == 22) {
                        for (int j = 0; j <= 3; j++) {
                            if (j == 0) {
                                System.out.print("Chúc em ngày mai gặp may mắn nhé, bình tĩnh, đầu óc thoải mái để làm hết sức ");
                            } else if (j == 1) {
                                System.out.print("Chúc em ngày mai gặp may mắn nhé, bình tĩnh, đầu óc thoải mái để làm hết sức .");
                            } else if (j == 2) {
                                System.out.print("Chúc em ngày mai gặp may mắn nhé, bình tĩnh, đầu óc thoải mái để làm hết sức  ..");
                            } else if (j == 3) {
                                System.out.print("Chúc em ngày mai gặp may mắn nhé, bình tĩnh, đầu óc thoải mái để làm hết sức ...");
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                    if (i == 22) {
                        System.out.println("Chúc em ngày mai gặp may mắn nhé, bình tĩnh, đầu óc thoải mái để làm hết sức ");
                    }
                    if (i == 28 || i == 29 || i == 30) {
                        for (int j = 0; j <= 3; j++) {
                            if (j == 0) {
                                System.out.print("Trước khi thi ăn uống vừa đủ thôi. Ăn nó quá dễ buồn ngủ lắm. Thấy em có vẻ quyết tâm nên chắc là đỗ thôi =))) ");
                            } else if (j == 1) {
                                System.out.print("Trước khi thi ăn uống vừa đủ thôi. Ăn nó quá dễ buồn ngủ lắm. Thấy em có vẻ quyết tâm nên chắc là đỗ thôi =))).");
                            } else if (j == 2) {
                                System.out.print("Trước khi thi ăn uống vừa đủ thôi. Ăn nó quá dễ buồn ngủ lắm. Thấy em có vẻ quyết tâm nên chắc là đỗ thôi =)))  ..");
                            } else if (j == 3) {
                                System.out.print("Trước khi thi ăn uống vừa đủ thôi. Ăn nó quá dễ buồn ngủ lắm. Thấy em có vẻ quyết tâm nên chắc là đỗ thôi =))) ...");
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                    if (i == 30) {
                        System.out.println("Trước khi thi ăn uống vừa đủ thôi. Ăn nó quá dễ buồn ngủ lắm. Thấy em có vẻ quyết tâm nên chắc là đỗ thôi =))) ");
                        System.out.println("----->So...");
                    }
                }
            }
        };
        r3.start();
        r3.join();
        Thread r5 = new Thread() {
            public void run() {
                for (int i = 0; i < 15; i++) {
                    if (i == 0) {
                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t    Loading : 17" + "%");
                    } else if (i == 11) {
                        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t    Loading : 100" + "%");
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.print("\r");
                }
            }
        };
        r5.start();
        r5.join();
        System.out.print("\t\t\t\t\t\t Ở đây có những lời khuyên của anh với mỗi môn em bước vào phòng thi  ( đây là kinh nghiệm chủ quan a rút ra lúc đi thi thôi nhé )  ( Toán | Lý | Hóa | Anh ) em muốn chọn môn nào xem : ");
        while (kyThi == true) {
            monThi = s.nextLine();
            System.out.println("");
            System.out.println("");
            if (monThi.equalsIgnoreCase("Toan")) {
                Thread r2 = new Thread() {
                    public void run() {
                        System.out.println("                                                                    ");
                        int i = 0;
                        while (i++ < 100) {
                            if (i == 0 || i == 2 || i == 3) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("- Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading ...");
                                    }
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");

                                }
                            }
                            if (i == 3) {
                                System.out.println("- Vậy đây là môn đâu tiên của em thi. Môn này nếu xét về mặt logic là môn dễ nhất trong 3 môn toán lý hóa vì nó chỉ có logic mà thôi");
                            }
                            if (i == 4 || i == 5 || i == 6) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 0) {
                                        System.out.print("-  Loading ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading ...");
                                    }
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 6) {
                                System.out.println("- Theo kinh nghiệm của anh với môn này thì khi đọc câu hỏi em cần xác định 3 thứ : ");
                            }
                            if (i == 7 || i == 8 || i == 9) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 0) {
                                        System.out.print("-  Loading ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading.");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading...");
                                    }
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 9) {
                                System.out.println("\t+ Đề bài hỏi gì ");
                            }
                            if (i == 12 || i == 13 || i == 14) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 0) {
                                        System.out.print("-  Loading ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading.");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading...");
                                    }
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 14) {
                                System.out.println("\t+ Thuộc vào dạng gì ");
                            }
                            if (i == 17 || i == 18 || i == 19) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("- Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 19) {
                                System.out.println("\t+ Sau đó mới nghĩ đến cách giải quyết ( nên nhớ đừng bị phức tạp hóa câu hỏi ) ");
                                System.out.println("- Và đây cũng là kết thúc những gì anh nói về môn Toán. Cố gắng làm thật tốt đừng để nhầm nhé! ");
                            }
                        }
                    }
                };

                r2.start();
                r2.join();
            } else if (monThi.equalsIgnoreCase("Ly") || monThi.equalsIgnoreCase("Li")) {
                Thread r1 = new Thread() {
                    public void run() {
                        int i = 0;
                        while (i++ < 100) {
                            System.out.print("\t\t\t\t\t\t\t\t\t\t    Loading : " + i + "%");
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                };
                r1.start();
                r1.join();
                Thread r2 = new Thread() {
                    public void run() {
                        System.out.println("                                                                    ");
                        int i = 0;
                        while (i++ < 100) {
                            if (i == 0 || i == 2 || i == 3) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");

                                }
                            }
                            if (i == 3) {
                                System.out.println("- Vậy đây là môn thứ 2 của em thi trong các môn lựa chọn. Môn Lý này trong phòng thi đòi hỏi em phải làm thật nhanh 30 câu đầu. Anh tin với kiến thức học ở KL thì chắc dễ thôi");
                            }
                            if (i == 4 || i == 5 || i == 6) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 0) {
                                        System.out.print("-  Loading ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 6) {
                                System.out.println("- Tuy là xếp theo từ dễ đến khó. Nhưng mà anh khuyên em làm những câu LÝ THUYÊT trước trong khoảng 30 câu đầu. Làm đến đâu phải chắc đến đó, tuyệt đối kiểu không chắc mà khoanh lúc sau sẽ rất dễ nhầm lẫn");
                            }
                            if (i == 7 || i == 8 || i == 9) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 0) {
                                        System.out.print("-  Loading ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading.");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 9) {
                                System.out.println("- Vì khi em làm lý thuyết sẽ tổng hợp kiến thức nhanh hơn đến lúc vào bài tập vận dụng tư duy sẽ thoải mái không bị phải tìm tòi nhớ lại kiến thức nữa");
                            }
                            if (i == 12 || i == 13 || i == 14) {
                                for (int j = 0; j <= 3; j++) {
                                    if (i == 0) {
                                        System.out.print("-  Loading ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading.");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 14) {
                                System.out.println("- Trong Lý hãy để ý đến nhưng yếu tố đặc biệt trong bài toán vận dụng hoặc vận dụng cao nhé ( mấu chốt để giải quyết nằm ở đấy khai thác thật sâu vào chỗ nào em cảm thấy đặc biệt nhất )");
                            }
                            if (i == 17 || i == 18 || i == 19) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 19) {
                                System.out.println("- Tin vào trực quan ban đầu nhất của bản thân nhé nếu gặp một câu mà TRỰC QUAN cảm thấy đã làm ở đâu đó rồi hoặc trực quan của em đưa ra những phán đoán thì xoáy vào đó ( nên nhớ chỉ là suy nghĩ xuất hiện đầu tiên thôi ) ");
                                System.out.println("Và em làm xong câu nào khoanh luôn câu đó không cuối giờ lại cuống khoanh loạn giống anh ngày trước");
                            }
                        }
                    }
                };

                r2.start();
                r2.join();
            } else if (monThi.equalsIgnoreCase("Hoa")) {
                Thread r1 = new Thread() {
                    public void run() {
                        int i = 0;
                        while (i++ < 100) {
                            System.out.print("\t\t\t\t\t\t\t\t\t\t    Loading : " + i + "%");
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                };
                r1.start();
                r1.join();
                Thread r2 = new Thread() {
                    public void run() {
                        System.out.println("                                                                    ");
                        int i = 0;
                        while (i++ < 100) {
                            if (i == 0 || i == 2 || i == 3) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");

                                }
                            }
                            if (i == 3) {
                                System.out.println("- Theo như anh thấy muốn làm tốt bài thi môn Hóa thì LÝ THUYẾT là cái cực kỳ quan trọng ");
                            }
                            if (i == 4 || i == 5 || i == 6) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 6) {
                                System.out.println("- Anh khuyên em làm những câu LÝ THUYÊT trước trong khoảng 30 câu đầu. Làm đến đâu phải chắc đến đó, tuyệt đối kiểu không chắc mà khoanh lúc sau sẽ rất dễ nhầm lẫn ");
                            }
                            if (i == 7 || i == 8 || i == 9) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 9) {
                                System.out.println("- Vì khi em làm lý thuyết sẽ tổng hợp kiến thức nhanh hơn đến lúc vào bài tập vận dụng tư duy sẽ thoải mái không bị phải tìm tòi nhớ lại kiến thức nữa ");
                            }
                            if (i == 12 || i == 13 || i == 14) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 14) {
                                System.out.println("- Trớ trêu thay là trong Hóa câu khó thường lại là câu LÝ THUYẾT hoặc LÝ THUYẾT nhưng vận dụng chút tư duy và công thức. Vậy nên là em đừng sợ bài tập áp dụng công thức nhiều nhé");
                            }
                            if (i == 17 || i == 18 || i == 19) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 19) {
                                System.out.println("- Trong môn Hóa hoặc Lý yêu cầu em làm bài rất nhanh nên tránh giải bài toán 1 cách quá phức tạp hoặc chi tiết nhé. Cứ gộp hết lời giải trên máy tính ");
                                System.out.println("- Và đây cũng là kết thúc những gì anh nói về môn Hóa");
                            }
                        }
                    }
                };

                r2.start();
                r2.join();
            } else if (monThi.equalsIgnoreCase("Anh")) {
                Thread r1 = new Thread() {
                    public void run() {
                        int i = 0;
                        while (i++ < 100) {
                            System.out.print("\t\t\t\t\t\t\t\t\t\t    Loading : " + i + "%");
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                };
                r1.start();
                r1.join();
                Thread r2 = new Thread() {
                    public void run() {
                        System.out.println("                                                                    ");
                        int i = 0;
                        while (i++ < 100) {
                            if (i == 0 || i == 2 || i == 3) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");

                                }
                            }
                            if (i == 3) {
                                System.out.println("- Khi làm bài môn Anh, anh chỉ muốn nhấn mạnh với em là đề thi Anh để đạt điểm 7 trở lên dễ lắm nếu em học tốt lớp 12 hoặc học mẹo thì không phải là khó");
                            }
                            if (i == 4 || i == 5 || i == 6) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 6) {
                                System.out.println("- Có một số điều anh lưu ý với bài nghe thì em không nghe được là Next luôn đừng quan tâm làm gì. Trước khi vào bài xem form câu hỏi của nó trước để chuẩn bị. Ghi các KeyWord ra nháp nhé ( nhanh vào )");
                            }
                            if (i == 7 || i == 8 || i == 9) {
                                for (int j = 0; j <= 3; j++) {
                                    if (j == 0) {
                                        System.out.print("-  Loading  ");
                                    } else if (j == 1) {
                                        System.out.print("-  Loading  .");
                                    } else if (j == 2) {
                                        System.out.print("-  Loading  ..");
                                    } else if (j == 3) {
                                        System.out.print("-  Loading  ...");
                                    }
                                    try {
                                        Thread.sleep(800);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    System.out.print("\r");
                                }
                            }
                            if (i == 9) {
                                System.out.println("- Trước khi vào phần nghe cố gắng uống nhiều nước vào để tập trung. Em sẽ nghe tốt hơn nhiều đấy");
                                System.out.println("Ngày trước anh thi anh cũng không được cao lắm nên chỉ đưa ra được ít kinh nghiệm thôi. Nhưng sau khi lên đại học mới thấy ngành công nghệ thực sự rất cần tiếng anh thế nên là làm hết sức nhé");
                            }
                        }
                    }
                };

                r2.start();
                r2.join();

            }
            System.out.print("\t\t\t\t\t\t Em muốn xem thêm môn nào nữa không ? ( Co || Khong ) : ");
            luaChon = s.nextLine();
            if (luaChon.equalsIgnoreCase("Khong")) {
                break;
            } else if (luaChon.equalsIgnoreCase("Co")) {
                kyThi = true;
                System.out.print("\t\t\t\t\t\t Em muốn xem thêm môn nào ( Toan | Ly | Hoa | Anh ) : ");
            }
        }
        Thread r4 = new Thread() {
            public void run() {
                int i = 0;
                while (i++ < 50) {
                    if (i == 0 || i == 2 || i == 3) {
                        for (int j = 0; j <= 3; j++) {
                            if (j == 0) {
                                System.out.print("- Nói gì thì nói thì quan trọng nhất em phải tự tin vào bản thân. Đừng tin ai xung quanh. Dài rồi thôi tóm lại là đỗ công nghệ thông tin nhé ");
                            } else if (j == 1) {
                                System.out.print("- Nói gì thì nói thì quan trọng nhất em phải tự tin vào bản thân. Đừng tin ai xung quanh. Dài rồi thôi tóm lại là đỗ công nghệ thông tin nhé  .");
                            } else if (j == 2) {
                                System.out.print("- Nói gì thì nói thì quan trọng nhất em phải tự tin vào bản thân. Đừng tin ai xung quanh. Dài rồi thôi tóm lại là đỗ công nghệ thông tin nhé  ..");
                            } else if (j == 3) {
                                System.out.print("- Nói gì thì nói thì quan trọng nhất em phải tự tin vào bản thân. Đừng tin ai xung quanh. Dài rồi thôi tóm lại là đỗ công nghệ thông tin nhé  ...");
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                    if (i == 3) {
                        System.out.println("- Nói gì thì nói thì quan trọng nhất em phải tự tin vào bản thân. Đừng tin ai xung quanh. Dài rồi thôi tóm lại là đỗ công nghệ thông tin nhé ");
                    }
                    if (i == 9 || i == 10 || i == 11) {
                        for (int j = 0; j <= 20; j++) {
                            if (j==0) System.out.print("-  ");
                            else if (j == 1) {
                                System.out.print("- Chúc");
                            } else if (j ==2) {
                                System.out.print("- Chúc  .");
                            } else if (j == 3) {
                                System.out.print("- Chúc .~");
                            } else if (j == 4) {
                                System.out.print("- Chúc  .~*");
                            } else if (j == 5) {
                                System.out.print("- Chúc .~*~");
                            } else if (j == 6) {
                                System.out.print("- Chúc .~*~.");
                            } else if (j == 7) {
                                System.out.print("- Chúc .~*~.~*");
                            } else if (j == 8) {
                                System.out.print("- Chúc .~*~.~*~");
                            } else if (j == 9) {
                                System.out.print("- Chúc .~*~.~*~.");
                            }
                            if (j == 10) {
                                System.out.print("- Chúc .~*~.~*~.May");
                            } else if (j == 11) {
                                System.out.print("- Chúc .~*~.~*~.May  .");
                            } else if (j == 12) {
                                System.out.print("- Chúc .~*~.~*~.May .~");
                            } else if (j == 13) {
                                System.out.print("- Chúc .~*~.~*~.May  .~*");
                            } else if (j == 14) {
                                System.out.print("- Chúc .~*~.~*~.May .~*~");
                            } else if (j == 15) {
                                System.out.print("- Chúc .~*~.~*~.May .~*~.");
                            } else if (j == 16) {
                                System.out.print("- Chúc .~*~.~*~.May .~*~.~*");
                            } else if (j == 17) {
                                System.out.print("- Chúc .~*~.~*~.May .~*~.~*~");
                            } else if (j == 18) {
                                System.out.print("- Chúc .~*~.~*~.May .~*~.~*~.Mắn.");
                            }
                            else if (j==19){
                                System.out.print("- Chúc .~*~.~*~.May .~*~.~*~.Mắn..");
                            }else if (j==20){
                                System.out.print("- Chúc .~*~.~*~.May .~*~.~*~.Mắn...");
                            }
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.print("\r");

                        }
                    }
                    if (i == 11) {
                        System.out.print("- Chúc .~*~.~*~.May .~*~.~*~.Mắn.");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.print("\r");
                    }
                    if (i == 16) {
                        System.out.print("                                     ");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.print("\r");
                    }
                    if (i == 21) {
                        System.out.print("- Chúc .~*~.~*~.May .~*~.~*~.Mắn.");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.print("\r");
                    }
                    if (i == 26) {
                        System.out.print("                                ");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.print("\r");
                    }
                    if (i == 31) {
                         System.out.print("- Chúc .~*~.~*~.May .~*~.~*~.Mắn.");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.print("\r");
                    }
                                        if (i == 36) {
                        System.out.print("                                ");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.print("\r");
                    }
                    if (i == 41) {
                         System.out.print("- Chúc .~*~.~*~.May .~*~.~*~.Mắn.");
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Gift.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.print("\r");
                    }
                }
            }
        };
        r4.start();
        r4.join();
    }
        }
}
