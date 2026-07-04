class Solution {
    public int countElements(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

        return (int) Arrays.stream(nums).filter(x -> x < max && x > min).count();
    }
}