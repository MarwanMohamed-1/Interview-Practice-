
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
    int [] nums = {1,2,3,4};
    Set<Integer>set = new HashSet<>();
    System.out.println(hasDuplicate(nums));
}
