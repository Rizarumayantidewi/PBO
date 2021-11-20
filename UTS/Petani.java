import java.util.Arrays;

public class Petani {
  public static void main(String[] args) {
    String[] boxOfUnorganizedFruits = {
      "Apel",
      "Pisang",
      "Anggur",
      "Jambu",
      "Pepaya",
      "Duku",
      "Durian",
      "Jeruk",
      "Mangga",
      "Manggis",
    };

    int boxIndex = 0;
    int containerBoxIndex = 0;
    int boxSize = boxOfUnorganizedFruits.length;

    String[] boxOfOrganizedFruits = sortItems(boxOfUnorganizedFruits);
    String[][] boxesOfOrganizedFruits = new String[5][2];
    String pointer = boxOfOrganizedFruits[0];

    for (int g = 0; g < boxOfOrganizedFruits.length; g++) {

      if (pointer.charAt(0) != boxOfOrganizedFruits[g].charAt(0)) {
        pointer = boxOfOrganizedFruits[g];
        containerBoxIndex++;
        boxIndex = 0;
      }

      if (pointer.charAt(0) == boxOfOrganizedFruits[g].charAt(0)) {
        boxesOfOrganizedFruits[containerBoxIndex][boxIndex] = boxOfOrganizedFruits[g];
        boxIndex += 1;
      } 
    }

    System.out.println(Arrays.deepToString(boxesOfOrganizedFruits));
  }

  public static String[] sortItems(String[] items) {
    for (int k = 0; k < items.length; k++) {
      String temp = items[k];
      int position = k;

      while( position >= 1 && items[position - 1].charAt(0) > temp.charAt(0) ) {
        items[position] = items[position - 1];
        position--;
      }

      items[position] = temp;
    }

    return items;
  }

}
