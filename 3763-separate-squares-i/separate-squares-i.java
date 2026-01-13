class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0.0;
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;

        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];
            totalArea += l * l;
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        double target = totalArea / 2.0;

        for (int iter = 0; iter < 60; iter++) {
            double mid = (low + high) / 2.0;
            double areaBelow = areaBelow(mid, squares);

            if (areaBelow < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    private double areaBelow(double Y, int[][] squares) {
        double area = 0.0;

        for (int[] s : squares) {
            double y = s[1];
            double l = s[2];

            if (Y <= y) continue;
            else if (Y >= y + l) area += l * l;
            else area += l * (Y - y);
        }

        return area;
    }
}
