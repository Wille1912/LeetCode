class Solution {
    public int reverse(int x) {
        boolean flag = true;
        if (x < 0) {
            x = -x;
            flag = false;
        }
        int ans = 0;
        int ans_pre;

        while (x > 0) {
            ans_pre = ans;

            ans *= 10;
            ans += x % 10;

            if ((ans / 10) != ans_pre)
                return 0;


            x /= 10;
        }

        if (!flag)
            ans = -ans;

        return ans;
    }
}