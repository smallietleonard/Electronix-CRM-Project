import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Electronix {

  public static void main(String[] args) {
    
    Scanner user_input = new Scanner(System.in);
   
   ArrayList <TV> TVList = new ArrayList<TV>();
   ArrayList <Laptop> LTList = new ArrayList<Laptop>();
   final String brand = "Sony";

    System.out.println("Welcome to the Electronix Store database.\n\n");
    int replay;
    for (replay=0; replay<100;replay++) {
    System.out.println("What would you like to do?\n");
    System.out.println("Press 1 to add products.\nPress 2 to view inventory.\nPress 3 to change price or stock of any product.\nPress 4 to create inventory note.\nPress 5 to view past notes.");

    int option = user_input.nextInt();
    user_input.nextLine();

    switch (option){
      case 1:
      System.out.println("Is it a TV (1) or Laptop (2)?");
      int tol = user_input.nextInt();
      user_input.nextLine();
      if (tol == 1) {
        int i;
        for (i=0; i<50; i++){
          int u = 0;
        System.out.println("Enter a screen size in inches.");
        int s = user_input.nextInt();
        user_input.nextLine();

        System.out.println("Enter a weight in pounds.");
        int w = user_input.nextInt();
        user_input.nextLine();

        System.out.println("Enter a picture quality.");
        String q = user_input.nextLine();

        System.out.println("Enter a price.");
        double p = user_input.nextDouble();
        user_input.nextLine();

        System.out.println("Does this product have an antennae?");
        String a = user_input.nextLine();

        System.out.println("How many were recieved?");
        int n = user_input.nextInt();
        user_input.nextLine();
        
        TV newTV = new TV(s, w, q, p, a, u, brand, n);

        TVList.add(newTV);

        System.out.println("add more TV's? (1 is yes, 2 is no)");
        int more = user_input.nextInt();
        if (more == 1) {
        i = i + 0;
        }
        else {
        i = i+50;
        }//more else closer
        }//for with TVs closer
      }//if closer
      
        else {
          int j;
          for (j=0; j<50; j++) {
            String a = "None";
            System.out.println("Enter a screen size in inches.");
            int s = user_input.nextInt();
            user_input.nextLine();
            

            System.out.println("Enter a weight in pounds.");
            int w = user_input.nextInt();
            user_input.nextLine();
            

            System.out.println("Enter a picture quality.");
           String q = user_input.nextLine();
           

            System.out.println("Enter a price.");
            double p = user_input.nextDouble();
            user_input.nextLine();
          

            System.out.println("How many usb drives does this product have?");
            int u = user_input.nextInt();
            user_input.nextLine();
            

            System.out.println("How many were recieved?");
            int n = user_input.nextInt();
            user_input.nextLine();

            Laptop newLT = new Laptop(s, w, q, p, a, u, brand, n);

            LTList.add(newLT);

            System.out.println("add more Laptops? (1 is yes, 2 is no)");
            int more = user_input.nextInt();
            if (more == 1) {
              j = j + 0;
            }
            else {
              j = j+50;
            }
          

          }

         }
      break;
      case 2:
      System.out.println("View Tvs (1) or Laptops (2)?");
      int v = user_input.nextInt();
      if (v == 1) {
        int mtvs;
        for (mtvs = 0; mtvs<10000;mtvs++){
        System.out.println("Which TV? Start at 0");
        int z = user_input.nextInt();
        user_input.nextLine();
        System.out.println(TVList.get(z)
         );

        System.out.println("Would you like to see more TVs? Yes (1) or No (2)?");
        int moretvs = user_input.nextInt();
        user_input.nextLine();
        if (moretvs == 1) {
          mtvs = mtvs + 1;
        }
        else {
          mtvs = mtvs +10000;
        }
        
        }
        }
     else {
       int mlts;
            for (mlts = 0; mlts<10000;mlts++){
        System.out.println("Which Laptop? Start at 0");
        int z = user_input.nextInt();
        user_input.nextLine();
        System.out.println(LTList.get(z)
         );

        System.out.println("Would you like to see more Laptops? Yes (1) or No (2)?");
        int morelts = user_input.nextInt();
        user_input.nextLine();
        if (morelts == 1) {
          mlts = mlts + 1;
        }
        else {
          mlts = mlts +10000;
        }
        
        }
     }
     break;
     case 3:
     System.out.println("Would you like to alter stored information about TVs (1) or Laptops (2)?");
     
     int alterChoice = user_input.nextInt();
     user_input.nextLine();

     if (alterChoice == 1) {
       int moreTVChange;
       for (moreTVChange=0; moreTVChange<10000;moreTVChange++){
       System.out.println("In the order you entered them and starting at 0, select which TV you'd like to alter.");
       int tvChoice = user_input.nextInt();
       user_input.nextLine();

       System.out.println("Would you like to alter price (1) or stock (2)?");
       int priceOrStock = user_input.nextInt();
       user_input.nextLine();

       if (priceOrStock == 1) {
         System.out.println("Please enter what you would like the price to be changed to.");
         double priceChange = user_input.nextDouble();
         TVList.get(tvChoice).setPrice(priceChange);
         System.out.println("The new information for product " + tvChoice + " is:\n\n" + TVList.get(tvChoice));

         System.out.println("Change more TVs, Yes (1) or No (2)?");
         int moreTVChangeDecision = user_input.nextInt();
         user_input.nextLine();
           if (moreTVChangeDecision == 1) {
           moreTVChange = moreTVChange + 0;
         } else {
           moreTVChange = moreTVChange +10000;
         }
       } else{
         System.out.println("Please enter what you would like the stock to be changed to.");
         int stockChange = user_input.nextInt();
         TVList.get(tvChoice).setInStock(stockChange);
         System.out.println("The new information for product " + tvChoice + " is:\n\n" + TVList.get(tvChoice));

         System.out.println("Change more TVs, Yes (1) or No (2)?");
         int moreTVChangeDecision = user_input.nextInt();
         user_input.nextLine();
           if (moreTVChangeDecision == 1) {
           moreTVChange = moreTVChange + 0;
         } else {
           moreTVChange = moreTVChange +10000;
         }
       }
       }
     }
     else {
      int moreLTChange;
       for (moreLTChange=0; moreLTChange<10000;moreLTChange++){
       System.out.println("In the order you entered them and starting at 0, select which laptop you'd like to alter.");
       int lTChoice = user_input.nextInt();
       user_input.nextLine();

       System.out.println("Would you like to alter price (1) or stock (2)?");
       int priceOrStock = user_input.nextInt();
       user_input.nextLine();

       if (priceOrStock == 1) {
         System.out.println("Please enter what you would like the price to be changed to.");
         double priceChange = user_input.nextDouble();
         LTList.get(lTChoice).setPrice(priceChange);
         System.out.println("The new information for product " + lTChoice + " is:\n\n" + LTList.get(lTChoice));

         System.out.println("Change more laptops, Yes (1) or No (2)?");
         int moreLTChangeDecision = user_input.nextInt();
         user_input.nextLine();
           if (moreLTChangeDecision == 1) {
           moreLTChange = moreLTChange + 0;
         } else {
           moreLTChange = moreLTChange +10000;
         }
       } else{
         System.out.println("Please enter what you would like the stock to be changed to.");
         int stockChange = user_input.nextInt();
         LTList.get(lTChoice).setInStock(stockChange);
         System.out.println("The new information for product " + lTChoice + " is:\n\n" + LTList.get(lTChoice));

         System.out.println("Change more laptops, Yes (1) or No (2)?");
         int moreLTChangeDecision = user_input.nextInt();
         user_input.nextLine();
           if (moreLTChangeDecision == 1) {
           moreLTChange = moreLTChange + 0;
         } else {
           moreLTChange = moreLTChange +10000;
         }
       }
       }
      }
     break;
     case 4:
     int moreNotes;
     for (moreNotes=0;moreNotes<10000;moreNotes++){
     System.out.println("What would you like to name your notes?");
     String noteName = user_input.nextLine();

     try {
     File newFile = new File(noteName + ".txt");
     if (newFile.createNewFile()) {
        System.out.println("File " + noteName + ".txt successfully created.");
        FileWriter newFileWriter = new FileWriter (noteName + ".txt");
        System.out.println("Please type your note.");
        String note = user_input.nextLine();
        newFileWriter.write(note);
        newFileWriter.close();
        System.out.println("Note written and saved.");
     } else {
       System.out.println("Oops! That name is taken!");
     }
     } catch (IOException e) {
       System.out.println("ERROR");
       e.printStackTrace();
     }
      System.out.println("Create more notes? Yes (1) or No (2)");
      int moreNotesDecision = user_input.nextInt();
      user_input.nextLine();
      if (moreNotesDecision == 1){
        moreNotes = moreNotes + 1;
      } else {
        moreNotes = moreNotes +10000;
      }
     }
     break;
     case 5:
     try{
       System.out.println("Enter while file to view.\n");
       String noteName = user_input.nextLine();
       System.out.println("\n");
       File newFile = new File (noteName + ".txt");
      Scanner fileReader = new Scanner(newFile);
      System.out.println("The file says:");
      while (fileReader.hasNextLine()){
        String noteLine = fileReader.nextLine();
        System.out.println(noteLine);
        System.out.println("\n");
      }
      fileReader.close();
     } catch (IOException e) {
       System.out.println("ERROR");
       e.printStackTrace();
     }
      
     break;
    }//<<
    }//switch case closer
    replay = replay + 1;
    }//main closer
  }
  


class Product { 
  private int screen;
  private int weight;
  private String quality;
  double price;
  private String antennae;
  private int usbDrives;
  private final String brand = "Sony";
  int inStock;

  public Product (int screen, int weight, String quality, double price, String antennae, int usbDrives, String brand, int inStock) {
    this.screen = screen;
    this.weight = weight;
    this.quality = quality;
    this.price = price;
    this.antennae = antennae;
    this.usbDrives = usbDrives;
    this.inStock = inStock;
  }

  

  public void setPrice (double newPrice) {
    this.price = newPrice;
  }

  public void setinStock (int newStock) {
    this.inStock = newStock;
  }

  public String toString() {
    return ("Screen size: " + screen + "in\n" +"Weight: "+ weight + "lbs\n" + "Picture Quality: " + quality + "\n" + "Price: $" + price + "\n" + "Antennae Y/N: " + antennae + "\n" + "# of usb ports: " + usbDrives + "\n" + "Brand: " + brand + "\n"+ "# in stock: " + inStock);
  }

}

class TV extends Product {
  public TV (int screen, int weight, String quality, double price, String antennae, int usbDrives, String brand, int inStock) {
    super (screen, weight, quality, price, antennae, usbDrives, brand, inStock);
  }

  public void setPrice (double newTVPrice) {
    this.price = newTVPrice;
  }

  public void setInStock (int newTVStock) {
    this.inStock = newTVStock;
  }
}

class Laptop extends Product {
  public Laptop (int screen, int weight, String quality, double price, String antennae, int usbDrives, String brand, int inStock) {
    super (screen, weight, quality, price, antennae, usbDrives, brand, inStock);
  }
    public void setPrice (double newLTPrice) {
    this.price = newLTPrice;
  }

  public void setInStock (int newLTStock) {
    this.inStock = newLTStock;
  }
}
