import java.util.Scanner;

public class MyPhone {
  static boolean isClosed = false;
  static String answer;
  static Phone phoneOfChoice;

  public static void main(String[] args) {
    Phone SamsungZFold3 = new Samsung();
    Phone Xiaomi11T = new Xiaomi();

    Scanner input = new Scanner(System.in); 

    System.out.println("--------- Pilih HP ---------");
    System.out.println("1. Xiaomi 11 T" );
    System.out.println("2. Samsung Galaxy Z Fold3");
    System.out.println("-----------------------------");

    System.out.print("Pilih menu : ");
    answer = input.next();

    switch(answer) {
      case "1":
        phoneOfChoice = Xiaomi11T;
        break;
      case "2":
        phoneOfChoice = SamsungZFold3;
        break;
      default:
        System.out.println("Wrong input number");
    }

    PhoneUser Riza = new PhoneUser(phoneOfChoice);

    while(!isClosed) {
      System.out.println("--------- Main Menu ---------");
      System.out.println("1. Nyalakan Handphone");
      System.out.println("2. Matikan Handphone");
      System.out.println("3. Perbesar Volume");
      System.out.println("4. Perkecil Volume");
      System.out.println("5. Keluar Program");
      System.out.println("-----------------------------");

      System.out.print("Pilih menu : ");
      answer = input.next();

      switch(answer) {
        case "1":
          Riza.turnOn();
          break;
        case "2":
          Riza.turnOff();
          break;
        case "3":
          Riza.makeFullVolume();
          break;
        case "4":
          Riza.makeSilentVolume();
          break;
        case "5":
          isClosed = true;
          break;
        default:
          System.out.println("Wrong input number");
      }
    }
  }

}


interface Phone {
  int MAX_VOLUME = 100;
  int MIN_VOLUME = 0;

  void powerOn();
  void powerOff();
  void volumeUp();
  void volumeDown();
}

class PhoneUser {
  Phone phone;

  public PhoneUser(Phone phone) {
    this.phone = phone;
  }

  void turnOn() {
    phone.powerOn();
  }

  void turnOff() {
    phone.powerOff();
  }

  void makeFullVolume() {
    phone.volumeUp();
  }

  void makeSilentVolume() {
    phone.volumeDown();
  }
}

class Samsung implements Phone {
  int volume;
  boolean isPower;

  public Samsung() {
    volume = 0;
  }

  public String getString() {
    return "Samsung";
  }

  @Override
  public void powerOn() {
    isPower = true;
    System.out.println("HP Samsung Menyala");
  }

  @Override
  public void powerOff() {
    isPower = false;
    System.out.println("Smartphone dimatikan");
  }

  @Override
  public void volumeUp() {
    if (isPower) {
      if (volume == MAX_VOLUME) {
        System.out.println("Volume is 100%");
      }

      else {
        volume += 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Smartphone dalam keadaan mati, Silahkan hidupkan Smartphone");
    }
  }

  @Override
  public void volumeDown() {
    if (isPower) {
      if (volume == MIN_VOLUME) {
        System.out.println("Volume is 0%");
      }

      else {
        volume -= 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Smartphone dalam keadaan mati, Silahkan hidupkan Smartphone");
    }
  }

  public int getVolume() {
    return volume;
  }
}


class Xiaomi implements Phone {
  int volume;
  boolean isPower;

  public Xiaomi() {
    volume = 0;
  }

  public String getString() {
    return "Xiaomi";
  }

  @Override
  public void powerOn() {
    isPower = true;
    System.out.println("HP Xiaomi Menyala");
  }

  @Override
  public void powerOff() {
    isPower = false;
    System.out.println("Smartphone dimatikan");
  }

  @Override
  public void volumeUp() {
    if (isPower) {
      if (volume == MAX_VOLUME) {
        System.out.println("Volume is 100%");
      }

      else {
        volume += 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Smartphone dalam keadaan mati, Silahkan hidupkan Smartphone");
    }
  }

  @Override
  public void volumeDown() {
    if (isPower) {
      if (volume == MIN_VOLUME) {
        System.out.println("Volume is 0%");
      }

      else {
        volume -= 5;
        System.out.println("Volume is now " + getVolume() + "%");
      }

    } else {
      System.out.println("Smartphone dalam keadaan mati, Silahkan hidupkan Smartphone");
    }
  }

  public int getVolume() {
    return volume;
  }
}
