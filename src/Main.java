
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public boolean hasDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        if (set.contains(num)) {
            return true;
        } else {
            set.add(num);
        }
    }
    return false;
}

void main() {
    LinkedList n1 = new LinkedList();

    n1.insertHead(1);
    n1.insertTail(2);
    n1.insertTail(3);

    System.out.println(n1.getValues().toString());
}
