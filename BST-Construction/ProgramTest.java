// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    var root = new Program.BST(10);
    root.left = new Program.BST(5);
    root.left.left = new Program.BST(2);
    root.left.left.left = new Program.BST(1);
    root.left.right = new Program.BST(5);
    root.right = new Program.BST(15);
    root.right.left = new Program.BST(13);
    root.right.left.right = new Program.BST(14);
    root.right.right = new Program.BST(22);

    root.insert(12);
    Utils.assertTrue(root.right.left.left.value == 12);

    root.remove(10);
    Utils.assertTrue(root.contains(10) == false);
    Utils.assertTrue(root.value == 12);

    Utils.assertTrue(root.contains(15));
  }
}
