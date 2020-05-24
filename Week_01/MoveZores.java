class MoveZeroes {
    public void moveZeroes(int[] nums) {
        Int i = 0;
        Int j = 0;
        Int z = 0;
        Int[] res = new Int(nums.length);
        for (i; i < nums.length; i++) {
            if(nums[i] == 0) {
                res.append(nums[i]);
            } else {
                j ++
            }
        }

        for (z; z < j; z++) {
            res.append(0);
        }
        return res;

    }
}
