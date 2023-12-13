class Revercee {
  public static void main(String[] args) {

    int num = 1;
    int rowCount = 0;
    for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 4; j++) {
        System.out.print((num + num) + " ");
        rowCount = rowCount + (num + num);
        num++;
      }
      System.out.print("");
      System.out.println(rowCount);
      rowCount = 0;
    }

  }
}