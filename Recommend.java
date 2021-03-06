/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kalsi
 */
public class Recommend extends javax.swing.JFrame {

    private Customer customer;

    /**
     * Creates new form Recommend
     */
    public Recommend(Customer customer) {
        this.customer = customer;
        initComponents();
        algorithm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cover1 = new javax.swing.JLabel();
        cover3 = new javax.swing.JLabel();
        cover2 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        author1 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        author2 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        author3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        logo = new javax.swing.JMenu();
        randomMenu = new javax.swing.JMenu();
        menuMenu = new javax.swing.JMenu();
        browseMenu = new javax.swing.JMenu();
        ratedMenu = new javax.swing.JMenu();
        addBooksMenu = new javax.swing.JMenu();
        clubsMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Here are some books you may like!");

        cover1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cover1.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N

        cover3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cover3.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N

        cover2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cover2.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N

        title1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Title PlaceHolder");
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        author1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author1.setText("Author Place Holder");

        title2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Title PlaceHolder");
        title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        author2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author2.setText("Author Place Holder");

        title3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title3.setText("Title PlaceHolder");
        title3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        author3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        author3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        author3.setText("Author Place Holder");

        logo.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\kalsi\\Documents\\NetBeansProjects\\Booksmart_App\\logo_Menu.png")); // NOI18N
        menuBar.add(logo);

        randomMenu.setText("Random Book");
        randomMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        randomMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                randomMenuMouseClicked(evt);
            }
        });
        menuBar.add(randomMenu);

        menuMenu.setText("Main Menu");
        menuMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMenuMouseClicked(evt);
            }
        });
        menuBar.add(menuMenu);

        browseMenu.setText("Browse");
        browseMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        browseMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                browseMenuMouseClicked(evt);
            }
        });
        menuBar.add(browseMenu);

        ratedMenu.setText("Books you've rated");
        ratedMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ratedMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratedMenuMouseClicked1(evt);
            }
        });
        menuBar.add(ratedMenu);

        addBooksMenu.setText("Add books");
        addBooksMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addBooksMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBooksMenuMouseClicked(evt);
            }
        });
        menuBar.add(addBooksMenu);

        clubsMenu.setText("Clubs");
        clubsMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clubsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clubsMenuMouseClicked(evt);
            }
        });
        menuBar.add(clubsMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup().addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cover1, javax.swing.GroupLayout.PREFERRED_SIZE, 233,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(author1, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                        .addComponent(title1, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(author2, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(title2, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 233,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addComponent(author3,
                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(title3, javax.swing.GroupLayout.Alignment.LEADING,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 233,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(cover2, javax.swing.GroupLayout.PREFERRED_SIZE, 233,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cover3, javax.swing.GroupLayout.PREFERRED_SIZE, 233,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(
                                layout.createSequentialGroup().addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cover1, javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cover3, javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cover2, javax.swing.GroupLayout.PREFERRED_SIZE, 293,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addComponent(title1)
                                                        .addGap(18, 18, 18).addComponent(author1))
                                                .addGroup(layout.createSequentialGroup().addComponent(title2)
                                                        .addGap(18, 18, 18).addComponent(author2))
                                                .addGroup(layout.createSequentialGroup().addComponent(title3)
                                                        .addGap(24, 24, 24).addComponent(author3)))
                                        .addGap(0, 21, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    public void randomBook() {
        final String BOOK_DIR = "images";
        final String bookList = "data/books.txt";

        File dir = new File(BOOK_DIR);
        File[] bookCovers = dir.listFiles();

        int[] covers = new int[3];
        int[] alreadySelected = { -1, -1, -1 };

        for (int i = 0; i < covers.length; i++) {
            boolean run = true;

            while (run) {
                covers[i] = (int) (Math.random() * bookCovers.length);

                for (int j = i - 1; j > -1; j--) {
                    if (covers[i] == alreadySelected[j]) {
                        run = false;
                        break;
                    }
                }

                run = !run;
            }
            alreadySelected[i] = covers[i];
        }

        String bookCover1Path = "images\\" + (covers[0] + 1) + ".jpg";
        String bookCover2Path = "images\\" + (covers[1] + 1) + ".jpg";
        String bookCover3Path = "images\\" + (covers[2] + 1) + ".jpg";

        cover1.setIcon(new javax.swing.ImageIcon(bookCover1Path));
        cover2.setIcon(new javax.swing.ImageIcon(bookCover2Path));
        cover3.setIcon(new javax.swing.ImageIcon(bookCover3Path));

        int[] coversCopy = new int[covers.length];

        for (int i = 0; i < coversCopy.length; i++) {
            coversCopy[i] = covers[i];
        }

        Arrays.sort(coversCopy);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < coversCopy.length; i++) {
            for (int j = 0; j < coversCopy.length; j++) {
                if (coversCopy[i] == covers[j]) {
                    map.put(coversCopy[i], j);
                    break;
                }
            }
        }
        System.out.println(map);

        String[][] info = { { "PlaceHolder", "PlaceHolder", "PlaceHolder" },
                { "PlaceHolder", "PlaceHolder", "PlaceHolder" } };

        File file = new File(bookList);

        Scanner reader = null;

        try {
            reader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int indexCount = 0;
        int count = 0;

        System.out.println("----------------------------");

        while (reader.hasNextLine()) {
            boolean cont = false;

            if (count == coversCopy[indexCount]) {
                cont = true;
            } else {
                System.out.println(count + " " + coversCopy[indexCount]);
            }

            if (!cont) {
                reader.nextLine();
                count++;
            } else {
                String[] line = reader.nextLine().split(",");

                System.out.println(line[0] + " " + line[1]);

                System.out.println(indexCount);

                info[0][map.get(coversCopy[indexCount])] = line[0];
                info[1][map.get(coversCopy[indexCount])] = line[1];

                indexCount++;
                count++;
            }

            if (indexCount == 3) {
                break;
            }
        }

        title1.setText(info[0][0]);
        title2.setText(info[0][1]);
        title3.setText(info[0][2]);

        author1.setText(info[1][0]);
        author2.setText(info[1][1]);
        author3.setText(info[1][2]);
    }

    public ArrayList<Integer> getRatings() {
        ArrayList<Integer> ratings = new ArrayList<>();

        File file = new File("stars/ratings.txt");

        Scanner in = null;

        try {
            in = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        } // end try catch

        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(",");
            Integer[] ratingArr = new Integer[line.length];

            int indexCount = 0;

            if(line.length == 1){
                ratings.add(5);
            }else{
                for (String l : line) {
                    ratingArr[indexCount] = Integer.parseInt(l);
                    indexCount++;
                } // end for loop

                ratings.add(getPopularRating(ratingArr));
            }
        } // end while loop

        return ratings;
    }// end of method getRatings

    public int getPopularRating(Integer[] a) {
        if (a.length == 0) {
            return 5;
        }

        int count = 1, tempCount;
        int popular = a[0];
        int temp = 0;

        for (int i = 0; i < (a.length - 1); i++) {
            temp = a[i];
            tempCount = 0;
            for (int j = 1; j < a.length; j++) {
                if (temp == a[j]) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

    public ArrayList<Integer> getRated() {
        ArrayList<Integer> alreadyRated = new ArrayList<>();

        File myFile = new File("stars/" + this.customer.getUsername() + "-rated.txt"); // pranav change!!!! help me!!!
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        while(inputFile.hasNextLine()){
            String [] line = inputFile.nextLine().split(",");

            alreadyRated.add(Integer.parseInt(line[2]));
        }//end while loop

        return alreadyRated;
    }//end getRated

    public void algorithm(){
        File file = new File("data/genres_new.txt");

        Scanner reader = null;

        try {
            reader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }//end of try catch

        String favouriteGenre = customer.getSurveyData().getFavouriteGenre();

        String closestGenre = "";

        while(reader.hasNextLine()){
            String [] line = reader.nextLine().split(",");

            if(line[0].equalsIgnoreCase(favouriteGenre)){
                closestGenre = line[1];
                break;
            }//
        }//

        if(closestGenre.equals("")){
            JOptionPane.showMessageDialog(null, "The genre that entred in the survey\ndidn't have any suitable matches.\n So here is 3 random books!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            randomBook();
            return;
        }else{
            ArrayList <Integer> ratings = getRatings();
            ArrayList <Integer> lowRatedLines = new ArrayList<>();
            ArrayList <Integer> alreadyRated = getRated();

            file = new File("data/books_update.txt");
            try {
                reader = new Scanner(file);
            } catch (Exception e) {
                e.printStackTrace();
            }//end of try catch

            int start = -1;
            int end = -1;

            String [] line = null;

            int lineCount = 0;
            int c  =0;
            while(reader.hasNextLine()){
                line = reader.nextLine().split(",");
                lineCount++;

                System.out.println(c++);

                if(line[2].equalsIgnoreCase(closestGenre)){
                    if(ratings.get(lineCount-1) < 4){
                        lowRatedLines.add(lineCount);
                    }

                    if(start == -1){
                        start = lineCount;
                    }else{
                        end = lineCount;
                    }
                }else{
                    System.out.println(line[2] + " " + closestGenre);
                }
            }//end of while loop

            System.out.println(start + " " + end);

            final String BOOK_DIR = "images";
            final String bookList = "data/books.txt";

            File dir = new File(BOOK_DIR);
            File [] bookCovers = dir.listFiles();

            int [] covers = new int [3];
            int [] alreadySelected = {-1,-1,-1};

            for(int i = 0; i < covers.length; i++){
                boolean run = true;

                while(run){
                    covers[i] = ((int) (Math.random() * (end - start + 1))) + start;
                    
                    System.out.println("here");
                    System.out.println(end +" "+ start);

                    for(int j = i-1; j > -1; j--){
                        if(covers[i] == alreadySelected[j]||lowRatedLines.contains(covers[i])||alreadyRated.contains(covers[i])){
                            run = false;
                            break;
                        }
                    }

                    run = !run;
                }
                alreadySelected[i] = covers[i];
            }

            String bookCover1Path = "images\\" + (covers[0]) + ".jpg";
            String bookCover2Path = "images\\" + (covers[1]) + ".jpg";
            String bookCover3Path = "images\\" + (covers[2]) + ".jpg";

            cover1.setIcon(new javax.swing.ImageIcon(bookCover1Path));
            cover2.setIcon(new javax.swing.ImageIcon(bookCover2Path));
            cover3.setIcon(new javax.swing.ImageIcon(bookCover3Path));


            int [] coversCopy = new int[covers.length];

            for(int i = 0; i < coversCopy.length; i++){
                System.out.println(covers[i] + "!");
                coversCopy[i] = covers[i]; 
            }

            Arrays.sort(coversCopy);

            HashMap <Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < coversCopy.length; i++){
                System.out.println(coversCopy[i]);
                for(int j = 0; j < coversCopy.length; j++){
                    if(coversCopy[i] == covers[j]){
                        map.put(coversCopy[i], j);
                        break;
                    }
                }
            }   
            System.out.println(map);

            String [] [] info = {
                {"PlaceHolder","PlaceHolder","PlaceHolder"},
                {"PlaceHolder","PlaceHolder","PlaceHolder"}
            };

            file = new File(bookList);

            try{
                reader = new Scanner(file);
            }catch(Exception e){
                e.printStackTrace();
            }

            int indexCount = 0;
            int count = 1;
            
            System.out.println("----------------------------");

            while(reader.hasNextLine()){
                boolean cont = false;

                if(count == coversCopy[indexCount]){
                    cont = true;
                }else{
                    System.out.println(count + " " + coversCopy[indexCount]);
                }

                if(!cont){
                    reader.nextLine();
                    count++;
                }else{
                    line = reader.nextLine().split(",");

                    System.out.println(line[0] + " " + line[1]);
                    
                    System.out.println(indexCount);

                    info[0][map.get(coversCopy[indexCount])] = line[0];
                    info[1][map.get(coversCopy[indexCount])] = line[1];

                    indexCount++;
                    count++;
                }

                if(indexCount == 3){
                    break;
                }
            }

            title1.setText(info[0][0]);
            title2.setText(info[0][1]);
            title3.setText(info[0][2]);

            author1.setText(info[1][0]);
            author2.setText(info[1][1]);
            author3.setText(info[1][2]);

        }   
    }//end of method algorithm

    private void randomMenuMouseClicked(java.awt.event.MouseEvent evt) {                                        
        new RandomBook(customer).setVisible(true);
        this.setVisible(false);
    }                                       

    private void menuMenuMouseClicked(java.awt.event.MouseEvent evt) {                                      
        try {
            new mainMenu(this.customer).setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setVisible(false);
    }                                     

    private void browseMenuMouseClicked(java.awt.event.MouseEvent evt) {                                        
        new BrowseMenu(customer).setVisible(true);
        this.setVisible(false);
    }                                       

    private void ratedMenuMouseClicked1(java.awt.event.MouseEvent evt) {                                        
        try {
            new SeeRated(this.customer).setVisible(true);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.setVisible(false);
    }                                       

    private void addBooksMenuMouseClicked(java.awt.event.MouseEvent evt) {                                          
        try {
            new addBooks(this.customer).setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.setVisible(false);
    }                                         

    private void clubsMenuMouseClicked(java.awt.event.MouseEvent evt) {                                       
        try{
            new Friends_Page(this.customer, null).setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        this.setVisible(false);
    }                                      

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
    //     /* Set the Nimbus look and feel */
    //     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //     /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //      * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //      */
    //     try {
    //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //             if ("Nimbus".equals(info.getName())) {
    //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                 break;
    //             }
    //         }
    //     } catch (ClassNotFoundException ex) {
    //         java.util.logging.Logger.getLogger(Recommend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(Recommend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(Recommend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(Recommend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>

    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new Recommend().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu addBooksMenu;
    private javax.swing.JLabel author1;
    private javax.swing.JLabel author2;
    private javax.swing.JLabel author3;
    private javax.swing.JMenu browseMenu;
    private javax.swing.JMenu clubsMenu;
    private javax.swing.JLabel cover1;
    private javax.swing.JLabel cover2;
    private javax.swing.JLabel cover3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu logo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuMenu;
    private javax.swing.JMenu randomMenu;
    private javax.swing.JMenu ratedMenu;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    // End of variables declaration                   
}
